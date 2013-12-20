/**
 */
package de.hsos.richwps.wD;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hsos.richwps.wD.Assignment#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.Assignment#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.Assignment#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.Assignment#getVal_i <em>Val i</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hsos.richwps.wD.WDPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Operation
{
  /**
   * Returns the value of the '<em><b>Lefthand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lefthand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lefthand</em>' attribute.
   * @see #setLefthand(String)
   * @see de.hsos.richwps.wD.WDPackage#getAssignment_Lefthand()
   * @model
   * @generated
   */
  String getLefthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.Assignment#getLefthand <em>Lefthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lefthand</em>' attribute.
   * @see #getLefthand()
   * @generated
   */
  void setLefthand(String value);

  /**
   * Returns the value of the '<em><b>Righthand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Righthand</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Righthand</em>' attribute.
   * @see #setRighthand(String)
   * @see de.hsos.richwps.wD.WDPackage#getAssignment_Righthand()
   * @model
   * @generated
   */
  String getRighthand();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.Assignment#getRighthand <em>Righthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Righthand</em>' attribute.
   * @see #getRighthand()
   * @generated
   */
  void setRighthand(String value);

  /**
   * Returns the value of the '<em><b>Val s</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val s</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val s</em>' attribute.
   * @see #setVal_s(String)
   * @see de.hsos.richwps.wD.WDPackage#getAssignment_Val_s()
   * @model
   * @generated
   */
  String getVal_s();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.Assignment#getVal_s <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val s</em>' attribute.
   * @see #getVal_s()
   * @generated
   */
  void setVal_s(String value);

  /**
   * Returns the value of the '<em><b>Val i</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val i</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val i</em>' attribute.
   * @see #setVal_i(int)
   * @see de.hsos.richwps.wD.WDPackage#getAssignment_Val_i()
   * @model
   * @generated
   */
  int getVal_i();

  /**
   * Sets the value of the '{@link de.hsos.richwps.wD.Assignment#getVal_i <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val i</em>' attribute.
   * @see #getVal_i()
   * @generated
   */
  void setVal_i(int value);

} // Assignment
