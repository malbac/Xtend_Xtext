/**
 */
package org.xtext.assignment1.einKauflist;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.assignment1.einKauflist.Item#getItemName <em>Item Name</em>}</li>
 *   <li>{@link org.xtext.assignment1.einKauflist.Item#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject
{
  /**
   * Returns the value of the '<em><b>Item Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item Name</em>' attribute.
   * @see #setItemName(String)
   * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getItem_ItemName()
   * @model
   * @generated
   */
  String getItemName();

  /**
   * Sets the value of the '{@link org.xtext.assignment1.einKauflist.Item#getItemName <em>Item Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item Name</em>' attribute.
   * @see #getItemName()
   * @generated
   */
  void setItemName(String value);

  /**
   * Returns the value of the '<em><b>Price</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Price</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Price</em>' attribute.
   * @see #setPrice(int)
   * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getItem_Price()
   * @model
   * @generated
   */
  int getPrice();

  /**
   * Sets the value of the '{@link org.xtext.assignment1.einKauflist.Item#getPrice <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Price</em>' attribute.
   * @see #getPrice()
   * @generated
   */
  void setPrice(int value);

} // Item
