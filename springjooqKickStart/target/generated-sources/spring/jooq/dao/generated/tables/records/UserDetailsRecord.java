/**
 * This class is generated by jOOQ
 */
package spring.jooq.dao.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDetailsRecord extends org.jooq.impl.UpdatableRecordImpl<spring.jooq.dao.generated.tables.records.UserDetailsRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1702372006;

	/**
	 * Setter for <code>user_mgmt.user_details.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>user_mgmt.user_details.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>user_mgmt.user_details.username</code>.
	 */
	public void setUsername(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>user_mgmt.user_details.username</code>.
	 */
	public java.lang.String getUsername() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>user_mgmt.user_details.address</code>.
	 */
	public void setAddress(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>user_mgmt.user_details.address</code>.
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS.USERNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getUsername();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetailsRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetailsRecord value2(java.lang.String value) {
		setUsername(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetailsRecord value3(java.lang.String value) {
		setAddress(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserDetailsRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserDetailsRecord
	 */
	public UserDetailsRecord() {
		super(spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS);
	}

	/**
	 * Create a detached, initialised UserDetailsRecord
	 */
	public UserDetailsRecord(java.lang.Integer id, java.lang.String username, java.lang.String address) {
		super(spring.jooq.dao.generated.tables.UserDetails.USER_DETAILS);

		setValue(0, id);
		setValue(1, username);
		setValue(2, address);
	}
}
