# [Gold I] Schedule - 19110

[문제 링크](https://www.acmicpc.net/problem/19110)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 21, 맞힌 사람: 19, 정답 비율: 57.576%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 집합과 맵, 스위핑

### 문제 설명

<p>There are $N$ tasks: the $i$-th task has to start at moment $s_i$ and finish at moment $e_i$. There is also a potentially infinite supply of machines. We want to assign tasks to machines. Each task will be assigned to one machine. On the other hand, each machine may handle an arbitrary number of tasks as long as no two of them overlap. Tasks $i$ and $j$ are said to overlap if the intersection of the open intervals $(s_i, e_i)$ and $(s_j, e_j)$ is non-empty.</p>

<p>A machine is turned on at the moment when the earliest of its assigned tasks has to start, and turned off at the moment when the latest of them has to finish. The working time of a machine is the length of the time period between these two moments: we cannot turn a single machine on and off more than once.</p>

<p>Your task is to find the minimum possible number of machines $K$ such that we can use only $K$ machines to perform all tasks. Additionally, when using $K$ machines, find the minimum possible sum of all their working times.</p>

### 입력

<p>The first line of input contains an integer $T$, the number of test cases ($1 \le T \le 100$).</p>

<p>Each test case begins with a line containing one integer $N$ ($0 &lt; N \le 10^5$). Each of the next $N$ lines contains two integers $s_i$ and $e_i$ ($0 \le s_i &lt; e_i \le 10^9$).</p>

<p>It is guaranteed that $N &gt; 50$ for no more than 10 test cases.</p>

### 출력

<p>For each test case, print two integers in one line: the minimum possible number of machines $K$ to perform all tasks and the minimum sum of all working times when using $K$ machines.</p>