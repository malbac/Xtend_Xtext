/**
 */
package org.xtext.assignment1.einKauflist;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buyticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.assignment1.einKauflist.Buyticket#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getBuyticket()
 * @model
 * @generated
 */
public interface Buyticket extends EObject
{
  /**
   * Returns the value of the '<em><b>Category</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.assignment1.einKauflist.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' containment reference list.
   * @see org.xtext.assignment1.einKauflist.EinKauflistPackage#getBuyticket_Category()
   * @model containment="true"
   * @generated
   */
  EList<Category> getCategory();

} // Buyticket
