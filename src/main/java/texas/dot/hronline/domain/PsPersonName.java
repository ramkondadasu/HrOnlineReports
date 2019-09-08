package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.util.Date;


/**
 * The persistent class for the PS_PERSON_NAME database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_PERSON_NAME")
@NamedQuery(name="PsPersonName.findAll", query="SELECT p FROM PsPersonName p")
public class PsPersonName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COUNTRY_NM_FORMAT")
	private String countryNmFormat;

	@Temporal(TemporalType.DATE)
	private Date effdt;
	@Id
	private String emplid;

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="FIRST_NAME_SRCH")
	private String firstNameSrch;

	@Column(name="LAST_NAME")
	private String lastName;

	@Column(name="LAST_NAME_PREF_NLD")
	private String lastNamePrefNld;

	@Column(name="LAST_NAME_SRCH")
	private String lastNameSrch;

	@Column(name="MIDDLE_NAME")
	private String middleName;

	private String name;

	@Column(name="NAME_AC")
	private String nameAc;

	@Column(name="NAME_INITIALS")
	private String nameInitials;

	@Column(name="NAME_PREFIX")
	private String namePrefix;

	@Column(name="NAME_ROYAL_PREFIX")
	private String nameRoyalPrefix;

	@Column(name="NAME_ROYAL_SUFFIX")
	private String nameRoyalSuffix;

	@Column(name="NAME_SUFFIX")
	private String nameSuffix;

	@Column(name="NAME_TITLE")
	private String nameTitle;

	@Column(name="NAME_TYPE")
	private String nameType;

	@Column(name="PARTNER_LAST_NAME")
	private String partnerLastName;

	@Column(name="PARTNER_ROY_PREFIX")
	private String partnerRoyPrefix;

	@Column(name="PREF_FIRST_NAME")
	private String prefFirstName;

	@Column(name="SECOND_LAST_NAME")
	private String secondLastName;

	@Column(name="SECOND_LAST_SRCH")
	private String secondLastSrch;

	public PsPersonName() {
	}

	public String getCountryNmFormat() {
		return this.countryNmFormat;
	}

	public void setCountryNmFormat(String countryNmFormat) {
		this.countryNmFormat = countryNmFormat;
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

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstNameSrch() {
		return this.firstNameSrch;
	}

	public void setFirstNameSrch(String firstNameSrch) {
		this.firstNameSrch = firstNameSrch;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastNamePrefNld() {
		return this.lastNamePrefNld;
	}

	public void setLastNamePrefNld(String lastNamePrefNld) {
		this.lastNamePrefNld = lastNamePrefNld;
	}

	public String getLastNameSrch() {
		return this.lastNameSrch;
	}

	public void setLastNameSrch(String lastNameSrch) {
		this.lastNameSrch = lastNameSrch;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameAc() {
		return this.nameAc;
	}

	public void setNameAc(String nameAc) {
		this.nameAc = nameAc;
	}

	public String getNameInitials() {
		return this.nameInitials;
	}

	public void setNameInitials(String nameInitials) {
		this.nameInitials = nameInitials;
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
	}

	public String getNameRoyalPrefix() {
		return this.nameRoyalPrefix;
	}

	public void setNameRoyalPrefix(String nameRoyalPrefix) {
		this.nameRoyalPrefix = nameRoyalPrefix;
	}

	public String getNameRoyalSuffix() {
		return this.nameRoyalSuffix;
	}

	public void setNameRoyalSuffix(String nameRoyalSuffix) {
		this.nameRoyalSuffix = nameRoyalSuffix;
	}

	public String getNameSuffix() {
		return this.nameSuffix;
	}

	public void setNameSuffix(String nameSuffix) {
		this.nameSuffix = nameSuffix;
	}

	public String getNameTitle() {
		return this.nameTitle;
	}

	public void setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
	}

	public String getNameType() {
		return this.nameType;
	}

	public void setNameType(String nameType) {
		this.nameType = nameType;
	}

	public String getPartnerLastName() {
		return this.partnerLastName;
	}

	public void setPartnerLastName(String partnerLastName) {
		this.partnerLastName = partnerLastName;
	}

	public String getPartnerRoyPrefix() {
		return this.partnerRoyPrefix;
	}

	public void setPartnerRoyPrefix(String partnerRoyPrefix) {
		this.partnerRoyPrefix = partnerRoyPrefix;
	}

	public String getPrefFirstName() {
		return this.prefFirstName;
	}

	public void setPrefFirstName(String prefFirstName) {
		this.prefFirstName = prefFirstName;
	}

	public String getSecondLastName() {
		return this.secondLastName;
	}

	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}

	public String getSecondLastSrch() {
		return this.secondLastSrch;
	}

	public void setSecondLastSrch(String secondLastSrch) {
		this.secondLastSrch = secondLastSrch;
	}

}