# [Platinum III] Submissions - 33427

[문제 링크](https://www.acmicpc.net/problem/33427)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 4, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현, 자료 구조

### 문제 설명

<p><strong>The legend, example, and note of this problem are used fictitiously. Any resemblance to the actual contests, rules, submissions, or teams is coincidental.</strong></p>

<p>In the International Challenging Puzzle Contest (ICPC), there are $m$ submissions. You are given the list of $m$ submissions ordered by time. A submission can be represented as a tuple $(c,p,t,s)$, which means team $c$ makes a submission on problem $p$ at time $t$ with status $s$. The status of a submission is either "accepted" or "rejected".</p>

<p>The score of a team is the pair of the number of problems solved by the team and the total time consumed$^\dagger$ by the team. The larger the number of problems solved is, the higher the score is. If a tie occurs, the smaller the total time consumed is, the higher the score is.</p>

<p>If team $c$ makes at least one submission with status "accepted" on problem $p$, we say that team $c$ solves problem $p$. A team can get a gold medal if the number of teams with higher score is less than $\min(\lceil 0.1 \cdot n \rceil, 35)$, where $n$ is the number of teams that solved <strong>at least</strong> one problem and $\lceil x \rceil$ denotes the smallest integer that is not smaller than $x$.</p>

<p>You need to find all the teams that can get a gold medal if <strong>at most</strong> one of the $m$ submissions changes its status.</p>

<p>$\dagger$ The total time consumed is the sum of times consumed for all solved problems ($0$ if no problems are solved). The time consumed for a solved problem is the time of the first submission with status  "accepted", plus $20$ times the number of submissions on this problem before the first submission with status  "accepted". Note that we say submission $i$ is before submission $j$ if and only if submission $i$ appears earlier than submission $j$ in the given list of $m$ submissions.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains a single integer $t$ ($1 \le t \le 10^5$) denoting the number of test cases. For each test case:</p>

<p>The first line contains a single integer $m$ ($1 \le m \le 10^5$) denoting the number of submissions.</p>

<p>The $i$-th of the following $m$ lines contains $c_i$, $p_i$, $t_i$, and $s_i$ which mean that team $c_i$ makes a submission on problem $p_i$ at time $t_i$ with status $s_i$. Specifically:</p>

<ul>
	<li>$c_i$ is a string of length between $1$ and $20$ consisting of uppercase letters, lowercase letters, digits and underscores ('<code>_</code>'). Note that no two teams have the same name.</li>
	<li>$p_i$ is an uppercase letter.</li>
	<li>$t_i$ is a non-negative integer less than $300$.</li>
	<li>$s_i$ is a string, being either "<code>accepted</code>" or "<code>rejected</code>".</li>
</ul>

<p>It is guaranteed that $t_i \le t_j$ for all $i &lt; j$. Recall that if $t_i = t_j$ and $i &lt; j$, we still say that the $i$-th submission came before the $j$-th submission.</p>

<p>It is guaranteed that the sum of $m$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case:</p>

<p>Output one integer $k$ on the first line, denoting the number of teams that can get a gold medal if at most one of the $m$ submissions changes its status.</p>

<p>On the second line, output $k$ distinct strings <strong>in any order</strong>, denoting the names of these $k$ teams.</p>

### 힌트

<p>In the first case of the first example, <code>TS1</code> solves two problems, so they can get a gold medal. <code>TSxingxing10</code> can get a gold medal if their first submission changes its status to "accepted".</p>

<p>In the second case of the first example, <code>AllWayTheNorth</code>, <code>XuejunXinyoudui1</code>, <code>LetItRot</code> and <code>ImYourFan</code> have the same score, two problems solved with $514$ total time consumed. They can get gold medals simultaneously if no submission changes its status.</p>