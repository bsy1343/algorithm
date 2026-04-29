# [Gold III] Circle Passing - 32444

[문제 링크](https://www.acmicpc.net/problem/32444)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 8, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

이분 탐색, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>It is the first day of high school for Anouk; as a warm-up activity, her sports teacher is making the class play name-learning games. There are $2N$ students in the class. Most of them do not know each other, but there are $M$ pairs of best friends who do everything together. Each student has at most one best friend.</p>

<p>The teacher arranges all of the students in a circle, consecutively assigning each student a number from $0$ to $2N - 1$. More specifically, for each $0 \leq i &lt; 2N - 1$, students $i$ and $i + 1$ stand next to each other. Additionally, students $0$ and $2N - 1$ stand next to each other.</p>

<p>Since the teacher wants everyone to meet new students, best friends have to stand as far away from each other as possible, i.e. opposite each other. That is, the students forming the $i$th pair of best friends are standing at positions $k_i$ and $k_i + N$ respectively, where $0 \leq k_i &lt; N$.</p>

<p>The teacher selects two students $x$ and $y$ and hands a ball to student $x$. The goal is to send the ball to student $y$, but each student may only pass the ball to another student whose name they already know. Of course, best friends know each other's names. While the rules were explained, each student got to know the names of the two students standing directly beside them. Other than that, no one knows any other names.</p>

<p>The game is played $Q$ times; the teacher chooses two students each time. Since the students are not paying attention, they do not learn any new names throughout the games. What is the minimum number of passes needed to get the ball from student $x$ to student $y$ in each game?</p>

### 입력

<p>The first line of input contains three integers, $N$, $M$ and $Q$, where $2N$ is the number of students in Anouk's class, $M$ is the number of pairs of best friends, and $Q$ is the number of games that are played.</p>

<p>The second line contains $M$ integers $k_0, \ldots, k_{M-1}$, with $k_i$ describing the $i$th pair of best friends. For each $i$, the best friends stand at positions $k_i$ and $k_i + N$ respectively. Each student has at most one best friend.</p>

<p>The following $Q$ lines each contain two integers, $x_i$ and $y_i$, the two selected students in game $i$.</p>

### 출력

<p>Output $Q$ lines, the $i$th line containing a single integer, the minimum number of passes needed in game $i$.</p>

### 제한

<ul>
	<li>$2 \leq N \leq 5 \cdot 10^8$.</li>
	<li>$1 \leq M \leq 5 \cdot 10^5$ and $M \le N$.</li>
	<li>$1 \leq Q \leq 2 \cdot 10^4$.</li>
	<li>$0 \leq k_0 &lt; k_1 &lt; \ldots &lt; k_{M - 1} &lt; N$.</li>
	<li>$0 \leq x_i, y_i &lt; 2N$ with $x_i \neq y_i$.</li>
</ul>

### 힌트

<p>The following two figures depict the arrangements in the first and the fourth sample. Two students are connected by an edge if they know each other's names.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32444.%E2%80%85Circle%E2%80%85Passing/5d2e2824.png" data-original-src="https://boja.mercury.kr/assets/problem/32444-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 278px;"></p>

<p>In the first game of the first sample, the ball is given to student $1$. Student $1$ passes the ball to their best friend, student $5$. The ball reaches student $4$ after student $5$ passes it to them, needing two passes in total.</p>