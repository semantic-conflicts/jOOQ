/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public interface IXTestCase_2025 extends java.io.Serializable {

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public void setRefId(java.lang.Integer value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_2025.REF_ID</code>. 
	 */
	public java.lang.Integer getRefId();

	/**
	 * Setter for <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public void setRefName(java.lang.String value);

	/**
	 * Getter for <code>PUBLIC.X_TEST_CASE_2025.REF_NAME</code>. 
	 */
	public java.lang.String getRefName();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IXTestCase_2025
	 */
	public void from(org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025 from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IXTestCase_2025
	 */
	public <E extends org.jooq.test.h2.generatedclasses.tables.interfaces.IXTestCase_2025> E into(E into);
}
