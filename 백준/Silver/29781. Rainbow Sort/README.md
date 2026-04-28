# [Silver III] Rainbow Sort - 29781

[문제 링크](https://www.acmicpc.net/problem/29781)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 40, 정답: 34, 맞힌 사람: 29, 정답 비율: 87.879%

### 분류

그리디 알고리즘

### 문제 설명

<p>Your friend Charles gives you a challenge. He puts $\mathbf{N}$ cards on a table and arranges them in a line in an order that he chooses. Each card has a single color, and each color can be on one or more cards.</p>

<p>Charles then asks you to write a positive integer on each card without altering his chosen order such that:</p>

<ol>
	<li>The integers you write appear in non-decreasing order when cards are read from left to right.</li>
	<li>Cards of the same color have the same integer written on them.</li>
	<li>Cards of different colors have different integers written on them.</li>
</ol>

<p>Finally, Charles wants you to order the colors in increasing order of written integer. For example, if blue cards have a $2$, red cards have a $5$, and green cards have a $3$, the color order would be blue, green, red.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>Each test case begins with a line containing the integer $\mathbf{N}$. The next line contains $\mathbf{N}$ integers, $\mathbf{S_1}$, $\mathbf{S_2}$, $\dots$, $\mathbf{S_N}$, where $\mathbf{S_i}$ represents the color of the $i$-th card from the left.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the set of colors, once each, listed in the requested order. If it is impossible to write integers in the given cards while adhering to all the rules, $y$ must be <code>IMPOSSIBLE</code> instead.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{S_i} \le 10^5$, for all $i$.</li>
</ul>

### 힌트

<p>In Sample Case #1, there are $3$ different colors on $4$ cards. One possible solution is to write the following integers, in order: $1$, $2$, $2$, and $3$. Notice that the same integer ($2$) is written on both cards of color $8$. Then, the order of the colors is $3$, $8$, $2$.</p>

<p>In Sample Case #2, let $c_8$ and $c_2$ be the integers written in cards of color $8$ and $2$, respectively. If $c_2 \gt c_8$ then the rightmost two cards would not have their integers in non-decreasing order. If $c_2 \lt c_8$ that would happen to the second and third card from the left. Finally, $c_8 = c_2$ is forbidden by one of the rules. Therefore, there is no valid way of writing the integers in this case.</p>