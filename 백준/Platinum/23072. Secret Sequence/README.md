# [Platinum II] Secret Sequence - 23072

[문제 링크](https://www.acmicpc.net/problem/23072)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 129, 정답: 14, 맞힌 사람: 14, 정답 비율: 13.333%

### 분류

애드 혹, 이분 탐색

### 문제 설명

<p>There is a secret sequence of zeros and ones of length $n$, and you want to know the number of ones in the sequence. You are allowed to ask queries by giving four integers $0 \leq a \leq b \leq c \leq d \leq n$. The answer to the query will be $-1$ if the sum of the numbers at positions $a, a+1, ..., b-1$ is larger than the sum of the numbers at positions $c, c+1, ..., d-1$, and $1$ if the sum is smaller. If the sums are equal, the answer will be $0$.</p>

<p>The indices of the sequence start at $0$ and end at $n-1$. Note that the intervals you&#39;re querying can be empty, if $a = b$ or $c = d$ respectively. The sum of the numbers in an empty interval is $0$.</p>

<p>Figure out the total number of ones in the sequence using at most $200$ queries.</p>

### 입력



### 출력

