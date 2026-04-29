# [Gold III] Fell Walking - 35244

[문제 링크](https://www.acmicpc.net/problem/35244)

### 성능 요약

시간 제한: 3.5 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

분리 집합, 자료 구조

### 문제 설명

<p>You are creating a tour of the Peak District hills for a friend visiting from the Netherlands.  The walk will go from the locally famous viewpoint "Hill 1" to the world-famous viewpoint "Hill 2".</p>

<p>To make this friend feel at home, you want to minimise the difference in height between the highest and lowest hills of the walk.</p>

<p>Given a graph of the local points of interest and paths between them, find such an optimally-flat route.</p>

### 입력

<ul>
<li>One line containing the number of hills, $n$ ($2 \le n \le 5,000$), and the number of trails connecting them, $m$ ($1 \le m \le 25,000$).</li>
<li>One line containing $n$ integers $h_1 \ldots h_n$ ($0 \le h \le 10^6$), the heights in metres of the hills from $1$ to $n$.</li>
<li>$m$ further lines, the $i$-th of which contains two integers $a$ and $b$ ($1 \le a, b \le n$) indicating that there is a bi-directional path between hills $a$ and $b$.</li>
</ul>

<p>It is guaranteed that there is a path (direct or indirect) between hills $1$ and $2$.</p>

### 출력

<p>Output the minimum possible distance between the maximum and minimum heights of hills encountered on a walk between hills $1$ and $2$.</p>