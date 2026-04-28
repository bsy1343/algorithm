# [Platinum IV] Frequent Flier - 28150

[문제 링크](https://www.acmicpc.net/problem/28150)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 104, 정답: 56, 맞힌 사람: 52, 정답 비율: 56.522%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>An airline is offering a strange new rewards program to offer free flights to travelers.</p>

<p>The program can be parameterized with two integers $m$ and $k$. Within any $m$ consecutive months, a traveler must pay for at least $k$ of those flights (if there are fewer than $k$ flights in that interval, all of those flights must be paid for). Other flights within that interval are free. Note that this condition needs to be true for all $m$-month intervals, including all of the ones that start before your first flight.</p>

<p>You have a schedule of the number of flights you&#39;ll take over the next many months. You want to know the minimum number of flights you&#39;ll need to pay for.</p>

### 입력

<p>The first line of input contains three integers $n$, $m$ ($1 \le n,m \le 2 \times 10^5$) and $k$ ($1 \le k \le 10^9$), where $n$ is the number of consecutive months ahead that you have flights planned, and $m$ and $k$ are the parameters of the airline&#39;s rewards program.</p>

<p>Each of the next $n$ lines contains an integer $f$ ($1 \le f \le 10^9$), which is the number of flights you plan to take during that month.</p>

### 출력

<p>Output a single integer, which is the minimum number of planned flights that you must pay for.</p>