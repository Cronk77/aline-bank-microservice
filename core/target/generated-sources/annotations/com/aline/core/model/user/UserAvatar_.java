package com.aline.core.model.user;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserAvatar.class)
public abstract class UserAvatar_ {

	public static volatile SingularAttribute<UserAvatar, Long> id;
	public static volatile SingularAttribute<UserAvatar, byte[]> pic;

	public static final String ID = "id";
	public static final String PIC = "pic";

}

