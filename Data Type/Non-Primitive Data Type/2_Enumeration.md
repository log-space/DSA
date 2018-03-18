<p align="right">
	<b>Enumeration</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

enum Day {

            sunday,
            monday,
            tuesday = 5,
            wednesday,
            thursday = 10,
            friday,
            saturday
};

int main() {
	// Enumeration is a user defined data type and mainly used to assign names to integer constants.
	// The names make a program easy to read and maintain.
	// Size, each member have their own memory space members.

	cout <<								// 0 1 5 6 10 11 12
		sunday << endl <<
		monday << endl <<
		tuesday << endl <<
		wednesday << endl <<
		thursday << endl <<
		friday << endl <<
		saturday << endl;
		
	return 0;
};
```
