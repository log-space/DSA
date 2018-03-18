<p align="right">
	<b>Reference</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	// When a variable is declared as reference, it becomes an alternative name for an existing variable.

	int x = 10;
	
	// Variable reference is a reference to x.
	int &reference = x;
	
	// Value of x is now changed to 20 too.
	reference = 20;
	cout << x;
	
	return 0;
};
```

<p align="right">
	<b>Pointer</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

int main() {
	// Once a reference is created, it cannot be later made to reference another object.
	// It cannot be reseated.
	// This is often done with pointers.

	int x = 10;
	
	// A pointer variable declaration.
	int *pointer = &x;
	
	// Now the variable has two declaration.
	
	cout << *pointer;						// 10
	cout << pointer;						// 0x7fffa057dd4
	
	return 0;
};
```
