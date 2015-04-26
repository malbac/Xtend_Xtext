/**
 */
package org.xtext.assignment1.einKauflist.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.assignment1.einKauflist.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EinKauflistFactoryImpl extends EFactoryImpl implements EinKauflistFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EinKauflistFactory init()
  {
    try
    {
      EinKauflistFactory theEinKauflistFactory = (EinKauflistFactory)EPackage.Registry.INSTANCE.getEFactory(EinKauflistPackage.eNS_URI);
      if (theEinKauflistFactory != null)
      {
        return theEinKauflistFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EinKauflistFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EinKauflistFactoryImpl()
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
      case EinKauflistPackage.BUYTICKET: return createBuyticket();
      case EinKauflistPackage.CATEGORY: return createCategory();
      case EinKauflistPackage.ITEM: return createItem();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Buyticket createBuyticket()
  {
    BuyticketImpl buyticket = new BuyticketImpl();
    return buyticket;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Category createCategory()
  {
    CategoryImpl category = new CategoryImpl();
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Item createItem()
  {
    ItemImpl item = new ItemImpl();
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EinKauflistPackage getEinKauflistPackage()
  {
    return (EinKauflistPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EinKauflistPackage getPackage()
  {
    return EinKauflistPackage.eINSTANCE;
  }

} //EinKauflistFactoryImpl
