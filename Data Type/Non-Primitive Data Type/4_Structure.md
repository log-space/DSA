<p align="right">
	<b>Structure</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>

using namespace std;

struct Structure {

	Structure();
	~Structure();
	
	public : int x;
	protected : int y;
	private : int z;
};

Structure::Structure() { cout << "Alive"; };
Structure::~Structure() { cout << "Dead"; };

int main() {
	// Structure creates a data type to group items of different types into a single type.
	// Size, each member have their own memory space members.

	struct Structure strctr;
	
	cout << strctr.x;
	
	return 0;
};
```
