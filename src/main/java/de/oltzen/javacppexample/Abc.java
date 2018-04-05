package de.oltzen.javacppexample;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include = "Abc.cpp")
@Namespace("TestLibrary")
// The java class and the C++ class must be the same name.
public class Abc extends Pointer {

	static {
		Loader.load();
	}

	public Abc() {
		//allocate();
	}

	//private native void allocate();

	public native int testMethod(int a); // Method we want to use

	public static void main(String[] args) {
		// Create the Abc instance also in C++.
		Abc abc = new Abc();
		System.out.println("out=" + abc.testMethod(2));
		// Call the desturctor
		abc.close();
	}
}
