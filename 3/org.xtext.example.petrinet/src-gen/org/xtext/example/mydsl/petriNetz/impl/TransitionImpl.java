/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.petriNetz.impl;

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

import org.xtext.example.mydsl.petriNetz.PTArc;
import org.xtext.example.mydsl.petriNetz.PetriNetzPackage;
import org.xtext.example.mydsl.petriNetz.TPArc;
import org.xtext.example.mydsl.petriNetz.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.TransitionImpl#getIn <em>In</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.TransitionImpl#getOut <em>Out</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
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
   * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIn()
   * @generated
   * @ordered
   */
  protected EList<PTArc> in;

  /**
   * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOut()
   * @generated
   * @ordered
   */
  protected EList<TPArc> out;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PetriNetzPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PetriNetzPackage.TRANSITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PTArc> getIn()
  {
    if (in == null)
    {
      in = new EObjectContainmentEList<PTArc>(PTArc.class, this, PetriNetzPackage.TRANSITION__IN);
    }
    return in;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TPArc> getOut()
  {
    if (out == null)
    {
      out = new EObjectContainmentEList<TPArc>(TPArc.class, this, PetriNetzPackage.TRANSITION__OUT);
    }
    return out;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case PetriNetzPackage.TRANSITION__IN:
        return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
      case PetriNetzPackage.TRANSITION__OUT:
        return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PetriNetzPackage.TRANSITION__NAME:
        return getName();
      case PetriNetzPackage.TRANSITION__IN:
        return getIn();
      case PetriNetzPackage.TRANSITION__OUT:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PetriNetzPackage.TRANSITION__NAME:
        setName((String)newValue);
        return;
      case PetriNetzPackage.TRANSITION__IN:
        getIn().clear();
        getIn().addAll((Collection<? extends PTArc>)newValue);
        return;
      case PetriNetzPackage.TRANSITION__OUT:
        getOut().clear();
        getOut().addAll((Collection<? extends TPArc>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PetriNetzPackage.TRANSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PetriNetzPackage.TRANSITION__IN:
        getIn().clear();
        return;
      case PetriNetzPackage.TRANSITION__OUT:
        getOut().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PetriNetzPackage.TRANSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PetriNetzPackage.TRANSITION__IN:
        return in != null && !in.isEmpty();
      case PetriNetzPackage.TRANSITION__OUT:
        return out != null && !out.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
