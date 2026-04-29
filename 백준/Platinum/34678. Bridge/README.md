# [Platinum II] Bridge - 34678

[문제 링크](https://www.acmicpc.net/problem/34678)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 77, 정답: 14, 맞힌 사람: 6, 정답 비율: 12.500%

### 분류

기하학, 누적 합, 삼분 탐색, 스위핑, 스택, 자료 구조

### 문제 설명

<p>You are given a simple polygonal path $P = &lt;v_1, v_2, \dots , v_n&gt;$ with $x(v_i) ≤ x(v_{i+1})$ for every $i = 1, \dots , n − 1$ in the plane. Every segment of $P$ has a positive length and no two segments of $P$ intersect, except at their endpoints. The distance between any two points $p$, $q$ in $P$ is the length of the path from $p$ to $q$ along $P$, that is, the sum of segment lengths of the path. The diameter of $P$ is the maximum of all possible distances between two points in $P$.</p>

<p>For example, consider a polygonal path $P = &lt;p_1, p_2, p_3&gt;$ as shown in Figure (a) below. The distance between the two midpoints $p$, $q$ of the segments is the sum of lengths of segments $pv_2$ and $v_2q$. The diameter of $P$ is the distance between the two end vertices $v_1$, $v_3$ of $P$, that is the sum of lengths of segments $v_1v_2$ and $v_2v_3$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34678.%E2%80%85Bridge/0d93e584.png" data-original-src="https://boja.mercury.kr/assets/problem/34678-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 198px;"></p>

<p>Now we add a bridge to $P$. A bridge $B$ of $P$ is a segment parallel to the $x$-axis and connecting two points of $P$ such that for every point $z$ of $B$, except the endpoints of $B$, $P$ has no point $z'$ with $x(z) = x(z')$ and $y(z) ≤ y(z')$, where $x(t)$ is the $x$-coordinate and $y(t)$ is the $y$-coordinate of a point $t$ in the plane. Then a path connecting two points of $P$ can use $B$ by entering and exiting at the endpoints of $B$. Thus, the distance between two points of $P$ is the length of the shorter path between the path using $B$ and the path not using $B$.</p>

<p>For example, if we add a bridge $B$ as shown in Figure (b) above, the distance between $v_1$ and $v_3$ is $a + e + |B|$ by the path using $B$, where $|B|$ is the length of $B$. The distance between $v_1$ and $r$ is the smaller between the length $a + d + |B|$ of the path using $B$ and the length $a + b + c$ of the path not using $B$.</p>

<p>Given a simple polygonal path $P = &lt;v_1, v_2, \dots , v_n&gt;$ with $x(v_i) ≤ x(v_{i+1})$ for every $i = 1, \dots , n − 1$, write a program to output the infimum (greatest lower bound) of diameters of $P$ using a bridge.</p>

### 입력

<p>Your program is to read from standard input. The first line contains the number $n$ ($3 ≤ n ≤ 10^5$) of vertices of $P = &lt;v_1, v_2, \dots , v_n&gt;$ with $x(v_i) ≤ x(v_{i+1})$ for every $i = 1, \dots , n − 1$. In the next $n$ lines, the $i$-th line contains the $x$-coordinate $x(v_i)$ and the $y$-coordinate $y(v_i)$ of $v_i$ ($−100\,000 ≤ x(v_i), y(v_i) ≤ 100\,000$) . All the coordinates are integers, and no two vertices are at the same position.</p>

### 출력

<p>Your program is to write to standard output. Print the infimum $z$ of diameters of $P$ using a bridge. If no bridge can be placed on $P$, print the diameter of $P$ with no bridge. The output $z$ should be in the format that consists of its integer part, a decimal point, and its fractional part, and will be decided to “correct” if it holds that $\frac{|a-z|}{a} &lt; 10^{-6}$, where $a$ denotes the exact answer.</p>