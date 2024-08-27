package com.hvn.pojo;

import com.hvn.pojo.Fee;
import com.hvn.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Payment.class)
public class Payment_ { 

    public static volatile SingularAttribute<Payment, Date> dateOfPayment;
    public static volatile SingularAttribute<Payment, String> description;
    public static volatile SingularAttribute<Payment, Integer> id;
    public static volatile SingularAttribute<Payment, Fee> feeId;
    public static volatile SingularAttribute<Payment, User> userId;
    public static volatile SingularAttribute<Payment, String> status;

}