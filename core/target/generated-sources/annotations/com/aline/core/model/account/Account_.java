package com.aline.core.model.account;

import com.aline.core.model.Member;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Account.class)
public abstract class Account_ {

	public static volatile SingularAttribute<Account, Integer> balance;
	public static volatile SetAttribute<Account, Member> members;
	public static volatile SingularAttribute<Account, Long> id;
	public static volatile SingularAttribute<Account, Member> primaryAccountHolder;
	public static volatile SingularAttribute<Account, String> accountNumber;
	public static volatile SingularAttribute<Account, AccountStatus> status;

	public static final String BALANCE = "balance";
	public static final String MEMBERS = "members";
	public static final String ID = "id";
	public static final String PRIMARY_ACCOUNT_HOLDER = "primaryAccountHolder";
	public static final String ACCOUNT_NUMBER = "accountNumber";
	public static final String STATUS = "status";

}

