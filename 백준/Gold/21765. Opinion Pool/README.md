# [Gold III] Opinion Pool - 21765

[문제 링크](https://www.acmicpc.net/problem/21765)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 213, 정답: 111, 맞힌 사람: 101, 정답 비율: 57.062%

### 분류

수학, 그리디 알고리즘, 이분 탐색

### 문제 설명

<p>MOLOCO, a global company with an unbeatable global reach, is developing a new survey platform to increase user engagement.</p>

<p>There are $N$ people who want to vote on an issue. Each person is either in support of the issue or against the issue.</p>

<p>There are $M$ not necessarily disjoint sets of people $S_1, S_2, \cdots, S_M$. For these $M$ sets and a constant $p$ ($0 \le p \le 1$), the propositions below are established.</p>

<ul>
	<li>For every set $S_i$, at least $p \cdot|S_i|$ people belonging to $S_i$ is in support of the issue.</li>
</ul>

<p>If $p = 0$, no information can be obtained from this proposition. $p = 1$ shows that everyone is in support of the issue. That is, as $p$ grows, it becomes easier to ascertain who is in support of the issue.</p>

<p>Thus, if a proposition is established for a sufficiently large $p$, we can know that everyone is in support of the issue. Find the maximum value of $p$ such that you can not be certain everyone is in support.</p>

### 입력

<p>The first line contains two integers $N$ and $M$, where $N$ denotes the number of people and $M$ denotes the number of sets.</p>

<p>The next $M$ lines describe the information of each of the $M$ sets.</p>

<p>The $i$-th line starts with an integer $|S_i|$, denoting the number of elements in the set $S_i$, followed by $|S_i|$ distinct integers $S_{i,j}$, denoting the elements in the set $S_i$.</p>

### 출력

<p>Output the maximum value of $p$ such that you cannot be certain everyone is in support of the issue.</p>

<p>Your answer will be considered correct if it has an absolute or relative error less than $10^{-6}$.</p>

### 제한

<ul>
	<li>$1 \le N,M \le 200\,000$</li>
	<li>$S_i \subseteq \{1,2,\cdots,N\}$ $(1 \le i \le M)$</li>
	<li>$\sum_{i=1}^{M}|S_i| \le 1\,000\,000$</li>
	<li>Everyone appears in at least one set.</li>
</ul>

### 힌트

<p>In example 2, the proposition can be established for $p=0.5,$ if people 1, 3 are for and people 2, 4 are against.</p>

<p>However, if the proposition is established for $p&gt;0.5, $ it is a contradiction to the proposition if there exists a person against an issue.</p>