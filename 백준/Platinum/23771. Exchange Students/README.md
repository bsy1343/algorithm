# [Platinum I] Exchange Students - 23771

[문제 링크](https://www.acmicpc.net/problem/23771)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 86, 정답: 25, 맞힌 사람: 24, 정답 비율: 30.000%

### 분류

자료 구조, 그리디 알고리즘, 세그먼트 트리, 집합과 맵

### 문제 설명

<p>A group of $n$ exchange students at Reykjavik University is lining up to get their group photo taken. From left to right, the heights of the students are $g_1, g_2, \ldots, g_n$. However, the photographer would like to rearrange the students such that the order of their heights becomes $h_1, h_2, \ldots, h_n$. In order to do this, the photographer will repeatedly exchange two exchange students. Two exchange students can only be exchanged if they can see each other, that is, if every student in between them has strictly smaller height than the two students to be exchanged.</p>

<p>Determine the minimum number of exchanges needed to arrange the students in the photographer&#39;s preferred order, and find a suitable sequence of exchanges of this minimal length. The photographer only has time for at most $2\cdot 10^5$ exchanges. If more are needed, you only need to determine the first $2\cdot 10^5$ exchanges.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n \leq 3\cdot 10^5$), the number of students.</li>
	<li>One line with $n$ integers $g_1, g_2, \ldots, g_n$ ($1\leq g_i\leq 10^9$), the heights of the students.</li>
	<li>One line with $n$ integers $h_1, h_2, \ldots, h_n$ ($1\leq h_i\leq 10^9$), the order of heights the photographer prefers.</li>
</ul>

<p>It is guaranteed that $(h_1, \ldots, h_n)$ is a permutation of $(g_1, \ldots, g_n)$.</p>

### 출력

<p>First output an integer $s$, the minimum number of exchanges needed. Then print $\min(s, 2\cdot 10^5)$ exchanges, each consisting of two integers $i$ and $j$, the one-based positions of the students that must be exchanged in this step.</p>

<p>If there are multiple valid solutions, you may print any one of them.</p>