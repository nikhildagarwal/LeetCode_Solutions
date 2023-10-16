class Solution {
public:
    bool isValid(string s) {

        map<char,char> myMap;
        myMap['['] = ']';
        myMap['('] = ')';
        myMap['{'] = '}';

        stack<char> myStack;
        int length = s.size();
        for(int i = 0;i<length;i++){
            char curr = s.at(i);
            if(curr == '{' || curr == '(' || curr == '['){
                myStack.push(curr);
            }else{
                if(myStack.empty()){
                    return false;
                }
                char topChar = myStack.top();
                if(myMap[topChar] == curr){
                    myStack.pop();
                }else{
                    return false;
                }
            }
        }
        return myStack.empty();
    }
};