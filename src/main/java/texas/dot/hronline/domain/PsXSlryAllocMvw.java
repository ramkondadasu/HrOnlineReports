package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;


/**
 * The persistent class for the PS_X_SLRY_ALLOC_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist", name="PS_X_SLRY_ALLOC_MVW")
@NamedQuery(name="PsXSlryAllocMvw.findAll", query="SELECT p FROM PsXSlryAllocMvw p")
public class PsXSlryAllocMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ADJUSTMT_AMT")
	private BigDecimal adjustmtAmt;

	@Column(name="ALLOCATION_AMT")
	private BigDecimal allocationAmt;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	@Column(name="FISCAL_YEAR")
	private BigDecimal fiscalYear;

	@Column(name="FTE_CAP")
	private BigDecimal fteCap;

	private String monthcd;

	@Id
	private BigDecimal id;

	@Column(name="X_FTE_CAP_GOAL")
	private BigDecimal xFteCapGoal;

	@Column(name="X_HR_APPROVED_CAP")
	private BigDecimal xHrApprovedCap;

	@Column(name="X_MGR_SPV_CAP")
	private BigDecimal xMgrSpvCap;

	@Column(name="X_PREV_ADJUST_AMT")
	private BigDecimal xPrevAdjustAmt;

	
	private String year;

	public PsXSlryAllocMvw() {
	}

	public BigDecimal getAdjustmtAmt() {
		return this.adjustmtAmt;
	}

	public void setAdjustmtAmt(BigDecimal adjustmtAmt) {
		this.adjustmtAmt = adjustmtAmt;
	}

	public BigDecimal getAllocationAmt() {
		return this.allocationAmt;
	}

	public void setAllocationAmt(BigDecimal allocationAmt) {
		this.allocationAmt = allocationAmt;
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public BigDecimal getFiscalYear() {
		return this.fiscalYear;
	}

	public void setFiscalYear(BigDecimal fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public BigDecimal getFteCap() {
		return this.fteCap;
	}

	public void setFteCap(BigDecimal fteCap) {
		this.fteCap = fteCap;
	}

	public String getMonthcd() {
		return this.monthcd;
	}

	public void setMonthcd(String monthcd) {
		this.monthcd = monthcd;
	}



	public BigDecimal getXFteCapGoal() {
		return this.xFteCapGoal;
	}

	public void setXFteCapGoal(BigDecimal xFteCapGoal) {
		this.xFteCapGoal = xFteCapGoal;
	}

	public BigDecimal getXHrApprovedCap() {
		return this.xHrApprovedCap;
	}

	public void setXHrApprovedCap(BigDecimal xHrApprovedCap) {
		this.xHrApprovedCap = xHrApprovedCap;
	}

	public BigDecimal getXMgrSpvCap() {
		return this.xMgrSpvCap;
	}

	public void setXMgrSpvCap(BigDecimal xMgrSpvCap) {
		this.xMgrSpvCap = xMgrSpvCap;
	}

	public BigDecimal getXPrevAdjustAmt() {
		return this.xPrevAdjustAmt;
	}

	public void setXPrevAdjustAmt(BigDecimal xPrevAdjustAmt) {
		this.xPrevAdjustAmt = xPrevAdjustAmt;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

}