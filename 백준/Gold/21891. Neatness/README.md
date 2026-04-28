# [Gold V] Neatness - 21891

[문제 링크](https://www.acmicpc.net/problem/21891)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

수학

### 문제 설명

<p>Boys Dima and Mitya share a room in a dormitory and take turns cleaning it every $k$ days. &nbsp;New month, consisting of $n$ days, has just begun, so boys have to come up with a new cleaning schedule. To do it, boys simply choose who is going to clean first, and which of the first $k$ days of the month it will happen. The next cleaning will happen exactly $k$ days after the previous one, and the other boy will have to do it. For example, if Dima cleans the room on day $i$, then, on day $i + k$, Mitya will have to do the cleaning, on day $i + 2k$, it will be Dima&#39;s turn again, and so on.</p>

<p>The schedule should be fair: both boys should clean the room equal number of times. The situation is complicated by the fact that both Dima and Mitya are planning go to an olympiad once during this month. If one of the boys is absent during his cleaning day, the other boy is cleaning in his place. The schedule does not shift in this case. It is known that Dima will be absent from the $a$-th day to the $b$-th day inclusive, and Mitya --- from the $c$-th day until the $d$-th day. Days in month are numbered from 1 to $n$. Boys&#39; trips to olympiads do not intersect, so every day at least one of the boys is at home.</p>

<p>Help boys decide who should clean the room first, and which day (among the first $k$ days of the month) it should happen, or determine that it is impossible.</p>

### 입력

<p>First line contains two integers $n$ and $k$ --- the number of days in this month and the number of days between two consecutive cleanings ($2 \le n \le 10^{18}$, $1 \le k \le n$).</p>

<p>Second line contains integers $a$, $b$, $c$ and $d$, describing boys&#39; trips to olympiads &nbsp;($1 \le a \le b \le n$; $1 \le c \le d \le n$; $b &lt; c$ or $d &lt; a$).&nbsp;</p>

### 출력

<p>If it&#39;s impossible to create a fair schedule, print $-1$.</p>

<p>Otherwise, print one integer in the first line --- the day of the first cleaning. On the second line print &lt;&lt;<code>Dima</code>&gt;&gt;, if Dima should clean first, and &lt;&lt;<code>Mitya</code>&gt;&gt; otherwise.</p>

<p>If there are multiple possible solutions, print any of them.</p>

### 힌트

<p>Let&#39;s represent sample tests as tables using the following notation:</p>

<ul>
	<li>&lt;&lt;<code>d</code>&gt;&gt; --- day, when Dima is away,</li>
	<li>&lt;&lt;<code>m</code>&gt;&gt; --- day, when Mitya is away,&nbsp;</li>
	<li>&lt;&lt;<code>D</code>&gt;&gt; --- day, when Dima cleans the room,</li>
	<li>&lt;&lt;<code>M</code>&gt;&gt; --- day, when Mitya cleans the room,&nbsp;</li>
	<li>&lt;&lt;<code>*</code>&gt;&gt; --- possible starting day.</li>
</ul>

<p>Then for the first sample we get the following table:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Days</th>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
		</tr>
		<tr>
			<th>Departures</th>
			<td>*</td>
			<td>*</td>
			<td>*</td>
			<td>*</td>
			<td>*</td>
			<td>d</td>
			<td>d</td>
			<td>d</td>
			<td>d</td>
			<td>d</td>
			<td>m</td>
			<td>m</td>
		</tr>
		<tr>
			<th>Schedule</th>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>
		<tr>
			<th>Actual</th>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>
	</tbody>
</table>

<p>This way, both bots will clean the room equal number of times, and boys&#39; trips do not affect the schedule.</p>

<p>Table for the second sample:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Days</th>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
			<td>13</td>
			<td>14</td>
			<td>15</td>
			<td>16</td>
			<td>17</td>
			<td>18</td>
		</tr>
		<tr>
			<th>Departures</th>
			<td>m*</td>
			<td>m*</td>
			<td>m*</td>
			<td>m*</td>
			<td>m</td>
			<td>m</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>d</td>
			<td>d</td>
			<td>d</td>
			<td>d</td>
		</tr>
		<tr>
			<th>Schedule</th>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>
		<tr>
			<th>Actual</th>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>D</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
			<td>M</td>
			<td>.</td>
			<td>.</td>
			<td>.</td>
		</tr>
	</tbody>
</table>

<p>Because Mitya is absent on the third day, Dima will clean instead. Mitya will clean the room on the 15-th day because of Dima&#39;s trip. This way, each boy cleans the room twice, even if it wasn&#39;t scheduled.</p>