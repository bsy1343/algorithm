# [Gold II] XY - 32495

[문제 링크](https://www.acmicpc.net/problem/32495)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

그래프 이론, 누적 합, 방향 비순환 그래프, 수학, 위상 정렬, 정수론

### 문제 설명

<p>Kaloyan was preparing an exam for his students and found the following problem to be pretty interesting. He wrote two numbers $X$ and $Y$ and wants to find a sequence of integers where the sum of every $X$ consecutive elements (in the sequence) is strictly positive while the sum of every $Y$ consecutive elements is strictly negative.</p>

<p>Kaloyan found out that this sequence cannot be infinitely long. He tried to find a sequence of maximum possible length with the described property. However, it turns out to be rather difficult problem for Kaloyan. Help him by writing a program <code>XY</code> that finds the maximum length of such a sequence. You should find the answers to $Q$ such pairs $X$ and $Y$. Additionally, you have to find a maximal sequence only for the first query.</p>

### 입력

<p>The only line of the standard input contains one number $Q$ - the number of queries. Each of the following $Q$ lines contains two numbers - $X$ and $Y$ .</p>

### 출력

<p>On the first line of the standard output you should print $Q$ numbers - $N_1, N_2, \dots, N_Q$, separated with intervals, where $N_i$ is the answer for the $i^{th}$ query. On the second line you should print $N_1$ integers separated with intervals - a sequence with the desired property for the first query.</p>

### 제한

<ul>
	<li>$1 \leq X,Y \leq 100\ 000$</li>
	<li>$1 \leq Q \leq 100\ 000$</li>
</ul>