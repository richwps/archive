/**
 */
package de.hsos.richwps.wD.util;

import de.hsos.richwps.wD.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hsos.richwps.wD.WDPackage
 * @generated
 */
public class WDAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WDPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WDAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WDPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WDSwitch<Adapter> modelSwitch =
    new WDSwitch<Adapter>()
    {
      @Override
      public Adapter caseWorksequence(Worksequence object)
      {
        return createWorksequenceAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseLocalBinding(LocalBinding object)
      {
        return createLocalBindingAdapter();
      }
      @Override
      public Adapter caseRemoteBinding(RemoteBinding object)
      {
        return createRemoteBindingAdapter();
      }
      @Override
      public Adapter caseExecuteStatement(ExecuteStatement object)
      {
        return createExecuteStatementAdapter();
      }
      @Override
      public Adapter caseExecInput(ExecInput object)
      {
        return createExecInputAdapter();
      }
      @Override
      public Adapter caseExecOutput(ExecOutput object)
      {
        return createExecOutputAdapter();
      }
      @Override
      public Adapter caseAssignment(Assignment object)
      {
        return createAssignmentAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.Worksequence <em>Worksequence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.Worksequence
   * @generated
   */
  public Adapter createWorksequenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.LocalBinding <em>Local Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.LocalBinding
   * @generated
   */
  public Adapter createLocalBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.RemoteBinding <em>Remote Binding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.RemoteBinding
   * @generated
   */
  public Adapter createRemoteBindingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.ExecuteStatement <em>Execute Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.ExecuteStatement
   * @generated
   */
  public Adapter createExecuteStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.ExecInput <em>Exec Input</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.ExecInput
   * @generated
   */
  public Adapter createExecInputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.ExecOutput <em>Exec Output</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.ExecOutput
   * @generated
   */
  public Adapter createExecOutputAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.hsos.richwps.wD.Assignment <em>Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.hsos.richwps.wD.Assignment
   * @generated
   */
  public Adapter createAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WDAdapterFactory
