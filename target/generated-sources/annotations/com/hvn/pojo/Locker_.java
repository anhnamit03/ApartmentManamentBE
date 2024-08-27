package com.hvn.pojo;

import com.hvn.pojo.Item;
import com.hvn.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Locker.class)
public class Locker_ { 

    public static volatile SingularAttribute<Locker, String> description;
    public static volatile SingularAttribute<Locker, Integer> id;
    public static volatile SetAttribute<Locker, Item> itemSet;
    public static volatile SetAttribute<Locker, User> userSet;

}