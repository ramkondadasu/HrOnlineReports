package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_LR01_DA_CASE_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_LR01_DA_CASE_MVW")
@NamedQuery(name="PsXLr01DaCaseMvw.findAll", query="SELECT p FROM PsXLr01DaCaseMvw p")
public class PsXLr01DaCaseMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DISCIP_STEP_DESCR")
	private String discipStepDescr;

	@Column(name="DISCIP_TYPE_DESCR")
	private String discipTypeDescr;

	@Column(name="DISCIPLINARY_STEP")
	private String disciplinaryStep;

	@Column(name="DISCIPLINARY_TYPE")
	private String disciplinaryType;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	private String emplid;

	@Column(name="FIRST_NAME_SRCH")
	private String firstNameSrch;
	@Id
	private BigDecimal id;

	@Column(name="LAST_NAME_SRCH")
	private String lastNameSrch;

	@Temporal(TemporalType.DATE)
	@Column(name="LETTER_PRINTED_DT")
	private Date letterPrintedDt;

	@Column(name="TXDOT_DISTRICT_ABBV")
	private String txdotDistrictAbbv;

	@Column(name="X_CASE_NBR")
	private String xCaseNbr;

	@Column(name="X_REPORT_SUMMARY")
	private String xReportSummary;

	public PsXLr01DaCaseMvw() {
	}

	public String getDiscipStepDescr() {
		return this.discipStepDescr;
	}

	public void setDiscipStepDescr(String discipStepDescr) {
		this.discipStepDescr = discipStepDescr;
	}

	public String getDiscipTypeDescr() {
		return this.discipTypeDescr;
	}

	public void setDiscipTypeDescr(String discipTypeDescr) {
		this.discipTypeDescr = discipTypeDescr;
	}

	public String getDisciplinaryStep() {
		return this.disciplinaryStep;
	}

	public void setDisciplinaryStep(String disciplinaryStep) {
		this.disciplinaryStep = disciplinaryStep;
	}

	public String getDisciplinaryType() {
		return this.disciplinaryType;
	}

	public void setDisciplinaryType(String disciplinaryType) {
		this.disciplinaryType = disciplinaryType;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getFirstNameSrch() {
		return this.firstNameSrch;
	}

	public void setFirstNameSrch(String firstNameSrch) {
		this.firstNameSrch = firstNameSrch;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getLastNameSrch() {
		return this.lastNameSrch;
	}

	public void setLastNameSrch(String lastNameSrch) {
		this.lastNameSrch = lastNameSrch;
	}

	public Date getLetterPrintedDt() {
		return this.letterPrintedDt;
	}

	public void setLetterPrintedDt(Date letterPrintedDt) {
		this.letterPrintedDt = letterPrintedDt;
	}

	public String getTxdotDistrictAbbv() {
		return this.txdotDistrictAbbv;
	}

	public void setTxdotDistrictAbbv(String txdotDistrictAbbv) {
		this.txdotDistrictAbbv = txdotDistrictAbbv;
	}

	public String getXCaseNbr() {
		return this.xCaseNbr;
	}

	public void setXCaseNbr(String xCaseNbr) {
		this.xCaseNbr = xCaseNbr;
	}

	public String getXReportSummary() {
		return this.xReportSummary;
	}

	public void setXReportSummary(String xReportSummary) {
		this.xReportSummary = xReportSummary;
	}

}