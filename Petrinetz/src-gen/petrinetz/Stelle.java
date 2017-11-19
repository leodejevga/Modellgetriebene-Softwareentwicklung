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
 *   <li>{@link petrinetz.Stelle#isMark <em>Mark</em>}</li>
 *   <li>{@link petrinetz.Stelle#getA <em>A</em>}</li>
 *   <li>{@link petrinetz.Stelle#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see petrinetz.PetrinetzPackage#getStelle()
 * @model
 * @generated
 */
public interface Stelle extends EObject {
	/**
	 * Returns the value of the '<em><b>Mark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' attribute.
	 * @see #setMark(boolean)
	 * @see petrinetz.PetrinetzPackage#getStelle_Mark()
	 * @model
	 * @generated
	 */
	boolean isMark();

	/**
	 * Sets the value of the '{@link petrinetz.Stelle#isMark <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' attribute.
	 * @see #isMark()
	 * @generated
	 */
	void setMark(boolean value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' reference list.
	 * The list contents are of type {@link petrinetz.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' reference list.
	 * @see petrinetz.PetrinetzPackage#getStelle_A()
	 * @model
	 * @generated
	 */
	EList<Transition> getA();

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
	 * @see petrinetz.PetrinetzPackage#getStelle_Name()
	 * @model required="true"
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

} // Stelle
