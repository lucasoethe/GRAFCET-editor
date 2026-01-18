/**
 */
package terms.impl;

import de.hsu.grafcet.InitializableType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import terms.Sort;
import terms.TermsPackage;
import terms.VariableDeclaration;
import terms.VariableDeclarationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getVariableDeclarationType <em>Variable Declaration Type</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getStep <em>Step</em>}</li>
 *   <li>{@link terms.impl.VariableDeclarationImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableDeclarationImpl extends MinimalEObjectImpl.Container implements VariableDeclaration {
	/**
	 * The cached value of the '{@link #getSort() <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSort()
	 * @generated
	 * @ordered
	 */
	protected Sort sort;

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
	 * The default value of the '{@link #getVariableDeclarationType() <em>Variable Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final VariableDeclarationType VARIABLE_DECLARATION_TYPE_EDEFAULT = VariableDeclarationType.INPUT;

	/**
	 * The cached value of the '{@link #getVariableDeclarationType() <em>Variable Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclarationType variableDeclarationType = VARIABLE_DECLARATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected InitializableType step;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sort getSort() {
		return sort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSort(Sort newSort, NotificationChain msgs) {
		Sort oldSort = sort;
		sort = newSort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TermsPackage.VARIABLE_DECLARATION__SORT, oldSort, newSort);
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
	public void setSort(Sort newSort) {
		if (newSort != sort) {
			NotificationChain msgs = null;
			if (sort != null)
				msgs = ((InternalEObject) sort).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.VARIABLE_DECLARATION__SORT, null, msgs);
			if (newSort != null)
				msgs = ((InternalEObject) newSort).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TermsPackage.VARIABLE_DECLARATION__SORT, null, msgs);
			msgs = basicSetSort(newSort, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__SORT, newSort,
					newSort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclarationType getVariableDeclarationType() {
		return variableDeclarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclarationType(VariableDeclarationType newVariableDeclarationType) {
		VariableDeclarationType oldVariableDeclarationType = variableDeclarationType;
		variableDeclarationType = newVariableDeclarationType == null ? VARIABLE_DECLARATION_TYPE_EDEFAULT
				: newVariableDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE, oldVariableDeclarationType,
					variableDeclarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableType getStep() {
		if (step != null && step.eIsProxy()) {
			InternalEObject oldStep = (InternalEObject) step;
			step = (InitializableType) eResolveProxy(oldStep);
			if (step != oldStep) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TermsPackage.VARIABLE_DECLARATION__STEP,
							oldStep, step));
			}
		}
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializableType basicGetStep() {
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStep(InitializableType newStep) {
		InitializableType oldStep = step;
		step = newStep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__STEP, oldStep,
					step));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE_DECLARATION__VALUE, oldValue,
					value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return basicSetSort(null, msgs);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return getSort();
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			return getName();
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			return getVariableDeclarationType();
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			if (resolve)
				return getStep();
			return basicGetStep();
		case TermsPackage.VARIABLE_DECLARATION__VALUE:
			return getValue();
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			setSort((Sort) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			setName((String) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			setVariableDeclarationType((VariableDeclarationType) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			setStep((InitializableType) newValue);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VALUE:
			setValue((String) newValue);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			setSort((Sort) null);
			return;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			setVariableDeclarationType(VARIABLE_DECLARATION_TYPE_EDEFAULT);
			return;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			setStep((InitializableType) null);
			return;
		case TermsPackage.VARIABLE_DECLARATION__VALUE:
			setValue(VALUE_EDEFAULT);
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
		case TermsPackage.VARIABLE_DECLARATION__SORT:
			return sort != null;
		case TermsPackage.VARIABLE_DECLARATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case TermsPackage.VARIABLE_DECLARATION__VARIABLE_DECLARATION_TYPE:
			return variableDeclarationType != VARIABLE_DECLARATION_TYPE_EDEFAULT;
		case TermsPackage.VARIABLE_DECLARATION__STEP:
			return step != null;
		case TermsPackage.VARIABLE_DECLARATION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", variableDeclarationType: ");
		result.append(variableDeclarationType);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //VariableDeclarationImpl
