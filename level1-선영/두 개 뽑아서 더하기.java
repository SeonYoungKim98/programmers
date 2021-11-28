import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list =new ArrayList<>(); 
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){  //이부분 유의하기
                if(!list.contains(numbers[i] + numbers[j])){ //이부분 유의하기
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        Collections.sort(list); //정렬 
        
        int[] answer = new int[list.size()]; //답이 int형 array로 나와야 하므로 다시 넣어주기
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
