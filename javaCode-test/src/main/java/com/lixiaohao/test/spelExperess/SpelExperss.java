package com.lixiaohao.test.spelExperess;

import org.junit.Before;
import org.junit.Test;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.ParseException;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class SpelExperss {

    ExpressionParser parser;


    @Before
    public void before(){
        parser = new SpelExpressionParser();
    }


    @Test
    public void spelexptessTest() {
        try {
            Expression expression = parser.parseExpression("'abc'");

            String value = expression.getValue(String.class);
            System.out.println(value);

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }




    public void invoekTest(String name,String value){
        System.out.println("name:"+name+"  value:"+value);
    }

}
