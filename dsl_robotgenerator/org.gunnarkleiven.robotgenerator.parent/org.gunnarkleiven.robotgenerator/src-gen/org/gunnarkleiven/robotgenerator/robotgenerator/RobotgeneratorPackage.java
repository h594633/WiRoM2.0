/**
 * generated by Xtext 2.25.0
 */
package org.gunnarkleiven.robotgenerator.robotgenerator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotgeneratorFactory
 * @model kind="package"
 * @generated
 */
public interface RobotgeneratorPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "robotgenerator";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gunnarkleiven.org/robotgenerator/Robotgenerator";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "robotgenerator";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RobotgeneratorPackage eINSTANCE = org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl.init();

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.ModelImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Commands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__COMMANDS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandImpl <em>Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getCommand()
   * @generated
   */
  int COMMAND = 1;

  /**
   * The feature id for the '<em><b>Command Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__COMMAND_TYPE = 0;

  /**
   * The feature id for the '<em><b>Robot Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ROBOT_TYPE = 1;

  /**
   * The feature id for the '<em><b>Robot Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__ROBOT_NAME = 2;

  /**
   * The feature id for the '<em><b>XValue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__XVALUE = 3;

  /**
   * The feature id for the '<em><b>YValue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND__YVALUE = 4;

  /**
   * The number of structural features of the '<em>Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotNameImpl <em>Robot Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotNameImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRobotName()
   * @generated
   */
  int ROBOT_NAME = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_NAME__VALUE = 0;

  /**
   * The number of structural features of the '<em>Robot Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ROBOT_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.PositionValueImpl <em>Position Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.PositionValueImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getPositionValue()
   * @generated
   */
  int POSITION_VALUE = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Position Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSITION_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandTypeImpl <em>Command Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandTypeImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getCommandType()
   * @generated
   */
  int COMMAND_TYPE = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_TYPE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Command Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMMAND_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.AddRobotImpl <em>Add Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.AddRobotImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getAddRobot()
   * @generated
   */
  int ADD_ROBOT = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ROBOT__VALUE = COMMAND_TYPE__VALUE;

  /**
   * The number of structural features of the '<em>Add Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_ROBOT_FEATURE_COUNT = COMMAND_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.RemoveRobotImpl <em>Remove Robot</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RemoveRobotImpl
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRemoveRobot()
   * @generated
   */
  int REMOVE_ROBOT = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ROBOT__VALUE = COMMAND_TYPE__VALUE;

  /**
   * The number of structural features of the '<em>Remove Robot</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOVE_ROBOT_FEATURE_COUNT = COMMAND_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RobotType <em>Robot Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotType
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRobotType()
   * @generated
   */
  int ROBOT_TYPE = 7;


  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Model#getCommands <em>Commands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Commands</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Model#getCommands()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Commands();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command
   * @generated
   */
  EClass getCommand();

  /**
   * Returns the meta object for the containment reference '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command#getCommandType <em>Command Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Command Type</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command#getCommandType()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_CommandType();

  /**
   * Returns the meta object for the attribute '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command#getRobotType <em>Robot Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Robot Type</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command#getRobotType()
   * @see #getCommand()
   * @generated
   */
  EAttribute getCommand_RobotType();

  /**
   * Returns the meta object for the containment reference '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command#getRobotName <em>Robot Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Robot Name</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command#getRobotName()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_RobotName();

  /**
   * Returns the meta object for the containment reference '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command#getXValue <em>XValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>XValue</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command#getXValue()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_XValue();

  /**
   * Returns the meta object for the containment reference '{@link org.gunnarkleiven.robotgenerator.robotgenerator.Command#getYValue <em>YValue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>YValue</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.Command#getYValue()
   * @see #getCommand()
   * @generated
   */
  EReference getCommand_YValue();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RobotName <em>Robot Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Robot Name</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotName
   * @generated
   */
  EClass getRobotName();

  /**
   * Returns the meta object for the attribute '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RobotName#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotName#getValue()
   * @see #getRobotName()
   * @generated
   */
  EAttribute getRobotName_Value();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.PositionValue <em>Position Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Position Value</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.PositionValue
   * @generated
   */
  EClass getPositionValue();

  /**
   * Returns the meta object for the attribute '{@link org.gunnarkleiven.robotgenerator.robotgenerator.PositionValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.PositionValue#getValue()
   * @see #getPositionValue()
   * @generated
   */
  EAttribute getPositionValue_Value();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.CommandType <em>Command Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Command Type</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.CommandType
   * @generated
   */
  EClass getCommandType();

  /**
   * Returns the meta object for the attribute '{@link org.gunnarkleiven.robotgenerator.robotgenerator.CommandType#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.CommandType#getValue()
   * @see #getCommandType()
   * @generated
   */
  EAttribute getCommandType_Value();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.AddRobot <em>Add Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Add Robot</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.AddRobot
   * @generated
   */
  EClass getAddRobot();

  /**
   * Returns the meta object for class '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RemoveRobot <em>Remove Robot</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remove Robot</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.RemoveRobot
   * @generated
   */
  EClass getRemoveRobot();

  /**
   * Returns the meta object for enum '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RobotType <em>Robot Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Robot Type</em>'.
   * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotType
   * @generated
   */
  EEnum getRobotType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RobotgeneratorFactory getRobotgeneratorFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.ModelImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Commands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__COMMANDS = eINSTANCE.getModel_Commands();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandImpl <em>Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getCommand()
     * @generated
     */
    EClass COMMAND = eINSTANCE.getCommand();

    /**
     * The meta object literal for the '<em><b>Command Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__COMMAND_TYPE = eINSTANCE.getCommand_CommandType();

    /**
     * The meta object literal for the '<em><b>Robot Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND__ROBOT_TYPE = eINSTANCE.getCommand_RobotType();

    /**
     * The meta object literal for the '<em><b>Robot Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__ROBOT_NAME = eINSTANCE.getCommand_RobotName();

    /**
     * The meta object literal for the '<em><b>XValue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__XVALUE = eINSTANCE.getCommand_XValue();

    /**
     * The meta object literal for the '<em><b>YValue</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMMAND__YVALUE = eINSTANCE.getCommand_YValue();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotNameImpl <em>Robot Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotNameImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRobotName()
     * @generated
     */
    EClass ROBOT_NAME = eINSTANCE.getRobotName();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ROBOT_NAME__VALUE = eINSTANCE.getRobotName_Value();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.PositionValueImpl <em>Position Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.PositionValueImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getPositionValue()
     * @generated
     */
    EClass POSITION_VALUE = eINSTANCE.getPositionValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POSITION_VALUE__VALUE = eINSTANCE.getPositionValue_Value();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandTypeImpl <em>Command Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.CommandTypeImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getCommandType()
     * @generated
     */
    EClass COMMAND_TYPE = eINSTANCE.getCommandType();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMMAND_TYPE__VALUE = eINSTANCE.getCommandType_Value();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.AddRobotImpl <em>Add Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.AddRobotImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getAddRobot()
     * @generated
     */
    EClass ADD_ROBOT = eINSTANCE.getAddRobot();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.impl.RemoveRobotImpl <em>Remove Robot</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RemoveRobotImpl
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRemoveRobot()
     * @generated
     */
    EClass REMOVE_ROBOT = eINSTANCE.getRemoveRobot();

    /**
     * The meta object literal for the '{@link org.gunnarkleiven.robotgenerator.robotgenerator.RobotType <em>Robot Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotType
     * @see org.gunnarkleiven.robotgenerator.robotgenerator.impl.RobotgeneratorPackageImpl#getRobotType()
     * @generated
     */
    EEnum ROBOT_TYPE = eINSTANCE.getRobotType();

  }

} //RobotgeneratorPackage