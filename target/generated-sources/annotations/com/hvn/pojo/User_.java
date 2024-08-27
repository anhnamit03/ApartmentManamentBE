package com.hvn.pojo;

import com.hvn.pojo.Locker;
import com.hvn.pojo.Payment;
import com.hvn.pojo.Reflective;
import com.hvn.pojo.Relative;
import com.hvn.pojo.Role;
import com.hvn.pojo.Surveyform;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Short> gender;
    public static volatile SingularAttribute<User, Role> idRole;
    public static volatile SingularAttribute<User, Short> active;
    public static volatile SetAttribute<User, Reflective> reflectiveSet;
    public static volatile SetAttribute<User, Surveyform> surveyformSet;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> linkImage;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, Locker> idLocker;
    public static volatile SetAttribute<User, Relative> relativeSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> fullname;
    public static volatile SetAttribute<User, Payment> paymentSet;
    public static volatile SingularAttribute<User, Short> status;
    public static volatile SingularAttribute<User, String> username;

}