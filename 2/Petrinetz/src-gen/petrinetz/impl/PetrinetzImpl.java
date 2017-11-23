/**
 */
package petrinetz.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import petrinetz.Petrinetz;
import petrinetz.PetrinetzPackage;
import petrinetz.Stelle;
import petrinetz.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinetz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.impl.PetrinetzImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.impl.PetrinetzImpl#getS <em>S</em>}</li>
 *   <li>{@link petrinetz.impl.PetrinetzImpl#getT <em>T</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetrinetzImpl extends MinimalEObjectImpl.Container implements Petrinetz {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Mein Petrinetz";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected EList<Stelle> s;

	/**
	 * The cached value of the '{@link #getT() <em>T</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getT()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> t;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetrinetzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetzPackage.Literals.PETRINETZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.PETRINETZ__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stelle> getS() {
		if (s == null) {
			s = new EObjectContainmentEList<Stelle>(Stelle.class, this, PetrinetzPackage.PETRINETZ__S);
		}
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getT() {
		if (t == null) {
			t = new EObjectContainmentEList<Transition>(Transition.class, this, PetrinetzPackage.PETRINETZ__T);
		}
		return t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetrinetzPackage.PETRINETZ__S:
			return ((InternalEList<?>) getS()).basicRemove(otherEnd, msgs);
		case PetrinetzPackage.PETRINETZ__T:
			return ((InternalEList<?>) getT()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetrinetzPackage.PETRINETZ__NAME:
			return getName();
		case PetrinetzPackage.PETRINETZ__S:
			return getS();
		case PetrinetzPackage.PETRINETZ__T:
			return getT();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetrinetzPackage.PETRINETZ__NAME:
			setName((String) newValue);
			return;
		case PetrinetzPackage.PETRINETZ__S:
			getS().clear();
			getS().addAll((Collection<? extends Stelle>) newValue);
			return;
		case PetrinetzPackage.PETRINETZ__T:
			getT().clear();
			getT().addAll((Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PetrinetzPackage.PETRINETZ__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetrinetzPackage.PETRINETZ__S:
			getS().clear();
			return;
		case PetrinetzPackage.PETRINETZ__T:
			getT().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PetrinetzPackage.PETRINETZ__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetrinetzPackage.PETRINETZ__S:
			return s != null && !s.isEmpty();
		case PetrinetzPackage.PETRINETZ__T:
			return t != null && !t.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PetrinetzImpl
