import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = { 2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        
        for(int i = 0 ; i < answers.length; i++){
            if(user1[i%5] == answers[i]){
                g1 += 1;
            }
            if(user2[i%8] == answers[i]){
                g2 += 1;
            }
            if(user3[i%10] == answers[i]){
                g3 += 1;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        int max_grade = Integer.max(g1,g2);
        max_grade = Integer.max(max_grade, g3); //가장 큰 점수 구해주기
        
        //중복되는 사람들 추가해주기
        if(max_grade == g1){
            list.add(1);
        }
        if(max_grade == g2){
            list.add(2);
        }
        if(max_grade == g3){
            list.add(3);
        }
        
        Collections.sort(list); //중복되는 score의 사람들 정렬해주기
        
        
        int[] numList = new int[list.size()];
        
        for(int i = 0 ; i < list.size(); i++){
            numList[i] = list.get(i);
        }
        
        return numList;
    }
}
