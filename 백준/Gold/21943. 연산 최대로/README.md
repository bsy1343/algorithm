# [Gold II] 연산 최대로 - 21943

[문제 링크](https://www.acmicpc.net/problem/21943)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 725, 정답: 353, 맞힌 사람: 230, 정답 비율: 48.729%

### 분류

그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>$N$개의 양의 정수&nbsp;$X_{i}$와 곱하기 연산자, 더하기 연산자가&nbsp;총 $N - 1$개가 존재하고 괄호는 무수히 많이 사용해도 된다. 이 연산에는 곱하기&nbsp;연산자와 더하기 연산자의 우선순위가 동일하다.</p>

<p>정수와 연산자는 아래와 같이 배치해야한다. 정수의 순서는 바꿔도 상관없다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21943.%E2%80%85%EC%97%B0%EC%82%B0%E2%80%85%EC%B5%9C%EB%8C%80%EB%A1%9C/167fefcf.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21943.%E2%80%85%EC%97%B0%EC%82%B0%E2%80%85%EC%B5%9C%EB%8C%80%EB%A1%9C/167fefcf.png" data-original-src="https://upload.acmicpc.net/dee111bb-5eac-4721-a9d4-014a5d55569d/-/crop/1543x341/187,368/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 110px; width: 500px;" /></p>

<p>예를 들어 정수 $1$, $2$,&nbsp;$3$이 있고 더하기 연산자와&nbsp;곱하기 연산자가 각각 하나 있다고 가정하면 아래와 같이 만들 수 있다.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21943.%E2%80%85%EC%97%B0%EC%82%B0%E2%80%85%EC%B5%9C%EB%8C%80%EB%A1%9C/8fbf3b9d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/21943.%E2%80%85%EC%97%B0%EC%82%B0%E2%80%85%EC%B5%9C%EB%8C%80%EB%A1%9C/8fbf3b9d.png" data-original-src="https://upload.acmicpc.net/071247cb-d101-4243-b266-9e341299fbd7/-/crop/1524x312/202,385/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 102px; width: 500px;" /></p>

<p>예를 들어, 수 $1, 2, 4, 5, 7, 8$와 더하기 연산자가 4개 곱하기&nbsp;연산자가 1개 있다고 하자. 괄호를 이용하여 최대값을 구하는 방법 중 일부이다.</p>

<ul>
	<li>$(((1+2)+4)+7) &times; (5+8)$</li>
	<li>$((1+2)+(4+7)) &times; (5+8)$</li>
	<li>$(1+(2+4)+7) &times; (5+8)$</li>
	<li>$(1+2+4+7) &times; (5+8)$</li>
</ul>

<p>연산을 잘 이용하여 값을 최대로 만들어 보자.</p>

### 입력

<p>첫째 줄에 입력될 양의 정수 개수를 뜻하는 $N$이 주어진다.</p>

<p>그 다음줄에는 $N$개의 양의 정수 $X_{i}$가 공백으로 구분되어 주어진다.</p>

<p>마지막 줄에는 더하기 연산자의 개수 $P$와 곱하기 연산자의 개수 $Q$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>가능한 연산의 결과 중 최댓값을 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N \le 8$</li>
	<li>$1 \le X_{i} \le 9$</li>
	<li>$0&nbsp;\le P, Q \le N - 1$</li>
	<li>$P + Q&nbsp;=&nbsp;N - 1$</li>
</ul>