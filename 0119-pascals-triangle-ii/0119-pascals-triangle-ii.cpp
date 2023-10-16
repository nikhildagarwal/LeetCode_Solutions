class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<vector<int>> triangle = makePascals(rowIndex+1);
        return triangle[rowIndex];
    }

vector<vector<int>> makePascals(int numRows) {
        vector<vector<int>> pascals;
        for(int i=1;i<=numRows;i++){
            vector<int> row;
            if(i==1){
                row.emplace_back(1);
            }else if(i==2){
                row.emplace_back(1);
                row.emplace_back(1);
            }else{
                vector<int> prevRow = pascals[i-2];
                int l = prevRow.size();
                row.emplace_back(1);
                for(int j = 0;j<l-1;j++){
                    row.emplace_back(prevRow[j] + prevRow[j+1]);
                }
                row.emplace_back(1);
            }
            pascals.emplace_back(row);
        }
        return pascals;
    }
    
};