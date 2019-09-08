package texas.dot.hronline.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the HRWORK_POSITIVE_HISTORY_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="HRWORK_POSITIVE_HISTORY_VW")
public class HrworkPositiveHistoryVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALTERNATE_ID")
	private String alternateId;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_POSITIVE")
	private Date datePositive;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;
    @Id
	@Column(name="SSN_NUMBER")
	private String ssnNumber;

	private String subtype;

	//private String testtype;

	public HrworkPositiveHistoryVw() {
	}

	public String getAlternateId() {
		return this.alternateId;
	}

	public void setAlternateId(String alternateId) {
		this.alternateId = alternateId;
	}

	public Date getDatePositive() {
		return this.datePositive;
	}

	public void setDatePositive(Date datePositive) {
		this.datePositive = datePositive;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsnNumber() {
		return this.ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public String getSubtype() {
		return this.subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

//	public String getTesttype() {
//		return this.testtype;
//	}
//
//	public void setTesttype(String testtype) {
//		this.testtype = testtype;
//	}

}