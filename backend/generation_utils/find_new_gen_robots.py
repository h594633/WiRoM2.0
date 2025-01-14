import os
import pathlib
import shutil

"""
This class is deprecated.
Related to the Eclipse Xtext version of the Robot-Generator DSL, and would check if there 
were any new generated files
"""

class FindNewGenRobots:
    def __init__(self, prev_added_robots, controllers_base_filepath):
        # self.generated_files_filepath = pathlib.Path.cwd().parent.parent / "dsl_robotgenerator" \
        self.generated_files_filepath = pathlib.Path.cwd() / "dsl_robotgenerator" \
                                        / "org.gunnarkleiven.robotgenerator.parent" \
                                        / "org.gunnarkleiven.robotgenerator" / "sample" / "src-gen" / "robotgenerator"
        self.prev_added_robots = prev_added_robots
        self.controllers_base_filepath = controllers_base_filepath

        # print(f"Path = {self.generated_files_filepath}")

    def find_new_generated_robots(self):
        if not self.generated_files_filepath.parent.exists():
            print("No src-gen folder")
            return []
        all_generated_robots = os.listdir(self.generated_files_filepath)
        print(f"All generated robots: {all_generated_robots}")
        new_robots = []
        for x in all_generated_robots:
            # If the folder is empty, then the command in the DSL has been deleted, and the folder should be deleted
            # as well
            current_dir = self.generated_files_filepath / x
            if len(os.listdir(current_dir)) == 0:
                print(f"Empty dir: {current_dir}")
                os.removedirs(current_dir)
                # Also remove the created controller directory
                # current_controller_filepath = self.controllers_base_filepath / f"{x}_controller"
                # shutil.rmtree(current_controller_filepath)
                # print(f"Removed controller in {current_controller_filepath}")
                continue

            if x not in self.prev_added_robots:
                print(f"Found new generated robot: {x}")
                new_robots.append(x)

        print(f"new_robots: {new_robots}")
        return new_robots
