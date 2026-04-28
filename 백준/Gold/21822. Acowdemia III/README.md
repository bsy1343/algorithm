# [Gold III] Acowdemia III - 21822

[문제 링크](https://www.acmicpc.net/problem/21822)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 379, 정답: 135, 맞힌 사람: 113, 정답 비율: 37.542%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bessie is a busy computer science graduate student. However, even graduate students need friends. As a result, Farmer John has opened a pasture with the explicit purpose of helping Bessie and other cows form lasting friendships.</p>

<p>Farmer John&#39;s pasture can be regarded as a large 2D grid of square &quot;cells&quot; (picture a huge chess board). Each cell is labeled with:</p>

<ul>
	<li>C if the cell contains a cow.</li>
	<li>G if the cell contains grass.</li>
	<li>. if the cell contains neither a cow nor grass.</li>
</ul>

<p>For two distinct cows to become friends, the cows must choose to meet at a grass-covered square that is directly horizontally or vertically adjacent to both of them. During the process, they eat the grass in the grass-covered square, so future pairs of cows cannot use that square as a meeting point. The same cow may become friends with more than one other cow, but no pair of cows may meet and become friends more than once.</p>

<p>Farmer John is hoping that numerous pairs of cows will meet and become friends over time. Please determine the maximum number of new friendships between distinct pairs of cows that can possibly be created by the end of this experience.</p>

### 입력

<p>The first line contains $N$ and $M$ ($N,M \leq 1000$).</p>

<p>The next $N$ lines each contain a string of $M$ characters, describing the pasture.</p>

### 출력

<p>Count the maximum number of pairs of cows that can become friends by the end of the experience.</p>

### 힌트

<p>If we label the cow in row $i$ and column $j$ with coordinates $(i,j)$, then in this example there are cows at $(1,2)$, $(1,5)$, $(2,2)$, $(2,4)$, $(3,1)$, $(3,3)$, $(4,2)$, $(4,3)$, and $(4,5)$. One way for four pairs of cows to become friends is as follows:</p>

<ul>
	<li>The cows at $(2,2)$ and $(3,3)$ eat the grass at $(3,2)$.</li>
	<li>The cows at $(2,2)$ and $(2,4)$ eat the grass at $(2,3)$.</li>
	<li>The cows at $(2,4)$ and $(3,3)$ eat the grass at $(3,4)$.</li>
	<li>The cows at $(2,4)$ and $(1,5)$ eat the grass at $(2,5)$.</li>
</ul>