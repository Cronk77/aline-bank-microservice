package com.aline.core.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Applicant.class)
public abstract class Applicant_ {

	public static volatile SingularAttribute<Applicant, Integer> income;
	public static volatile SingularAttribute<Applicant, String> mailingZipcode;
	public static volatile SingularAttribute<Applicant, String> lastName;
	public static volatile SingularAttribute<Applicant, String> address;
	public static volatile SingularAttribute<Applicant, LocalDateTime> lastModifiedAt;
	public static volatile SingularAttribute<Applicant, Gender> gender;
	public static volatile SingularAttribute<Applicant, String> city;
	public static volatile SingularAttribute<Applicant, String> mailingCity;
	public static volatile SingularAttribute<Applicant, LocalDate> dateOfBirth;
	public static volatile SingularAttribute<Applicant, String> driversLicense;
	public static volatile SingularAttribute<Applicant, String> zipcode;
	public static volatile SingularAttribute<Applicant, String> firstName;
	public static volatile SingularAttribute<Applicant, LocalDateTime> createdAt;
	public static volatile SingularAttribute<Applicant, String> phone;
	public static volatile SingularAttribute<Applicant, String> mailingAddress;
	public static volatile SingularAttribute<Applicant, String> middleName;
	public static volatile SingularAttribute<Applicant, Long> id;
	public static volatile SingularAttribute<Applicant, String> state;
	public static volatile SingularAttribute<Applicant, String> mailingState;
	public static volatile SingularAttribute<Applicant, String> socialSecurity;
	public static volatile SingularAttribute<Applicant, String> email;
	public static volatile SetAttribute<Applicant, Application> applications;

	public static final String INCOME = "income";
	public static final String MAILING_ZIPCODE = "mailingZipcode";
	public static final String LAST_NAME = "lastName";
	public static final String ADDRESS = "address";
	public static final String LAST_MODIFIED_AT = "lastModifiedAt";
	public static final String GENDER = "gender";
	public static final String CITY = "city";
	public static final String MAILING_CITY = "mailingCity";
	public static final String DATE_OF_BIRTH = "dateOfBirth";
	public static final String DRIVERS_LICENSE = "driversLicense";
	public static final String ZIPCODE = "zipcode";
	public static final String FIRST_NAME = "firstName";
	public static final String CREATED_AT = "createdAt";
	public static final String PHONE = "phone";
	public static final String MAILING_ADDRESS = "mailingAddress";
	public static final String MIDDLE_NAME = "middleName";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String MAILING_STATE = "mailingState";
	public static final String SOCIAL_SECURITY = "socialSecurity";
	public static final String EMAIL = "email";
	public static final String APPLICATIONS = "applications";

}

