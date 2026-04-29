# [Gold I] Flowing Fountain - 32894

[문제 링크](https://www.acmicpc.net/problem/32894)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 69, 정답: 50, 맞힌 사람: 49, 정답 비율: 74.242%

### 분류

구현, 분리 집합, 스택, 시뮬레이션, 자료 구조

### 문제 설명

<p>Last week, Bill filled a champagne fountain for the first time. Delighted by the champagne pouring from one glass into another, he decided that he wants to organize an even bigger champagne fountain for the next World Finals. He already ordered $n$ glass bowls with different capacities to stack on top of each other to form a huge glass fountain. However, he is still unsure how to pour the champagne into the fountain. One bottle will not be enough and just pouring from the top might not fill every bowl. Bill wants to try out different ways to fill the fountain, but wasting any champagne would be such a shame.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32894.%E2%80%85Flowing%E2%80%85Fountain/2df97341.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32894-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 803px; height: 200px;"></p>

<p style="text-align: center;">Figure F.1: Illustration of Sample Input 2. The $i$th image visualizes the $i$th query of type '<code>+</code>'.</p>

<p>This is your time to shine! You are tasked with writing a program that simulates the process of pouring champagne into a given fountain. With this program, Bill can now pretend to pour certain amounts of champagne into different levels. If a bowl in some level is already filled up, then the champagne spills over to the first level below it with larger capacity. If the next larger level is also filled, the champagne spills over even further until eventually seeping into the ground, wasting the good champagne. Additionally, Bill also wants to know at some times during the simulation process how much champagne currently is in a certain level.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $q$ ($1\leq n, q \leq 3 \cdot 10^5$), the number of levels and the number of queries.</li>
	<li>One line with $n$ distinct integers $c$ ($1\leq c \leq 10^9$), the capacity of each level in litres. The levels are given in order from top to bottom.</li>
	<li>$q$ lines, each describing a query. The first symbol $t$ ($t \in \{$'<code>+</code>', '<code>?</code>'$\}$) describes the type of the query. The format of the rest of the line depends on $t$:
	<ul>
		<li>$t=$'<code>+</code>': Two integers $\ell$ and $x$ follow ($1 \leq \ell \leq n$, $1 \leq x \leq 10^9$), the level into which Bill wants to pour $x$ litres of champagne.</li>
		<li>$t=$'<code>?</code>': One integer $\ell$ follows ($1 \leq \ell \leq n$), the level for which Bill requests the current amount of champagne in litres.</li>
	</ul>
	</li>
</ul>

<p>It is guaranteed that there is at least one query of type '<code>?</code>'.</p>

### 출력

<p>For each query of type '<code>?</code>', output the amount of champagne in the requested level in litres.</p>