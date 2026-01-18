/**
 */
package de.hsu.grafcet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Highlightable Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.hsu.grafcet.HighlightableType#isHighlight <em>Highlight</em>}</li>
 * </ul>
 *
 * @see de.hsu.grafcet.GrafcetPackage#getHighlightableType()
 * @model
 * @generated
 */
public interface HighlightableType extends Node {
	/**
	 * Returns the value of the '<em><b>Highlight</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Highlight</em>' attribute.
	 * @see #setHighlight(boolean)
	 * @see de.hsu.grafcet.GrafcetPackage#getHighlightableType_Highlight()
	 * @model default="false" required="true"
	 * @generated
	 */
	boolean isHighlight();

	/**
	 * Sets the value of the '{@link de.hsu.grafcet.HighlightableType#isHighlight <em>Highlight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Highlight</em>' attribute.
	 * @see #isHighlight()
	 * @generated
	 */
	void setHighlight(boolean value);

} // HighlightableType
