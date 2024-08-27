package com.hvn.pojo;

import com.hvn.pojo.Question;
import com.hvn.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Surveyform.class)
public class Surveyform_ { 

    public static volatile SingularAttribute<Surveyform, User> idUser;
    public static volatile SetAttribute<Surveyform, Question> questionSet;
    public static volatile SingularAttribute<Surveyform, String> description;
    public static volatile SingularAttribute<Surveyform, Date> innitiatedDate;
    public static volatile SingularAttribute<Surveyform, Integer> id;

}