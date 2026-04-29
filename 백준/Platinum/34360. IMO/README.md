# [Platinum I] IMO - 34360

[문제 링크](https://www.acmicpc.net/problem/34360)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 2048 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 비트 집합

### 문제 설명

<p>The International Mathematics Olympiad (IMO) is a maths competition for high school students that is held every year. The 2025 edition of the IMO takes place at the same time as the EGOI. As you are reading this, both contest days of the IMO have ended and the grading is probably almost done as well. Unlike programming competitions like the EGOI, the grading is done by hand, which is a long and arduous process.</p>

<p>This year the IMO had $M$ problems (numbered from $0$ to $M-1$), and each problem is worth a maximum of $K$ points. There were $N$ contestants taking part in the contest. The $i$th contestant received a score of $a_{i,j}$ on problem $j$, where $a_{i,j}$ is an integer between $0$ and $K$, inclusive. The ranking of the contestants is determined by the total score of each contestant, with ties broken by the contestants' indices. More formally, contestant $x$ ranks higher than contestant $y$ if:</p>

<ul>
	<li>either the total score of contestant $x$ is bigger than the total score of contestant $y$,</li>
	<li>or their total scores are the same and $x &lt; y$.</li>
</ul>

<p>In order to release the final ranking, the organizers need to publish some of the values $a_{i,j}$. If a value is unpublished, it is only known that it is an integer between $0$ and $K$, inclusive.</p>

<p>The organizers want to reveal as few of the values $a_{i,j}$ as possible. At the same time, they need to make sure that everyone knows the correct final ranking. In other words, they must reveal a set of values such that the only ranking consistent with it is the correct one.</p>

<p>Find the smallest $S$ such that it is possible to reveal $S$ of the values $a_{i,j}$ in a way that uniquely determines the full ranking of the contestants.</p>

### 입력

<p>The first line contains three integers $N$, $M$, and $K$: the number of contestants, the number of problems, and the maximum score of the tasks, respectively.</p>

<p>Then follow $N$ lines, where the $i$th line contains $a_{i,j}$. That is, the first of these contains $a_{0,0}, a_{0,1}, \ldots, a_{0, M-1}$, the second contains $a_{1,0}, a_{1,1}, \ldots, a_{1, M-1}$, and so on.</p>

### 출력

<p>Print one integer $S$, the minimum number of scores that can be revealed so that the final ranking is uniquely determined.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 20\,000$.</li>
	<li>$1 \leq M \leq 100$.</li>
	<li>$1 \leq K \leq 100$.</li>
	<li>$0 \leq a_{i,j} \leq K$ for every pair $i,j$ where $0 \leq i \leq N-1$ and $0\leq j \leq M-1$.</li>
</ul>