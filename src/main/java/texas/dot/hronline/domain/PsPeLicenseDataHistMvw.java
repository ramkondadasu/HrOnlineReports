package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_PE_LICENSE_DATA_HIST_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_PE_LICENSE_DATA_HIST_MVW")
@NamedQuery(name="PsPeLicenseDataHistMvw.findAll", query="SELECT p FROM PsPeLicenseDataHistMvw p")
public class PsPeLicenseDataHistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String accomplishment;

	@Column(name="ACCOMPLISHMENT_DSCR")
	private String accomplishmentDscr;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String deptid;

	@Column(name="EMPL_RCD")
	private BigDecimal emplRcd;

	@Id
	private String emplid;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATN_DT")
	private Date expiratnDt;

	private BigDecimal id;

	@Column(name="ISSUING_AUTH")
	private String issuingAuth;

	@Column(name="JOB_CODE_DESCR")
	private String jobCodeDescr;

	@Column(name="LICENSE_NBR")
	private String licenseNbr;

	private String name;

	public PsPeLicenseDataHistMvw() {
	}

	public String getAccomplishment() {
		return this.accomplishment;
	}

	public void setAccomplishment(String accomplishment) {
		this.accomplishment = accomplishment;
	}

	public String getAccomplishmentDscr() {
		return this.accomplishmentDscr;
	}

	public void setAccomplishmentDscr(String accomplishmentDscr) {
		this.accomplishmentDscr = accomplishmentDscr;
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

	public String getIssuingAuth() {
		return this.issuingAuth;
	}

	public void setIssuingAuth(String issuingAuth) {
		this.issuingAuth = issuingAuth;
	}

	public String getJobCodeDescr() {
		return this.jobCodeDescr;
	}

	public void setJobCodeDescr(String jobCodeDescr) {
		this.jobCodeDescr = jobCodeDescr;
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

}