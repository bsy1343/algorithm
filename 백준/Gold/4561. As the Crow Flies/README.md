# [Gold II] As the Crow Flies - 4561

[문제 링크](https://www.acmicpc.net/problem/4561)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 5, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

수학, 그래프 이론, 기하학, 트리, 3차원 기하학

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4561.%E2%80%85As%E2%80%85the%E2%80%85Crow%E2%80%85Flies/4b5cbb42.png" data-original-src="https://upload.acmicpc.net/aed79a83-aefe-450a-bdef-01d9a44aacd7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>As president of a startup airline company, you have started a frequent flier program that rewards customers for every mile they travel. As a for-profit company, you have a vested interest in minimizing the number of frequent flier miles that a person can earn on any one trip. To get an idea of how many miles a customer could earn flying the existing network, you&#39;ve decided to write a program.</p>

<p>Assumptions:</p>

<ul>
	<li>A passenger&#39;s itinerary is one-way (no return flight).</li>
	<li>Every itinerary takes the shortest route from the departing city to the destination city.</li>
	<li>Frequent flier miles are counted &quot;as the crow flies&quot; (i.e., the shortest route across the earth&#39;s surface that connects the cities along the route).</li>
	<li>The earth&#39;s surface is a perfect sphere with radius 4000 miles.</li>
</ul>

### 입력

<p>The first line contains a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets. Each data set will be formatted according to the following description:</p>

<p>A single data set has 3 components:</p>

<ol>
	<li><i>Header Line</i>&nbsp;- A single line, &quot;<i><tt>X Y</tt></i>&quot;, where&nbsp;<i>X</i>&nbsp;is the number of cities and&nbsp;<i>Y</i>&nbsp;is the number of flight legs in the airline&#39;s network. Both will be positive integers less than 100.</li>
	<li><i>City List</i>&nbsp;- A list of cities and their locations, one city per line. The line will be of the format
	<p>&quot;<i><tt>C LA NS LO EW</tt></i>&quot; where:</p>

	<ul>
		<li><i><tt>C</tt></i>&nbsp;is the name of the city (no spaces, alphabetical, first letter only upper case)</li>
		<li><i><tt>LA</tt></i>&nbsp;is the degrees of latitude where the city is located (from 0 to 90)</li>
		<li><i><tt>NS</tt></i>&nbsp;is the direction of latitude (&#39;N&#39;orth or &#39;S&#39;outh of the equator)</li>
		<li><i><tt>LO</tt></i>&nbsp;is the degrees of longitude where the city is located (from 0 to 180)</li>
		<li><i><tt>EW</tt></i>&nbsp;is the direction of longitude (&#39;E&#39;ast or &#39;W&#39;est of the prime meridian)</li>
	</ul>
	</li>
	<li><i>Flight List</i>&nbsp;- A list of city pairs of the format &quot;<i><tt>B C</tt></i>&quot; representing different cities that are directly connected by flight legs, one pair per line. Note that &quot;<i><tt>B C</tt></i>&quot; is equivalent to &quot;<i><tt>C B</tt></i>&quot;.</li>
</ol>

<p>Note:</p>

<ul>
	<li>Some longitude measurements can be represented in multiple ways (i.e., 180E = 180W)</li>
	<li>All degrees of latitude and longitude given in the input will be integers.</li>
	<li>The airline&#39;s network is connected (i.e., there is at least one route between any two cities).</li>
</ul>

### 출력

<p>For each data set, output the two cities that are farthest from each other (farthest in the sense that the shortest route between them is the longest of any city pair). You are guaranteed that there will be no ties. Display the city names on the same line, separated by a single space, sorted in dictionary order.</p>