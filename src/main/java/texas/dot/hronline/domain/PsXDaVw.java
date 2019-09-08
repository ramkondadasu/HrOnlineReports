package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;


/**
 * The persistent class for the PS_X_DA_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_DA_VW")
@NamedQuery(name="PsXDaVw.findAll", query="SELECT p FROM PsXDaVw p")
public class PsXDaVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="AUTHORIZATION_ID")
	private String authorizationId;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String changed;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DT")
	private Date creationDt;

	private String deptid;
	@Id
	private String emplid;

	@Column(name="FINAL_RESOLUTION")
	private String finalResolution;

	@Column(name="SUPERVISOR_ID")
	private String supervisorId;

	@Column(name="X_BHVR_SUM")
	private long xBhvrSum;

	@Column(name="X_CASE_NBR")
	private String xCaseNbr;

	@Column(name="X_MDI_NBR")
	private String xMdiNbr;

	@Column(name="X_MDR_NBR")
	private String xMdrNbr;

	@Column(name="X_MGR_ROLEUSER")
	private String xMgrRoleuser;

	@Column(name="X_REPORT_SUMMARY")
	private String xReportSummary;

	public PsXDaVw() {
	}

	public String getAuthorizationId() {
		return this.authorizationId;
	}

	public void setAuthorizationId(String authorizationId) {
		this.authorizationId = authorizationId;
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getChanged() {
		return this.changed;
	}

	public void setChanged(String changed) {
		this.changed = changed;
	}

	public Date getCreationDt() {
		return this.creationDt;
	}

	public void setCreationDt(Date creationDt) {
		this.creationDt = creationDt;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getFinalResolution() {
		return this.finalResolution;
	}

	public void setFinalResolution(String finalResolution) {
		this.finalResolution = finalResolution;
	}

	public String getSupervisorId() {
		return this.supervisorId;
	}

	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}

	

	public String getXCaseNbr() {
		return this.xCaseNbr;
	}

	public void setXCaseNbr(String xCaseNbr) {
		this.xCaseNbr = xCaseNbr;
	}

	public String getXMdiNbr() {
		return this.xMdiNbr;
	}

	public void setXMdiNbr(String xMdiNbr) {
		this.xMdiNbr = xMdiNbr;
	}

	public String getXMdrNbr() {
		return this.xMdrNbr;
	}

	public void setXMdrNbr(String xMdrNbr) {
		this.xMdrNbr = xMdrNbr;
	}

	public String getXMgrRoleuser() {
		return this.xMgrRoleuser;
	}

	public void setXMgrRoleuser(String xMgrRoleuser) {
		this.xMgrRoleuser = xMgrRoleuser;
	}

	public String getXReportSummary() {
		return this.xReportSummary;
	}

	public void setXReportSummary(String xReportSummary) {
		this.xReportSummary = xReportSummary;
	}

	public long getxBhvrSum() {
		return xBhvrSum;
	}

	public void setxBhvrSum(long xBhvrSum) {
		this.xBhvrSum = xBhvrSum;
	}

}