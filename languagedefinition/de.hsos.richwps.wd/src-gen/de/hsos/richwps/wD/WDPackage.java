/**
 */
package de.hsos.richwps.wD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hsos.richwps.wD.WDFactory
 * @model kind="package"
 * @generated
 */
public interface WDPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "wD";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hsos.de/richwps/WD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "wD";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WDPackage eINSTANCE = de.hsos.richwps.wD.impl.WDPackageImpl.init();

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.WorksequenceImpl <em>Worksequence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.WorksequenceImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getWorksequence()
   * @generated
   */
  int WORKSEQUENCE = 0;

  /**
   * The feature id for the '<em><b>Operations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSEQUENCE__OPERATIONS = 0;

  /**
   * The number of structural features of the '<em>Worksequence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSEQUENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.OperationImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 1;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.LocalBindingImpl <em>Local Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.LocalBindingImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getLocalBinding()
   * @generated
   */
  int LOCAL_BINDING = 2;

  /**
   * The feature id for the '<em><b>Processid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING__PROCESSID = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING__HANDLE = OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_BINDING_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.RemoteBindingImpl <em>Remote Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.RemoteBindingImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getRemoteBinding()
   * @generated
   */
  int REMOTE_BINDING = 3;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PROTOCOL = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Host</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__HOST = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Port</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PORT = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PATH = OPERATION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Processid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__PROCESSID = OPERATION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING__HANDLE = OPERATION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Remote Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMOTE_BINDING_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.ExecuteStatementImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecuteStatement()
   * @generated
   */
  int EXECUTE_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Handle</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__HANDLE = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Execinputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__EXECINPUTS = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Execoutputs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT__EXECOUTPUTS = OPERATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Execute Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTE_STATEMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.ExecInputImpl <em>Exec Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.ExecInputImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecInput()
   * @generated
   */
  int EXEC_INPUT = 5;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Wpsid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT__WPSID = 1;

  /**
   * The number of structural features of the '<em>Exec Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_INPUT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.ExecOutputImpl <em>Exec Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.ExecOutputImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecOutput()
   * @generated
   */
  int EXEC_OUTPUT = 6;

  /**
   * The feature id for the '<em><b>Wpsid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT__WPSID = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Wpside</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT__WPSIDE = 2;

  /**
   * The number of structural features of the '<em>Exec Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXEC_OUTPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.hsos.richwps.wD.impl.AssignmentImpl <em>Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.hsos.richwps.wD.impl.AssignmentImpl
   * @see de.hsos.richwps.wD.impl.WDPackageImpl#getAssignment()
   * @generated
   */
  int ASSIGNMENT = 7;

  /**
   * The feature id for the '<em><b>Lefthand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__LEFTHAND = OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Righthand</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__RIGHTHAND = OPERATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val s</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VAL_S = OPERATION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Val i</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT__VAL_I = OPERATION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.Worksequence <em>Worksequence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Worksequence</em>'.
   * @see de.hsos.richwps.wD.Worksequence
   * @generated
   */
  EClass getWorksequence();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.wD.Worksequence#getOperations <em>Operations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operations</em>'.
   * @see de.hsos.richwps.wD.Worksequence#getOperations()
   * @see #getWorksequence()
   * @generated
   */
  EReference getWorksequence_Operations();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see de.hsos.richwps.wD.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.LocalBinding <em>Local Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Binding</em>'.
   * @see de.hsos.richwps.wD.LocalBinding
   * @generated
   */
  EClass getLocalBinding();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.LocalBinding#getProcessid <em>Processid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processid</em>'.
   * @see de.hsos.richwps.wD.LocalBinding#getProcessid()
   * @see #getLocalBinding()
   * @generated
   */
  EAttribute getLocalBinding_Processid();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.LocalBinding#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.wD.LocalBinding#getHandle()
   * @see #getLocalBinding()
   * @generated
   */
  EAttribute getLocalBinding_Handle();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.RemoteBinding <em>Remote Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Remote Binding</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding
   * @generated
   */
  EClass getRemoteBinding();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Protocol</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getProtocol()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Protocol();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Host</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getHost()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Host();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Port</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getPort()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Port();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getPath()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Path();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getProcessid <em>Processid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Processid</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getProcessid()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Processid();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.RemoteBinding#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.wD.RemoteBinding#getHandle()
   * @see #getRemoteBinding()
   * @generated
   */
  EAttribute getRemoteBinding_Handle();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.ExecuteStatement <em>Execute Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execute Statement</em>'.
   * @see de.hsos.richwps.wD.ExecuteStatement
   * @generated
   */
  EClass getExecuteStatement();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecuteStatement#getHandle <em>Handle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Handle</em>'.
   * @see de.hsos.richwps.wD.ExecuteStatement#getHandle()
   * @see #getExecuteStatement()
   * @generated
   */
  EAttribute getExecuteStatement_Handle();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.wD.ExecuteStatement#getExecinputs <em>Execinputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Execinputs</em>'.
   * @see de.hsos.richwps.wD.ExecuteStatement#getExecinputs()
   * @see #getExecuteStatement()
   * @generated
   */
  EReference getExecuteStatement_Execinputs();

  /**
   * Returns the meta object for the containment reference list '{@link de.hsos.richwps.wD.ExecuteStatement#getExecoutputs <em>Execoutputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Execoutputs</em>'.
   * @see de.hsos.richwps.wD.ExecuteStatement#getExecoutputs()
   * @see #getExecuteStatement()
   * @generated
   */
  EReference getExecuteStatement_Execoutputs();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.ExecInput <em>Exec Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Input</em>'.
   * @see de.hsos.richwps.wD.ExecInput
   * @generated
   */
  EClass getExecInput();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecInput#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.hsos.richwps.wD.ExecInput#getReference()
   * @see #getExecInput()
   * @generated
   */
  EAttribute getExecInput_Reference();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecInput#getWpsid <em>Wpsid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wpsid</em>'.
   * @see de.hsos.richwps.wD.ExecInput#getWpsid()
   * @see #getExecInput()
   * @generated
   */
  EAttribute getExecInput_Wpsid();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.ExecOutput <em>Exec Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exec Output</em>'.
   * @see de.hsos.richwps.wD.ExecOutput
   * @generated
   */
  EClass getExecOutput();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecOutput#getWpsid <em>Wpsid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wpsid</em>'.
   * @see de.hsos.richwps.wD.ExecOutput#getWpsid()
   * @see #getExecOutput()
   * @generated
   */
  EAttribute getExecOutput_Wpsid();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecOutput#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see de.hsos.richwps.wD.ExecOutput#getReference()
   * @see #getExecOutput()
   * @generated
   */
  EAttribute getExecOutput_Reference();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.ExecOutput#getWpside <em>Wpside</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wpside</em>'.
   * @see de.hsos.richwps.wD.ExecOutput#getWpside()
   * @see #getExecOutput()
   * @generated
   */
  EAttribute getExecOutput_Wpside();

  /**
   * Returns the meta object for class '{@link de.hsos.richwps.wD.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assignment</em>'.
   * @see de.hsos.richwps.wD.Assignment
   * @generated
   */
  EClass getAssignment();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.Assignment#getLefthand <em>Lefthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lefthand</em>'.
   * @see de.hsos.richwps.wD.Assignment#getLefthand()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Lefthand();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.Assignment#getRighthand <em>Righthand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Righthand</em>'.
   * @see de.hsos.richwps.wD.Assignment#getRighthand()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Righthand();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.Assignment#getVal_s <em>Val s</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val s</em>'.
   * @see de.hsos.richwps.wD.Assignment#getVal_s()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Val_s();

  /**
   * Returns the meta object for the attribute '{@link de.hsos.richwps.wD.Assignment#getVal_i <em>Val i</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val i</em>'.
   * @see de.hsos.richwps.wD.Assignment#getVal_i()
   * @see #getAssignment()
   * @generated
   */
  EAttribute getAssignment_Val_i();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WDFactory getWDFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.WorksequenceImpl <em>Worksequence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.WorksequenceImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getWorksequence()
     * @generated
     */
    EClass WORKSEQUENCE = eINSTANCE.getWorksequence();

    /**
     * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSEQUENCE__OPERATIONS = eINSTANCE.getWorksequence_Operations();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.OperationImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.LocalBindingImpl <em>Local Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.LocalBindingImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getLocalBinding()
     * @generated
     */
    EClass LOCAL_BINDING = eINSTANCE.getLocalBinding();

    /**
     * The meta object literal for the '<em><b>Processid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_BINDING__PROCESSID = eINSTANCE.getLocalBinding_Processid();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_BINDING__HANDLE = eINSTANCE.getLocalBinding_Handle();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.RemoteBindingImpl <em>Remote Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.RemoteBindingImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getRemoteBinding()
     * @generated
     */
    EClass REMOTE_BINDING = eINSTANCE.getRemoteBinding();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PROTOCOL = eINSTANCE.getRemoteBinding_Protocol();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__HOST = eINSTANCE.getRemoteBinding_Host();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PORT = eINSTANCE.getRemoteBinding_Port();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PATH = eINSTANCE.getRemoteBinding_Path();

    /**
     * The meta object literal for the '<em><b>Processid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__PROCESSID = eINSTANCE.getRemoteBinding_Processid();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REMOTE_BINDING__HANDLE = eINSTANCE.getRemoteBinding_Handle();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.ExecuteStatementImpl <em>Execute Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.ExecuteStatementImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecuteStatement()
     * @generated
     */
    EClass EXECUTE_STATEMENT = eINSTANCE.getExecuteStatement();

    /**
     * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTE_STATEMENT__HANDLE = eINSTANCE.getExecuteStatement_Handle();

    /**
     * The meta object literal for the '<em><b>Execinputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_STATEMENT__EXECINPUTS = eINSTANCE.getExecuteStatement_Execinputs();

    /**
     * The meta object literal for the '<em><b>Execoutputs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXECUTE_STATEMENT__EXECOUTPUTS = eINSTANCE.getExecuteStatement_Execoutputs();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.ExecInputImpl <em>Exec Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.ExecInputImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecInput()
     * @generated
     */
    EClass EXEC_INPUT = eINSTANCE.getExecInput();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_INPUT__REFERENCE = eINSTANCE.getExecInput_Reference();

    /**
     * The meta object literal for the '<em><b>Wpsid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_INPUT__WPSID = eINSTANCE.getExecInput_Wpsid();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.ExecOutputImpl <em>Exec Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.ExecOutputImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getExecOutput()
     * @generated
     */
    EClass EXEC_OUTPUT = eINSTANCE.getExecOutput();

    /**
     * The meta object literal for the '<em><b>Wpsid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_OUTPUT__WPSID = eINSTANCE.getExecOutput_Wpsid();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_OUTPUT__REFERENCE = eINSTANCE.getExecOutput_Reference();

    /**
     * The meta object literal for the '<em><b>Wpside</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXEC_OUTPUT__WPSIDE = eINSTANCE.getExecOutput_Wpside();

    /**
     * The meta object literal for the '{@link de.hsos.richwps.wD.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hsos.richwps.wD.impl.AssignmentImpl
     * @see de.hsos.richwps.wD.impl.WDPackageImpl#getAssignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getAssignment();

    /**
     * The meta object literal for the '<em><b>Lefthand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__LEFTHAND = eINSTANCE.getAssignment_Lefthand();

    /**
     * The meta object literal for the '<em><b>Righthand</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__RIGHTHAND = eINSTANCE.getAssignment_Righthand();

    /**
     * The meta object literal for the '<em><b>Val s</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VAL_S = eINSTANCE.getAssignment_Val_s();

    /**
     * The meta object literal for the '<em><b>Val i</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSIGNMENT__VAL_I = eINSTANCE.getAssignment_Val_i();

  }

} //WDPackage
