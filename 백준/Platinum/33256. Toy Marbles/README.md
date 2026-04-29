# [Platinum IV] Toy Marbles - 33256

[문제 링크](https://www.acmicpc.net/problem/33256)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 9, 맞힌 사람: 9, 정답 비율: 32.143%

### 분류

순열 사이클 분할, 애드 혹

### 문제 설명

<p>Busy Beaver has discovered that someone has mixed up his toy marbles!</p>

<p>There are $N$ containers, numbered from $1$ to $N$. The $i$-th container currently contains a single marble of color $c_i$.</p>

<p>Busy Beaver wants to tidy up his marbles so that the $i$-th container only contains marbles of color $i$. To achieve this, he can perform either of the following actions any number of times (possibly zero):</p>

<ul>
	<li>Swap the marbles in two containers $x$ and $y$. After this action, all marbles from container $x$ move to container $y$, and vice versa.</li>
	<li>Move all the marbles from one container $y$ to another container $x$. After this action, container $y$ becomes empty, and all its marbles are moved to container $x$.</li>
</ul>

<p>Find a way to organize the marbles using the <em>minimum</em> number of actions.</p>

### 입력

<p>The first line contains an integer $N$ ($1\leq N\leq 2\cdot 10^5$) — the number of containers.</p>

<p>The second line contains $N$ integers $c_1,c_2,\dots ,c_N$ ($1\leq c_i\leq N$) — the marble initially in each container.</p>

### 출력

<p>On the first line, print a single integer $K$ — the minimum number of actions required.</p>

<p>On the next $K$ lines, describe the actions in order, one per line. Each action should be in one of the following formats:</p>

<ul>
	<li><code>1</code> $x$ $y$: Swap the marbles in containers $x$ and $y$ ($1\leq x,y\leq N$; $x\neq y$).</li>
	<li><code>2</code> $x$ $y$: Move all marbles from container $y$ to container $x$ ($1\leq x,y\leq N$; $x\neq y$).</li>
</ul>

<p>If there are multiple ways to achieve the goal in the minimum number of actions, you may print any valid solution.</p>