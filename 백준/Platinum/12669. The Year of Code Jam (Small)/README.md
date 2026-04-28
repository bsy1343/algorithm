# [Platinum I] The Year of Code Jam (Small) - 12669

[문제 링크](https://www.acmicpc.net/problem/12669)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 41, 맞힌 사람: 36, 정답 비율: 87.805%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>The year 2008 will be known as a year of change and transition, the start of a new era: we&#39;re talking, of course, about the new Google Code Jam format. The introduction of this contest has jammed so many great programming competitions together in a single year that people have started calling it&nbsp;<em>The Year of Code Jam</em>.<br />
Sphinny, a passionate contestant, is looking at her calendar of the year and discovering that a great number of programming contests has been scheduled. She has marked every day of the year on the calendar in one of the three ways:</p>

<ul>
	<li>White: She will not participate in a contest on this day. Either no contests are scheduled, or she has more important things to do (surely there are other good things in life!).</li>
	<li>Blue: She will definitely participate in a contest on this day.</li>
	<li>Question mark: There is a contest scheduled, but she has not decided yet whether she will participate.</li>
</ul>

<p>Note: To simplify the problem, we&#39;ll assume that there is no concept of qualification: you don&#39;t have to participate in one contest to be eligible for another.</p>

<p>Being in a world that is somewhat different from ours, Sphinny&#39;s calendar has some features we must mention: It has&nbsp;<strong>N</strong>&nbsp;months, and each month has exactly&nbsp;<strong>M</strong>&nbsp;days.</p>

<p>The picture below depicts a calendar with 5 months, 8 days in each month, 15 blue days, and 5 question marks.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12669.%E2%80%85The%E2%80%85Year%E2%80%85of%E2%80%85Code%E2%80%85Jam%E2%80%85(Small)/1d90c752.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12669/images-12.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Looking at her beautiful calendar, Sphinny has decided that each day has up to 4&nbsp;<strong>neighbors</strong>&nbsp;in the year: The previous day in the same month, the next day in the same month, the same day in the previous month, and the same day in the next month.</p>

<p>Sphinny wants to maximize her happiness from these contests, and she estimates the effect of the contests on her happiness as a summation of values for all the blue days. For each blue day, the value is computed as follows:</p>

<ul>
	<li>The initial value is 4.</li>
	<li>For each blue neighbour the day has, decrease the value by 1.</li>
</ul>

<p>You may think that Sphinny likes the contests, but participating on two consecutive days makes her a little tired. And for aesthetic reasons, participating on the same day in two consecutive months is also not so great.</p>

<p>Sphinny wants to plan her year now, and decide for every day with a question mark whether it should be white or blue. Her goal is simply to maximize the happiness value.</p>

<p>The following picture shows a solution for the example above. By changing two question marks to blue days, and the other three to white days, she can achieve a happiness value of 42.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12669.%E2%80%85The%E2%80%85Year%E2%80%85of%E2%80%85Code%E2%80%85Jam%E2%80%85(Small)/d22de514.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12669/images-13.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:204px; width:293px" /></p>

### 입력

<p>The first line in the input file contains the number of cases&nbsp;<strong>T</strong>. This is followed by&nbsp;<strong>T</strong>&nbsp;cases in the following format.<br />
The first line is of the form &quot;<strong>N M</strong>&quot;, where&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>&nbsp;are two numbers giving the number of months and the number of days per month.<br />
The next&nbsp;<strong>N</strong>&nbsp;lines each contain a string of length&nbsp;<strong>M</strong>. The&nbsp;<strong>j</strong>-th character in the&nbsp;<strong>i</strong>-th string is one of {&#39;#&#39;, &#39;.&#39;, &#39;?&#39;}, which gives the status of the j-th day in the i-th month. &#39;#&#39; indicates a blue day, &#39;.&#39; indicates a white day, and &#39;?&#39; indicates a day with a question mark.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>M</strong>,&nbsp;<strong>N</strong>&nbsp;&le; 15.</li>
</ul>

### 출력

<p>For each input case, you should output a line in the format:</p>

<pre>
Case #X: Y
</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the 1-based case number, and&nbsp;<strong>Y</strong>&nbsp;is the maximum happiness value.</p>

### 힌트

<p>Note that the second sample is our example in the pictures above.</p>