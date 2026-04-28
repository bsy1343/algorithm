# [Platinum III] Roads of the Empire - 23166

[문제 링크](https://www.acmicpc.net/problem/23166)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 8, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

수학, 트리, 정수론, 무작위화

### 문제 설명

<p>King is dead. Long live the king!</p>

<p>The young emperor has just inherited the vast empire of his father. After the successful reign, it consists of such many cities that it is plausible to consider that there are infinitely many of them.</p>

<p>However, the transportation system of the empire is pretty poor. As all new rulers do, the emperor wants to change his predecessor&#39;s policies. Thus, instead of war, he decides to build some new roads in the empire. However, the country&#39;s religious beliefs require the emperor to follow a specific ritual of building new roads.</p>

<p>First, he has to choose a positive number $n$. Then, $n$ cities are taken, numbered from $1$ to $n$. After that, for all pairs of cities with numbers $x$ and $y$ such that $1 \leq x &lt; y \leq n$, the road between them is built if and only if $x + n$ is evenly divisible by $y$.&nbsp;</p>

<p>After all those manipulations, the emperor has to choose two cities $u$ and $v$, satisfying $1 \leq u, v \leq n$, and find the number of roads in the shortest path between them. Moreover, he must choose them randomly and equiprobably to be blessed by God, the holy protector of the empire. Knowing this length, the Religious Council will decide whether the plan is acceptable.&nbsp;</p>

<p>The emperor is worried before the meeting with the Council, so he prepared several such plans. For every plan, answer the question of the length of the shortest path!</p>

### 입력

<p>The first line contains one integer $T$ ($1 \leq T \leq 2 \cdot 10^5$) --- the number of plans proposed by the emperor.</p>

<p>Each of the following $T$ lines contains three integers $n, u, v$ ($1 \leq n \leq 10^{18}, 1 \leq u, v \leq n$) --- the number of cities chosen for the plan, and the two cities for which you are asked to find the length of the shortest path in the described graph.</p>

<p>It is guaranteed that $u$ and $v$ were chosen randomly and equiprobably after $n$ had been selected for each test.</p>

### 출력

<p>For every query, print a number on a separate line --- the length of the shortest path between the corresponding cities. If the path does not exist, print $-1$.</p>