# [Gold IV] Turn Left - 22692

[문제 링크](https://www.acmicpc.net/problem/22692)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>Taro got a driver&rsquo;s license with a great effort in his campus days, but unfortunately there had been no opportunities for him to drive. He ended up obtaining a gold license.</p>

<p>One day, he and his friends made a plan to go on a trip to Kyoto with you. At the end of their meeting, they agreed to go around by car, but there was a big problem; none of his friends was able to drive a car. Thus he had no choice but to become the driver.</p>

<p>The day of our departure has come. He is going to drive but would never turn to the right for fear of crossing an opposite lane (note that cars keep left in Japan). Furthermore, he cannot U-turn for the lack of his technique. The car is equipped with a car navigation system, but the system cannot search for a route without right turns. So he asked to you: &ldquo;I hate right turns, so, could you write a program to find the shortest left-turn-only route to the destination, using the road map taken from this navigation system?&rdquo;</p>

### 입력

<p>The input consists of multiple data sets. The first line of the input contains the number of data sets. Each data set is described in the format below:</p>

<pre>
<i>m n</i>
<i>name</i><sub>1</sub> <i>x</i><sub>1</sub> <i>y</i><sub>1</sub>
...
<i>name</i><sub><i>m</i></sub> <i>x</i><sub><i>m</i></sub> <i>y</i><sub><i>m</i></sub>
<i>p</i><sub>1</sub> <i>q</i><sub>1</sub>
...
<i>p</i><sub><i>n</i></sub> <i>q</i><sub><i>n</i></sub>
<i>src dst</i>
</pre>

<p><i>m</i>&nbsp;is the number of intersections.&nbsp;<i>n</i>&nbsp;is the number of roads.&nbsp;<i>name<sub>i</sub></i>&nbsp;is the name of the&nbsp;<i>i</i>-th intersection. (<i>x<sub>i</sub></i>,&nbsp;<i>y<sub>i</sub></i>) are the integer coordinates of the&nbsp;<i>i</i>-th intersection, where the positive&nbsp;<i>x</i>&nbsp;goes to the east, and the positive&nbsp;<i>y</i>&nbsp;goes to the north.&nbsp;<i>p<sub>j</sub></i>&nbsp;and&nbsp;<i>q<sub>j</sub></i>&nbsp;are the intersection names that represent the endpoints of the&nbsp;<i>j</i>-th road. All roads are bidirectional and either vertical or horizontal.&nbsp;<i>src</i>&nbsp;and&nbsp;<i>dst</i>&nbsp;are the names of the source and destination intersections, respectively.</p>

<p>You may assume all of the followings:</p>

<ul>
	<li>2 &le;&nbsp;<i>m</i>&nbsp;&le; 1000, 0 &le;&nbsp;<i>x<sub>i</sub></i>&nbsp;&le; 10000, and 0 &le;&nbsp;<i>y<sub>i</sub></i>&nbsp;&le; 10000;</li>
	<li>each intersection name is a sequence of one or more alphabetical characters at most 25 character long;</li>
	<li>no intersections share the same coordinates;</li>
	<li>no pair of roads have common points other than their endpoints;</li>
	<li>no road has intersections in the middle;</li>
	<li>no pair of intersections has more than one road;</li>
	<li>Taro can start the car in any direction; and</li>
	<li>the source and destination intersections are different.</li>
</ul>

<p>Note that there may be a case that an intersection is connected to less than three roads in the input data; the rode map may not include smaller roads which are not appropriate for the non-local people. In such a case, you still have to consider them as intersections when you go them through.</p>

### 출력

<p>For each data set, print how many times&nbsp;<i>at least</i>&nbsp;Taro needs to pass intersections when he drive the route of the shortest distance without right turns. The source and destination intersections must be considered as &ldquo;passed&rdquo; (thus should be counted) when Taro starts from the source or arrives at the destination. Also note that there may be more than one shortest route possible.</p>

<p>Print &ldquo;impossible&rdquo; if there is no route to the destination without right turns.</p>