# [Platinum II] Stock Charts (Large) - 12634

[문제 링크](https://www.acmicpc.net/problem/12634)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 110, 정답: 74, 맞힌 사람: 66, 정답 비율: 67.347%

### 분류

이분 매칭

### 문제 설명

<p>You&#39;re in the middle of writing your newspaper&#39;s end-of-year economics summary, and you&#39;ve decided that you want to show a number of charts to demonstrate how different stocks have performed over the course of the last year. You&#39;ve already decided that you want to show the price of&nbsp;<strong>n</strong>&nbsp;different stocks, all at the same&nbsp;<strong>k</strong>&nbsp;points of the year.</p>

<p>A&nbsp;<em>simple chart</em>&nbsp;of one stock&#39;s price would draw lines between the points (0, price<sub>0</sub>), (1, price<sub>1</sub>), ... , (k-1, price<sub>k-1</sub>), where price<sub>i</sub>&nbsp;is the price of the stock at the&nbsp;<em>i</em>th point in time.</p>

<p>In order to save space, you have invented the concept of an&nbsp;<em>overlaid chart</em>. An overlaid chart is the combination of one or more simple charts, and shows the prices of multiple stocks (simply drawing a line for each one). In order to avoid confusion between the stocks shown in a chart, the lines in an overlaid chart may not cross or touch.</p>

<p>Given a list of&nbsp;<em>n</em>&nbsp;stocks&#39; prices at each of&nbsp;<em>k</em>&nbsp;time points, determine the minimum number of overlaid charts you need to show all of the stocks&#39; prices.</p>

### 입력

<p>The first line of input will contain a single integer&nbsp;<strong>T</strong>, the number of test cases. After this will follow&nbsp;<strong>T</strong>&nbsp;test cases on different lines, each of the form:</p>

<pre>
n k
price<sub>0,0</sub> price<sub>0,1</sub> ... price<sub>0,k-1</sub>
price<sub>1,0</sub> price<sub>1,1</sub> ... price<sub>1,k-1</sub>
...
price<sub>n-1,0</sub> price<sub>n-1,1</sub> ... price<sub>n-1,k-1</sub></pre>

<p>Where price<sub>i,j</sub>&nbsp;is an integer, the price of the&nbsp;<em>i</em>th stock at time&nbsp;<em>j</em>.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>2 &le;&nbsp;<strong>k</strong>&nbsp;&le; 25</li>
	<li>0 &le; price<sub>i,j</sub>&nbsp;&le; 1000000</li>
	<li>1 &le;&nbsp;<strong>n</strong>&nbsp;&le; 100</li>
</ul>

### 출력

<p>For each test case, a single line containing &quot;Case #X: Y&quot;, where&nbsp;<em>X</em>&nbsp;is the number of the test-case (1-indexed) and&nbsp;<em>Y</em>&nbsp;is the minimum number of overlaid charts needed to show the prices of all of the stocks.</p>