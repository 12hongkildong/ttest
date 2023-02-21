package com.newlecture.web;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.newlecture.web.controller.menu.ListPOJOController4;
import com.oracle.wls.shaded.org.apache.xalan.xsltc.runtime.Parameter;

public class ReflectProgram {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		Object controller = Class
				.forName("com.newlecture.web.controller.menu.ListPOJOController4")
				.getDeclaredConstructor()
				.newInstance();
		
		//갸ㅐ체명 (문자열)에서 클래스 정보 얻기
		Class clsInfo = Class.forName("com.newlecture.web.controller.menu.ListPOJOController4");
		
		
		
		// 객체에서 클래스 정보 얻기
		Class clsInfo2 = controller.getClass();
		
		
		
		// 개체(class)에서 클래스 정보 얻기 -> reflection
		Class clsInfo1 = ListPOJOController4.class;
		
		
		 Method[] methods = clsInfo.getDeclaredMethods();
		
		 Method method = null;
		 for(Method m : methods) {
			 if(m.getName().equals("add"))
				 method = m;
		 }
		 
//		 method.getParameterCount();
		 Parameter[] params = method.getParameters();
		 for(Parameter p : params)	
			 System.out.printf("param : %s\n", p.getType().toString());
		 
//		 if(params.length >2)
//			 params[2].getType();

		 Object[] objs = null;
		 if()
			 objs = {2};
		 
		int result = (int)method.invoke(controller, objs);
		System.out.printf("result : %d\n", result);
		
		

	}

}
