package com.aline.core.model.user;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AdminUser.class)
public abstract class AdminUser_ extends com.aline.core.model.user.User_ {

	public static volatile SingularAttribute<AdminUser, String> firstName;
	public static volatile SingularAttribute<AdminUser, String> lastName;
	public static volatile SingularAttribute<AdminUser, String> phone;
	public static volatile SingularAttribute<AdminUser, String> email;

	public static final String FIRST_NAME = "firstName";
	public static final String LAST_NAME = "lastName";
	public static final String PHONE = "phone";
	public static final String EMAIL = "email";

}

