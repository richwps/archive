/**
 */
package de.hsos.richwps.wD.impl;

import de.hsos.richwps.wD.Assignment;
import de.hsos.richwps.wD.ExecInput;
import de.hsos.richwps.wD.ExecOutput;
import de.hsos.richwps.wD.ExecuteStatement;
import de.hsos.richwps.wD.LocalBinding;
import de.hsos.richwps.wD.Operation;
import de.hsos.richwps.wD.RemoteBinding;
import de.hsos.richwps.wD.WDFactory;
import de.hsos.richwps.wD.WDPackage;
import de.hsos.richwps.wD.Worksequence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WDPackageImpl extends EPackageImpl implements WDPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass worksequenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass operationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass remoteBindingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executeStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execInputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass execOutputEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assignmentEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.hsos.richwps.wD.WDPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WDPackageImpl()
  {
    super(eNS_URI, WDFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WDPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WDPackage init()
  {
    if (isInited) return (WDPackage)EPackage.Registry.INSTANCE.getEPackage(WDPackage.eNS_URI);

    // Obtain or create and register package
    WDPackageImpl theWDPackage = (WDPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WDPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WDPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWDPackage.createPackageContents();

    // Initialize created meta-data
    theWDPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWDPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WDPackage.eNS_URI, theWDPackage);
    return theWDPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWorksequence()
  {
    return worksequenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWorksequence_Operations()
  {
    return (EReference)worksequenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOperation()
  {
    return operationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalBinding()
  {
    return localBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalBinding_Processid()
  {
    return (EAttribute)localBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalBinding_Handle()
  {
    return (EAttribute)localBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRemoteBinding()
  {
    return remoteBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Protocol()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Host()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Port()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Path()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Processid()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRemoteBinding_Handle()
  {
    return (EAttribute)remoteBindingEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecuteStatement()
  {
    return executeStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecuteStatement_Handle()
  {
    return (EAttribute)executeStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteStatement_Execinputs()
  {
    return (EReference)executeStatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExecuteStatement_Execoutputs()
  {
    return (EReference)executeStatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecInput()
  {
    return execInputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecInput_Reference()
  {
    return (EAttribute)execInputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecInput_Wpsid()
  {
    return (EAttribute)execInputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecOutput()
  {
    return execOutputEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecOutput_Wpsid()
  {
    return (EAttribute)execOutputEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecOutput_Reference()
  {
    return (EAttribute)execOutputEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExecOutput_Wpside()
  {
    return (EAttribute)execOutputEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssignment()
  {
    return assignmentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Lefthand()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Righthand()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Val_s()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAssignment_Val_i()
  {
    return (EAttribute)assignmentEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WDFactory getWDFactory()
  {
    return (WDFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    worksequenceEClass = createEClass(WORKSEQUENCE);
    createEReference(worksequenceEClass, WORKSEQUENCE__OPERATIONS);

    operationEClass = createEClass(OPERATION);

    localBindingEClass = createEClass(LOCAL_BINDING);
    createEAttribute(localBindingEClass, LOCAL_BINDING__PROCESSID);
    createEAttribute(localBindingEClass, LOCAL_BINDING__HANDLE);

    remoteBindingEClass = createEClass(REMOTE_BINDING);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PROTOCOL);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__HOST);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PORT);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PATH);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__PROCESSID);
    createEAttribute(remoteBindingEClass, REMOTE_BINDING__HANDLE);

    executeStatementEClass = createEClass(EXECUTE_STATEMENT);
    createEAttribute(executeStatementEClass, EXECUTE_STATEMENT__HANDLE);
    createEReference(executeStatementEClass, EXECUTE_STATEMENT__EXECINPUTS);
    createEReference(executeStatementEClass, EXECUTE_STATEMENT__EXECOUTPUTS);

    execInputEClass = createEClass(EXEC_INPUT);
    createEAttribute(execInputEClass, EXEC_INPUT__REFERENCE);
    createEAttribute(execInputEClass, EXEC_INPUT__WPSID);

    execOutputEClass = createEClass(EXEC_OUTPUT);
    createEAttribute(execOutputEClass, EXEC_OUTPUT__WPSID);
    createEAttribute(execOutputEClass, EXEC_OUTPUT__REFERENCE);
    createEAttribute(execOutputEClass, EXEC_OUTPUT__WPSIDE);

    assignmentEClass = createEClass(ASSIGNMENT);
    createEAttribute(assignmentEClass, ASSIGNMENT__LEFTHAND);
    createEAttribute(assignmentEClass, ASSIGNMENT__RIGHTHAND);
    createEAttribute(assignmentEClass, ASSIGNMENT__VAL_S);
    createEAttribute(assignmentEClass, ASSIGNMENT__VAL_I);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    localBindingEClass.getESuperTypes().add(this.getOperation());
    remoteBindingEClass.getESuperTypes().add(this.getOperation());
    executeStatementEClass.getESuperTypes().add(this.getOperation());
    assignmentEClass.getESuperTypes().add(this.getOperation());

    // Initialize classes and features; add operations and parameters
    initEClass(worksequenceEClass, Worksequence.class, "Worksequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWorksequence_Operations(), this.getOperation(), null, "operations", null, 0, -1, Worksequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(localBindingEClass, LocalBinding.class, "LocalBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalBinding_Processid(), ecorePackage.getEString(), "processid", null, 0, 1, LocalBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLocalBinding_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, LocalBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(remoteBindingEClass, RemoteBinding.class, "RemoteBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRemoteBinding_Protocol(), ecorePackage.getEString(), "protocol", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Host(), ecorePackage.getEString(), "host", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Port(), ecorePackage.getEInt(), "port", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Path(), ecorePackage.getEString(), "path", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Processid(), ecorePackage.getEString(), "processid", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRemoteBinding_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, RemoteBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(executeStatementEClass, ExecuteStatement.class, "ExecuteStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecuteStatement_Handle(), ecorePackage.getEString(), "handle", null, 0, 1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteStatement_Execinputs(), this.getExecInput(), null, "execinputs", null, 0, -1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExecuteStatement_Execoutputs(), this.getExecOutput(), null, "execoutputs", null, 0, -1, ExecuteStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execInputEClass, ExecInput.class, "ExecInput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecInput_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ExecInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecInput_Wpsid(), ecorePackage.getEString(), "wpsid", null, 0, 1, ExecInput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(execOutputEClass, ExecOutput.class, "ExecOutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExecOutput_Wpsid(), ecorePackage.getEString(), "wpsid", null, 0, 1, ExecOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecOutput_Reference(), ecorePackage.getEString(), "reference", null, 0, 1, ExecOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExecOutput_Wpside(), ecorePackage.getEString(), "wpside", null, 0, 1, ExecOutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(assignmentEClass, Assignment.class, "Assignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAssignment_Lefthand(), ecorePackage.getEString(), "lefthand", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Righthand(), ecorePackage.getEString(), "righthand", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Val_s(), ecorePackage.getEString(), "val_s", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAssignment_Val_i(), ecorePackage.getEInt(), "val_i", null, 0, 1, Assignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //WDPackageImpl
