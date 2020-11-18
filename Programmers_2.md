# 프로그래머스 코딩 테스트 연습 _2

###### 문제 설명

String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요. seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

##### 제한 사항

- seoul은 길이 1 이상, 1000 이하인 배열입니다.
- seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
- Kim은 반드시 seoul 안에 포함되어 있습니다.

##### 입출력 예

| seoul       | return            |
| ----------- | ----------------- |
| [Jane, Kim] | 김서방은 1에 있다 |

# 문제풀이

```java
public class main {
        public String solution(String[] seoul) {
            String answer = "";
           String Str = "Kim";
            for(int i=0; i<seoul.length;i++){
                if(Str.equals(seoul[i])){
                    answer = "김서방은 "+i+"에 있다";
                    break;
                }
            }
            return answer;
        }
    }
```

> 주관적인 코드리뷰 

```
기본적인 문자배열 사용법같다. 다른 사람배열도 푸는 방법만 조금 다른거같으니 패스 !
```

