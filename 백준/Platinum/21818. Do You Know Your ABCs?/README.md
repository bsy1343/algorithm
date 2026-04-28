# [Platinum V] Do You Know Your ABCs? - 21818

[문제 링크](https://www.acmicpc.net/problem/21818)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 314, 정답: 137, 맞힌 사람: 108, 정답 비율: 42.353%

### 분류

수학, 구현, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>Farmer John&#39;s cows have been holding a daily online gathering on the &quot;mooZ&quot; video meeting platform. For fun, they have invented a simple number game to play during the meeting to keep themselves entertained.</p>

<p>Elsie has three positive integers $A$, $B$, and $C$ ($1\le A\le B\le C$). These integers are supposed to be secret, so she will not directly reveal them to her sister Bessie. Instead, she tells Bessie $N$ ($4\le N\le 7$) distinct integers $x_1,x_2,\ldots,x_N$ ($1\le x_i\le 10^9$), claiming that each $x_i$ is one of $A$, $B$, $C$, $A+B$, $B+C$, $C+A$, or $A+B+C$. However, Elsie may be lying; the integers $x_i$ might not correspond to any valid triple $(A,B,C)$.</p>

<p>This is too hard for Bessie to wrap her head around, so it is up to you to determine the number of triples $(A,B,C)$ that are consistent with the numbers Elsie presented (possibly zero).</p>

<p>Each input file will contain $T$ ($1\le T\le 100$) test cases that should be solved independently.</p>

### 입력

<p>The first input line contains $T$.</p>

<p>Each test case starts with $N$, the number of integers Elsie gives to Bessie.</p>

<p>The second line of each test case contains $N$ distinct integers $x_1,x_2,\ldots,x_N$.</p>

### 출력

<p>For each test case, output the number of triples $(A,B,C)$ that are consistent with the numbers Elsie presented.</p>

### 힌트

<p>For $x=\{4,5,7,9\}$, the five possible triples are as follows: $$(2, 2, 5), (2, 3, 4), (2, 4, 5), (3, 4, 5), (4, 5, 7).$$</p>