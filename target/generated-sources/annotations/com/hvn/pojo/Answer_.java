package com.hvn.pojo;

import com.hvn.pojo.Question;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Answer.class)
public class Answer_ { 

    public static volatile SingularAttribute<Answer, String> contents;
    public static volatile SingularAttribute<Answer, Question> idQuestion;
    public static volatile SingularAttribute<Answer, Integer> id;
    public static volatile SingularAttribute<Answer, Short> choice;

}