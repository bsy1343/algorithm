# [Platinum II] Log Set (Large) - 12136

[문제 링크](https://www.acmicpc.net/problem/12136)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 13, 정답 비율: 52.000%

### 분류

애드 혹, 다이나믹 프로그래밍, 배낭 문제, 수학

### 문제 설명

<p>The&nbsp;<em>power set</em>&nbsp;of a set S is the set of all subsets of S (including the empty set and S itself). It&#39;s easy to go from a set to a power set, but in this problem, we&#39;ll go in the other direction!<br />
<br />
We&#39;ve started with a set of (not necessarily unique) integers S, found its power set, and then replaced every element in the power set with the sum of elements of that element, forming a new set S&#39;. For example, if S = {-1, 1}, then the power set of S is {{}, {-1}, {1}, {-1, 1}}, and so S&#39; = {0, -1, 1, 0}. S&#39; is allowed to contain duplicates, so if S has N elements, then S&#39; always has exactly 2<sup>N</sup>&nbsp;elements.<br />
<br />
Given a description of the elements in S&#39; and their frequencies, can you determine our original S? It is guaranteed that S exists. If there are multiple possible sets S that could have produced S&#39;, we guarantee that our original set S was the&nbsp;<em>earliest</em>&nbsp;one of those possibilities. To determine whether a set S<sub>1</sub>&nbsp;is earlier than a different set S<sub>2</sub>&nbsp;of the same length, sort each set into nondecreasing order and then examine the leftmost position at which the sets differ. S<sub>1</sub>&nbsp;is earlier iff the element at that position in S<sub>1</sub>&nbsp;is smaller than the element at that position in S<sub>2</sub>.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each consists of one line with an integer&nbsp;<strong>P</strong>, followed by two more lines, each of which has&nbsp;<strong>P</strong>&nbsp;space-separated integers. The first of those lines will have all of the different elements E<sub>1</sub>, E<sub>2</sub>, ..., E<sub><strong>P</strong></sub>&nbsp;that appear in S&#39;, sorted in ascending order. The second of those lines will have the number of times F<sub>1</sub>, F<sub>2</sub>, ..., F<sub><strong>P</strong></sub>&nbsp;that each of those values appears in S&#39;. That is, for any i, the element E<sub>i</sub>&nbsp;appears F<sub>i</sub>&nbsp;times in S&#39;.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 10000.</li>
	<li><strong>F<sub>i</sub></strong>&nbsp;&ge; 1.</li>
	<li>S will contain between 1 and 60 elements.</li>
	<li>-10<sup>10</sup>&nbsp;&le; each E<sub>i</sub>&nbsp;&le; 10<sup>10</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot;, where x is the test case number (starting from 1), followed by the elements of our original set S, separated by spaces, in nondecreasing order. (You will be listing the elements of S directly, and not providing two lists of elements and frequencies as we do for S&#39;.)</p>

### 힌트

<p>In Case #1, you can run to the left and catch all three quail at the same time, 12 meters to the left of the starting position, which takes 3 seconds.<br />
<br />
In Case #2, one optimal strategy is to run to the left until the second quail is caught at -2 m, which takes one second, and then run to the right in pursuit of the first quail, which you will catch at 6 m, taking four more seconds.</p>