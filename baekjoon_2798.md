# 백준 2798번 블랙잭 알고리즘 문제풀기 

> 문제 

```
카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 게임이다. 블랙잭은 카지노마다 다양한 규정이 있다.

한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.

김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.

이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.

N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.
```

> 예제입력

```
5 21
5 6 7 8 9
```

> 예제출력

```
21
```

> **문제풀이**

```java
import java.util.Scanner;



public class Main {
	public static int maxOf(int[]a) { 
        //m을 넘지 않는 수를 배열에 담아 m에 가장가까운수를 찾는 메서드  
        	int max = a[0];
        		for(int i=1; i<a.length;i++) {
					if(max<a[i])
							max=a[i];
							}
				return max;
						}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n =sc.nextInt(); // n장의 카드 입력받기
		int m =sc.nextInt(); // 숫자 m 입력받기 
		int k =0;

		int [] sum = new int[n*n]; //m을 넘지않는 경우의 수를 저장하는 배열
		int [] arry = new int[n]; //n장의 카드 숫자를 저장하는 배열 
				for(int i=0;i<arry.length;i++) {				
					arry[i]=sc.nextInt(); //n장의 카드 숫자 입력받기
					}

		for(int i = 0; i<arry.length;i++) {	
        	for(int j=i+1;j<arry.length;j++) {
				for(int b=j+1;b<arry.length;b++) {
						int num = arry[i]+arry[j]+arry[b];
                    //반복문을 사용하여 i,j,b에 각각 경우의 수를 대입함 
								if(num<=m) { // m과 같거나 큰 경우의 수 일경우
									sum[k]=num; // 배열에 저장 
									k++;
										}
									}
								}
							}
System.out.println(maxOf(sum));
	}
}
```

> 주관적인 코드리뷰 .

```
for문 남발이라 가독성이 떨어지는거 같다 . 
더 괜찮은 방법이 있는지 찾아보아야겠다 .
정리해서 깃허브에 올릴때는 공부 정리겸 주석을 많이 사용하지만 
막상 코드 짤때는 사용을 잘 하지 않는다 . 이부분은 조금 고쳐야 할거같다 .
```





