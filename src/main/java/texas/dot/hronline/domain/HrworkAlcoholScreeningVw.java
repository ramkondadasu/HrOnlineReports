package texas.dot.hronline.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;

/**
 * The persistent class for the HRWORK_ALCOHOL_SCREENING_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="HRWORK_ALCOHOL_SCREENING_VW")
public class HrworkAlcoholScreeningVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="COLLECTED_DATE")
	private Date collectedDate;

	@Column(name="CONFIRMATION_LEVEL")
	private BigDecimal confirmationLevel;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="SCREEN_LEVEL")
	private BigDecimal screenLevel;
	@Id
	@Column(name="SSN_NUMBER")
	private String ssnNumber;

	public HrworkAlcoholScreeningVw() {
	}

	public Date getCollectedDate() {
		return this.collectedDate;
	}

	public void setCollectedDate(Date collectedDate) {
		this.collectedDate = collectedDate;
	}

	public BigDecimal getConfirmationLevel() {
		return this.confirmationLevel;
	}

	public void setConfirmationLevel(BigDecimal confirmationLevel) {
		this.confirmationLevel = confirmationLevel;
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

	public BigDecimal getScreenLevel() {
		return this.screenLevel;
	}

	public void setScreenLevel(BigDecimal screenLevel) {
		this.screenLevel = screenLevel;
	}

	public String getSsnNumber() {
		return this.ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

}