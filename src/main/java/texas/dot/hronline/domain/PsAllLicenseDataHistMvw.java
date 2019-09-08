package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_ALL_LICENSE_DATA_HIST_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_ALL_LICENSE_DATA_HIST_MVW")
@NamedQuery(name="PsAllLicenseDataHistMvw.findAll", query="SELECT p FROM PsAllLicenseDataHistMvw p")
public class PsAllLicenseDataHistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String accomplishment;

	@Column(name="ACCOMPLISHMENT_DESCR")
	private String accomplishmentDescr;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String deptid;

	@Column(name="EMPL_RCD")
	private BigDecimal emplRcd;

	private String emplid;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATN_DT")
	private Date expiratnDt;
	@Id
	private BigDecimal id;

	@Column(name="ISSUING_AUTHORITY")
	private String issuingAuthority;

	@Column(name="JOBCODE_DESCR")
	private String jobcodeDescr;

	@Column(name="LICENSE_NBR")
	private String licenseNbr;

	private String name;

	@Column(name="X_ISSUING_AUTH")
	private String xIssuingAuth;

	public PsAllLicenseDataHistMvw() {
	}

	public String getAccomplishment() {
		return this.accomplishment;
	}

	public void setAccomplishment(String accomplishment) {
		this.accomplishment = accomplishment;
	}

	public String getAccomplishmentDescr() {
		return this.accomplishmentDescr;
	}

	public void setAccomplishmentDescr(String accomplishmentDescr) {
		this.accomplishmentDescr = accomplishmentDescr;
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public BigDecimal getEmplRcd() {
		return this.emplRcd;
	}

	public void setEmplRcd(BigDecimal emplRcd) {
		this.emplRcd = emplRcd;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public Date getExpiratnDt() {
		return this.expiratnDt;
	}

	public void setExpiratnDt(Date expiratnDt) {
		this.expiratnDt = expiratnDt;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getIssuingAuthority() {
		return this.issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public String getJobcodeDescr() {
		return this.jobcodeDescr;
	}

	public void setJobcodeDescr(String jobcodeDescr) {
		this.jobcodeDescr = jobcodeDescr;
	}

	public String getLicenseNbr() {
		return this.licenseNbr;
	}

	public void setLicenseNbr(String licenseNbr) {
		this.licenseNbr = licenseNbr;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXIssuingAuth() {
		return this.xIssuingAuth;
	}

	public void setXIssuingAuth(String xIssuingAuth) {
		this.xIssuingAuth = xIssuingAuth;
	}

}