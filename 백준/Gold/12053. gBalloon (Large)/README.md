# [Gold III] gBalloon (Large) - 12053

[문제 링크](https://www.acmicpc.net/problem/12053)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 18, 맞힌 사람: 15, 정답 비율: 42.857%

### 분류

그리디 알고리즘, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>The G tech company has deployed many balloons. Sometimes, they need to be collected for maintenance at the company&#39;s tower, which is located at horizontal position 0. Each balloon is currently at horizontal position&nbsp;<strong>P<sub>i</sub></strong>&nbsp;and height&nbsp;<strong>H<sub>i</sub></strong>.</p>

<p>G engineers can move a balloon up and down by sending radio signals to tell it to drop ballast or let out air. But they can&#39;t move the balloon horizontally; they have to rely on existing winds to do that.</p>

<p>There are&nbsp;<strong>M</strong>&nbsp;different heights where the balloons could be. The winds at different heights may blow in different directions and at different velocities. Specifically, at height j, the wind has velocity&nbsp;<strong>V<sub>j</sub></strong>, with positive velocities meaning that the wind blows left to right, and negative velocities meaning that the wind blows right to left. A balloon at position P at a height with wind velocity V will be at position P+V after one time unit, P+2V after two time units, etc. If a balloon touches the tower, it is immediately collected.</p>

<p>It costs | H<sub>original</sub>&nbsp;- H<sub>new</sub>&nbsp;| points of energy to move one balloon between two different heights. (This transfer takes no time.) You have&nbsp;<strong>Q</strong>&nbsp;points of energy to spend, although you do not need to spend all of it. What is the least amount of time it will take to collect all the balloons, if you spend energy optimally?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follows. The first line of each case has three integers&nbsp;<strong>N</strong>,&nbsp;<strong>M</strong>, and&nbsp;<strong>Q</strong>, representing the number of balloons, the number of height levels, and the amount of energy available.&nbsp;<br />
The second line has&nbsp;<strong>M</strong>&nbsp;integers; the jth value on this line (counting starting from 0) is the wind velocity at height j.&nbsp;<br />
Then,&nbsp;<strong>N</strong>&nbsp;more lines follow. The ith of these lines consists of two integers,&nbsp;<strong>P<sub>i</sub></strong>&nbsp;and&nbsp;<strong>H<sub>i</sub></strong>, representing the position and height of the ith balloon.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 25.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 1000.</li>
	<li>-100 &le;&nbsp;<strong>V<sub>j</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 10000.</li>
	<li>0 &le;&nbsp;<strong>H<sub>i</sub></strong>&nbsp;&lt;<strong>M</strong>.</li>
	<li>-10000 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&le; 10000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of time units needed to collect all of the balloons, returns IMPOSSIBLE if it&#39;s impossible to collect all the balloons using the energy given.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12053.%E2%80%85gBalloon%E2%80%85(Large)/1cab4677.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12053.%E2%80%85gBalloon%E2%80%85(Large)/1cab4677.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12052/12052.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:372px; width:572px" /></p>

<p>In the sample case, there are two balloons in the sky, and you have 1 energy point to use. The best solution is to immediately spend 1 energy point to move the balloon at position 3, height 3 down to height 2. Once you&#39;ve done that, it will take 2 time units for both balloons to reach the tower.</p>