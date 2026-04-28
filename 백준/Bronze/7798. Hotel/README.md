# [Bronze I] Hotel - 7798

[문제 링크](https://www.acmicpc.net/problem/7798)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 119, 정답: 48, 맞힌 사람: 43, 정답 비율: 39.450%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Indonesia tourism board has just sent a list of available room type of all hotels in Jakarta for teams that will participate in Indonesia Programming Contest 2008. Each record on the list contains:</p>

<ol>
	<li>Hotel name (max. 25 char, alphabet only).</li>
	<li>Bed size (20 &ndash; 62).</li>
	<li>Room capacity (1 &ndash; 4).</li>
	<li>Number of available room (1 &ndash; 50).</li>
	<li>Cost per room (1 &ndash; 5,000).</li>
</ol>

<p>To simplify the problem, let&rsquo;s assume that each hotel will offer only one type of room (which means they will appear only once in the list).</p>

<p>Several participants have submitted their hotel preference to the committee, which consists of:</p>

<ul>
	<li>Prefered bed size, grouped into three categories:
	<ul>
		<li>Type A: bed size 20 &ndash; 35</li>
		<li>Type B: bed size 36 &ndash; 48</li>
		<li>Type C: bed size 49 - 62</li>
	</ul>
	</li>
	<li>Number of people in their teams (1 &ndash; 200).</li>
	<li>Maximum number of person in a room (1 &ndash; 4). The number of people in each room will be limited to this number even if the room has more capacity.</li>
</ul>

<p>Based on the data above, write a program to find the cheapest hotel for each team. If there&rsquo;re more than one cheapest hotels, then choose one with largest bed size. If there&rsquo;re still more than one, then choose one which come first on the list.</p>

<p>You don&rsquo;t have to worry about multiple teams assigned at one hotel. What we will do here is only make a suggestion for each team, not a reservation.</p>

### 입력

<p>The first line of input contains an integer T, the number of test cases follow.</p>

<p>Each case will begin with two integers N (1 &le; N &le; 50) and M (1 &le; M &le; 50) the number of available hotel and the number of teams respectively. The next N lines each will contains four integers (bed size, room capacity, number of available room and the price per room) and a string which denotes the hotel&rsquo;s name. The next M lines each will contains three data: bed size type (A, B or C), number of people in their teams and maximum number of person in a room.</p>

### 출력

<p>Print &quot;Case #X:&quot; (X is the case number) at the first line of each test case. For each team, print on a single line the total cost and the hotel name which you suggested (in the same order as the team appearance in the input), separated by a single space. If there&rsquo;re no hotels that match the team&rsquo;s criteria, then output &ldquo;no-hotel&rdquo; (without quotes).</p>