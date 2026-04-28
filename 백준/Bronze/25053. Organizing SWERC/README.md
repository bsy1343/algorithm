# [Bronze II] Organizing SWERC - 25053

[문제 링크](https://www.acmicpc.net/problem/25053)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 287, 정답: 229, 맞힌 사람: 186, 정답 비율: 79.487%

### 분류

구현

### 문제 설명

<p>Gianni, SWERC&rsquo;s chief judge, received a huge amount of high quality problems from the judges and now he has to choose a problem set for SWERC.</p>

<p>He received $n$ problems and he assigned a beauty score and a difficulty to each of them. The $i$-th problem has beauty score equal to $b_i$ and difficulty equal to $d_i$. The beauty and the difficulty are integers between $1$ and $10$.</p>

<p>If there are no problems with a certain difficulty (the possible difficulties are $1$, $2$, $\dots$, $10$) then Gianni will ask for more problems to the judges.</p>

<p>Otherwise, for each difficulty between $1$ and $10$, he will put in the problem set one of the most beautiful problems with such difficulty (so the problem set will contain exactly $10$ problems with distinct difficulties). You shall compute the total beauty of the problem set, that is the sum of the beauty scores of the problems chosen by Gianni.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains an integer $t$ ($1 &le; t &le; 100$) &mdash; the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains the integer $n$ ($1 &le; n &le; 100$) &mdash; how many problems Gianni received from the judges.</p>

<p>The next $n$ lines contain two integers each. The $i$-th of such lines contains $b_i$ and $d_i$ ($1 &le; b_i , d_i &le; 10$) &mdash; the beauty score and the difficulty of the $i$-th problem.</p>

### 출력

<p>For each test case, print the total beauty of the problem set chosen by Gianni. If Gianni cannot create a problem set (because there are no problems with a certain difficulty) print the string <code>MOREPROBLEMS</code> (all letters are uppercase, there are no spaces).</p>