package com.hvn.pojo;

import com.hvn.pojo.Payment;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Fee.class)
public class Fee_ { 

    public static volatile SingularAttribute<Fee, Double> price;
    public static volatile SingularAttribute<Fee, String> name;
    public static volatile SingularAttribute<Fee, String> description;
    public static volatile SingularAttribute<Fee, Short> active;
    public static volatile SingularAttribute<Fee, Integer> id;
    public static volatile SetAttribute<Fee, Payment> paymentSet;

}