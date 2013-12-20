/**
 */
package de.hsos.richwps.wD.impl;

import de.hsos.richwps.wD.ExecInput;
import de.hsos.richwps.wD.WDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.wD.impl.ExecInputImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link de.hsos.richwps.wD.impl.ExecInputImpl#getWpsid <em>Wpsid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecInputImpl extends MinimalEObjectImpl.Container implements ExecInput
{
  /**
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getWpsid() <em>Wpsid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWpsid()
   * @generated
   * @ordered
   */
  protected static final String WPSID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWpsid() <em>Wpsid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWpsid()
   * @generated
   * @ordered
   */
  protected String wpsid = WPSID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecInputImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WDPackage.Literals.EXEC_INPUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WDPackage.EXEC_INPUT__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWpsid()
  {
    return wpsid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWpsid(String newWpsid)
  {
    String oldWpsid = wpsid;
    wpsid = newWpsid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WDPackage.EXEC_INPUT__WPSID, oldWpsid, wpsid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WDPackage.EXEC_INPUT__REFERENCE:
        return getReference();
      case WDPackage.EXEC_INPUT__WPSID:
        return getWpsid();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WDPackage.EXEC_INPUT__REFERENCE:
        setReference((String)newValue);
        return;
      case WDPackage.EXEC_INPUT__WPSID:
        setWpsid((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WDPackage.EXEC_INPUT__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case WDPackage.EXEC_INPUT__WPSID:
        setWpsid(WPSID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WDPackage.EXEC_INPUT__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
      case WDPackage.EXEC_INPUT__WPSID:
        return WPSID_EDEFAULT == null ? wpsid != null : !WPSID_EDEFAULT.equals(wpsid);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (reference: ");
    result.append(reference);
    result.append(", wpsid: ");
    result.append(wpsid);
    result.append(')');
    return result.toString();
  }

} //ExecInputImpl
