/**
 */
package de.hsos.richwps.dSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.ExecInput#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.ExecInput#getWpsid <em>Wpsid</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.dSL.DSLPackage#getExecInput()
 * @model
 * @generated
 */
public interface ExecInput extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getExecInput_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.ExecInput#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Wpsid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wpsid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wpsid</em>' attribute.
   * @see #setWpsid(String)
   * @see de.hsos.richwps.dSL.DSLPackage#getExecInput_Wpsid()
   * @model
   * @generated
   */
  String getWpsid();

  /**
   * Sets the value of the '{@link de.hsos.richwps.dSL.ExecInput#getWpsid <em>Wpsid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wpsid</em>' attribute.
   * @see #getWpsid()
   * @generated
   */
  void setWpsid(String value);

} // ExecInput
