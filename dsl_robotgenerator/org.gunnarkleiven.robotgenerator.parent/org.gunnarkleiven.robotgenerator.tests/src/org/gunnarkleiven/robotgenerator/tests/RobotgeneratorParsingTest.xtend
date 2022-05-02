/*
 * generated by Xtext 2.25.0
 */
package org.gunnarkleiven.robotgenerator.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.gunnarkleiven.robotgenerator.robotgenerator.Model
import org.gunnarkleiven.robotgenerator.robotgenerator.RobotType
import org.junit.runner.RunWith
import org.junit.Test
import org.junit.Assert
 
@RunWith(XtextRunner)
@InjectWith(RobotgeneratorInjectorProvider)
class RobotgeneratorParsingTest {
	@Inject extension ParseHelper<Model>
	
	@Inject extension ValidationTestHelper
	
	@Test
	def void testCorrectParsing1() {
		'''
		addRobot(moose,,,);
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testCorrectParsing2() {
		'''
		addRobot(mavic2pro,,2,);
		'''.parse.assertNoErrors
		
	}
	
	@Test
	def void testCorrectParsing3() {
		'''
		addRobot(mavic2pro, "test", , 2);
		'''.parse.assertNoErrors
		
	}
	
	@Test
	def void testCorrectParsingMultipleParameters() {
		'''
		addRobot(moose, "test", 3, 1);
		'''.parse.assertNoErrors
	}
	
	@Test
	def void testParsing() {
		val model = '''
		addRobot(moose, "test", 5);
		'''.parse
		
		val command = model.commands.get(0)
//		print(command)
		Assert.assertEquals("addRobot", command.commandType.value)
		Assert.assertEquals("moose", command.robotType.toString)
		Assert.assertEquals("test", command.robotName.value)
	}
	
}



