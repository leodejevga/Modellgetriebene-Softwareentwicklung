/**
 */
package petrinetz.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import petrinetz.PetrinetzPackage;
import petrinetz.Stelle;
import petrinetz.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stelle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.impl.StelleImpl#isMark <em>Mark</em>}</li>
 *   <li>{@link petrinetz.impl.StelleImpl#getA <em>A</em>}</li>
 *   <li>{@link petrinetz.impl.StelleImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StelleImpl extends MinimalEObjectImpl.Container implements Stelle {
	/**
	 * The default value of the '{@link #isMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMark()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MARK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMark() <em>Mark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMark()
	 * @generated
	 * @ordered
	 */
	protected boolean mark = MARK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> a;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StelleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetzPackage.Literals.STELLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMark() {
		return mark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMark(boolean newMark) {
		boolean oldMark = mark;
		mark = newMark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.STELLE__MARK, oldMark, mark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getA() {
		if (a == null) {
			a = new EObjectResolvingEList<Transition>(Transition.class, this, PetrinetzPackage.STELLE__A);
		}
		return a;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.STELLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetrinetzPackage.STELLE__MARK:
			return isMark();
		case PetrinetzPackage.STELLE__A:
			return getA();
		case PetrinetzPackage.STELLE__NAME:
			return getName();
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
		case PetrinetzPackage.STELLE__MARK:
			setMark((Boolean) newValue);
			return;
		case PetrinetzPackage.STELLE__A:
			getA().clear();
			getA().addAll((Collection<? extends Transition>) newValue);
			return;
		case PetrinetzPackage.STELLE__NAME:
			setName((String) newValue);
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
		case PetrinetzPackage.STELLE__MARK:
			setMark(MARK_EDEFAULT);
			return;
		case PetrinetzPackage.STELLE__A:
			getA().clear();
			return;
		case PetrinetzPackage.STELLE__NAME:
			setName(NAME_EDEFAULT);
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
		case PetrinetzPackage.STELLE__MARK:
			return mark != MARK_EDEFAULT;
		case PetrinetzPackage.STELLE__A:
			return a != null && !a.isEmpty();
		case PetrinetzPackage.STELLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (Mark: ");
		result.append(mark);
		result.append(", Name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //StelleImpl
