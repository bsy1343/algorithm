# [Gold II] Animesh practices some programming contests - 30150

[문제 링크](https://www.acmicpc.net/problem/30150)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 44.444%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>As you know, Malvika has created some n programming contests. Each of the contests has three problems, categorized as easy, medium and hard on difficulty level. For the i th contest, easy problem takes TE[i] hours and gives you PE[i] pleasure. Similarly, medium problem takes TM[i] hours, gives PM[i] pleasure, and a hard one has the values TH[i], PH[i].</p>

<p>Today, Animesh wanted to practice some of them. Animesh has a really bad habit of trying problems for only a few minutes and saying to Malvika &quot;I am a noob, you are a pro. It&#39;s some weird shit I don&#39;t know. Please, tell me the solution, bro!&quot; Having been irritated by this behaviour numerous times in the past, she granted him K special powers he can use before starting the practice session. By using a single power, Animesh can pick any two problems irrespective of their difficulty from two different contests and swap them.</p>

<p>Animesh has at max time hours before he gets frustrated by his noobness and ends the practice session. He wants to make the maximum use of it by getting as much pleasure out of this activity as possible. Animesh also gets bored with the contest themes fairly quickly, so he does not want to solve more than one problem from any contest. Can you help Animesh in estimating the maximum amount of pleasure he can achieve out of this activity?</p>

### 입력

<p>The first line of input contains a single integer T denoting number of test cases</p>

<p>For each test case:</p>

<ul>
	<li>The first line contains three space separated integers n, k, time.</li>
	<li>Each of the next n lines contain three space separated integers denoting TE[i], TM[i], TH[i].</li>
	<li>Each of the next n lines contain three space separated integers denoting PE[i], PM[i], PH[i].</li>
</ul>

### 출력

<p>For each test case, output a single integer in a separate line corresponding to the answer of the problem.</p>

### 제한

<ul>
	<li>1 &le; T &le; 10</li>
	<li>1 &le; n &le; 50</li>
	<li>0 &le; k &le; n * n</li>
	<li>1 &le; time &le; 50</li>
	<li>1 &le; TE[i], TM[i], TH[i] &le; 50</li>
	<li>1 &le; PE[i], PM[i], PH[i] &le; 100000</li>
</ul>

### 힌트

<p>In the first example, Malvika has prepared only one programming contest, its easy problem takes 1 hour and gives 5 units of pleasure. The medium one takes 2 hours and gives 3 units of pleasure whereas the same values for hard are 3 hours and 6 units of pleasure. Animesh has only 5 hours and can select at max one problems out of these to solve. The hard problem is the best candidate to choose for him, it will him give him 6 units of pleasure and take his 5 hours. So, the answer is 6.</p>

<p>In the second example, Malvika has prepared two programming contests.</p>

<ul>
	<li>First programming contest:
	<ul>
		<li>Easy problem &mdash; 1 hour and 2 units of pleasure.</li>
		<li>Medium problem &mdash; 2 hours and 3 units of pleasure.</li>
		<li>Hard problem &mdash; 1 hours and 3 units of pleasure.</li>
	</ul>
	</li>
	<li>Second programming contest:
	<ul>
		<li>Easy problem &mdash; 2 hours and 4 units of pleasure.</li>
		<li>Medium problem &mdash; 3 hours and 6 units of pleasure.</li>
		<li>Hard problem &mdash; 3 hours and 5 units of pleasure.</li>
	</ul>
	</li>
</ul>

<p>Animesh has 6 hours and can use at max one swapping power. He can use the special power to swap the medium problem of second contest with any problem of first contest. After doing that, he can select the two problems taking 3 hours and giving pleasure of 6 and 5 units to get a total pleasure of 11 units.</p>