// in-place rotation by 90 deg of N*N matrix.
class Solution {
public:

    void transpose(vector<vector<int>> & m) {
        int N = m.size(), r = 0;

        for (; r < N; ++r) {
            for (int c = r; c < N; ++c) {
                swap(m[r][c], m[c][r]);
            }
        }
    }

    void reverseColumns(vector<vector<int>> & m) {
        int N = m.size(), c = 0, k = N - 1;
        
        for (; c < N / 2; ++c) {
            for (int r = 0; r < N; ++r) {
                swap(m[r][c], m[r][k - c]);
            }
        }
    }

    void rotate(vector<vector<int>>& matrix) {
        transpose(matrix);
        reverseColumns(matrix);
    }
    
    void printMatrix(vector<vector<int>> & m) {
        int N = m.size();
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                cout << m[i][j]  << " ";
            }
            cout << endl;
        }
        cout <<endl;
    }
};
