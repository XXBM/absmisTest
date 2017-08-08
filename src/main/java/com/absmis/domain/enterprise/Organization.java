package com.absmis.domain.enterprise;


import com.absmis.domain.authority.User;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.MappedSuperclass;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 *
 * 企业与企业产业化信息
 * 项目与项目产业化信息
 * 单位工程与单位工程产业化信息
 * 项目与项目进度信息
 *
 */
@MappedSuperclass
@DynamicInsert(true)
@DynamicUpdate(true)
public abstract class Organization extends User {
    @javax.persistence.Column(nullable = false)
    protected String creditCode;
    @javax.persistence.Column(nullable = false)
    protected String organizationCode;
    @javax.persistence.Column(nullable = false)
    protected String name;
    @javax.persistence.Column(nullable = false)
    protected String city;
    @javax.persistence.Column(nullable = false)
    protected String legalRepresentative;
    @javax.persistence.Column(nullable = false)
    protected String contactPerson;
    @javax.persistence.Column(nullable = false)
    protected String idNumber;
    @javax.persistence.Column(nullable = false)
    protected String phoneNumber;
    @javax.persistence.Column(nullable = false)
    protected String officePhone;
    @javax.persistence.Column(nullable = false)
    protected String mailingAddress;
    @javax.persistence.Column(nullable = false)
    protected String postalCode;
    public Organization() {
        super();
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}

