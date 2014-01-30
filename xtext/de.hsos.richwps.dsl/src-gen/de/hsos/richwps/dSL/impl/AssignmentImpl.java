/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.Assignment;
import de.hsos.richwps.dSL.DSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getLefthand <em>Lefthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getRighthand <em>Righthand</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getVal_s <em>Val s</em>}</li>
 *   <li>{@link de.hsos.richwps.dSL.impl.AssignmentImpl#getVal_i <em>Val i</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends OperationImpl implements Assignment
{
  /**
   * The default value of the '{@link #getLefthand() <em>Lefthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLefthand()
   * @generated
   * @ordered
   */
  protected static final String LEFTHAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLefthand() <em>Lefthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLefthand()
   * @generated
   * @ordered
   */
  protected String lefthand = LEFTHAND_EDEFAULT;

  /**
   * The default value of the '{@link #getRighthand() <em>Righthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRighthand()
   * @generated
   * @ordered
   */
  protected static final String RIGHTHAND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRighthand() <em>Righthand</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRighthand()
   * @generated
   * @ordered
   */
  protected String righthand = RIGHTHAND_EDEFAULT;

  /**
   * The default value of the '{@link #getVal_s() <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_s()
   * @generated
   * @ordered
   */
  protected static final String VAL_S_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal_s() <em>Val s</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_s()
   * @generated
   * @ordered
   */
  protected String val_s = VAL_S_EDEFAULT;

  /**
   * The default value of the '{@link #getVal_i() <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_i()
   * @generated
   * @ordered
   */
  protected static final int VAL_I_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal_i() <em>Val i</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_i()
   * @generated
   * @ordered
   */
  protected int val_i = VAL_I_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return DSLPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLefthand()
  {
    return lefthand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLefthand(String newLefthand)
  {
    String oldLefthand = lefthand;
    lefthand = newLefthand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__LEFTHAND, oldLefthand, lefthand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRighthand()
  {
    return righthand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRighthand(String newRighthand)
  {
    String oldRighthand = righthand;
    righthand = newRighthand;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__RIGHTHAND, oldRighthand, righthand));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal_s()
  {
    return val_s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_s(String newVal_s)
  {
    String oldVal_s = val_s;
    val_s = newVal_s;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__VAL_S, oldVal_s, val_s));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVal_i()
  {
    return val_i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal_i(int newVal_i)
  {
    int oldVal_i = val_i;
    val_i = newVal_i;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DSLPackage.ASSIGNMENT__VAL_I, oldVal_i, val_i));
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        return getLefthand();
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        return getRighthand();
      case DSLPackage.ASSIGNMENT__VAL_S:
        return getVal_s();
      case DSLPackage.ASSIGNMENT__VAL_I:
        return getVal_i();
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        setLefthand((String)newValue);
        return;
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        setRighthand((String)newValue);
        return;
      case DSLPackage.ASSIGNMENT__VAL_S:
        setVal_s((String)newValue);
        return;
      case DSLPackage.ASSIGNMENT__VAL_I:
        setVal_i((Integer)newValue);
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        setLefthand(LEFTHAND_EDEFAULT);
        return;
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        setRighthand(RIGHTHAND_EDEFAULT);
        return;
      case DSLPackage.ASSIGNMENT__VAL_S:
        setVal_s(VAL_S_EDEFAULT);
        return;
      case DSLPackage.ASSIGNMENT__VAL_I:
        setVal_i(VAL_I_EDEFAULT);
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
      case DSLPackage.ASSIGNMENT__LEFTHAND:
        return LEFTHAND_EDEFAULT == null ? lefthand != null : !LEFTHAND_EDEFAULT.equals(lefthand);
      case DSLPackage.ASSIGNMENT__RIGHTHAND:
        return RIGHTHAND_EDEFAULT == null ? righthand != null : !RIGHTHAND_EDEFAULT.equals(righthand);
      case DSLPackage.ASSIGNMENT__VAL_S:
        return VAL_S_EDEFAULT == null ? val_s != null : !VAL_S_EDEFAULT.equals(val_s);
      case DSLPackage.ASSIGNMENT__VAL_I:
        return val_i != VAL_I_EDEFAULT;
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
    result.append(" (lefthand: ");
    result.append(lefthand);
    result.append(", righthand: ");
    result.append(righthand);
    result.append(", val_s: ");
    result.append(val_s);
    result.append(", val_i: ");
    result.append(val_i);
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
