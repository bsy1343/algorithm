# [Gold II] Map of Ninja House - 15544

[문제 링크](https://www.acmicpc.net/problem/15544)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>An old document says that a Ninja House in Kanazawa City was in fact a defensive fortress, which was designed like a maze. Its rooms were connected by hidden doors in a complicated manner, so that any invader would become lost. Each room has at least two doors.</p>

<p>The Ninja House can be modeled by a graph, as shown in Figure 1. A circle represents a room. Each line connecting two circles represents a door between two rooms.</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15544.%E2%80%85Map%E2%80%85of%E2%80%85Ninja%E2%80%85House/f29165db.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15544.%E2%80%85Map%E2%80%85of%E2%80%85Ninja%E2%80%85House/f29165db.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15544/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:216px; width:222px" /></td>
			<td style="text-align:center; width:50%"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15544.%E2%80%85Map%E2%80%85of%E2%80%85Ninja%E2%80%85House/c52d2ca9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15544.%E2%80%85Map%E2%80%85of%E2%80%85Ninja%E2%80%85House/c52d2ca9.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15544/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:220px; width:234px" /></td>
		</tr>
		<tr>
			<td style="text-align:center; width:50%">Figure 1</td>
			<td style="text-align:center; width:50%">Figure 2</td>
		</tr>
	</tbody>
</table>

<p>I decided to draw a map, since no map was available. Your mission is to help me draw a map from the record of my exploration.</p>

<p>I started exploring by entering a single entrance that was open to the outside. The path I walked is schematically shown in Figure 2, by a line with arrows. The rules for moving between rooms are described below.</p>

<p>After entering a room, I first open the rightmost door and move to the next room. However, if the next room has already been visited, I close the door without entering, and open the next rightmost door, and so on. When I have inspected all the doors of a room, I go back through the door I used to enter the room.</p>

<p>I have a counter with me to memorize the distance from the first room. The counter is incremented when I enter a new room, and decremented when I go back from a room. In Figure 2, each number in parentheses is the value of the counter when I have entered the room, i.e., the distance from the first room. In contrast, the numbers not in parentheses represent the order of my visit.</p>

<p>I take a record of my exploration. Every time I open a door, I record a single number, acording to the following rules.</p>

<ol>
	<li>If the opposite side of the door is a new room, I record the number of doors in that room, which is a positive number.</li>
	<li>If it is an already visited room, say R, I record &quot;<em>the distance of R from the first room</em>&quot; minus &quot;<em>the distance of the current room from the first room</em>&quot;, which is a negative number.</li>
</ol>

<p>In the example shown in Figure 2, as the first room has three doors connecting other rooms, I initialy record &quot;3&quot;. Then when I move to the second, third, and fourth rooms, which all have three doors, I append &quot;3 3 3&quot; to the record. When I skip the entry from the fourth room to the first room, the distance difference &quot;-3&quot; (minus three) will be appended, and so on. So, when I finish this exploration, its record is a sequence of numbers &quot;3 3 3 3 -3 3 2 -5 3 2 -5 -3&quot;.</p>

<p>There are several dozens of Ninja Houses in the city. Given a sequence of numbers for each of these houses, you should produce a graph for each house.</p>

### 입력

<p>The first line of the input is a single integer&nbsp;<em>n</em>, indicating the number of records of Ninja Houses I have visited. You can assume that&nbsp;<em>n</em>&nbsp;is less than 100. Each of the foIowing&nbsp;<em>n</em>&nbsp;records consists of numbers recorded on one exploration and a zero as a terminator. Each record consists of one or more lines whose lengths are less than 1000 characters. Each number is delimited by a space or a newline. You can assume that the number of rooms for each Ninja House is less than 100, and the number of doors in each room is less than 40.</p>

### 출력

<p>For each Ninja House of&nbsp;<em>m</em>&nbsp;rooms, the output should consist of&nbsp;<em>m</em>&nbsp;lines. The&nbsp;<em>j</em>-th line of each such&nbsp;<em>m</em>&nbsp;lines should look as follows:</p>

<pre>
<em>i</em> <em>r</em><sub>1</sub> <em>r</em><sub>2</sub>  ... <em>r</em><sub><em>k</em><sub><em>i</em></sub></sub>
</pre>

<p>where&nbsp;<em>r</em><sub>1</sub>, ... ,&nbsp;<em>r<sub>k<sub>i</sub></sub></em>&nbsp;should be rooms adjoining room&nbsp;<em>i</em>, and&nbsp;<em>k<sub>i</sub></em>&nbsp;should be the number of doors in room&nbsp;<em>i</em>. Numbers should be separated by exactly one space character. The rooms should be numbered from 1 in visited order.&nbsp;<em>r</em><sub>1</sub>,&nbsp;<em>r</em><sub>2</sub>, ... ,&nbsp;<em>r<sub>k<sub>i</sub></sub></em>&nbsp;should be in ascending order. Note that the room&nbsp;<em>i</em>&nbsp;may be connected to another room through more than one door. In this case, that room number should appear in&nbsp;<em>r</em><sub>1</sub>, ... ,&nbsp;<em>r<sub>k<sub>i</sub></sub></em>&nbsp;as many times as it is connected by different doors.</p>