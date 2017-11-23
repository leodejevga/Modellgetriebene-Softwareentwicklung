/**
 */
package petrinetz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petrinetz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.Petrinetz#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.Petrinetz#getS <em>S</em>}</li>
 *   <li>{@link petrinetz.Petrinetz#getT <em>T</em>}</li>
 * </ul>
 *
 * @see petrinetz.PetrinetzPackage#getPetrinetz()
 * @model
 * @generated
 */
public interface Petrinetz extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Mein Petrinetz"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetz.PetrinetzPackage#getPetrinetz_Name()
	 * @model default="Mein Petrinetz"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petrinetz.Petrinetz#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetz.Stelle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>S</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference list.
	 * @see petrinetz.PetrinetzPackage#getPetrinetz_S()
	 * @model containment="true"
	 * @generated
	 */
	EList<Stelle> getS();

	/**
	 * Returns the value of the '<em><b>T</b></em>' containment reference list.
	 * The list contents are of type {@link petrinetz.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' containment reference list.
	 * @see petrinetz.PetrinetzPackage#getPetrinetz_T()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getT();

} // Petrinetz
