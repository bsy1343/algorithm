# [Silver II] Competition Results - 35011

[문제 링크](https://www.acmicpc.net/problem/35011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 13, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>There are $n$ runners participating in a race. Each runner is assigned a unique number from $1$ to $n$. They have arrived at the finish line in some specific order, with no ties. Let us say that runner $i$ has performed an <em>upset</em> of runner $j$ if $i$ finished before $j$ and $i &lt; j$.</p>

<p>For each $i$ from $1$ to $n$, it is known that runner $i$ has performed exactly $a_i$ upsets of other runners. Your task is to restore the competition results: the number of the runner that took first place, the number of the runner that took second place, \ldots, the number of the runner that took the $n$-th place. It can be shown that the answer is always unique, assuming that it exists.</p>

### 입력

<p>The first line of the input contains an integer $n$ from $1$ to $1000$: the number of runners.</p>

<p>The second line contains $n$ space-delimited integers $a_1, a_2, \ldots, a_n$, where $a_i$ is the number of upsets performed by runner $i$.</p>

<p>The given data is consistent with some possible results of the competition: for every $i$, it is true that $a_i \le n - i$. In particular, $a_n = 0$.</p>

### 출력

<p>Print $n$ space-separated integers: the numbers of runners who took first, second, \ldots, $n$-th place.</p>

### 힌트

<p>Let us check that the answer to the first example is consistent with the given numbers $a_i$.</p>

<ol>
<li>Runner $1$ has upset runners $2$, $4$, and $5$.</li>
<li>Runner $2$ took the last place and, therefore, has not outperformed anyone. Hence, runner $2$ has performed no upsets.</li>
<li>The runner with the number $3$ took the first place and, therefore, has upset both runners with larger numbers.</li>
<li>The runner with the number $4$ has upset a single other runner: runner $5$.</li>
<li>There are no runners with numbers larger than $5$. Therefore, runner $5$ has performed no upsets.</li>
</ol>