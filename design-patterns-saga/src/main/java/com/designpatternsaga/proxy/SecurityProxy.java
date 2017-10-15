package com.designpatternsaga.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.swing.JOptionPane;

public class SecurityProxy implements InvocationHandler {

	private Object obj;

	private SecurityProxy(Object obj) {
		this.obj = obj;
	}

	public static Object newInstance(Object obj) {
		return java.lang.reflect.Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
				new SecurityProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		Object result;
		try {
			result = m.invoke(obj, args);
		} catch (InvocationTargetException e) {
			JOptionPane.showMessageDialog(null, e.getTargetException()
					.getMessage());
			
			throw e.getTargetException(); 
		} catch (Exception exception) {
			throw new RuntimeException(exception);
		}
		return result;
	}

}
