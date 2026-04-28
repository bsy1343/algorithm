# [Platinum V] Cow Beauty Pageant - 5925

[문제 링크](https://www.acmicpc.net/problem/5925)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 349, 정답: 121, 맞힌 사람: 110, 정답 비율: 41.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>Hearing that the latest fashion trend was cows with three spots on their hides, Farmer John has purchased an entire herd of three-spot cows. Unfortunately, fashion trends tend to change quickly, and the most popular current fashion is cows with only one spot!</p>

<p>FJ wants to make his herd more fashionable by painting each of his cows in such a way that merges their three spots into one. The hide of a cow is represented by an N by M grid of characters like this:</p>

<pre>
................
..XXXX....XXX...
...XXXX....XX...
.XXXX......XXX..
........XXXXX...
..XXX....XXX....</pre>

<p>Here, each &#39;X&#39; denotes part of a spot. Two &#39;X&#39;s belong to the same spot if they are vertically or horizontally adjacent (diagonally adjacent does not count), so the figure above has exactly three spots. All of the cows in FJ&#39;s herd have exactly three spots.</p>

<p>FJ wants to use as little paint as possible to merge the three spots into one. In the example above, he can do this by painting only four additional characters with &#39;X&#39;s (the new characters are marked with &#39;*&#39;s below to make them easier to see).</p>

<pre>
................
..XXXX....XXX...
...XXXX*...XX...
.XXXX..**..XXX..
...*....XXXXX...
..XXX....XXX....
</pre>


<p>Please help FJ determine the minimum number of new &#39;X&#39;s he must paint in order to merge three spots into one large spot.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and M (1 &lt;= N,M &lt;= 50).</li>
	<li>Lines 2..1+N: Each line contains a length-M string of &#39;X&#39;s and &#39;.&#39; specifying one row of the cow hide pattern.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of new &#39;X&#39;s that must be added to the input pattern in order to obtain one single spot.</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>The pattern in the input shows a cow hide with three distinct spots.</p>

<h4>Output Details</h4>

<p>Four &#39;X&#39;s suffice to join the three spots into one.</p>