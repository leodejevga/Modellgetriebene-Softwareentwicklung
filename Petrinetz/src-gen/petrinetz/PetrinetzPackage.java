/**
 */
package petrinetz;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see petrinetz.PetrinetzFactory
 * @model kind="package"
 * @generated
 */
public interface PetrinetzPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "petrinetz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/petrinetz";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "petrinetz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetrinetzPackage eINSTANCE = petrinetz.impl.PetrinetzPackageImpl.init();

	/**
	 * The meta object id for the '{@link petrinetz.impl.PetrinetzImpl <em>Petrinetz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetz.impl.PetrinetzImpl
	 * @see petrinetz.impl.PetrinetzPackageImpl#getPetrinetz()
	 * @generated
	 */
	int PETRINETZ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ__NAME = 0;

	/**
	 * The feature id for the '<em><b>S</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ__S = 1;

	/**
	 * The feature id for the '<em><b>T</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ__T = 2;

	/**
	 * The number of structural features of the '<em>Petrinetz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Petrinetz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRINETZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetz.impl.StelleImpl <em>Stelle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetz.impl.StelleImpl
	 * @see petrinetz.impl.PetrinetzPackageImpl#getStelle()
	 * @generated
	 */
	int STELLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE__TOKEN = 1;

	/**
	 * The feature id for the '<em><b>Zu</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE__ZU = 2;

	/**
	 * The number of structural features of the '<em>Stelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Stelle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STELLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link petrinetz.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see petrinetz.impl.TransitionImpl
	 * @see petrinetz.impl.PetrinetzPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Zu</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ZU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link petrinetz.Petrinetz <em>Petrinetz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petrinetz</em>'.
	 * @see petrinetz.Petrinetz
	 * @generated
	 */
	EClass getPetrinetz();

	/**
	 * Returns the meta object for the attribute '{@link petrinetz.Petrinetz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetz.Petrinetz#getName()
	 * @see #getPetrinetz()
	 * @generated
	 */
	EAttribute getPetrinetz_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetz.Petrinetz#getS <em>S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>S</em>'.
	 * @see petrinetz.Petrinetz#getS()
	 * @see #getPetrinetz()
	 * @generated
	 */
	EReference getPetrinetz_S();

	/**
	 * Returns the meta object for the containment reference list '{@link petrinetz.Petrinetz#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>T</em>'.
	 * @see petrinetz.Petrinetz#getT()
	 * @see #getPetrinetz()
	 * @generated
	 */
	EReference getPetrinetz_T();

	/**
	 * Returns the meta object for class '{@link petrinetz.Stelle <em>Stelle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stelle</em>'.
	 * @see petrinetz.Stelle
	 * @generated
	 */
	EClass getStelle();

	/**
	 * Returns the meta object for the attribute '{@link petrinetz.Stelle#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetz.Stelle#getName()
	 * @see #getStelle()
	 * @generated
	 */
	EAttribute getStelle_Name();

	/**
	 * Returns the meta object for the attribute '{@link petrinetz.Stelle#isToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see petrinetz.Stelle#isToken()
	 * @see #getStelle()
	 * @generated
	 */
	EAttribute getStelle_Token();

	/**
	 * Returns the meta object for the reference list '{@link petrinetz.Stelle#getZu <em>Zu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zu</em>'.
	 * @see petrinetz.Stelle#getZu()
	 * @see #getStelle()
	 * @generated
	 */
	EReference getStelle_Zu();

	/**
	 * Returns the meta object for class '{@link petrinetz.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see petrinetz.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference list '{@link petrinetz.Transition#getZu <em>Zu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Zu</em>'.
	 * @see petrinetz.Transition#getZu()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Zu();

	/**
	 * Returns the meta object for the attribute '{@link petrinetz.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see petrinetz.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link petrinetz.Transition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see petrinetz.Transition#getValue()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetrinetzFactory getPetrinetzFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link petrinetz.impl.PetrinetzImpl <em>Petrinetz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetz.impl.PetrinetzImpl
		 * @see petrinetz.impl.PetrinetzPackageImpl#getPetrinetz()
		 * @generated
		 */
		EClass PETRINETZ = eINSTANCE.getPetrinetz();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PETRINETZ__NAME = eINSTANCE.getPetrinetz_Name();

		/**
		 * The meta object literal for the '<em><b>S</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINETZ__S = eINSTANCE.getPetrinetz_S();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRINETZ__T = eINSTANCE.getPetrinetz_T();

		/**
		 * The meta object literal for the '{@link petrinetz.impl.StelleImpl <em>Stelle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetz.impl.StelleImpl
		 * @see petrinetz.impl.PetrinetzPackageImpl#getStelle()
		 * @generated
		 */
		EClass STELLE = eINSTANCE.getStelle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STELLE__NAME = eINSTANCE.getStelle_Name();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STELLE__TOKEN = eINSTANCE.getStelle_Token();

		/**
		 * The meta object literal for the '<em><b>Zu</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STELLE__ZU = eINSTANCE.getStelle_Zu();

		/**
		 * The meta object literal for the '{@link petrinetz.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see petrinetz.impl.TransitionImpl
		 * @see petrinetz.impl.PetrinetzPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Zu</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ZU = eINSTANCE.getTransition_Zu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__VALUE = eINSTANCE.getTransition_Value();

	}

} //PetrinetzPackage
