/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    x += "";
    let pL = 0;
    let pR = x.length - 1;
    while(pL<pR){
        if(x.charAt(pL) != x.charAt(pR)){
            return false;
        }else{
            pL++;
            pR--;
        }
    }
    return true;
};