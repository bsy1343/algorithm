# [Gold IV] Picking Up Chicks (Large) - 12580

[문제 링크](https://www.acmicpc.net/problem/12580)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 26, 맞힌 사람: 25, 정답 비율: 89.286%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>A flock of chickens are running east along a straight, narrow road. Each one is running with its own constant speed. Whenever a chick catches up to the one in front of it, it has to slow down and follow at the speed of the other chick. You are in a mobile crane behind the flock, chasing the chicks towards the barn at the end of the road. The arm of the crane allows you to pick up any chick momentarily, let the chick behind it pass underneath and place the picked up chick back down. This operation takes no time and can only be performed on a pair of chicks that are immediately next to each other, even if 3 or more chicks are in a row, one after the other.</p>

<p>Given the initial locations (<strong>X<sub>i</sub></strong>) at time 0 and natural speeds (<strong>V<sub>i</sub></strong>) of the chicks, as well as the location of the barn (<strong>B</strong>), what is the minimum number of swaps you need to perform with your crane in order to have at least&nbsp;<strong>K</strong>&nbsp;of the&nbsp;<strong>N</strong>&nbsp;chicks arrive at the barn no later than time&nbsp;<strong>T</strong>?</p>

<p>You may think of the chicks as points moving along a line. Even if 3 or more chicks are at the same location, next to each other, picking up one of them will only let one of the other two pass through. Any swap is instantaneous, which means that you may perform multiple swaps at the same time, but each one will count as a separate swap.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>C</strong>.&nbsp;&nbsp;<strong>C</strong>&nbsp;test cases follow. Each test case starts with 4 integers on a line --&nbsp;<strong>N</strong>,&nbsp;<strong>K</strong>,&nbsp;<strong>B</strong>&nbsp;and&nbsp;<strong>T</strong>. The next line contains the&nbsp;<strong>N</strong>&nbsp;different integers&nbsp;<strong>X<sub>i</sub></strong>, in increasing order. The line after that contains the&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>V<sub>i</sub></strong>. All distances are in meters; all speeds are in meters per second; all times are in seconds.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100;</li>
	<li>1 &le;&nbsp;<strong>B</strong>&nbsp;&le; 1,000,000,000;</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 1,000;</li>
	<li>0 &le;&nbsp;<strong>X<sub>i</sub></strong>&nbsp;&lt;&nbsp;<strong>B</strong>;</li>
	<li>1 &le;&nbsp;<strong>V<sub>i</sub></strong>&nbsp;&le; 100;</li>
	<li>All the&nbsp;<strong>X<sub>i</sub></strong>&#39;s will be distinct and in increasing order.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50;</li>
	<li>0 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>;</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&nbsp;<strong>S</strong>&quot;, where x is the case number (starting from 1) and&nbsp;<strong>S</strong>&nbsp;is the smallest number of required swaps, or the word &quot;IMPOSSIBLE&quot;.</p>