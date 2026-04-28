# [Platinum III] Looking for the Risk Factor - 16532

[문제 링크](https://www.acmicpc.net/problem/16532)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 512 MB

### 통계

제출: 314, 정답: 158, 맞힌 사람: 137, 정답 비율: 56.148%

### 분류

자료 구조, 수학, 정수론, 오프라인 쿼리, 소수 판정, 세그먼트 트리, 에라토스테네스의 체, 정렬

### 문제 설명

<p>For testing a new cryptographic algorithm, engineers working for a large investment bank need to compute a value they named the Risk Factor of the algorithm. Informally, the Risk Factor is the amount of numbers less than or equal to a certain value N, that aren&rsquo;t multiples of prime numbers greater than a certain value K.</p>

<p>More formally, given the values N and K, the Risk Factor is the number of elements of the following set:</p>

<p style="text-align: center;">{x such that 2 &le; x &le; N and for every prime divisor p of x, p &le; K}</p>

<p>The engineers need to compute the Risk Factor for different values of N and K and have prepared a set of queries for you to answer. Can you help them?</p>

### 입력

<p>The first line contains an integer Q (1 &le; Q &le; 5 &times; 10<sup>4</sup>) representing the number of queries that the engineers prepared for you. Each of the following Q lines describes a query with two integers N and K (2 &le; N, K &le; 10<sup>5</sup>).</p>

### 출력

<p>Output Q lines, each line with an integer indicating the Risk Factor for the corresponding query of the input.</p>