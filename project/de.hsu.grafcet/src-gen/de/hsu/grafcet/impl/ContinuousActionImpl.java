/**
 */
package de.hsu.grafcet.impl;

import de.hsu.grafcet.Condition;
import de.hsu.grafcet.ContinuousAction;
import de.hsu.grafcet.ContinuousActionType;
import de.hsu.grafcet.GrafcetPackage;
import de.hsu.grafcet.TimeCondition;
import de.hsu.grafcet.TimeConditionType;
import de.hsu.grafcet.TimeUnit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import terms.Term;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuous Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getDelayTime <em>Delay Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getResetTime <em>Reset Time</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getTimeConditionType <em>Time Condition Type</em>}</li>
 *   <li>{@link de.hsu.grafcet.impl.ContinuousActionImpl#getContinuousActionType <em>Continuous Action Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContinuousActionImpl extends ActionImpl implements ContinuousAction {
	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected Term term;

	/**
	 * The default value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final int DELAY_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDelayTime() <em>Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayTime()
	 * @generated
	 * @ordered
	 */
	protected int delayTime = DELAY_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected static final int RESET_TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getResetTime() <em>Reset Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetTime()
	 * @generated
	 * @ordered
	 */
	protected int resetTime = RESET_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnit UNIT_EDEFAULT = TimeUnit.SECOND;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected TimeUnit unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected static final TimeConditionType TIME_CONDITION_TYPE_EDEFAULT = TimeConditionType.NONE;

	/**
	 * The cached value of the '{@link #getTimeConditionType() <em>Time Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConditionType()
	 * @generated
	 * @ordered
	 */
	protected TimeConditionType timeConditionType = TIME_CONDITION_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContinuousActionType() <em>Continuous Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousActionType()
	 * @generated
	 * @ordered
	 */
	protected static final ContinuousActionType CONTINUOUS_ACTION_TYPE_EDEFAULT = ContinuousActionType.CONTINUOUS_ACTION;

	/**
	 * The cached value of the '{@link #getContinuousActionType() <em>Continuous Action Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuousActionType()
	 * @generated
	 * @ordered
	 */
	protected ContinuousActionType continuousActionType = CONTINUOUS_ACTION_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuousActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrafcetPackage.Literals.CONTINUOUS_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerm(Term newTerm, NotificationChain msgs) {
		Term oldTerm = term;
		term = newTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.CONTINUOUS_ACTION__TERM, oldTerm, newTerm);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(Term newTerm) {
		if (newTerm != term) {
			NotificationChain msgs = null;
			if (term != null)
				msgs = ((InternalEObject) term).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.CONTINUOUS_ACTION__TERM, null, msgs);
			if (newTerm != null)
				msgs = ((InternalEObject) newTerm).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - GrafcetPackage.CONTINUOUS_ACTION__TERM, null, msgs);
			msgs = basicSetTerm(newTerm, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.CONTINUOUS_ACTION__TERM, newTerm,
					newTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDelayTime() {
		return delayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelayTime(int newDelayTime) {
		int oldDelayTime = delayTime;
		delayTime = newDelayTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME,
					oldDelayTime, delayTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getResetTime() {
		return resetTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResetTime(int newResetTime) {
		int oldResetTime = resetTime;
		resetTime = newResetTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME,
					oldResetTime, resetTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnit getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(TimeUnit newUnit) {
		TimeUnit oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.CONTINUOUS_ACTION__UNIT, oldUnit,
					unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConditionType getTimeConditionType() {
		return timeConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConditionType(TimeConditionType newTimeConditionType) {
		TimeConditionType oldTimeConditionType = timeConditionType;
		timeConditionType = newTimeConditionType == null ? TIME_CONDITION_TYPE_EDEFAULT : newTimeConditionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE,
					oldTimeConditionType, timeConditionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContinuousActionType getContinuousActionType() {
		return continuousActionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContinuousActionType(ContinuousActionType newContinuousActionType) {
		ContinuousActionType oldContinuousActionType = continuousActionType;
		continuousActionType = newContinuousActionType == null ? CONTINUOUS_ACTION_TYPE_EDEFAULT
				: newContinuousActionType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GrafcetPackage.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE, oldContinuousActionType,
					continuousActionType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case GrafcetPackage.CONTINUOUS_ACTION__TERM:
			return basicSetTerm(null, msgs);
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
		case GrafcetPackage.CONTINUOUS_ACTION__TERM:
			return getTerm();
		case GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME:
			return getDelayTime();
		case GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME:
			return getResetTime();
		case GrafcetPackage.CONTINUOUS_ACTION__UNIT:
			return getUnit();
		case GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE:
			return getTimeConditionType();
		case GrafcetPackage.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE:
			return getContinuousActionType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case GrafcetPackage.CONTINUOUS_ACTION__TERM:
			setTerm((Term) newValue);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME:
			setDelayTime((Integer) newValue);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME:
			setResetTime((Integer) newValue);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__UNIT:
			setUnit((TimeUnit) newValue);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE:
			setTimeConditionType((TimeConditionType) newValue);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE:
			setContinuousActionType((ContinuousActionType) newValue);
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
		case GrafcetPackage.CONTINUOUS_ACTION__TERM:
			setTerm((Term) null);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME:
			setDelayTime(DELAY_TIME_EDEFAULT);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME:
			setResetTime(RESET_TIME_EDEFAULT);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__UNIT:
			setUnit(UNIT_EDEFAULT);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE:
			setTimeConditionType(TIME_CONDITION_TYPE_EDEFAULT);
			return;
		case GrafcetPackage.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE:
			setContinuousActionType(CONTINUOUS_ACTION_TYPE_EDEFAULT);
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
		case GrafcetPackage.CONTINUOUS_ACTION__TERM:
			return term != null;
		case GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME:
			return delayTime != DELAY_TIME_EDEFAULT;
		case GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME:
			return resetTime != RESET_TIME_EDEFAULT;
		case GrafcetPackage.CONTINUOUS_ACTION__UNIT:
			return unit != UNIT_EDEFAULT;
		case GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE:
			return timeConditionType != TIME_CONDITION_TYPE_EDEFAULT;
		case GrafcetPackage.CONTINUOUS_ACTION__CONTINUOUS_ACTION_TYPE:
			return continuousActionType != CONTINUOUS_ACTION_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Condition.class) {
			switch (derivedFeatureID) {
			case GrafcetPackage.CONTINUOUS_ACTION__TERM:
				return GrafcetPackage.CONDITION__TERM;
			default:
				return -1;
			}
		}
		if (baseClass == TimeCondition.class) {
			switch (derivedFeatureID) {
			case GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME:
				return GrafcetPackage.TIME_CONDITION__DELAY_TIME;
			case GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME:
				return GrafcetPackage.TIME_CONDITION__RESET_TIME;
			case GrafcetPackage.CONTINUOUS_ACTION__UNIT:
				return GrafcetPackage.TIME_CONDITION__UNIT;
			case GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE:
				return GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Condition.class) {
			switch (baseFeatureID) {
			case GrafcetPackage.CONDITION__TERM:
				return GrafcetPackage.CONTINUOUS_ACTION__TERM;
			default:
				return -1;
			}
		}
		if (baseClass == TimeCondition.class) {
			switch (baseFeatureID) {
			case GrafcetPackage.TIME_CONDITION__DELAY_TIME:
				return GrafcetPackage.CONTINUOUS_ACTION__DELAY_TIME;
			case GrafcetPackage.TIME_CONDITION__RESET_TIME:
				return GrafcetPackage.CONTINUOUS_ACTION__RESET_TIME;
			case GrafcetPackage.TIME_CONDITION__UNIT:
				return GrafcetPackage.CONTINUOUS_ACTION__UNIT;
			case GrafcetPackage.TIME_CONDITION__TIME_CONDITION_TYPE:
				return GrafcetPackage.CONTINUOUS_ACTION__TIME_CONDITION_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (delayTime: ");
		result.append(delayTime);
		result.append(", resetTime: ");
		result.append(resetTime);
		result.append(", unit: ");
		result.append(unit);
		result.append(", timeConditionType: ");
		result.append(timeConditionType);
		result.append(", continuousActionType: ");
		result.append(continuousActionType);
		result.append(')');
		return result.toString();
	}

} //ContinuousActionImpl
