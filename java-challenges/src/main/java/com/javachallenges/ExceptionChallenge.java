package com.javachallenges;

import java.io.FileNotFoundException;
/** You can check out the answers on nobugsproject.com soon */
public class ExceptionChallenge {
    static String s = "-";
    // Make your best
    public static void main(String[] args) {
	try {
	    throw new IllegalArgumentException();
	} catch (Exception e) {
	    try {
		try {
		    throw new FileNotFoundException();
		} catch (RuntimeException ex) {
		    s += "run";
		}
		throw new NullPointerException();
	    } catch (Exception x) {
		s += "exc";
	    } finally {
		s += "fin";
	    }
	} finally {
	    s += "of";
	    try {
		throw new VirtualMachineError("JVMError") { private static 
		    final long serialVersionUID = -4930962728028907987L;};
	    } catch (Error error) {
		s += "error" + error.getMessage();
	    }
	}
	System.out.println(s);
    }   
}
