# [Platinum II] The Valley of Mexico - 5481

[문제 링크](https://www.acmicpc.net/problem/5481)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

다이나믹 프로그래밍, 기하학, 구현

### 문제 설명

<p>Mexico City is built in a beautiful valley known as the Valley of Mexico which, years ago, was mostly a lake. Around the year 1300, Aztec religious leaders decreed that the lake&rsquo;s center be filled in order to build the capital of their empire. Today, the lake is completely covered.</p>

<p>Before the Aztecs arrived, c cities were located around the lake on its shores. Some of these cities established commercial agreements. Goods were traded, using boats, between cities that had a commercial agreement. It was possible to connect any two cities by a line segment through the lake.</p>

<p>Eventually, the kings of the cities decided to organize this commerce. They designed a commerce route that connected every city around the lake. The route met the following requirements:</p>

<ul>
	<li>It could start in any of the cities, visited each of the cities around the lake, and finally ended in another city different from the starting city.</li>
	<li>The route visited each city exactly once.</li>
	<li>Every pair of consecutively visited cities in the route had a commercial agreement.</li>
	<li>Every pair of consecutively visited cities in the route was connected by a line segment.</li>
	<li>To avoid crashes between boats, the route never crossed itself.</li>
</ul>

<p><img alt="" src="https://upload.acmicpc.net/6c872627-5e87-4ed4-baea-bbc5fa61711c/-/preview/" style="width: 206px; height: 225px; float: left;" />The figure shows the lake and the cities around it. The lines (both thick and thin) represent commercial agreements between cities. The thick lines represent a commerce route starting in city 2 and ending in city 5.</p>

<p>This route never crosses itself. It would not be legal, for example, to construct a route that went from 2 to 6 to 5 to 1, since the route would cross itself.</p>

<p>Cities in the lake are numbered from 1 through c moving in clockwise direction.</p>

<p>Write a program that, given both the count c of cities and a list of the commercial agreements between them, constructs a commerce route that meets the above requirements.</p>

### 입력

<ul>
	<li>LINE 1: Contains integer c</li>
	<li>LINE 2: Contains an integer n that represents the number of commercial agreements</li>
	<li>NEXT n LINES: Each line represents a unique commercial agreement. Every line contains two space-separated integers that represent the two cities involved in the agreement.</li>
</ul>

### 출력

<p>If it&rsquo;s possible to construct the commerce route, write c lines, each with an integer that represents the order in which the cities are visited in the commerce route. If it&rsquo;s not possible to construct a commerce route that meets all the requirements, output a single line containing the number -1.</p>

### 제한

<ul>
	<li>3 &le; c &le; 1000 Number of cities around the lake.</li>
</ul>