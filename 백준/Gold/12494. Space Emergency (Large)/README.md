# [Gold V] Space Emergency (Large) - 12494

[문제 링크](https://www.acmicpc.net/problem/12494)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 37, 맞힌 사람: 20, 정답 비율: 52.632%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>There&#39;s an emergency&mdash;in space! You need to send your fleet&#39;s flagship as quickly as possible from star 0 to star&nbsp;<strong>N</strong>, traveling through the other stars in increasing numerical order along the way (0&rarr;1&rarr;...&rarr;<strong>N</strong>). Your flagship normally travels at a speed of 0.5 parsecs per hour.</p>

<p>In addition to sending your flagship, you can order your engineers to build up to&nbsp;<strong>L</strong>&nbsp;speed boosters at different stars. Building a speed booster takes&nbsp;<strong>t</strong>&nbsp;hours, and all&nbsp;<strong>L</strong>&nbsp;speed boosters can be built in parallel. While your flagship travels from a star with a completed speed booster to the next star, its speed is 1 parsec per hour.</p>

<p>If a speed booster is completed at a star while your flagship is traveling from that star to the next one, your flagship will start moving faster as soon as the speed booster is completed.</p>

<p>How many hours does it take your flagship to get to star&nbsp;<strong>N</strong>&nbsp;if you build speed boosters to make it arrive as soon as possible?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each contains integers,&nbsp;<strong>L</strong>,&nbsp;<strong>t</strong>,&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>C</strong>, followed by&nbsp;<strong>C</strong>&nbsp;integers&nbsp;<strong>a<sub>i</sub></strong>, all separated by spaces.&nbsp;&nbsp;<strong>a<sub>i</sub></strong>&nbsp;is the number of parsecs between star&nbsp;<strong>k*C</strong>+i and star&nbsp;<strong>k*C</strong>+i+1, for all integer values of&nbsp;<strong>k</strong>.</p>

<p>For example, with&nbsp;<strong>N</strong>=8,&nbsp;<strong>C</strong>=3,&nbsp;<strong>a<sub>0</sub></strong>=3,&nbsp;<strong>a<sub>1</sub></strong>=5 and&nbsp;<strong>a<sub>2</sub></strong>=4, the distances between stars are [3, 5, 4, 3, 5, 4, 3, 5].</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 1000.</li>
	<li><strong>C</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>a<sub>i</sub></strong>&nbsp;&le; 10<sup>4</sup>.</li>
	<li>0 &le;&nbsp;<strong>t</strong>&nbsp;&le; 10<sup>11</sup>.</li>
	<li><strong>t</strong>&nbsp;is even.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>6</sup>.</li>
	<li>0 &le;&nbsp;<strong>L</strong>&nbsp;&le; N.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is a single integer: the number of hours it takes to reach star&nbsp;<strong>N</strong>. The answer is guaranteed to always be an integer.</p>

### 힌트

<p>In the second case, we can build one speed booster. The distances between stars are [10, 4]. We build the speed booster on the first star. After 4 hours, our flagship has gone 2 parsecs and the speed booster is complete. It takes our flagship another 8 hours to get to star 1, then 8 more hours to get to star 2, our destination.</p>

<p><strong>Note:</strong>&nbsp;This problem takes place in a universe where the speed of light is much higher than 1 parsec per hour, so we don&#39;t have to worry about special relativistic effects.</p>