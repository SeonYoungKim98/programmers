public class Split{
  
  public static void main(String[] args){
    
    //--------------------특정 문자 기준으로 문자 자르기------------------------------------------
    Strung str = "A#BC#D";
    
    String[] arr = str.split("#"); //#을 기준으로 자름.
    
    for(int i = 0; i < arr.length; i++){
     System.out.println(arr[i]); 
    }
    
    //----------------------인덱스 기준으로 문자 자르기----------------------------------------
    //SubString함수!
    str.substring(시작인덱스, 종료인덱스);
    
    String.substring("~~~~");
    String.substring(start, end);
    //---------------------substring()써서 문자열 자르기-----------------------------------------
    //예제
    
    String str = "ABCDEFG";
    str.substring(3); //DEFG
    
    str.substring(3, 6); //DEF      끝 전까지!!! 즉, 6번째 전까지!!!
    
    
    //---------------StringBuilder 클래스----------------------------------------------
    //예제
    
    charAt(); //특정 인덱스 위치의 문자 반환
    indexOf(); lastIndexOf(); //문자열 검색해서 위치 반환
    length(); //문자열 길이 반환
    replace(); //검색된 문자열 교체
    substring(); //특정 인덱스 범위 내 문자열을 복사해서 새로 생성된 인스턴스 반환
    toString(); //문자열 출력
    
    
    //--------------------------------------------------------------
    
    delete(자르기 시작, 자르기 끝); //delete함수
    
    StringBuilder a = new StringBuilder("Hello");
    a.append(" World");
    System.out.println(a);  //  "Hello World"
    
    a.delete(6, 9); //index 6부터 9전까지 삭제
    System.out.println(a); //"Hello ld"
    
    //--------------------------------------------------------------
    
    
    
    
    //--------------------------------------------------------------
    
  }
  
}
