# [Gold III] Killjoys' Conference - 25255

[문제 링크](https://www.acmicpc.net/problem/25255)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 41, 맞힌 사람: 37, 정답 비율: 77.083%

### 분류

수학, 그래프 이론, 그래프 탐색, 조합론, 깊이 우선 탐색, 이분 그래프

### 문제 설명

<p>The General Counsel for Peaceful Congregations (GCPC) has a very, very stressful job. Almost every day they are approached by someone who has to organise a meeting whose attendees do not really get along. More specifically, in any group of attendees there may be several pairs of people who are known to dislike each other. Nevertheless people sometimes need to meet, so the general strategy of the GCPC is to split up the meeting attendees into two groups. These groups will then meet in different rooms and GCPC employees will deliver messages back and forth between the two rooms. Let&#39;s call these two rooms the East and the West room -- for no particular reason. To ensure peaceful and productive meetings, the GCPC assigns people to the East and West room such that no two people in each room dislike each other.</p>

<p>Over time, the process of assigning people to the East and West rooms has become a bit tedious, so you decided to undertake a little experiment. Some of the GCPC&#39;s clients schedule the same meeting with the exact same people every year. To keep things interesting, you want to use a new assignment of people to the East and West rooms for each meeting. If the editions of the meeting are numbered starting from $1$, what is the number of the first meeting where you are forced to reuse an assignment of people that you have already used before? Note that simply swapping the rooms, i.e.\ assigning the people from the East room to the West room and vice versa, is not considered a different assignment -- after all, the same people will meet. Since your investigation will almost certainly only be of an academic nature, you are not interested in the exact value. It will suffice to find the remainder when dividing the result by a given odd prime number $p$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $n$, $m$ and $p$ ($1 \le n \le 10^6$, $0 \le m \le 10^6$, $3 \le p \le 10^9$), where $n$ is the number of people attending the meeting, $m$ is the number of known dislikes between them and $p$ is an odd prime number. The attendees of the meeting are numbered from $1$ to $n$, inclusive.</li>
	<li>$m$ lines, each with two integers $a$ and $b$ ($1 \le a,b \le n, a \neq b$), specifying that attendees $a$ and $b$ dislike each other.</li>
</ul>

### 출력

<p>Output one integer, the number of the first edition where an assignment must re-occur. Output this number modulo $p$. If it is impossible to assign the people to the East and West rooms such that no two people disliking each other are placed in the same room, output <code>impossible</code>.</p>

### 힌트

<p>In the first sample, you could use the following room assignments:</p>

<table class="table table-bordered table-center-20">
	<thead>
		<tr>
			<th> </th>
			<th>East</th>
			<th>West</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>Year 1</th>
			<td>1,3</td>
			<td>2,4</td>
		</tr>
		<tr>
			<th>Year 2</th>
			<td>1,4</td>
			<td>2,3</td>
		</tr>
		<tr>
			<th>Year 3</th>
			<td>2,4</td>
			<td>1,3</td>
		</tr>
	</tbody>
</table>

<p>In the third year the groups are the same as in the first year, and there is no set of assignments that avoids repetitions this for longer than that.</p>

<p>In the second sample, an optimal set of assignments is given as follows:</p>

<table class="table table-bordered table-center-20">
	<thead>
		<tr>
			<th> </th>
			<th>East</th>
			<th>West</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>Year 1</th>
			<td>1,3,5</td>
			<td>2,4</td>
		</tr>
		<tr>
			<th>Year 2</th>
			<td>1,4,5</td>
			<td>2,3</td>
		</tr>
		<tr>
			<th>Year 3</th>
			<td>2,4,5</td>
			<td>1,3</td>
		</tr>
		<tr>
			<th>Year 4</th>
			<td>2,3,5</td>
			<td>1,4</td>
		</tr>
		<tr>
			<th>Year 5</th>
			<td>1,3,5</td>
			<td>2,4</td>
		</tr>
	</tbody>
</table>