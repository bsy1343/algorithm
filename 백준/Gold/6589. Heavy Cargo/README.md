# [Gold IV] Heavy Cargo - 6589

[문제 링크](https://www.acmicpc.net/problem/6589)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 151, 정답: 89, 맞힌 사람: 80, 정답 비율: 59.701%

### 분류

자료 구조, 그래프 이론, 최단 경로, 해시를 사용한 집합과 맵, 데이크스트라, 분리 집합, 최소 스패닝 트리

### 문제 설명

<p><i>Big Johnsson Trucks Inc.</i>&nbsp;is a company specialized in manufacturing big trucks. Their latest model, the&nbsp;<i>Godzilla V12</i>, is so big that the amount of cargo you can transport with it is never limited by the truck itself. It is only limited by the weight restrictions that apply for the roads along the path you want to drive.</p>

<p>Given start and destination city, your job is to determine the maximum load of the&nbsp;<i>Godzilla V12</i>&nbsp;so that there still exists a path between the two specified cities.</p>

### 입력

<p>&nbsp;</p>

<p>The input file will contain one or more test cases. The first line of each test case will contain two integers: the number of cities&nbsp;<i>n (2 &le; n &le; 200)</i>&nbsp;and the number of road segments&nbsp;<i>r (1 &le; r &le; 19900)</i>&nbsp;making up the street network.</p>

<p>Then&nbsp;<i>r</i>&nbsp;lines will follow, each one describing one road segment by naming the two cities connected by the segment and giving the weight limit for trucks that use this segment. Names are not longer than 30 characters and do not contain white-space characters. Weight limits are integers in the range 0 - 10000. Roads can always be travelled in both directions.</p>

<p>The last line of the test case contains two city names: start and destination.</p>

<p>Input will be terminated by two values of 0 for&nbsp;<i>n</i>&nbsp;and&nbsp;<i>r</i>.</p>

### 출력

<p>For each test case, print three lines:</p>

<ul>
	<li>a line saying &quot;Scenario #<em>x</em>&quot; where <em>x</em> is the number of the test case</li>
	<li>a line saying &quot;<em>y</em> tons&quot; where <em>y</em> is the maximum possible load</li>
	<li>a blank line</li>
</ul>