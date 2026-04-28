# [Gold II] Vacant Seat - 19269

[문제 링크](https://www.acmicpc.net/problem/19269)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 65, 정답: 34, 맞힌 사람: 30, 정답 비율: 50.000%

### 분류

이분 탐색

### 문제 설명

<p>Let $N \ge 3$ be an odd number.</p>

<p>There are $N$ seats arranged in a circle. The seats are numbered $0$ through $N-1$. For each $i$ ($0 \le i \le N - 2$), seat $i$ and seat $i + 1$ are adjacent. Also, seat $N - 1$ and seat $0$ are adjacent.</p>

<p>Each seat is either vacant, or occupied by a man or a woman. However, no two adjacent seats are occupied by two people of the same sex. It can be shown that there is at least one empty seat because $N$ is an odd number greater than $1$.</p>

<p>You are given $N$, but the states of the seats are not given. Your objective is to correctly guess the ID number of any one of the empty seats. To do so, you can repeatedly send the following query:</p>

<p>Choose an integer $i$ ($0 \le i \le N - 1$). If Seat $i$ is empty, the problem is solved. Otherwise, you are notified of the sex of the person at seat $i$.</p>

<p>Guess the ID number of an empty seat by sending at most $20$ queries.</p>

### 입력



### 출력



### 힌트

<p>In the sample, $N = 3$, and Seat $0$, $1$, $2$ are occupied by a man, occupied by a woman and vacant, respectively.</p>