/**
 * generated by Xtext 2.12.0
 */
package mdd.uni.petrinet.petrinet;

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
 * @see mdd.uni.petrinet.petrinet.PetrinetFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "petrinet";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.uni.mdd/petrinet/Petrinet";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "petrinet";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PetrinetPackage eINSTANCE = mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl.init();

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.PetrinetImpl <em>Petrinet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPetrinet()
   * @generated
   */
  int PETRINET = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRINET__NAME = 0;

  /**
   * The feature id for the '<em><b>Places</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRINET__PLACES = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRINET__TRANSITIONS = 2;

  /**
   * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRINET__ARCS = 3;

  /**
   * The number of structural features of the '<em>Petrinet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PETRINET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.PlaceImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
   * @generated
   */
  int PLACE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__TOKENS = 1;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__OUT = 2;

  /**
   * The feature id for the '<em><b>In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE__IN = 3;

  /**
   * The number of structural features of the '<em>Place</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.TokenImpl <em>Token</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.TokenImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getToken()
   * @generated
   */
  int TOKEN = 2;

  /**
   * The number of structural features of the '<em>Token</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TOKEN_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.TransitionImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Out</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__OUT = 1;

  /**
   * The feature id for the '<em><b>In</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__IN = 2;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.ArcImpl <em>Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.ArcImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getArc()
   * @generated
   */
  int ARC = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__NAME = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC__WEIGHT = 1;

  /**
   * The number of structural features of the '<em>Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.PTArcImpl <em>PT Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.PTArcImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPTArc()
   * @generated
   */
  int PT_ARC = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PT_ARC__NAME = ARC__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PT_ARC__WEIGHT = ARC__WEIGHT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PT_ARC__SOURCE = ARC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PT_ARC__TARGET = ARC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>PT Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PT_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link mdd.uni.petrinet.petrinet.impl.TPArcImpl <em>TP Arc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see mdd.uni.petrinet.petrinet.impl.TPArcImpl
   * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getTPArc()
   * @generated
   */
  int TP_ARC = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TP_ARC__NAME = ARC__NAME;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TP_ARC__WEIGHT = ARC__WEIGHT;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TP_ARC__SOURCE = ARC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TP_ARC__TARGET = ARC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>TP Arc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TP_ARC_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.Petrinet <em>Petrinet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Petrinet</em>'.
   * @see mdd.uni.petrinet.petrinet.Petrinet
   * @generated
   */
  EClass getPetrinet();

  /**
   * Returns the meta object for the attribute '{@link mdd.uni.petrinet.petrinet.Petrinet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdd.uni.petrinet.petrinet.Petrinet#getName()
   * @see #getPetrinet()
   * @generated
   */
  EAttribute getPetrinet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link mdd.uni.petrinet.petrinet.Petrinet#getPlaces <em>Places</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Places</em>'.
   * @see mdd.uni.petrinet.petrinet.Petrinet#getPlaces()
   * @see #getPetrinet()
   * @generated
   */
  EReference getPetrinet_Places();

  /**
   * Returns the meta object for the containment reference list '{@link mdd.uni.petrinet.petrinet.Petrinet#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see mdd.uni.petrinet.petrinet.Petrinet#getTransitions()
   * @see #getPetrinet()
   * @generated
   */
  EReference getPetrinet_Transitions();

  /**
   * Returns the meta object for the containment reference list '{@link mdd.uni.petrinet.petrinet.Petrinet#getArcs <em>Arcs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arcs</em>'.
   * @see mdd.uni.petrinet.petrinet.Petrinet#getArcs()
   * @see #getPetrinet()
   * @generated
   */
  EReference getPetrinet_Arcs();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.Place <em>Place</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Place</em>'.
   * @see mdd.uni.petrinet.petrinet.Place
   * @generated
   */
  EClass getPlace();

  /**
   * Returns the meta object for the attribute '{@link mdd.uni.petrinet.petrinet.Place#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdd.uni.petrinet.petrinet.Place#getName()
   * @see #getPlace()
   * @generated
   */
  EAttribute getPlace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link mdd.uni.petrinet.petrinet.Place#getTokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tokens</em>'.
   * @see mdd.uni.petrinet.petrinet.Place#getTokens()
   * @see #getPlace()
   * @generated
   */
  EReference getPlace_Tokens();

  /**
   * Returns the meta object for the reference list '{@link mdd.uni.petrinet.petrinet.Place#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Out</em>'.
   * @see mdd.uni.petrinet.petrinet.Place#getOut()
   * @see #getPlace()
   * @generated
   */
  EReference getPlace_Out();

  /**
   * Returns the meta object for the reference list '{@link mdd.uni.petrinet.petrinet.Place#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>In</em>'.
   * @see mdd.uni.petrinet.petrinet.Place#getIn()
   * @see #getPlace()
   * @generated
   */
  EReference getPlace_In();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.Token <em>Token</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Token</em>'.
   * @see mdd.uni.petrinet.petrinet.Token
   * @generated
   */
  EClass getToken();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see mdd.uni.petrinet.petrinet.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute '{@link mdd.uni.petrinet.petrinet.Transition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdd.uni.petrinet.petrinet.Transition#getName()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_Name();

  /**
   * Returns the meta object for the reference list '{@link mdd.uni.petrinet.petrinet.Transition#getOut <em>Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Out</em>'.
   * @see mdd.uni.petrinet.petrinet.Transition#getOut()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Out();

  /**
   * Returns the meta object for the reference list '{@link mdd.uni.petrinet.petrinet.Transition#getIn <em>In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>In</em>'.
   * @see mdd.uni.petrinet.petrinet.Transition#getIn()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_In();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.Arc <em>Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arc</em>'.
   * @see mdd.uni.petrinet.petrinet.Arc
   * @generated
   */
  EClass getArc();

  /**
   * Returns the meta object for the attribute '{@link mdd.uni.petrinet.petrinet.Arc#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see mdd.uni.petrinet.petrinet.Arc#getName()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_Name();

  /**
   * Returns the meta object for the attribute '{@link mdd.uni.petrinet.petrinet.Arc#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see mdd.uni.petrinet.petrinet.Arc#getWeight()
   * @see #getArc()
   * @generated
   */
  EAttribute getArc_Weight();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.PTArc <em>PT Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PT Arc</em>'.
   * @see mdd.uni.petrinet.petrinet.PTArc
   * @generated
   */
  EClass getPTArc();

  /**
   * Returns the meta object for the reference '{@link mdd.uni.petrinet.petrinet.PTArc#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see mdd.uni.petrinet.petrinet.PTArc#getSource()
   * @see #getPTArc()
   * @generated
   */
  EReference getPTArc_Source();

  /**
   * Returns the meta object for the reference '{@link mdd.uni.petrinet.petrinet.PTArc#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see mdd.uni.petrinet.petrinet.PTArc#getTarget()
   * @see #getPTArc()
   * @generated
   */
  EReference getPTArc_Target();

  /**
   * Returns the meta object for class '{@link mdd.uni.petrinet.petrinet.TPArc <em>TP Arc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>TP Arc</em>'.
   * @see mdd.uni.petrinet.petrinet.TPArc
   * @generated
   */
  EClass getTPArc();

  /**
   * Returns the meta object for the reference '{@link mdd.uni.petrinet.petrinet.TPArc#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see mdd.uni.petrinet.petrinet.TPArc#getSource()
   * @see #getTPArc()
   * @generated
   */
  EReference getTPArc_Source();

  /**
   * Returns the meta object for the reference '{@link mdd.uni.petrinet.petrinet.TPArc#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see mdd.uni.petrinet.petrinet.TPArc#getTarget()
   * @see #getTPArc()
   * @generated
   */
  EReference getTPArc_Target();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PetrinetFactory getPetrinetFactory();

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
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.PetrinetImpl <em>Petrinet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPetrinet()
     * @generated
     */
    EClass PETRINET = eINSTANCE.getPetrinet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PETRINET__NAME = eINSTANCE.getPetrinet_Name();

    /**
     * The meta object literal for the '<em><b>Places</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRINET__PLACES = eINSTANCE.getPetrinet_Places();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRINET__TRANSITIONS = eINSTANCE.getPetrinet_Transitions();

    /**
     * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PETRINET__ARCS = eINSTANCE.getPetrinet_Arcs();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.PlaceImpl <em>Place</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.PlaceImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPlace()
     * @generated
     */
    EClass PLACE = eINSTANCE.getPlace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLACE__NAME = eINSTANCE.getPlace_Name();

    /**
     * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACE__TOKENS = eINSTANCE.getPlace_Tokens();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACE__OUT = eINSTANCE.getPlace_Out();

    /**
     * The meta object literal for the '<em><b>In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLACE__IN = eINSTANCE.getPlace_In();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.TokenImpl <em>Token</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.TokenImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getToken()
     * @generated
     */
    EClass TOKEN = eINSTANCE.getToken();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.TransitionImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

    /**
     * The meta object literal for the '<em><b>Out</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__OUT = eINSTANCE.getTransition_Out();

    /**
     * The meta object literal for the '<em><b>In</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__IN = eINSTANCE.getTransition_In();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.ArcImpl <em>Arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.ArcImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getArc()
     * @generated
     */
    EClass ARC = eINSTANCE.getArc();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__NAME = eINSTANCE.getArc_Name();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.PTArcImpl <em>PT Arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.PTArcImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getPTArc()
     * @generated
     */
    EClass PT_ARC = eINSTANCE.getPTArc();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PT_ARC__SOURCE = eINSTANCE.getPTArc_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PT_ARC__TARGET = eINSTANCE.getPTArc_Target();

    /**
     * The meta object literal for the '{@link mdd.uni.petrinet.petrinet.impl.TPArcImpl <em>TP Arc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see mdd.uni.petrinet.petrinet.impl.TPArcImpl
     * @see mdd.uni.petrinet.petrinet.impl.PetrinetPackageImpl#getTPArc()
     * @generated
     */
    EClass TP_ARC = eINSTANCE.getTPArc();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TP_ARC__SOURCE = eINSTANCE.getTPArc_Source();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TP_ARC__TARGET = eINSTANCE.getTPArc_Target();

  }

} //PetrinetPackage
