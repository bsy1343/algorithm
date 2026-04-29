# [Platinum III] Snakey Beavers - 34904

[문제 링크](https://www.acmicpc.net/problem/34904)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

값 / 좌표 압축, 누적 합, 매개 변수 탐색, 세그먼트 트리, 애드 혹, 이분 탐색, 자료 구조, 정렬

### 문제 설명

<p>Mr. Busy Beaver is very stressed: he has to babysit $N$ baby beavers who are strangely obsessed with arranging themselves into one gigantic snake(?!).</p>

<p>The $i$-th baby beaver starts at a distinct point $(x_i, y_i)$ on an infinite Cartesian plane. Then, they will all start moving. At all times, each beaver's velocity $\vec{v} = (v_x, v_y)$ must satisfy $$ |v_x| \le 1 \quad\text{and}\quad |v_y| \le 1 \quad \text{(cells per second)}. $$ They will only be satisfied once their final positions lie along a path that moves only upward and rightward (i.e., nondecreasing in both $x_i$ and $y_i$). Note that multiple beavers can be at the same point.</p>

<p>Busy Beaver is exhausted, and he just wants to go home. Help him find <strong>twice</strong> the minimum time required to coordinate these babies into the described snake formation. It can be proven that this value is an integer.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \le T \le 10^4$) --- the number of test cases.</p>

<p>Each test case begins with one integer $N$ ($1 \le N \le 2 \cdot 10^5$) --- the number of baby beavers.</p>

<p>Each of the next $N$ lines contains two integers $x_i$ and $y_i$ ($0 \le x_i, y_i \le 10^9$) --- the initial coordinates of the $i$-th beaver.</p>

<p>All $(x_i, y_i)$ in a test case are distinct.</p>

<p>The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print one integer --- <strong>twice</strong> the minimum number of seconds needed for the beavers to reach a valid snake formation.</p>

### 힌트

<p>In the sample test case, one way for the beavers to reach a snake formation in $2$ seconds is as follows:</p>

<ul>
<li>The beaver at $(5,3)$ can move to $(3,5)$ in $2$ seconds.</li>
<li>The beaver at $(2,6)$ can move to $(3,6)$ in $1$ second, and then stay there for $1$ second.</li>
<li>The beaver at $(1,8)$ can move to $(3,6)$ in $2$ seconds.</li>
<li>The beaver at $(8,5)$ can stay still for $1$ second, and then move to $(8,6)$ in $1$ second.</li>
</ul>

<p>Afterwards, the beavers will be located at $(3,5)$, $(3,6)$, $(3,6)$, and $(8,6)$, which lie along a path that moves only upward and rightward.</p>

<p>We can show that it is impossible to form a snake with less time. Therefore, the answer is $2 \cdot 2 = 4$, twice the minimum number of seconds.</p>