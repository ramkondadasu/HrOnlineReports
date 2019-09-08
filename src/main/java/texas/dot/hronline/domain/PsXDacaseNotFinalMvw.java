package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_DACASE_NOT_FINAL_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_DACASE_NOT_FINAL_MVW")
@NamedQuery(name="PsXDacaseNotFinalMvw.findAll", query="SELECT p FROM PsXDacaseNotFinalMvw p")
public class PsXDacaseNotFinalMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String completed;

	private String deptid;

	private String emplid;

	@Column(name="FINAL_RESOLUTION")
	private String finalResolution;
	@Id
	private BigDecimal id;

	@Temporal(TemporalType.DATE)
	@Column(name="LETTER_PRINTED_DT")
	private Date letterPrintedDt;

	@Column(name="X_CASE_NBR")
	private String xCaseNbr;

	public PsXDacaseNotFinalMvw() {
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCompleted() {
		return this.completed;
	}

	public void setCompleted(String completed) {
		this.completed = completed;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public Date getLetterPrintedDt() {
		return this.letterPrintedDt;
	}

	public void setLetterPrintedDt(Date letterPrintedDt) {
		this.letterPrintedDt = letterPrintedDt;
	}

	public String getXCaseNbr() {
		return this.xCaseNbr;
	}

	public void setXCaseNbr(String xCaseNbr) {
		this.xCaseNbr = xCaseNbr;
	}

}