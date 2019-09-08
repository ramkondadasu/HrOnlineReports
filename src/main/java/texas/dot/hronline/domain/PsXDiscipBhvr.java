package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;


/**
 * The persistent class for the PS_X_DISCIP_BHVR database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_DISCIP_BHVR")
@NamedQuery(name="PsXDiscipBhvr.findAll", query="SELECT p FROM PsXDiscipBhvr p")
public class PsXDiscipBhvr implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DISCIPLINARY_TYPE")
	private String disciplinaryType;

	@Temporal(TemporalType.DATE)
	@Column(name="DISCIPLINE_DT")
	private Date disciplineDt;
	@Id
	private String emplid;

	@Column(name="X_CASE_NBR")
	private String xCaseNbr;

	public PsXDiscipBhvr() {
	}

	public String getDisciplinaryType() {
		return this.disciplinaryType;
	}

	public void setDisciplinaryType(String disciplinaryType) {
		this.disciplinaryType = disciplinaryType;
	}

	public Date getDisciplineDt() {
		return this.disciplineDt;
	}

	public void setDisciplineDt(Date disciplineDt) {
		this.disciplineDt = disciplineDt;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getXCaseNbr() {
		return this.xCaseNbr;
	}

	public void setXCaseNbr(String xCaseNbr) {
		this.xCaseNbr = xCaseNbr;
	}

}