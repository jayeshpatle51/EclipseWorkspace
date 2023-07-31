package Analyzer;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;

import org.testng.annotations.ITestAnnotation;


public class Mytransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation,Class TestClass,Constructor testconstructer,Method testmethod) {
		annotation.setRetryAnalyzer(retryAnalyzer.class);
	}
}
