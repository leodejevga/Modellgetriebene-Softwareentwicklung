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
 *   <li>{@link petrinetz.impl.StelleImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.impl.StelleImpl#getToken <em>Token</em>}</li>
 *   <li>{@link petrinetz.impl.StelleImpl#getZu <em>Zu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StelleImpl extends MinimalEObjectImpl.Container implements Stelle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Eine Stelle";

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
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final int TOKEN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected int token = TOKEN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getZu() <em>Zu</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZu()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> zu;

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
	public int getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(int newToken) {
		int oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.STELLE__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getZu() {
		if (zu == null) {
			zu = new EObjectResolvingEList<Transition>(Transition.class, this, PetrinetzPackage.STELLE__ZU);
		}
		return zu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetrinetzPackage.STELLE__NAME:
			return getName();
		case PetrinetzPackage.STELLE__TOKEN:
			return getToken();
		case PetrinetzPackage.STELLE__ZU:
			return getZu();
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
		case PetrinetzPackage.STELLE__NAME:
			setName((String) newValue);
			return;
		case PetrinetzPackage.STELLE__TOKEN:
			setToken((Integer) newValue);
			return;
		case PetrinetzPackage.STELLE__ZU:
			getZu().clear();
			getZu().addAll((Collection<? extends Transition>) newValue);
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
		case PetrinetzPackage.STELLE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetrinetzPackage.STELLE__TOKEN:
			setToken(TOKEN_EDEFAULT);
			return;
		case PetrinetzPackage.STELLE__ZU:
			getZu().clear();
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
		case PetrinetzPackage.STELLE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetrinetzPackage.STELLE__TOKEN:
			return token != TOKEN_EDEFAULT;
		case PetrinetzPackage.STELLE__ZU:
			return zu != null && !zu.isEmpty();
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
		result.append(", token: ");
		result.append(token);
		result.append(')');
		return result.toString();
	}

} //StelleImpl
