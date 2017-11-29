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

import org.xtext.example.mydsl.petriNetz.Arc;
import org.xtext.example.mydsl.petriNetz.PetriNetzPackage;
import org.xtext.example.mydsl.petriNetz.Petrinet;
import org.xtext.example.mydsl.petriNetz.Place;
import org.xtext.example.mydsl.petriNetz.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petrinet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.PetrinetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.PetrinetImpl#getPlaces <em>Places</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.PetrinetImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.petriNetz.impl.PetrinetImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PetrinetImpl extends MinimalEObjectImpl.Container implements Petrinet
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
   * The cached value of the '{@link #getPlaces() <em>Places</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlaces()
   * @generated
   * @ordered
   */
  protected EList<Place> places;

  /**
   * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> transitions;

  /**
   * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArcs()
   * @generated
   * @ordered
   */
  protected EList<Arc> arcs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PetrinetImpl()
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
    return PetriNetzPackage.Literals.PETRINET;
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
      eNotify(new ENotificationImpl(this, Notification.SET, PetriNetzPackage.PETRINET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Place> getPlaces()
  {
    if (places == null)
    {
      places = new EObjectContainmentEList<Place>(Place.class, this, PetriNetzPackage.PETRINET__PLACES);
    }
    return places;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getTransitions()
  {
    if (transitions == null)
    {
      transitions = new EObjectContainmentEList<Transition>(Transition.class, this, PetriNetzPackage.PETRINET__TRANSITIONS);
    }
    return transitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Arc> getArcs()
  {
    if (arcs == null)
    {
      arcs = new EObjectContainmentEList<Arc>(Arc.class, this, PetriNetzPackage.PETRINET__ARCS);
    }
    return arcs;
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
      case PetriNetzPackage.PETRINET__PLACES:
        return ((InternalEList<?>)getPlaces()).basicRemove(otherEnd, msgs);
      case PetriNetzPackage.PETRINET__TRANSITIONS:
        return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
      case PetriNetzPackage.PETRINET__ARCS:
        return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
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
      case PetriNetzPackage.PETRINET__NAME:
        return getName();
      case PetriNetzPackage.PETRINET__PLACES:
        return getPlaces();
      case PetriNetzPackage.PETRINET__TRANSITIONS:
        return getTransitions();
      case PetriNetzPackage.PETRINET__ARCS:
        return getArcs();
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
      case PetriNetzPackage.PETRINET__NAME:
        setName((String)newValue);
        return;
      case PetriNetzPackage.PETRINET__PLACES:
        getPlaces().clear();
        getPlaces().addAll((Collection<? extends Place>)newValue);
        return;
      case PetriNetzPackage.PETRINET__TRANSITIONS:
        getTransitions().clear();
        getTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case PetriNetzPackage.PETRINET__ARCS:
        getArcs().clear();
        getArcs().addAll((Collection<? extends Arc>)newValue);
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
      case PetriNetzPackage.PETRINET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case PetriNetzPackage.PETRINET__PLACES:
        getPlaces().clear();
        return;
      case PetriNetzPackage.PETRINET__TRANSITIONS:
        getTransitions().clear();
        return;
      case PetriNetzPackage.PETRINET__ARCS:
        getArcs().clear();
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
      case PetriNetzPackage.PETRINET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case PetriNetzPackage.PETRINET__PLACES:
        return places != null && !places.isEmpty();
      case PetriNetzPackage.PETRINET__TRANSITIONS:
        return transitions != null && !transitions.isEmpty();
      case PetriNetzPackage.PETRINET__ARCS:
        return arcs != null && !arcs.isEmpty();
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

} //PetrinetImpl
