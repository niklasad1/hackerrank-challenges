#include <iostream>
#include <iomanip>
#include <cstdio>
using namespace std;

int main() {
    int i1; 
    long i2; 
    long long i3; 
    char i4; 
    float i5; 
    double i6;
    
    scanf("%d %ld %lld %c %f %lf", &i1, &i2, &i3, &i4, &i5, &i6);
    
    printf("%d\n", i1);
    printf("%ld\n", i2);
    printf("%lld\n", i3);
    printf("%c\n", i4);
    printf("%.3f\n", i5);
    printf("%.9lf\n", i6);

    return 0;
}
