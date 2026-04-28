# [Gold III] Road Construction - 17325

[문제 링크](https://www.acmicpc.net/problem/17325)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 23, 맞힌 사람: 12, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>On planet W, there exists&nbsp;<var>n</var>&nbsp;countries. To promote the economic growth of each country, the kings of the countries have decided to construct bidirectional roads to ensure that all countries are connected. However, since they&#39;re all incredibly stingy, they wish to construct exactly&nbsp;<var>n</var>&nbsp;&minus; 1 roads.</p>

<p>Constructing each road will require a cost. This cost is equal to the length of the road multiplied by the absolute difference of the number of countries on each side of the road. For example, the road represented by a dashed line in the figure below has, respectively, 2 and 4 countries on each of its sides. If this road has a length of 1, then the cost will be 1&times;|2 &minus; 4| = 2. The circled numbers represent the numbers of the countries.</p>

<p><img alt="" src="https://upload.acmicpc.net/b3225916-b614-4ddb-ae58-883975870f8c/-/preview/" /><br />
Since both the number of countries and the number of ways to construct the roads are extremely large, as well the construction costs for each way is hard to calculate by humans, the kings have decided to hire a person to design a software to do this. This piece of software should be able calculate the total cost of constructing all the roads, given a way to construct them. Please help the kings to write such a program.</p>

### 입력

<p>The first line contains an integer&nbsp;<var>n</var>, representing the number countries on planet W. Countries are numbered from 1 to&nbsp;<var>n</var>.</p>

<p>For the following&nbsp;<var>n</var>&nbsp;&minus; 1 lines, each line will describe the construction of a single road. The&nbsp;<var>i</var>-th of these lines will contain three integers&nbsp;<var>a<sub>i</sub></var>,&nbsp;<var>b<sub>i</sub></var>, and&nbsp;<var>c<sub>i</sub></var>, indicating that the&nbsp;<var>i</var>-th bidirectional road connects countries&nbsp;<var>a<sub>i</sub></var>&nbsp;and&nbsp;<var>b<sub>i</sub></var>, and has a length of&nbsp;<var>c<sub>i</sub></var>.</p>

### 출력

<p>Output a single integer, the total cost of constructing all the roads.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<var>a<sub>i</sub></var>,&nbsp;<var>b<sub>i</sub></var>&nbsp;&le;&nbsp;<var>n</var></li>
	<li>2 &le;&nbsp;<i>n&nbsp;</i>&le; 10<sup>6</sup></li>
	<li>0 &le;&nbsp;<var>c<sub>i</sub></var>&nbsp;&le; 10<sup>6</sup></li>
</ul>