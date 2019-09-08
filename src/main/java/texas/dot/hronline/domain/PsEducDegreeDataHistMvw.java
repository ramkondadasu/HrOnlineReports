package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;


import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_EDUC_DEGREE_DATA_HIST_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_EDUC_DEGREE_DATA_HIST_MVW")
@NamedQuery(name="PsEducDegreeDataHistMvw.findAll", query="SELECT p FROM PsEducDegreeDataHistMvw p")
public class PsEducDegreeDataHistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String accomplishment;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String deptid;

	private String descr50;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ISSUED")
	private Date dtIssued;

	private String emplid;

	@Column(name="GRADUATE_INDICATOR")
	private String graduateIndicator;
	@Id
	private BigDecimal id;

	private String major;

	@Column(name="MAJOR_CODE")
	private String majorCode;

	private String name;

	@Column(name="SCHOOL_CODE")
	private String schoolCode;

	public PsEducDegreeDataHistMvw() {
	}

	public String getAccomplishment() {
		return this.accomplishment;
	}

	public void setAccomplishment(String accomplishment) {
		this.accomplishment = accomplishment;
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

	public String getDescr50() {
		return this.descr50;
	}

	public void setDescr50(String descr50) {
		this.descr50 = descr50;
	}

	public Date getDtIssued() {
		return this.dtIssued;
	}

	public void setDtIssued(Date dtIssued) {
		this.dtIssued = dtIssued;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getGraduateIndicator() {
		return this.graduateIndicator;
	}

	public void setGraduateIndicator(String graduateIndicator) {
		this.graduateIndicator = graduateIndicator;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getMajorCode() {
		return this.majorCode;
	}

	public void setMajorCode(String majorCode) {
		this.majorCode = majorCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

}