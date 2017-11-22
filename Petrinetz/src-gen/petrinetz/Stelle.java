/**
 */
package petrinetz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stelle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.Stelle#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.Stelle#isToken <em>Token</em>}</li>
 *   <li>{@link petrinetz.Stelle#getZu <em>Zu</em>}</li>
 * </ul>
 *
 * @see petrinetz.PetrinetzPackage#getStelle()
 * @model
 * @generated
 */
public interface Stelle extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Eine Stelle"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetz.PetrinetzPackage#getStelle_Name()
	 * @model default="Eine Stelle"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetz.Stelle#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' attribute.
	 * @see #setToken(boolean)
	 * @see petrinetz.PetrinetzPackage#getStelle_Token()
	 * @model
	 * @generated
	 */
	boolean isToken();

	/**
	 * Sets the value of the '{@link petrinetz.Stelle#isToken <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' attribute.
	 * @see #isToken()
	 * @generated
	 */
	void setToken(boolean value);

	/**
	 * Returns the value of the '<em><b>Zu</b></em>' reference list.
	 * The list contents are of type {@link petrinetz.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zu</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zu</em>' reference list.
	 * @see petrinetz.PetrinetzPackage#getStelle_Zu()
	 * @model
	 * @generated
	 */
	EList<Transition> getZu();

} // Stelle
