# [Platinum V] Consecutive Primes - 23005

[문제 링크](https://www.acmicpc.net/problem/23005)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 286, 정답: 92, 맞힌 사람: 66, 정답 비율: 27.966%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>Ada has bought a secret present for her friend John. In order to open the present, Ada wants John to crack a secret code. She decides to give him a hint to make things simple for him. She tells him that the secret code is a number that can be formed by taking the product of two consecutive&nbsp;<a href="https://en.wikipedia.org/wiki/Prime_number">prime numbers</a>, such that it is the largest number that is smaller than or equal to&nbsp;$Z$. Given the value of&nbsp;$Z$, help John to determine the secret code.</p>

<p>Formally, let the order of prime numbers&nbsp;2, 3, 5, 7, 11, ... be denoted by&nbsp;$p_1$, $p_2$, $p_3$, $p_4$, $p_5$, ... and so on. Consider $R_i$ to be the product of two consecutive primes $p_i$ and $p_{i+1}$. The secret code is the largest $R_j$ such that $R_j \le Z$.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$ lines follow.</p>

<p>Each line contains a single integer $Z$, representing the number provided by Ada as part of the hint.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where&nbsp;$x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the secret code - the largest number less than or equal to&nbsp;$Z$&nbsp;that is the product of two consecutive prime numbers.</p>

### 제한

<ul>
	<li>$1 \le T\le 100$.</li>
</ul>

### 힌트

<p>For Sample Case #1, the secret code is 2021 because it is exactly the product of consecutive primes 43 and 47.</p>

<p>For Sample Case #2, the secret code is 1763 because the product of 41 and 43 is 1763 which is smaller than 2020, but the product of 43 and 47 exceeds the given value of 2020.</p>