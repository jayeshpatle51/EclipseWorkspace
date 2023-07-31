package com.java.annotations;

import java.lang.annotation.Inherited;

@Inherited
@interface NoramalAnnotation {
	String value() default "default value";

}

@NoramalAnnotation
class ParentClass {

}

public class InheritedAnnotation extends ParentClass {

	public static void main(String[] args) {

	}
}

