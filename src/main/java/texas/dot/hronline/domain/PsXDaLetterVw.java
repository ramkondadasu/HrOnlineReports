package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;


/**
 * The persistent class for the PS_X_DA_LETTER_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_DA_LETTER_VW")
@NamedQuery(name="PsXDaLetterVw.findAll", query="SELECT p FROM PsXDaLetterVw p")
public class PsXDaLetterVw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attachsysfilename;

	private String attachuserfile;

	private String completed;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_RECEIVED")
	private Date dateReceived;
	
	@Id
	private String emplid;

	@Temporal(TemporalType.DATE)
	@Column(name="LETTER_PRINTED_DT")
	private Date letterPrintedDt;

	private String originatorid;

	@Temporal(TemporalType.DATE)
	@Column(name="PLAN_DT")
	private Date planDt;

	@Column(name="X_CASE_NBR")
	private String xCaseNbr;

	@Column(name="X_EMPL_RESP_RCVD")
	private String xEmplRespRcvd;

	@Column(name="X_IMPRV_PLAN_SUM")
	@NumberFormat(style = NumberFormat.Style.CURRENCY)
	private Long xImprvPlanSum;

	@Column(name="X_SIGNED_COPYLET")
	private String xSignedCopylet;

	public PsXDaLetterVw() {
	}

	public String getAttachsysfilename() {
		return this.attachsysfilename;
	}

	public void setAttachsysfilename(String attachsysfilename) {
		this.attachsysfilename = attachsysfilename;
	}

	public String getAttachuserfile() {
		return this.attachuserfile;
	}

	public void setAttachuserfile(String attachuserfile) {
		this.attachuserfile = attachuserfile;
	}

	public String getCompleted() {
		return this.completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
	}

	public Date getDateReceived() {
		return this.dateReceived;
	}

	public void setDateReceived(Date dateReceived) {
		this.dateReceived = dateReceived;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public Date getLetterPrintedDt() {
		return this.letterPrintedDt;
	}

	public void setLetterPrintedDt(Date letterPrintedDt) {
		this.letterPrintedDt = letterPrintedDt;
	}

	public String getOriginatorid() {
		return this.originatorid;
	}

	public void setOriginatorid(String originatorid) {
		this.originatorid = originatorid;
	}

	public Date getPlanDt() {
		return this.planDt;
	}

	public void setPlanDt(Date planDt) {
		this.planDt = planDt;
	}

	public String getXCaseNbr() {
		return this.xCaseNbr;
	}

	public void setXCaseNbr(String xCaseNbr) {
		this.xCaseNbr = xCaseNbr;
	}

	public String getXEmplRespRcvd() {
		return this.xEmplRespRcvd;
	}

	public void setXEmplRespRcvd(String xEmplRespRcvd) {
		this.xEmplRespRcvd = xEmplRespRcvd;
	}

	public Long getXImprvPlanSum() {
		return this.xImprvPlanSum;
	}

	public void setXImprvPlanSum(Long xImprvPlanSum) {
		this.xImprvPlanSum = xImprvPlanSum;
	}

	public String getXSignedCopylet() {
		return this.xSignedCopylet;
	}

	public void setXSignedCopylet(String xSignedCopylet) {
		this.xSignedCopylet = xSignedCopylet;
	}

}