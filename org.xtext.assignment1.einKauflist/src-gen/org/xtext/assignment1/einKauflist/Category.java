/**
 */
package org.xtext.assignment1.einKauflist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.assignment1.einKauflist.Category#getCategoryName <em>Category Name</em>}</li>
 *   <li>{@link org.xtext.assignment1.einKauflist.Category#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getCategory()
 * @model
 * @generated
 */
public interface Category extends EObject
{
  /**
   * Returns the value of the '<em><b>Category Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category Name</em>' attribute.
   * @see #setCategoryName(String)
   * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getCategory_CategoryName()
   * @model
   * @generated
   */
  String getCategoryName();

  /**
   * Sets the value of the '{@link org.xtext.assignment1.einKauflist.Category#getCategoryName <em>Category Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Category Name</em>' attribute.
   * @see #getCategoryName()
   * @generated
   */
  void setCategoryName(String value);

  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.assignment1.einKauflist.Item}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getCategory_Items()
   * @model containment="true"
   * @generated
   */
  EList<Item> getItems();

} // Category
