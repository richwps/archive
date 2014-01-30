/**
 */
package de.hsos.richwps.wD;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exec Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.wD.ExecOutput#getWpsid <em>Wpsid</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.ExecOutput#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.ExecOutput#getWpside <em>Wpside</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.wD.WDPackage#getExecOutput()
 * @model
 * @generated
 */
public interface ExecOutput extends EObject
{
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
   * @see de.hsos.richwps.wD.WDPackage#getExecOutput_Wpsid()
   * @model
   * @generated
   */
  String getWpsid();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.ExecOutput#getWpsid <em>Wpsid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wpsid</em>' attribute.
   * @see #getWpsid()
   * @generated
   */
  void setWpsid(String value);

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
   * @see de.hsos.richwps.wD.WDPackage#getExecOutput_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.ExecOutput#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Wpside</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wpside</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wpside</em>' attribute.
   * @see #setWpside(String)
   * @see de.hsos.richwps.wD.WDPackage#getExecOutput_Wpside()
   * @model
   * @generated
   */
  String getWpside();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.ExecOutput#getWpside <em>Wpside</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wpside</em>' attribute.
   * @see #getWpside()
   * @generated
   */
  void setWpside(String value);

} // ExecOutput
