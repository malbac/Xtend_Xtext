/**
 */
package org.xtext.assignment1.einKauflist;

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
 * @see org.xtext.assignment1.einKauflist.EinKauflistFactory
 * @model kind="package"
 * @generated
 */
public interface EinKauflistPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "einKauflist";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/assignment1/EinKauflist";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "einKauflist";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EinKauflistPackage eINSTANCE = org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.assignment1.einKauflist.impl.BuyticketImpl <em>Buyticket</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.assignment1.einKauflist.impl.BuyticketImpl
   * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getBuyticket()
   * @generated
   */
  int BUYTICKET = 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUYTICKET__CATEGORY = 0;

  /**
   * The number of structural features of the '<em>Buyticket</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUYTICKET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.assignment1.einKauflist.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.assignment1.einKauflist.impl.CategoryImpl
   * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 1;

  /**
   * The feature id for the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__CATEGORY_NAME = 0;

  /**
   * The feature id for the '<em><b>Items</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__ITEMS = 1;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.assignment1.einKauflist.impl.ItemImpl <em>Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.assignment1.einKauflist.impl.ItemImpl
   * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getItem()
   * @generated
   */
  int ITEM = 2;

  /**
   * The feature id for the '<em><b>Item Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__ITEM_NAME = 0;

  /**
   * The feature id for the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM__PRICE = 1;

  /**
   * The number of structural features of the '<em>Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.xtext.assignment1.einKauflist.Buyticket <em>Buyticket</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Buyticket</em>'.
   * @see org.xtext.assignment1.einKauflist.Buyticket
   * @generated
   */
  EClass getBuyticket();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.assignment1.einKauflist.Buyticket#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see org.xtext.assignment1.einKauflist.Buyticket#getCategory()
   * @see #getBuyticket()
   * @generated
   */
  EReference getBuyticket_Category();

  /**
   * Returns the meta object for class '{@link org.xtext.assignment1.einKauflist.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see org.xtext.assignment1.einKauflist.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.assignment1.einKauflist.Category#getCategoryName <em>Category Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Category Name</em>'.
   * @see org.xtext.assignment1.einKauflist.Category#getCategoryName()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_CategoryName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.assignment1.einKauflist.Category#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Items</em>'.
   * @see org.xtext.assignment1.einKauflist.Category#getItems()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Items();

  /**
   * Returns the meta object for class '{@link org.xtext.assignment1.einKauflist.Item <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item</em>'.
   * @see org.xtext.assignment1.einKauflist.Item
   * @generated
   */
  EClass getItem();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.assignment1.einKauflist.Item#getItemName <em>Item Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item Name</em>'.
   * @see org.xtext.assignment1.einKauflist.Item#getItemName()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_ItemName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.assignment1.einKauflist.Item#getPrice <em>Price</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Price</em>'.
   * @see org.xtext.assignment1.einKauflist.Item#getPrice()
   * @see #getItem()
   * @generated
   */
  EAttribute getItem_Price();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EinKauflistFactory getEinKauflistFactory();

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
     * The meta object literal for the '{@link org.xtext.assignment1.einKauflist.impl.BuyticketImpl <em>Buyticket</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.assignment1.einKauflist.impl.BuyticketImpl
     * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getBuyticket()
     * @generated
     */
    EClass BUYTICKET = eINSTANCE.getBuyticket();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUYTICKET__CATEGORY = eINSTANCE.getBuyticket_Category();

    /**
     * The meta object literal for the '{@link org.xtext.assignment1.einKauflist.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.assignment1.einKauflist.impl.CategoryImpl
     * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Category Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__CATEGORY_NAME = eINSTANCE.getCategory_CategoryName();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__ITEMS = eINSTANCE.getCategory_Items();

    /**
     * The meta object literal for the '{@link org.xtext.assignment1.einKauflist.impl.ItemImpl <em>Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.assignment1.einKauflist.impl.ItemImpl
     * @see org.xtext.assignment1.einKauflist.impl.EinKauflistPackageImpl#getItem()
     * @generated
     */
    EClass ITEM = eINSTANCE.getItem();

    /**
     * The meta object literal for the '<em><b>Item Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__ITEM_NAME = eINSTANCE.getItem_ItemName();

    /**
     * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

  }

} //EinKauflistPackage
