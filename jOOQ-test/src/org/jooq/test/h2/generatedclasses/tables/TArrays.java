/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TArrays extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> {

	private static final long serialVersionUID = -784512905;

	/**
	 * The singleton instance of <code>PUBLIC.T_ARRAYS</code>
	 */
	public static final org.jooq.test.h2.generatedclasses.tables.TArrays T_ARRAYS = new org.jooq.test.h2.generatedclasses.tables.TArrays();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> getRecordType() {
		return org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord.class;
	}

	/**
	 * The column <code>PUBLIC.T_ARRAYS.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_ARRAYS);

	/**
	 * The column <code>PUBLIC.T_ARRAYS.STRING_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> STRING_ARRAY = createField("STRING_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * The column <code>PUBLIC.T_ARRAYS.NUMBER_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> NUMBER_ARRAY = createField("NUMBER_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * The column <code>PUBLIC.T_ARRAYS.DATE_ARRAY</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord, java.lang.Object[]> DATE_ARRAY = createField("DATE_ARRAY", org.jooq.impl.SQLDataType.OTHER.getArrayDataType(), T_ARRAYS);

	/**
	 * No further instances allowed
	 */
	private TArrays() {
		super("T_ARRAYS", org.jooq.test.h2.generatedclasses.Public.PUBLIC);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord> getPrimaryKey() {
		return org.jooq.test.h2.generatedclasses.UniqueKeys.TArrays.PK_T_ARRAYS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.h2.generatedclasses.tables.records.TArraysRecord>>asList(org.jooq.test.h2.generatedclasses.UniqueKeys.TArrays.PK_T_ARRAYS);
	}
}
