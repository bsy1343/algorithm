# [Platinum IV] Year of More Code Jam (Small) - 12609

[문제 링크](https://www.acmicpc.net/problem/12609)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 17, 맞힌 사람: 17, 정답 비율: 45.946%

### 분류

브루트포스 알고리즘, 기댓값의 선형성, 수학, 확률론

### 문제 설명

<p>A new year brings a new calendar, new challenges, and a lot of new fun in life. Some things, however, never change. There are still many great programming contests to be held, and our heroine Sphinny&#39;s passion for them remains unchanged.</p>

<p>There are several tournaments Sphinny is interested in. Each tournament will consist of a number of rounds. The organizer of each tournament has not decided on what date the tournament will start, but has decided how many rounds there will be in the tournament and how many days after the start date each round will be.</p>

<p>In some situations, two or more rounds (from different tournaments) can be scheduled on the same day. As Sphinny is so keen on problem solving, she will be happier if more rounds are scheduled on the same day. Her happiness value is computed as follows: for each day on which there are&nbsp;<em>S</em>&nbsp;rounds, her happiness will be increased by&nbsp;<em>S</em><sup>2</sup>. Her happiness starts at 0 (don&#39;t worry &mdash; 0 is a happy place to start).</p>

<p>In the picture below there are three tournaments, each represented by a different color, and Sphinny&#39;s total happiness is 20. One tournament starts on the second day of the year, one starts on the fifth day of the year, and one starts on the sixth day of the year.&nbsp;<br />
<br />
<br />
<img src="%EB%B0%B1%EC%A4%80/Platinum/12609.%E2%80%85Year%E2%80%85of%E2%80%85More%E2%80%85Code%E2%80%85Jam%E2%80%85(Small)/0ba28459.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12609.%E2%80%85Year%E2%80%85of%E2%80%85More%E2%80%85Code%E2%80%85Jam%E2%80%85(Small)/0ba28459.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12609/images-26.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="border:0px; vertical-align:middle" />&nbsp;<br />
&nbsp;</p>

<p>There are&nbsp;<strong>N</strong>&nbsp;days in the year. Each tournament will begin on any of the&nbsp;<strong>N</strong>&nbsp;days with equal probability. The big question for this year is what the expected value of Sphinny&#39;s happiness is.</p>

<p>As a perfectionist, she is not going to solve the problem approximately. Instead, she wants to know the result exactly. The number of tournaments is&nbsp;<strong>T</strong>, and there are&nbsp;<strong>N</strong><sup>T</sup>&nbsp;equally likely ways to select the start dates of the tournaments. She is going to express her expected happiness as&nbsp;<em>K</em>+<em>A</em>/<em>B</em>, where&nbsp;<em>K</em>&nbsp;and&nbsp;<em>B</em>&nbsp;are positive integers and&nbsp;<em>A</em>&nbsp;is a non-negative integer less than&nbsp;<em>B</em>. If&nbsp;<em>A</em>&nbsp;is zero then&nbsp;<em>B</em>&nbsp;must be one, otherwise&nbsp;<em>A</em>&nbsp;and&nbsp;<em>B</em>&nbsp;must not have a common factor greater than one.</p>

<p>If a tournament starts late enough in the year, some of its rounds might be scheduled during the next year. Those rounds do not contribute to Sphinny&#39;s happiness this year.</p>

### 입력

<p>The first line of the input is a single integer&nbsp;<strong>C</strong>, the number of test cases.&nbsp;<strong>C</strong>&nbsp;tests follow. The first line of each test case is in the form</p>

<pre>
N T
</pre>

<p>where&nbsp;<strong>N</strong>&nbsp;is the number of days in the year, and&nbsp;<strong>T</strong>&nbsp;is the number of tournaments.&nbsp;<strong>T</strong>&nbsp;lines then follow, one for each tournament, in the format</p>

<pre>
m d<sub>2</sub> d<sub>3</sub> ... d<sub>m</sub>
</pre>

<p>indicating that there are&nbsp;<strong>m</strong>&nbsp;rounds, and the i-th round will be held on day&nbsp;<strong>d</strong><sub>i</sub>&nbsp;of the tournament. The first round of a tournament is held on day 1 (<strong>d</strong><sub>1</sub>&nbsp;= 1).</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 50</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>9</sup></li>
	<li>2 &le;&nbsp;<strong>m</strong>&nbsp;&le; 50</li>
	<li>1 &lt;&nbsp;<strong>d</strong><sub>2</sub>&nbsp;&lt;&nbsp;<strong>d</strong><sub>3</sub>&nbsp;&lt; ... &lt;&nbsp;<strong>d</strong><sub>m</sub>&nbsp;&le; 10000</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 2</li>
</ul>

### 출력

<p>For each test, output one line of the form</p>

<pre>
Case #X: K+A/B</pre>

<p>where&nbsp;<em>X</em>&nbsp;is the case number, starting from 1, and&nbsp;<em>K</em>,&nbsp;<em>A</em>&nbsp;and&nbsp;<em>B</em>&nbsp;are as described above.</p>