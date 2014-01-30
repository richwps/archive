/**
 */
package de.hsos.richwps.wD.impl;

import de.hsos.richwps.wD.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WDFactoryImpl extends EFactoryImpl implements WDFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static WDFactory init()
  {
    try
    {
      WDFactory theWDFactory = (WDFactory)EPackage.Registry.INSTANCE.getEFactory(WDPackage.eNS_URI);
      if (theWDFactory != null)
      {
        return theWDFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new WDFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WDFactoryImpl()
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
      case WDPackage.WORKSEQUENCE: return createWorksequence();
      case WDPackage.OPERATION: return createOperation();
      case WDPackage.LOCAL_BINDING: return createLocalBinding();
      case WDPackage.REMOTE_BINDING: return createRemoteBinding();
      case WDPackage.EXECUTE_STATEMENT: return createExecuteStatement();
      case WDPackage.EXEC_INPUT: return createExecInput();
      case WDPackage.EXEC_OUTPUT: return createExecOutput();
      case WDPackage.ASSIGNMENT: return createAssignment();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Worksequence createWorksequence()
  {
    WorksequenceImpl worksequence = new WorksequenceImpl();
    return worksequence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalBinding createLocalBinding()
  {
    LocalBindingImpl localBinding = new LocalBindingImpl();
    return localBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoteBinding createRemoteBinding()
  {
    RemoteBindingImpl remoteBinding = new RemoteBindingImpl();
    return remoteBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecuteStatement createExecuteStatement()
  {
    ExecuteStatementImpl executeStatement = new ExecuteStatementImpl();
    return executeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecInput createExecInput()
  {
    ExecInputImpl execInput = new ExecInputImpl();
    return execInput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExecOutput createExecOutput()
  {
    ExecOutputImpl execOutput = new ExecOutputImpl();
    return execOutput;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment createAssignment()
  {
    AssignmentImpl assignment = new AssignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WDPackage getWDPackage()
  {
    return (WDPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static WDPackage getPackage()
  {
    return WDPackage.eINSTANCE;
  }

} //WDFactoryImpl
