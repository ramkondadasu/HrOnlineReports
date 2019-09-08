package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_OTHER_ACCOMPL_DATA_HIST_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_OTHER_ACCOMPL_DATA_HIST_MVW")
@NamedQuery(name="PsOtherAccomplDataHistMvw.findAll", query="SELECT p FROM PsOtherAccomplDataHistMvw p")
public class PsOtherAccomplDataHistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACCOMP_CATEGORY")
	private String accompCategory;

	private String accomplishment;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String deptid;

	private String descr;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_ISSUED")
	private Date dtIssued;

	private String emplid;
	@Id
	private BigDecimal id;

	private String name;

	public PsOtherAccomplDataHistMvw() {
	}

	public String getAccompCategory() {
		return this.accompCategory;
	}

	public void setAccompCategory(String accompCategory) {
		this.accompCategory = accompCategory;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
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

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}