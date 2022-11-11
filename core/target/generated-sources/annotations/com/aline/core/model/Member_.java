package com.aline.core.model;

import com.aline.core.model.account.Account;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Member.class)
public abstract class Member_ {

	public static volatile SingularAttribute<Member, Long> id;
	public static volatile SingularAttribute<Member, String> membershipId;
	public static volatile SetAttribute<Member, Account> accounts;
	public static volatile SingularAttribute<Member, Branch> branch;
	public static volatile SingularAttribute<Member, Applicant> applicant;

	public static final String ID = "id";
	public static final String MEMBERSHIP_ID = "membershipId";
	public static final String ACCOUNTS = "accounts";
	public static final String BRANCH = "branch";
	public static final String APPLICANT = "applicant";

}

