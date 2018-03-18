<p align="right">
	<b>Class</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

class Class {

	public : Class();
	public : ~Class();
	
	public : int x;
	protected : int y;
	private : int z;
};

Class::Class() { cout << "Alive"; };
Class::~Class() { cout << "Dead"; };

int main() {
	// Class creates a data type to group items of different types into a single type.
	// Size, each member have their own memory space members.

	Class *cls = new Class;						// Constructor Running!
	
	cout << cls->x;
	
	delete cls;							// Destructor Running!
	
	return 0;
};
```
