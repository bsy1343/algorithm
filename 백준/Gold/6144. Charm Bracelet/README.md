# [Gold V] Charm Bracelet - 6144

[문제 링크](https://www.acmicpc.net/problem/6144)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1181, 정답: 567, 맞힌 사람: 441, 정답 비율: 50.285%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Bessie has gone to the mall&#39;s jewelry store and spies a charm bracelet. Of course, she&#39;d like to fill it with the best charms possible from the N (1 &lt;= N &lt;= 3,402) available charms. Each charm i in the supplied list has a weight W_i (1 &lt;= W_i &lt;= 400), a &#39;desirability&#39; factor D_i (1 &lt;= D_i &lt;= 100), and can be used at most once. &nbsp;Bessie can only support a charm bracelet whose weight is no more than M (1 &lt;= M &lt;= 12,880).</p>

<p>Given that weight limit as a constraint and a list of the charms with their weights and desirability rating, deduce the maximum possible sum of ratings.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 describes charm i with two space-separated integers: W_i and D_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer that is the greatest sum of charm desirabilities that can be achieved given the weight constraints</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Without the second possible charm, the 4+12+7=23 is the highest value for weight 1+2+3 &lt;= 6</p>

<p>&nbsp;</p>