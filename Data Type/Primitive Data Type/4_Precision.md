<p align="right">
	<b>Single Precision</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>
#include <limits>

using namespace std;

template<typename T>
void showMinMax() {
    
    cout << "min : " << numeric_limits<T>::min() << endl;
    cout << "max : " << numeric_limits<T>::max() << endl;
    cout << endl;
};

int main() {

    showMinMax<float>();                            // Float = min : 1.17549e-38 max : 3.40282e+38
	
return 0;   
};
```

<p align="right">
	<b>Double Precision</b>
</p>

<hr/>

```cpp
#include <iostream>
#include <cstdio>
#include <limits>

using namespace std;

template<typename T>
void showMinMax() {
    
    cout << "min : " << numeric_limits<T>::min() << endl;
    cout << "max : " << numeric_limits<T>::max() << endl;
    cout << endl;
};

int main() {

    showMinMax<double>();                            // Double = min : 2.22507e-308 max : 1.79769e+308
	
return 0;   
};
```

<p align="right">
	<b>Double Extended</b>
</p>

<hr/>

```cpp

#include <iostream>
#include <cstdio>
#include <limits>

using namespace std;

template<typename T>
void showMinMax() {
    
    cout << "min : " << numeric_limits<T>::min() << endl;
    cout << "max : " << numeric_limits<T>::max() << endl;
    cout << endl;
};

int main() {

    showMinMax<long double>();			// Long Double = min : 3.3621e-4932 max : 1.18973e+4932
	
return 0;   
};
```
