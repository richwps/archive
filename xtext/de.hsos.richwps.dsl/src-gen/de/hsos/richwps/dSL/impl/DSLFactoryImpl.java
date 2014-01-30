/**
 */
package de.hsos.richwps.dSL.impl;

import de.hsos.richwps.dSL.*;

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
public class DSLFactoryImpl extends EFactoryImpl implements DSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DSLFactory init()
  {
    try
    {
      DSLFactory theDSLFactory = (DSLFactory)EPackage.Registry.INSTANCE.getEFactory(DSLPackage.eNS_URI);
      if (theDSLFactory != null)
      {
        return theDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DSLFactoryImpl()
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
      case DSLPackage.WORKSEQUENCE: return createWorksequence();
      case DSLPackage.OPERATION: return createOperation();
      case DSLPackage.LOCAL_BINDING: return createLocalBinding();
      case DSLPackage.REMOTE_BINDING: return createRemoteBinding();
      case DSLPackage.EXECUTE_STATEMENT: return createExecuteStatement();
      case DSLPackage.EXEC_INPUT: return createExecInput();
      case DSLPackage.EXEC_OUTPUT: return createExecOutput();
      case DSLPackage.ASSIGNMENT: return createAssignment();
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
  public DSLPackage getDSLPackage()
  {
    return (DSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DSLPackage getPackage()
  {
    return DSLPackage.eINSTANCE;
  }

} //DSLFactoryImpl
