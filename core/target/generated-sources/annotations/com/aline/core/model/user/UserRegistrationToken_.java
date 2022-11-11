package com.aline.core.model.user;

import java.time.LocalDateTime;
import java.util.UUID;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(UserRegistrationToken.class)
public abstract class UserRegistrationToken_ {

	public static volatile SingularAttribute<UserRegistrationToken, Long> expirationDelay;
	public static volatile SingularAttribute<UserRegistrationToken, LocalDateTime> created;
	public static volatile SingularAttribute<UserRegistrationToken, User> user;
	public static volatile SingularAttribute<UserRegistrationToken, UUID> token;

	public static final String EXPIRATION_DELAY = "expirationDelay";
	public static final String CREATED = "created";
	public static final String USER = "user";
	public static final String TOKEN = "token";

}

