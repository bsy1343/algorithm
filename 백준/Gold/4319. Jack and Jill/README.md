# [Gold I] Jack and Jill - 4319

[문제 링크](https://www.acmicpc.net/problem/4319)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 2, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Ever since the incident on the hill, Jack and Jill dislike each other and wish to remain as distant as possible. Jack and Jill must attend school each day; Jack attends a boys&#39; school while Jill attends a girls&#39; school. Both schools start at the same time. You have been retained by their lawyers to arrange routes and a schedule that Jack and Jill will adhere to so as to maximize the closest straight-line distance between them at any time during their trip to school.</p>

<p>Jack and Jill live in a town laid out as an&nbsp;<i>n</i>&nbsp;by&nbsp;<i>n</i>&nbsp;square grid (<i>n</i>&nbsp;&lt;=&nbsp;<i>30</i>). It takes 1 minute to walk from one location to an adjacent location. In maximizing the distance between Jack and Jill you need consider only the distance between the locations they visit (i.e. you need not consider any intermediate points on the path they take from grid location to grid location). Some locations are impassable due to being occupied by rivers, buildings, etc. Jack must start at his house and walk continuously until he gets to school. Jill must start at her house at the same time as Jack and walk continuously until she arrives at her school. Jack&#39;s house and school are impassable to Jill while Jill&#39;s house and school are impassable to Jack. Other grid locations that are impassable to both Jack and Jill are given in the input.</p>

### 입력

<p>Input will consist of several test cases. Each test case will consist of&nbsp;<i>n</i>, followed by&nbsp;<i>n</i>&nbsp;lines with&nbsp;<i>n</i>&nbsp;characters representing a map of the town. In the map, Jack&#39;s house is represented by &#39;H&#39;, Jack&#39;s school is represented by &#39;S&#39;, Jill&#39;s house is represented by &#39;h&#39;, Jill&#39;s school is represented by &#39;s&#39;, impassable locations are represented by &#39;*&#39;, and all other locations are represented by &#39;.&#39; You may assume the normal cartographic convention that North is at the top of the page and West is to the left. A line containing 0 follows the last case.</p>

### 출력

<p>For each input case you should give three lines of output containing:</p>

<ul>
	<li>the closest that Jack and Jill come during the schedule (to 2 decimal places)</li>
	<li>Jack&#39;s route</li>
	<li>Jill&#39;s route.</li>
</ul>

<p>Each route is a sequence of directions that Jack or Jill should follow for each minute from the start time until arriving at school. Each direction is one of &#39;N&#39;, &#39;S&#39;, &#39;E&#39;, or &#39;W&#39;. If several pairs of routes are possible, any one will do. You may assume there is at least one solution. Leave a blank line between the output for successive cases.</p>