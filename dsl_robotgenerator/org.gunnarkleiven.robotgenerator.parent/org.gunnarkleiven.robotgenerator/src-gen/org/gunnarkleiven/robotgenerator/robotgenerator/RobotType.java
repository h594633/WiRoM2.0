/**
 * generated by Xtext 2.25.0
 */
package org.gunnarkleiven.robotgenerator.robotgenerator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Robot Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.gunnarkleiven.robotgenerator.robotgenerator.RobotgeneratorPackage#getRobotType()
 * @model
 * @generated
 */
public enum RobotType implements Enumerator
{
  /**
   * The '<em><b>MOOSE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOOSE_VALUE
   * @generated
   * @ordered
   */
  MOOSE(0, "MOOSE", "moose"),

  /**
   * The '<em><b>MAVIC2PRO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAVIC2PRO_VALUE
   * @generated
   * @ordered
   */
  MAVIC2PRO(1, "MAVIC2PRO", "mavic2pro"),

  /**
   * The '<em><b>OP2</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OP2_VALUE
   * @generated
   * @ordered
   */
  OP2(2, "OP2", "op2"),

  /**
   * The '<em><b>BB8</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BB8_VALUE
   * @generated
   * @ordered
   */
  BB8(3, "BB8", "bb8");

  /**
   * The '<em><b>MOOSE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOOSE
   * @model literal="moose"
   * @generated
   * @ordered
   */
  public static final int MOOSE_VALUE = 0;

  /**
   * The '<em><b>MAVIC2PRO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAVIC2PRO
   * @model literal="mavic2pro"
   * @generated
   * @ordered
   */
  public static final int MAVIC2PRO_VALUE = 1;

  /**
   * The '<em><b>OP2</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OP2
   * @model literal="op2"
   * @generated
   * @ordered
   */
  public static final int OP2_VALUE = 2;

  /**
   * The '<em><b>BB8</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BB8
   * @model literal="bb8"
   * @generated
   * @ordered
   */
  public static final int BB8_VALUE = 3;

  /**
   * An array of all the '<em><b>Robot Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final RobotType[] VALUES_ARRAY =
    new RobotType[]
    {
      MOOSE,
      MAVIC2PRO,
      OP2,
      BB8,
    };

  /**
   * A public read-only list of all the '<em><b>Robot Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<RobotType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Robot Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RobotType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RobotType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Robot Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RobotType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      RobotType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Robot Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static RobotType get(int value)
  {
    switch (value)
    {
      case MOOSE_VALUE: return MOOSE;
      case MAVIC2PRO_VALUE: return MAVIC2PRO;
      case OP2_VALUE: return OP2;
      case BB8_VALUE: return BB8;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private RobotType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //RobotType