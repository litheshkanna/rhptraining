#include <iostream>
#include <string>
using namespace std;

void generateCombinations(string s) {
    int L = s.length();
    // Loop through all possible non-empty subsets
    for (int ctr = 1; ctr < (1 << L); ctr++) {
        string combi = "";
        for (int sh = 0; sh < L; sh++) {
            if ((ctr & (1 << sh)) > 0) {
                // If the sh-th bit is set, include s[sh]
                combi += s[sh];
            }
        }
        cout << combi << endl;
    }
}

int main() {
    string s;
    cin >> s;
    generateCombinations(s);
    return 0;
}

