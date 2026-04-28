# [Platinum IV] Conditionally rich numbers - 28485

[문제 링크](https://www.acmicpc.net/problem/28485)

### 성능 요약

시간 제한: 0.18 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 10, 정답 비율: 28.571%

### 분류

수학, 자료 구조, 정수론, 세그먼트 트리, 오프라인 쿼리

### 문제 설명

<p>Mariya has come up with the following definition for a <strong>rich</strong> number. It is given a positive integer $X$. Then a positive integer $N$ is called a <strong>rich</strong> number (relative to $X$) if the sum of its divisors except $N$ is greater than $X$. For example, the number $10$ (whose sum of divisors is $1+2+5 = 8$) is <strong>rich</strong> relative to $X=7$ but it isn&rsquo;t <strong>rich</strong> relative to $X=12$.</p>

<p>Write a program <code>rich_num</code> to help Mariya. The program will be given queries that are ordered triples of positive integers $(L, R, V)$ and for each query it should calculate the number of rich numbers relative to $V$, which are greater than or equal to $L$ and less than or equal to $R$.</p>

### 입력

<p>The first line of the standard input contains one positive integer $Q$ &ndash; the number of queries that your program has to process.</p>

<p>Each of the next $Q$ lines contains three positive integers $L$, $R$ and $V$, which describe a query for your program to process.</p>

### 출력

<p>Your program should output to the standard output $Q$ lines &ndash; one line for each query in the order of the input. Each line should contain the answer to the corresponding query.</p>

### 제한

<ul>
	<li>$1 &le; Q &le; 10^5$</li>
	<li>$1 &le; L &le; R &le; 10^5$</li>
	<li>$1 &le; V &le; 10^5$</li>
</ul>