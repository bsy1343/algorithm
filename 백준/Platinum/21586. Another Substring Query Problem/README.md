# [Platinum I] Another Substring Query Problem - 21586

[문제 링크](https://www.acmicpc.net/problem/21586)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 1024 MB

### 통계

제출: 253, 정답: 57, 맞힌 사람: 45, 정답 비율: 28.125%

### 분류

자료 구조, 머지 소트 트리, 세그먼트 트리, 정렬, 문자열, 접미사 배열과 LCP 배열

### 문제 설명

<p>You are given a string $s$ and several queries.</p>

<p>Each query consists of a string $t$ and an integer $k$. For each query, determine the $k$<sup>th</sup> position in $s$ where a substring matching $t$ starts. If $t$ occurs fewer than $k$ times in $s$, print &minus;1.</p>

### 입력

<p>The first line of input contains a single string $s$ ($1 \le |s| \le 2 \cdot&nbsp;10^5$), which is the queriable string. It will consist only of lower-case letters.</p>

<p>The next line of input contains a single integer $q$ ($1 \le q \le 2 \cdot 10^5$), which is the number of queries that follow.</p>

<p>Each of the next $q$ lines contains a string $t$ ($1 \le |t|$) and an integer $k$ ($1 \le k \le |s|$). This represents a query for the $k$<sup>th</sup> occurrence of $t$ in $s$. The string $t$ will consist only of lower-case letters. The sum of all $|t|$&rsquo;s will be $\le 2 \cdot 10^5$.</p>

### 출력

<p>Output a single integer, which is the position of the start of the $k$<sup>th</sup> occurrence of $t$ in $s$, or &minus;1 if $t$ occurs fewer than $k$ times in $s$. The first character in $s$ is at position 1.</p>