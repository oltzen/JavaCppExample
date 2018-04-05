package de.oltzen.javacppexample;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include = "Abc.cpp")
// A name space is usefull.
@Namespace("TestLibrary")
// The java class and the C++ class must be the same name.
public class Abc extends Pointer {

	static {
		Loader.load();
	}

	public Abc() {
		allocate();
	}

	private native void allocate();

	/** Method that we implement in C++. */
	public native int testMethod(int a); 

	public static void main(String[] args) {
		// Create the Abc instance also in C++.
		Abc abc = new Abc();
		// Test call
		System.out.println("out=" + abc.testMethod(2));
		// Call the destructor
		abc.close();
	}
}
