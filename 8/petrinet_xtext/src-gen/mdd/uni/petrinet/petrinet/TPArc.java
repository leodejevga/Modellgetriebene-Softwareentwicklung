/**
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mdd.uni.petrinet.petrinet.TPArc#getSource <em>Source</em>}</li>
 *   <li>{@link mdd.uni.petrinet.petrinet.TPArc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see mdd.uni.petrinet.petrinet.PetrinetPackage#getTPArc()
 * @model
 * @generated
 */
public interface TPArc extends Arc
{
  /**
   * Returns the value of the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' reference.
   * @see #setSource(Transition)
   * @see mdd.uni.petrinet.petrinet.PetrinetPackage#getTPArc_Source()
   * @model
   * @generated
   */
  Transition getSource();

  /**
   * Sets the value of the '{@link mdd.uni.petrinet.petrinet.TPArc#getSource <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source</em>' reference.
   * @see #getSource()
   * @generated
   */
  void setSource(Transition value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(Place)
   * @see mdd.uni.petrinet.petrinet.PetrinetPackage#getTPArc_Target()
   * @model
   * @generated
   */
  Place getTarget();

  /**
   * Sets the value of the '{@link mdd.uni.petrinet.petrinet.TPArc#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(Place value);

} // TPArc