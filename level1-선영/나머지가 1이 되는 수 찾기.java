class Solution {
    public int solution(int n) {
        for(int count = 2; count <= n ; count++){ //이 부분에서 n까지만 돌려주는 것이다.  //시작 부분은 무조건 2부터!!
            if(n%count == 1){
                return count;
            }
        }
        
        return -1;
    }
}
