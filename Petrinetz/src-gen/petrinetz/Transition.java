/**
 */
package petrinetz;

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
 *   <li>{@link petrinetz.Transition#getB <em>B</em>}</li>
 *   <li>{@link petrinetz.Transition#getGewicht <em>Gewicht</em>}</li>
 *   <li>{@link petrinetz.Transition#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petrinetz.PetrinetzPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>B</em>' reference.
	 * @see #setB(Stelle)
	 * @see petrinetz.PetrinetzPackage#getTransition_B()
	 * @model required="true"
	 * @generated
	 */
	Stelle getB();

	/**
	 * Sets the value of the '{@link petrinetz.Transition#getB <em>B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>B</em>' reference.
	 * @see #getB()
	 * @generated
	 */
	void setB(Stelle value);

	/**
	 * Returns the value of the '<em><b>Gewicht</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gewicht</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gewicht</em>' attribute.
	 * @see #setGewicht(int)
	 * @see petrinetz.PetrinetzPackage#getTransition_Gewicht()
	 * @model
	 * @generated
	 */
	int getGewicht();

	/**
	 * Sets the value of the '{@link petrinetz.Transition#getGewicht <em>Gewicht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gewicht</em>' attribute.
	 * @see #getGewicht()
	 * @generated
	 */
	void setGewicht(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petrinetz.PetrinetzPackage#getTransition_Name()
	 * @model required="true"
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

} // Transition
