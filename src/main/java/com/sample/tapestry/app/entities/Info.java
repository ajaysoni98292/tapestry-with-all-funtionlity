package com.sample.tapestry.app.entities;

import org.apache.tapestry5.beaneditor.NonVisual;
import org.apache.tapestry5.beaneditor.Validate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ajay
 */

@Entity
public class Info {

    @Id
    @NonVisual
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Validate("required, minLength=5")
    private String name;

    @Validate("required, maxLength=10, minLength=10")
    private String mobileNumber;

    @Validate("required,regexp=^\\d{5}(-\\d{4})?$")
    private String zip;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
