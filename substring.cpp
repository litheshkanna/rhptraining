#include <iostream>
#include <vector>
#include <string>
using namespace std;

int longestCommonSubstring(string s1, string s2) {
    int m = s1.size(), n = s2.size();
    vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));
    int maxLen = 0;

    for (int i = 1; i <= m; i++) {
        for (int j = 1; j <= n; j++) {
            if (s1[i - 1] == s2[j - 1]) {
                dp[i][j] = dp[i - 1][j - 1] + 1;
                maxLen = max(maxLen, dp[i][j]);
            }
        }
    }
    return maxLen;
}

int main() {
    string s1, s2;
    cin >> s1;cin >> s2;
    cout<< longestCommonSubstring(s1, s2) << endl;
    return 0;
}

