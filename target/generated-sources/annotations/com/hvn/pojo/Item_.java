package com.hvn.pojo;

import com.hvn.pojo.Locker;
import com.hvn.pojo.Status;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Item.class)
public class Item_ { 

    public static volatile SingularAttribute<Item, Status> idStatus;
    public static volatile SingularAttribute<Item, Date> returnedTime;
    public static volatile SingularAttribute<Item, Locker> idLocker;
    public static volatile SingularAttribute<Item, Date> receivedTime;
    public static volatile SingularAttribute<Item, String> name;
    public static volatile SingularAttribute<Item, String> description;
    public static volatile SingularAttribute<Item, Integer> id;

}