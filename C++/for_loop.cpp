#include <iostream>
#include <string>

const std::string str [] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

int main() {
  int a, b;

  std::cin >> a >> b;

  for(int i = a; i <= b; i++) {
    if (i > 0 && i < 10) {
      std::cout << str[i-1] << std::endl;
    }
    else if( i % 2 == 0) {
      std::cout << "even" << std::endl;
    }
    else {
      std::cout << "odd" << std::endl;
    }
  }

  return 0;
}
