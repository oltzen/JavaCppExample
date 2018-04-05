#include <string>
#include <iostream>
#include <stdio.h>

namespace TestLibrary {
class Abc {
public:

	Abc() {
		std::cout << "Constructor called!" << std::endl;
	}

	~Abc() {
		std::cout << "Destructor called!" << std::endl;
	}

	int testMethod(int a) {
		std::cout << "Processing Abc with " << a << " ..." << std::endl;
		return 2 * a * a;
	}
};
}
