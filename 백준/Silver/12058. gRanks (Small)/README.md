# [Silver II] gRanks (Small) - 12058

[문제 링크](https://www.acmicpc.net/problem/12058)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 33, 맞힌 사람: 32, 정답 비율: 64.000%

### 분류

구현, 정렬, 문자열

### 문제 설명

<p>There are many great athletes in the world, and it&#39;s very hard to say who is the best in the world at a particular sport, especially when different athletes have won different competitions. Here&#39;s one possible system for ranking athletes:</p>

<ol>
	<li>Determine the number&nbsp;<strong>P</strong>&nbsp;of finishing places in any competition that will be worth points for athletes, and how many points&nbsp;<strong>S<sub>i</sub></strong>&nbsp;each of those finishing places is worth. For example, for&nbsp;<strong>P</strong>&nbsp;= 3, one possible assignment would be 1000 points for 1st place, 500 for 2nd place, and 300 for 3rd place, and 0 for anything below that. (We assume there are no ties within competitions.)</li>
	<li>Since not all competitions are equally important, assign a weight&nbsp;<strong>W<sub>i</sub></strong>&nbsp;to each one. The score gained by an athlete for a competition will be the points from step 1, modified by the weight for that competition. For example, we may decide that Olympics has a weight of 5, and, continuing with our example from above, the winner of the Olympics would receive 5 * 1000 = 5000 points.</li>
	<li>Since we don&#39;t want to reward athletes simply for participating in many competitions, we count only the&nbsp;<strong>M</strong>&nbsp;highest scores received by an athlete across all competitions. For example, if&nbsp;<strong>M</strong>&nbsp;= 2 and an athlete earns scores of 1000*5, 500*1, and 300*3 in three different competitions, only the 5000 and 900 would be counted.</li>
</ol>

<p>You are given the points per finishing place, the weights of the competitions, and the results of the competitions. Can you rank all of the athletes who appeared in the competitions? If multiple athletes have the same score, they will share the same rank and listed in alphabetical order of their names.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow; each test case consists of the following:</p>

<ol>
	<li>One line with an integer&nbsp;<strong>P</strong>, the number of top places for which points are awarded.</li>
	<li>One line consists with&nbsp;<strong>P</strong>&nbsp;integers representing the scores&nbsp;<strong>S<sub>i</sub></strong>&nbsp;for the top places, starting with first place and continuing down the places.</li>
	<li>One line with an integer&nbsp;<strong>N</strong>, the number of competitions.</li>
	<li><strong>N</strong>&nbsp;lines, each of which represents a competition. Each line begins with&nbsp;<strong>W<sub>i</sub></strong>, the weight of this competition, and continues with the&nbsp;<strong>P</strong>&nbsp;names of the athletes who finished in the top&nbsp;<strong>P</strong>&nbsp;places. They are listed in descending order starting from first place.</li>
	<li>One line with an integer&nbsp;<strong>M</strong>, the maximum number of competitions counted toward an athlete&#39;s score.</li>
</ol>

### 출력

<p>For each test case, output one line containing &quot;Case #x:&quot;, where x is the test case number (starting from 1). Then output one line for each athlete, from highest rank to lowest rank, with the format&nbsp;<code>r: name</code>, where&nbsp;<code>r</code>&nbsp;is the rank of the athlete and&nbsp;<code>name</code>&nbsp;is the name of the athlete. You need to rank all of the athletes that appeared in the input.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>S<sub>i</sub></strong>&nbsp;&le; 1000.</li>
	<li><strong>S<sub>i</sub></strong>&nbsp;&gt;&nbsp;<strong>S<sub>i+1</sub></strong>.</li>
	<li>1 &le;&nbsp;<strong>W<sub>i</sub></strong>&nbsp;&le; 1000.</li>
	<li>Each name consists only of characters&nbsp;<code>A</code>&nbsp;through&nbsp;<code>Z</code>, and is at most 10 characters long.</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&le; 10.</li>
</ul>

### 힌트

<p>In the first case, Bolt scored a total of 7000 in his two competitions. Gay would have scored a total of 8500 if all competitions were counted, but since only the top 2 competitions are counted in this case, Gay scored 6500 and ranked second. Since Peimeng and Tianbing both scored 1500, they both ranked 3rd and listed by their names. Larry is last, since he scored only 1000.</p>