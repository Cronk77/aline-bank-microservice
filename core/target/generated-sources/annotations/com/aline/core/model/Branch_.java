package com.aline.core.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Branch.class)
public abstract class Branch_ {

	public static volatile SingularAttribute<Branch, String> zipcode;
	public static volatile SingularAttribute<Branch, Bank> bank;
	public static volatile SingularAttribute<Branch, String> address;
	public static volatile SingularAttribute<Branch, String> city;
	public static volatile SingularAttribute<Branch, String> phone;
	public static volatile SingularAttribute<Branch, String> name;
	public static volatile SingularAttribute<Branch, Long> id;
	public static volatile SingularAttribute<Branch, String> state;

	public static final String ZIPCODE = "zipcode";
	public static final String BANK = "bank";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String PHONE = "phone";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String STATE = "state";

}

