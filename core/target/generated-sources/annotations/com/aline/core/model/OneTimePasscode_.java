package com.aline.core.model;

import com.aline.core.model.user.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OneTimePasscode.class)
public abstract class OneTimePasscode_ {

	public static volatile SingularAttribute<OneTimePasscode, Boolean> checked;
	public static volatile SingularAttribute<OneTimePasscode, String> otp;
	public static volatile SingularAttribute<OneTimePasscode, Integer> id;
	public static volatile SingularAttribute<OneTimePasscode, User> user;

	public static final String CHECKED = "checked";
	public static final String OTP = "otp";
	public static final String ID = "id";
	public static final String USER = "user";

}

