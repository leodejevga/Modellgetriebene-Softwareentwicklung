/**
 */
package petrinetz.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import petrinetz.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PetrinetzFactoryImpl extends EFactoryImpl implements PetrinetzFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PetrinetzFactory init() {
		try {
			PetrinetzFactory thePetrinetzFactory = (PetrinetzFactory) EPackage.Registry.INSTANCE
					.getEFactory(PetrinetzPackage.eNS_URI);
			if (thePetrinetzFactory != null) {
				return thePetrinetzFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PetrinetzFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetzFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PetrinetzPackage.PETRINETZ:
			return createPetrinetz();
		case PetrinetzPackage.STELLE:
			return createStelle();
		case PetrinetzPackage.TRANSITION:
			return createTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Petrinetz createPetrinetz() {
		PetrinetzImpl petrinetz = new PetrinetzImpl();
		return petrinetz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stelle createStelle() {
		StelleImpl stelle = new StelleImpl();
		return stelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetrinetzPackage getPetrinetzPackage() {
		return (PetrinetzPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PetrinetzPackage getPackage() {
		return PetrinetzPackage.eINSTANCE;
	}

} //PetrinetzFactoryImpl
