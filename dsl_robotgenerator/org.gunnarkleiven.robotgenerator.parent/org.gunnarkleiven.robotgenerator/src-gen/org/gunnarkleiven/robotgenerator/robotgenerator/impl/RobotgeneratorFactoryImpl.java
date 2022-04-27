/**
 * generated by Xtext 2.25.0
 */
package org.gunnarkleiven.robotgenerator.robotgenerator.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gunnarkleiven.robotgenerator.robotgenerator.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotgeneratorFactoryImpl extends EFactoryImpl implements RobotgeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RobotgeneratorFactory init()
  {
    try
    {
      RobotgeneratorFactory theRobotgeneratorFactory = (RobotgeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(RobotgeneratorPackage.eNS_URI);
      if (theRobotgeneratorFactory != null)
      {
        return theRobotgeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RobotgeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotgeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RobotgeneratorPackage.MODEL: return createModel();
      case RobotgeneratorPackage.COMMAND: return createCommand();
      case RobotgeneratorPackage.ROBOT_NAME: return createRobotName();
      case RobotgeneratorPackage.POSITION_VALUE: return createPositionValue();
      case RobotgeneratorPackage.COMMAND_TYPE: return createCommandType();
      case RobotgeneratorPackage.ADD_ROBOT: return createAddRobot();
      case RobotgeneratorPackage.REMOVE_ROBOT: return createRemoveRobot();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RobotgeneratorPackage.ROBOT_TYPE:
        return createRobotTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case RobotgeneratorPackage.ROBOT_TYPE:
        return convertRobotTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Command createCommand()
  {
    CommandImpl command = new CommandImpl();
    return command;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RobotName createRobotName()
  {
    RobotNameImpl robotName = new RobotNameImpl();
    return robotName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PositionValue createPositionValue()
  {
    PositionValueImpl positionValue = new PositionValueImpl();
    return positionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CommandType createCommandType()
  {
    CommandTypeImpl commandType = new CommandTypeImpl();
    return commandType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AddRobot createAddRobot()
  {
    AddRobotImpl addRobot = new AddRobotImpl();
    return addRobot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RemoveRobot createRemoveRobot()
  {
    RemoveRobotImpl removeRobot = new RemoveRobotImpl();
    return removeRobot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RobotType createRobotTypeFromString(EDataType eDataType, String initialValue)
  {
    RobotType result = RobotType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertRobotTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RobotgeneratorPackage getRobotgeneratorPackage()
  {
    return (RobotgeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RobotgeneratorPackage getPackage()
  {
    return RobotgeneratorPackage.eINSTANCE;
  }

} //RobotgeneratorFactoryImpl
