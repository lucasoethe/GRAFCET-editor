/**
 */
package terms;

import de.hsu.grafcet.InitializableType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terms.VariableDeclaration#getSort <em>Sort</em>}</li>
 *   <li>{@link terms.VariableDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link terms.VariableDeclaration#getVariableDeclarationType <em>Variable Declaration Type</em>}</li>
 *   <li>{@link terms.VariableDeclaration#getStep <em>Step</em>}</li>
 *   <li>{@link terms.VariableDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see terms.TermsPackage#getVariableDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='StepVarDeclSetStep'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot StepVarDeclSetStep='self.variableDeclarationType = VariableDeclarationType::step implies step &lt;&gt; null and self.sort.oclIsKindOf(Bool)'"
 * @generated
 */
public interface VariableDeclaration extends EObject {
	/**
	 * Returns the value of the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort</em>' containment reference.
	 * @see #setSort(Sort)
	 * @see terms.TermsPackage#getVariableDeclaration_Sort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sort getSort();

	/**
	 * Sets the value of the '{@link terms.VariableDeclaration#getSort <em>Sort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort</em>' containment reference.
	 * @see #getSort()
	 * @generated
	 */
	void setSort(Sort value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see terms.TermsPackage#getVariableDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link terms.VariableDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Declaration Type</b></em>' attribute.
	 * The literals are from the enumeration {@link terms.VariableDeclarationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Declaration Type</em>' attribute.
	 * @see terms.VariableDeclarationType
	 * @see #setVariableDeclarationType(VariableDeclarationType)
	 * @see terms.TermsPackage#getVariableDeclaration_VariableDeclarationType()
	 * @model
	 * @generated
	 */
	VariableDeclarationType getVariableDeclarationType();

	/**
	 * Sets the value of the '{@link terms.VariableDeclaration#getVariableDeclarationType <em>Variable Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Declaration Type</em>' attribute.
	 * @see terms.VariableDeclarationType
	 * @see #getVariableDeclarationType()
	 * @generated
	 */
	void setVariableDeclarationType(VariableDeclarationType value);

	/**
	 * Returns the value of the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' reference.
	 * @see #setStep(InitializableType)
	 * @see terms.TermsPackage#getVariableDeclaration_Step()
	 * @model
	 * @generated
	 */
	InitializableType getStep();

	/**
	 * Sets the value of the '{@link terms.VariableDeclaration#getStep <em>Step</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step</em>' reference.
	 * @see #getStep()
	 * @generated
	 */
	void setStep(InitializableType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see terms.TermsPackage#getVariableDeclaration_Value()
	 * @model default=""
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link terms.VariableDeclaration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // VariableDeclaration
