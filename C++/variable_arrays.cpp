#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
  int n, q;
  cin >> n >> q;
  vector< vector<int> > vec(n);

  for(int i = 0; i < n; i++) {
    int e;
    cin >> e;
    for(int j = 0; j < e; j++) {
      int num;
      cin >> num;
      vec[i].push_back(num);
    }
  }

  for(int i = 0; i < q; i++) {
    int arr, index;
    cin >> arr >> index;
    cout << vec[arr].at(index) << endl;
  }
  return 0;
}
