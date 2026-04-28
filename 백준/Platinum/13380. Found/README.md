# [Platinum V] Found - 13380

[문제 링크](https://www.acmicpc.net/problem/13380)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 85, 정답: 53, 맞힌 사람: 41, 정답 비율: 69.492%

### 분류

수학, 그래프 이론, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Alice and Bob live in a city with N intersections (numbered as intersection 1, intersection 2,..., intersection N). There are M roads. Each road is bidirectional and directly joins two intersections. Each pair of intersections is joined by at most one road.</p>

<p>Alice lives in a house at intersection 1. Bob lives in a house at intersection N. They start wandering in the city at 12pm. Each minute each one move from one intersection to another which is connected directly by a road. (Note that since they have to move, they cannot stay at the same intersection they were at in the previous minute).</p>

<p>They agree to meet exactly T minutes after 12pm at some intersection. Also they do not want to meet each other before T minutes. In how many ways can they move inside the city? Note that because they travel fairly fast, they do not meet if they travel on the same road on different directions.</p>

### 입력

<p>The first line of the input contains an integer K (1&lt;=K&lt;=5), the number of test cases. Then K test cases<br />
follow in the format specified below.</p>

<p>Each test case starts with 3 integers N, M, and T (2&lt;=N&lt;=10; 1&lt;=M&lt;=50; 1&lt;=T&lt;=1,000,000,000,000). The next M lines specify road connections. That is, line 1+i, for 1&lt;=i&lt;=M, contain two integers A and B specifying that there is a bidirectional road connecting intersection A and B (1&lt;=A&lt;=N; 1&lt;=B&lt;=N; A is not equal to B).</p>

### 출력

<p>For each test case, your program should output the number of possible ways (modulo 9973) can Alice and Bob move in the city so that at time T they meet at some intersection but they do not meet at any intersection before that. Since the number can be very large, you should output the numbers modulo 9973.</p>

<p>&nbsp;</p>