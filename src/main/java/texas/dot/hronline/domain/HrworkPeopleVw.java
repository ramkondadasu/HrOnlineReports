package texas.dot.hronline.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the HRWORK_PEOPLE_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="HRWORK_PEOPLE_VW")
public class HrworkPeopleVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ALTERNATE_ID")
	private String alternateId;

	@Column(name="CD_CERT_405")
	private String cdCert405;

	@Column(name="CD_VM_RECPT")
	private String cdVmRecpt;

	private String ddo;

	@Column(name="DEPARTMENT_ID")
	private String departmentId;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FUNC_CODE")
	private String funcCode;

	@Temporal(TemporalType.DATE)
	@Column(name="HIRED_DATE")
	private Date hiredDate;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="SI_CERT_404")
	private String siCert404;

	@Column(name="SI_RCPT")
	private String siRcpt;
    @Id
	@Column(name="SSN_NUMBER")
	private String ssnNumber;

	@Column(name="VCM_CERT_406")
	private String vcmCert406;

	public HrworkPeopleVw() {
	}

	public String getAlternateId() {
		return this.alternateId;
	}

	public void setAlternateId(String alternateId) {
		this.alternateId = alternateId;
	}

	public String getCdCert405() {
		return this.cdCert405;
	}

	public void setCdCert405(String cdCert405) {
		this.cdCert405 = cdCert405;
	}

	public String getCdVmRecpt() {
		return this.cdVmRecpt;
	}

	public void setCdVmRecpt(String cdVmRecpt) {
		this.cdVmRecpt = cdVmRecpt;
	}

	public String getDdo() {
		return this.ddo;
	}

	public void setDdo(String ddo) {
		this.ddo = ddo;
	}

	public String getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFuncCode() {
		return this.funcCode;
	}

	public void setFuncCode(String funcCode) {
		this.funcCode = funcCode;
	}

	public Date getHiredDate() {
		return this.hiredDate;
	}

	public void setHiredDate(Date hiredDate) {
		this.hiredDate = hiredDate;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSiCert404() {
		return this.siCert404;
	}

	public void setSiCert404(String siCert404) {
		this.siCert404 = siCert404;
	}

	public String getSiRcpt() {
		return this.siRcpt;
	}

	public void setSiRcpt(String siRcpt) {
		this.siRcpt = siRcpt;
	}

	public String getSsnNumber() {
		return this.ssnNumber;
	}

	public void setSsnNumber(String ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public String getVcmCert406() {
		return this.vcmCert406;
	}

	public void setVcmCert406(String vcmCert406) {
		this.vcmCert406 = vcmCert406;
	}

}