# [Platinum IV] Catch Them All - 24008

[문제 링크](https://www.acmicpc.net/problem/24008)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 9, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 최단 경로, 확률론, 분할 정복을 이용한 거듭제곱, 선형대수학, 플로이드–워셜

### 문제 설명

<p>After the release of&nbsp;<i><b>Codejamon Go</b></i>, you, like many of your friends, took to the streets of your city to catch as many of the furry little creatures as you could. The objective of the game is to catch&nbsp;<i>Codejamon</i>&nbsp;that appear around your city by going to their locations. You are wondering how long it would take for you to catch them all!</p>

<p>Your city consists of&nbsp;<b>N</b>&nbsp;locations numbered from 1 to&nbsp;<b>N</b>. You start at location 1. There are&nbsp;<b>M</b>&nbsp;bidirectional roads (numbered from 1 to&nbsp;<b>M</b>). The i-th road connects a pair of distinct locations (U<sub>i</sub>, V<sub>i</sub>), and it takes&nbsp;<b>D<sub>i</sub></b>&nbsp;minutes to travel on it in either direction. It is guaranteed that it is possible to reach any other location from location 1 by travelling on one or more roads.</p>

<p>At time 0, a&nbsp;<i>Codejamon</i>&nbsp;will appear at a uniformly random location other than your current location (which is location 1 at time 0). Uniformly random means that the probability that it will appear at each of the&nbsp;<b>N</b>&nbsp;- 1 locations other than your current location is exactly 1 / (<b>N</b>&nbsp;- 1). The instant that a&nbsp;<i>Codejamon</i>&nbsp;appears, you can immediately start moving towards it. When you arrive at a location containing a&nbsp;<i>Codejamon</i>, you instantly catch it, and then a new&nbsp;<i>Codejamon</i>&nbsp;will instantly appear at a uniformly random location other than your current location, and so on. Notice that only one Codejamon is present at any given time, and you must catch the existing one before the next will appear.</p>

<p>Given the layout of your city, calculate the expected time to catch&nbsp;<b>P</b>&nbsp;<i>Codejamon</i>, assuming that you always take the fastest possible route between any two locations.</p>

### 입력

<p>The input starts with one line containing one integer&nbsp;<b>T</b>: the number of test cases.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>Each test case begins with one line containing 3 integers&nbsp;<b>N</b>,&nbsp;<b>M</b>&nbsp;and&nbsp;<b>P</b>, indicating the number of locations, roads, and&nbsp;<i>Codejamon</i>&nbsp;to catch, respectively.</p>

<p>Then, each test case continues with&nbsp;<b>M</b>&nbsp;lines; the i-th of these lines contains three integers&nbsp;<b>U<sub>i</sub></b>,&nbsp;<b>V<sub>i</sub></b>&nbsp;and&nbsp;<b>D<sub>i</sub></b>, indicating that the i-th road is between locations&nbsp;<b>U<sub>i</sub></b>&nbsp;and&nbsp;<b>V<sub>i</sub></b>, and it takes&nbsp;<b>D<sub>i</sub></b>&nbsp;minutes to travel on it in either direction.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the expected time in minutes to catch&nbsp;<b>P</b>&nbsp;<i>Codejamon</i>. Your answer will be considered correct if it is within an absolute or relative error of 10<sup>-4</sup>&nbsp;of the correct answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li><b>N</b>&nbsp;- 1 &le;&nbsp;<b>M</b>&nbsp;&le; (<b>N</b>&nbsp;* (<b>N</b>&nbsp;- 1)) / 2.</li>
	<li>1 &le;&nbsp;<b>D<sub>i</sub></b>&nbsp;&le; 10, for all i.</li>
	<li>1 &le;&nbsp;<b>U<sub>i</sub></b>&nbsp;&lt;&nbsp;<b>V<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li>For all i and j with i &ne; j,&nbsp;<b>U<sub>i</sub></b>&nbsp;&ne;&nbsp;<b>U<sub>j</sub></b>&nbsp;and/or&nbsp;<b>V<sub>i</sub></b>&nbsp;&ne;&nbsp;<b>V<sub>j</sub></b>. (There is at most one road between any two locations.)</li>
	<li>It is guaranteed that it is possible to reach any other location from location 1 by travelling on one or more roads.</li>
</ul>

### 힌트

<p>In Sample Case #1, there is only one Codejamon for us to catch. With equal probability, it will appear at locations 2, 3, 4, and 5, which are at distances of 1, 3, 2, and 3, respectively, from our starting location 1. So the expected time it will take is (1 + 3 + 2 + 3) / 4 = 2.25 minutes.</p>

<p>In Sample Case #2, there are only two locations connected by one road. Every time a Codejamon appears, it will be in the location other than our current one, and we will have to take the road to get there. So we take the road 200 times, taking 5 minutes each time, for a total of 1000 minutes.</p>

<p>Sample Case #3 uses the same map as Sample Case #1. There are 16 ordered-pair possibilities for where the two Codejamon will appear, and doing the math yields an expected 87/16 = 5.4375 minutes.</p>

<p>In Sample Case #4, the one Codejamon we need to catch will appear at location 2 or location 3. If it appears at location 2, it is better for us to get there in two minutes via the 1-to-3 and 3-to-2 roads, instead of taking the more time-consuming 1-to-2 road. So the expected time taken is (2 + 1) / 2 = 1.5 minutes.</p>