package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_ACTN_REASON_TBL_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_ACTN_REASON_TBL_VW")
@NamedQuery(name="PsActnReasonTblVw.findAll", query="SELECT p FROM PsActnReasonTblVw p")
public class PsActnReasonTblVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACTION")
	private String action;

	@Column(name="ACTION_REASON")
	private String actionReason;

	private String descr;

	@Column(name="EFF_STATUS")
	private String effStatus;

	@Temporal(TemporalType.DATE)
	private Date effdt;
	
	@Id
	private BigDecimal id;

	public PsActnReasonTblVw() {
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getActionReason() {
		return this.actionReason;
	}

	public void setActionReason(String actionReason) {
		this.actionReason = actionReason;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getEffStatus() {
		return this.effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}