# [Gold II] Theme Park (Large) - 12594

[문제 링크](https://www.acmicpc.net/problem/12594)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 31, 맞힌 사람: 30, 정답 비율: 54.545%

### 분류

수학, 구현, 그래프 이론, 시뮬레이션, 함수형 그래프

### 문제 설명

<p>Roller coasters are so much fun! It seems like everybody who visits the theme park wants to ride the roller coaster. Some people go alone; other people go in groups, and don&#39;t want to board the roller coaster unless they can all go together. And&nbsp;<em>everyone</em>&nbsp;who rides the roller coaster wants to ride again. A ride costs 1 Euro per person; your job is to figure out how much money the roller coaster will make today.</p>

<p>The roller coaster can hold&nbsp;<strong>k</strong>&nbsp;people at once. People queue for it in groups. Groups board the roller coaster, one at a time, until there are no more groups left or there is no room for the next group; then the roller coaster goes, whether it&#39;s full or not. Once the ride is over, all of its passengers re-queue in the same order. The roller coaster will run&nbsp;<strong>R</strong>&nbsp;times in a day.</p>

<p>For example, suppose&nbsp;<strong>R</strong>=4,&nbsp;<strong>k</strong>=6, and there are four groups of people with sizes: 1, 4, 2, 1. The first time the roller coaster goes, the first two groups [1, 4] will ride, leaving an empty seat (the group of 2 won&#39;t fit, and the group of 1 can&#39;t go ahead of them). Then they&#39;ll go to the back of the queue, which now looks like 2, 1, 1, 4. The second time, the coaster will hold 4 people: [2, 1, 1]. Now the queue looks like 4, 2, 1, 1. The third time, it will hold 6 people: [4, 2]. Now the queue looks like [1, 1, 4, 2]. Finally, it will hold 6 people: [1, 1, 4]. The roller coaster has made a total of 21 Euros!</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, with each test case consisting of two lines. The first line contains three space-separated integers:&nbsp;<strong>R</strong>,&nbsp;<strong>k</strong>&nbsp;and&nbsp;<strong>N</strong>. The second line contains&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>g<sub>i</sub></strong>, each of which is the size of a group that wants to ride.&nbsp;&nbsp;<strong>g<sub>0</sub></strong>&nbsp;is the size of the first group,&nbsp;<strong>g<sub>1</sub></strong>&nbsp;is the size of the second group, etc.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li><strong>g<sub>i</sub></strong>&nbsp;&le;&nbsp;<strong>k</strong>.</li>
	<li>1 &le;&nbsp;<strong>R</strong>&nbsp;&le; 10<sup>8</sup>.</li>
	<li>1 &le;&nbsp;<strong>k</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<strong>g<sub>i</sub></strong>&nbsp;&le; 10<sup>7</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of Euros made by the roller coaster.</p>