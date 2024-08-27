package com.hvn.pojo;

import com.hvn.pojo.Answer;
import com.hvn.pojo.Surveyform;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-07-29T10:39:18")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile SingularAttribute<Question, String> contents;
    public static volatile SetAttribute<Question, Answer> answerSet;
    public static volatile SingularAttribute<Question, String> blankSpace;
    public static volatile SingularAttribute<Question, Integer> id;
    public static volatile SingularAttribute<Question, Surveyform> idSurveryform;

}