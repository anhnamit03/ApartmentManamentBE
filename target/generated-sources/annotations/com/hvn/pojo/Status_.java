package com.hvn.pojo;

import com.hvn.pojo.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile SingularAttribute<Status, String> description;
    public static volatile SingularAttribute<Status, Integer> id;
    public static volatile SetAttribute<Status, Item> itemSet;

}