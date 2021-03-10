public class Pro {
    public static String solution(String s) {

         /*
        매개 변수 = s
        짝수번째 -> 대문자
        홀수 -> 소문자
        공백기준으로 나누셈
        0 2 4 ->
         */

        String answer = "";
        s = s.toLowerCase();

         String [] arr = s.split(" ");

        ArrayList <String>list = new ArrayList();
        String str = "";
         for(int i=0;i<s.length();i++){
             if(s.charAt(i)==32) {
                 //공백일 경우
                 if (str != "") {
                     list.add(str);
                 }
                 list.add(" ");
                 str = "";
             }
             else {
                 str+=s.charAt(i);
             }
             if(i==s.length()-1){
                 list.add(str);
             }
         }

        for(int i=0;i<list.size();i++){ //출력 test 코드
            if(list.get(i)!=" "){
              // System.out.println(arr[i]); test code
            for(int j=0;j<list.get(i).length();j++){
                if(j==0||j%2==0) {
                    char a = (char) (list.get(i).charAt(j) - 32);
                    answer+=a;
                }else {
                    answer+=list.get(i).charAt(j);
                }
                }
            }else if(list.get(i)==" ") {
                answer+=" ";
            }
        }

        System.out.println(answer);


        return answer;
    }
    public static void main(String[]args){

        solution("try hello world");

    }
}
