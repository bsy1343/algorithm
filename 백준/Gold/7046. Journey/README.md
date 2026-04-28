# [Gold III] Journey - 7046

[문제 링크](https://www.acmicpc.net/problem/7046)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 27, 맞힌 사람: 25, 정답 비율: 52.083%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>There are n cities in Byteland (numbered from 1 to n), connected by bidirectional roads. The king of Byteland is not very generous, so there are only n-1 roads, but they connect the cities in such a way that it is possible to travel from each city to any other city.</p>

<p>One day, a traveller Byterider arrived in the city number k. He was planning to make a journey starting in the city k and visiting on his way cities m<sub>1</sub> , m<sub>2</sub> , ..., m<sub>j</sub> (not necessarily in this order) - the numbers m i are all different and they are also different from k. Byterider - like every traveller - has only a limited amount of money, so he would like to visit all the cities that he has planned to visit using the shortest possible path (starting in the city k). A path is one road or a sequence of roads, where every next road begins in the city where the previous one ends. Help Byterider to determine the length of the shortest path for his journey.</p>

<p>Write a program which</p>

<ul>
	<li>reads from the standard input:
	<ul>
		<li>the description of the roads connecting the cities of Byteland,</li>
		<li>the number of the city where Byterider arrived,</li>
		<li>a list of cities which Byterider would like to visit.</li>
	</ul>
	</li>
	<li>determines the minimum length of Byterider&#39;s journey,</li>
	<li>writes the result to the standard output</li>
</ul>

### 입력

<p>The first line of the standard input contains two integers n and k separated by a single space (2 &le; n &le; 50000, 1 &le; k &le; n), n is the number of cities in Byteland and k is the number of the first city on Byterider&#39;s path. Each of the following n-1 lines contains the description of one road in Byteland. Line (i + 1) (for 1 &le; i &le; n-1) contains three integers a<sub>i</sub>, b<sub>i</sub> and d<sub>i</sub> separated by single spaces (1 &le; ai, b<sub>i</sub> &le; n, 1 &le;&nbsp;d<sub>i</sub> &le; 1000), a<sub>i</sub> and b<sub>i</sub> are the cities connected by the road, and d<sub>i</sub> is the length of the road. Line (n + 1) contains one integer j - the number of cities which Byterider would like to visit (1 &le; j &le; n-1). The next line contains j different integers m<sub>i</sub> separated by single spaces - the numbers of the cities that Byterider would like to visit (1 &le; m<sub>i</sub> &le; n, m<sub>i</sub> &ne; k).</p>

### 출력

<p>The first and only line of the standard output should contain exactly one integer: the length of the shortest path for Byterider&#39;s journey.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/0048dcd8-1130-4bd3-b23c-103ea541eea2/-/preview/" style="width: 162px; height: 143px;" /></p>