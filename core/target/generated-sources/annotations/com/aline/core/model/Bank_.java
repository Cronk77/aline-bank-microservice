package com.aline.core.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bank.class)
public abstract class Bank_ {

	public static volatile SingularAttribute<Bank, String> zipcode;
	public static volatile SingularAttribute<Bank, String> routingNumber;
	public static volatile SingularAttribute<Bank, String> address;
	public static volatile SingularAttribute<Bank, String> city;
	public static volatile SingularAttribute<Bank, Long> id;
	public static volatile SingularAttribute<Bank, String> state;

	public static final String ZIPCODE = "zipcode";
	public static final String ROUTING_NUMBER = "routingNumber";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String ID = "id";
	public static final String STATE = "state";

}

