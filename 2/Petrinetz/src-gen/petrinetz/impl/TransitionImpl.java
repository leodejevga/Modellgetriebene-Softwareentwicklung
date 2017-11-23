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
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petrinetz.impl.TransitionImpl#getZu <em>Zu</em>}</li>
 *   <li>{@link petrinetz.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link petrinetz.impl.TransitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link petrinetz.impl.TransitionImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
	/**
	 * The cached value of the '{@link #getZu() <em>Zu</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZu()
	 * @generated
	 * @ordered
	 */
	protected EList<Stelle> zu;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Eine Transition";

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
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected int in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected static final int OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected int out = OUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetrinetzPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stelle> getZu() {
		if (zu == null) {
			zu = new EObjectResolvingEList<Stelle>(Stelle.class, this, PetrinetzPackage.TRANSITION__ZU);
		}
		return zu;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(int newIn) {
		int oldIn = in;
		in = newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.TRANSITION__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOut() {
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(int newOut) {
		int oldOut = out;
		out = newOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetrinetzPackage.TRANSITION__OUT, oldOut, out));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetrinetzPackage.TRANSITION__ZU:
			return getZu();
		case PetrinetzPackage.TRANSITION__NAME:
			return getName();
		case PetrinetzPackage.TRANSITION__IN:
			return getIn();
		case PetrinetzPackage.TRANSITION__OUT:
			return getOut();
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
		case PetrinetzPackage.TRANSITION__ZU:
			getZu().clear();
			getZu().addAll((Collection<? extends Stelle>) newValue);
			return;
		case PetrinetzPackage.TRANSITION__NAME:
			setName((String) newValue);
			return;
		case PetrinetzPackage.TRANSITION__IN:
			setIn((Integer) newValue);
			return;
		case PetrinetzPackage.TRANSITION__OUT:
			setOut((Integer) newValue);
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
		case PetrinetzPackage.TRANSITION__ZU:
			getZu().clear();
			return;
		case PetrinetzPackage.TRANSITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetrinetzPackage.TRANSITION__IN:
			setIn(IN_EDEFAULT);
			return;
		case PetrinetzPackage.TRANSITION__OUT:
			setOut(OUT_EDEFAULT);
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
		case PetrinetzPackage.TRANSITION__ZU:
			return zu != null && !zu.isEmpty();
		case PetrinetzPackage.TRANSITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetrinetzPackage.TRANSITION__IN:
			return in != IN_EDEFAULT;
		case PetrinetzPackage.TRANSITION__OUT:
			return out != OUT_EDEFAULT;
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
		result.append(", in: ");
		result.append(in);
		result.append(", out: ");
		result.append(out);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
