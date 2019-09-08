package texas.dot.hronline.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;


/**
 * The persistent class for the JOBCODE_PROFILE_DATA_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="JOBCODE_PROFILE_DATA_VW")
public class JobcodeProfileDataMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descr;

	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date effdt;


	@Column(name="FLSA_STATUS")
	private String flsaStatus;

	private String grade;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	@Id
	private BigDecimal id;
	
	private String jobcode;

	@Column(name="SAL_ADMIN_PLAN")
	private String salAdminPlan;

	@Column(name="X_STATE_CLASS_CD")
	private String xStateClassCd;

	public JobcodeProfileDataMvw() {
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public String getFlsaStatus() {
		return this.flsaStatus;
	}

	public void setFlsaStatus(String flsaStatus) {
		this.flsaStatus = flsaStatus;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobcode() {
		return this.jobcode;
	}

	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}

	public String getSalAdminPlan() {
		return this.salAdminPlan;
	}

	public void setSalAdminPlan(String salAdminPlan) {
		this.salAdminPlan = salAdminPlan;
	}

	public String getXStateClassCd() {
		return this.xStateClassCd;
	}

	public void setXStateClassCd(String xStateClassCd) {
		this.xStateClassCd = xStateClassCd;
	}
	
	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getxStateClassCd() {
		return xStateClassCd;
	}

	public void setxStateClassCd(String xStateClassCd) {
		this.xStateClassCd = xStateClassCd;
	}

}