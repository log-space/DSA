<p align="right">
	<b>Union</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

union Numeric {

            int x;
            int y;
};

int main() {
	// In Union, If we change x we can see the changes being reflected in y.
	// Size, each member have equal memory size it is highest data type of one member.
	
	union Numeric number;
	
	number.x = 10;							// Now number.y is 10 too
	number.y = 80;							// Now number.x is 80 too
	
	return 0;
};
```
