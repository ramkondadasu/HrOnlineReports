package texas.dot.hronline.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;
/**
 * The persistent class for the HRWORK_DRUG_TEST_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="HRWORK_DRUG_TEST_VW")
public class HrworkDrugTestVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="COLLECTED_DATE")
	private Date collectedDate;

	@Column(name="COLLECTION_STATUS")
	private String collectionStatus;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	private String reason;

//	@Column(name="\"RESULT\"")
//	private String result;

	@Temporal(TemporalType.DATE)
	@Column(name="SCHEDULED_DATE")
	private Date scheduledDate;
    @Id
	@Column(name="SSN_NUMBER")
	private String ssnNumber;

	@Column(name="TESTED_FOR")
	private String testedFor;

	public HrworkDrugTestVw() {
	}

	public Date getCollectedDate() {
		return this.collectedDate;
	}

	public void setCollectedDate(Date collectedDate) {
		this.collectedDate = collectedDate;
	}

	public String getCollectionStatus() {
		return this.collectionStatus;
	}

	public void setCollectionStatus(String collectionStatus) {
		this.collectionStatus = collectionStatus;
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

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
//
//	public String getResult() {
//		return this.result;
//	}
//
//	public void setResult(String result) {
//		this.result = result;
//	}

	public Date getScheduledDate() {
		return this.scheduledDate;
	}

	public void setScheduledDate(Date scheduledDate) {
		this.scheduledDate = scheduledDate;
	}

	public String getSsnNumber() {
		return this.ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public String getTestedFor() {
		return this.testedFor;
	}

	public void setTestedFor(String testedFor) {
		this.testedFor = testedFor;
	}

}