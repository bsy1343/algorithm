# [Platinum II] Guessing - 24063

[문제 링크](https://www.acmicpc.net/problem/24063)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 179, 정답: 30, 맞힌 사람: 22, 정답 비율: 14.865%

### 분류

너비 우선 탐색, 많은 조건 분기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 그리디 알고리즘, 수학

### 문제 설명

<p>There are $N$ cards placed face down in a row. A positive integer&nbsp;less than or equal to $m$ is written on each card.</p>

<p>Let $A_i$ be the integer written on the $i$-th card.</p>

<p>Your goal is to guess $A_1, \, A_2, \, \cdots , \, A_N$ correctly.</p>

<p>The only operation you can do is:</p>

<ul>
	<li>choose the $i$-th card and flip it to check the integer written on it. The cost of doing&nbsp;this&nbsp;is $X_i$.</li>
</ul>

<p>Also, you are given the following information:</p>

<ul>
	<li>for each $i = 1, \, 2, \, \cdots , \, M$, $A_{a_i} + A_{b_i} \equiv c_i \pmod m$.</li>
</ul>

<p>What&nbsp;is the minimum cost you need to pay&nbsp;to guess all of&nbsp;$A_1, \, A_2, \, \cdots , \, A_N$ correctly?</p>

### 입력

<p>The first line contains three integers $N$, $M$&nbsp;and $m$.</p>

<p>The second line contains $N$ integers $X_1, \, X_2, \, \cdots, \, X_N$.</p>

<p>This is followed by $M$ lines, the $i$-th line&nbsp;contains three integers $a_i$, $b_i$&nbsp;and $c_i$.</p>

### 출력

<p>If the $N$ integers written on each card can&#39;t be determined&nbsp;no matter how much you pay(i.e. if there&#39;s&nbsp;a contradiction in the information), print only <code>-1</code>.</p>

<p>Otherwise, in the first line, print a single integer&nbsp;&mdash;&nbsp;the minimum cost you need to pay to guess all of $A_i$ correctly.</p>

<p>In the second line, print $N$ integers&nbsp;$A^\prime_1, \, A^\prime_2, \, \cdots , \, A^\prime_N$&nbsp;&mdash;&nbsp;one of the&nbsp;possibilities&nbsp;of&nbsp;$A_1, \, A_2, \, \cdots , \, A_N$.</p>

### 제한

<ul>
	<li>$2&nbsp;\le N \le 2 \times 10^5$</li>
	<li>$1 \le M \le 10^6$</li>
	<li>$2 \le m \le 10^9$</li>
	<li>$1 \le X_i \le 10^4$ ($1 \le i \le N$)</li>
	<li>$1 \le a_i, \, b_i \le N$;&nbsp;$0 \le c_i &lt; m$ ($1 \le i \le M$)</li>
	<li>All values in input are integers.</li>
</ul>