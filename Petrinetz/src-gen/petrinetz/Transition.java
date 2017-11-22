/**
 */
package petrinetz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.Transition#getZu <em>Zu</em>}</li>
 *   <li>{@link petrinetz.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.Transition#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see petrinetz.PetrinetzPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Zu</b></em>' reference list.
	 * The list contents are of type {@link petrinetz.Stelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zu</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zu</em>' reference list.
	 * @see petrinetz.PetrinetzPackage#getTransition_Zu()
	 * @model required="true"
	 * @generated
	 */
	EList<Stelle> getZu();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Eine Transition"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetz.PetrinetzPackage#getTransition_Name()
	 * @model default="Eine Transition"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetz.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see petrinetz.PetrinetzPackage#getTransition_Value()
	 * @model default="0"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link petrinetz.Transition#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Transition
