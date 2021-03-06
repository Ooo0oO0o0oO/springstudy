package Springsource1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//在运行时执行  
@Retention(RetentionPolicy.RUNTIME)  
//注解适用地方(字段和方法)  
@Target({ElementType.METHOD,ElementType.FIELD}) 
public @interface MyValue
{
	 //注解的name属性  
    public  String value();  
}
