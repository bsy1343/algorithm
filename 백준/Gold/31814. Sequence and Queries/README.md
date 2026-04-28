# [Gold III] Sequence and Queries - 31814

[문제 링크](https://www.acmicpc.net/problem/31814)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 176, 정답: 111, 맞힌 사람: 96, 정답 비율: 71.111%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>길이가 $n$인 수열 $(s_1,s_2,\ldots ,s_n)$이 주어진다. 함수 $f$는 다음과 같이 정의된다.</p>

<p>\[f(i,j,k) =\begin{cases}1&amp;\text{if } s_{i+t}\leq s_{j+t}\text{ for all } 0\leq t&lt;k\\ 0&amp;\text{otherwise}\end{cases}\]</p>

<p>$\sum_{i=1}^{n}\sum_{j=1}^{n}\sum_{k=1}^{\min(n-i+1,n-j+1)}f(i,j,k)$의 값을 출력하라.</p>

### 입력

<p>첫 번째 줄에 수열의 길이를 나타내는 정수 $n$이 주어진다.</p>

<p>두 번째 줄에 $n$개의 정수 $s_1,s_2,\ldots ,s_n$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>$\sum_{i=1}^{n}\sum_{j=1}^{n}\sum_{k=1}^{\min(n-i+1,n-j+1)}f(i,j,k)$의 값을 출력한다.</p>

### 제한

<ul>
	<li>$1\leq n\leq 5\, 000$</li>
	<li>$1\le s_x\le 10^9$ ($1\le x\le n$)</li>
</ul>

### 힌트

<p>첫 번째 예제에 대한 설명은 다음과 같다.</p>

<ul>
	<li>$f(1,1,1) =1$</li>
	<li>$f(1,1,2) =1$</li>
	<li>$f(1,2,1) =1$</li>
	<li>$f(2,1,1) =0$</li>
	<li>$f(2,2,1) =1$</li>
</ul>