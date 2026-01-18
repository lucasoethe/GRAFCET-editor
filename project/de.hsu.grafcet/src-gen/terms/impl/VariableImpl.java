/**
 */
package terms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import terms.TermsPackage;
import terms.Variable;
import terms.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terms.impl.VariableImpl#getVariableDeclaration <em>Variable Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends TermImpl implements Variable {
	/**
	 * The cached value of the '{@link #getVariableDeclaration() <em>Variable Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclaration()
	 * @generated
	 * @ordered
	 */
	protected VariableDeclaration variableDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TermsPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration getVariableDeclaration() {
		if (variableDeclaration != null && variableDeclaration.eIsProxy()) {
			InternalEObject oldVariableDeclaration = (InternalEObject) variableDeclaration;
			variableDeclaration = (VariableDeclaration) eResolveProxy(oldVariableDeclaration);
			if (variableDeclaration != oldVariableDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TermsPackage.VARIABLE__VARIABLE_DECLARATION, oldVariableDeclaration, variableDeclaration));
			}
		}
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration basicGetVariableDeclaration() {
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableDeclaration(VariableDeclaration newVariableDeclaration) {
		VariableDeclaration oldVariableDeclaration = variableDeclaration;
		variableDeclaration = newVariableDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TermsPackage.VARIABLE__VARIABLE_DECLARATION,
					oldVariableDeclaration, variableDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TermsPackage.VARIABLE__VARIABLE_DECLARATION:
			if (resolve)
				return getVariableDeclaration();
			return basicGetVariableDeclaration();
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
		case TermsPackage.VARIABLE__VARIABLE_DECLARATION:
			setVariableDeclaration((VariableDeclaration) newValue);
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
		case TermsPackage.VARIABLE__VARIABLE_DECLARATION:
			setVariableDeclaration((VariableDeclaration) null);
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
		case TermsPackage.VARIABLE__VARIABLE_DECLARATION:
			return variableDeclaration != null;
		}
		return super.eIsSet(featureID);
	}

} //VariableImpl
