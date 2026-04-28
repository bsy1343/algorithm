# [Silver III] FreeCell Statistics (Small) - 12503

[문제 링크](https://www.acmicpc.net/problem/12503)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 231, 정답: 88, 맞힌 사람: 64, 정답 비율: 34.973%

### 분류

수학, 브루트포스 알고리즘, 정수론, 많은 조건 분기

### 문제 설명

<p>I played&nbsp;<strong>D</strong>&nbsp;(<strong>D</strong>&nbsp;&gt; 0) games of FreeCell today. Each game of FreeCell ends in one of two ways -- I either win, or I lose. I&#39;ve been playing for many years, and have so far played&nbsp;<strong>G</strong>games in total (obviously,&nbsp;<strong>G</strong>&nbsp;&ge;&nbsp;<strong>D</strong>).</p>

<p>At the end of the day, I look at the game statistics to see how well I have played. It turns out that I have won exactly&nbsp;<strong>P<sub>D</sub></strong>&nbsp;percent of the&nbsp;<strong>D</strong>&nbsp;games today, and exactly&nbsp;<strong>P<sub>G</sub></strong>&nbsp;percent of&nbsp;<strong>G</strong>total games I had ever played. Miraculously, there is no rounding necessary -- both percentages are exact! Unfortunately, I don&#39;t remember the exact number of games that I have played today (<strong>D</strong>), or the exact number of games that I have played in total (<strong>G</strong>). I do know that I could not have played more than&nbsp;<strong>N</strong>&nbsp;games today (<strong>D</strong>&nbsp;&le;&nbsp;<strong>N</strong>).</p>

<p>Are the percentages displayed possible, or is the game statistics calculator broken?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;lines follow. Each line contains 3 integers --&nbsp;<strong>N</strong>,&nbsp;<strong>P<sub>D</sub></strong>&nbsp;and&nbsp;<strong>P<sub>G</sub></strong>.</p>

<h3>Limits</h3>

<ul>
	<li>0 &le;&nbsp;<strong>P<sub>D</sub></strong>&nbsp;&le; 100;</li>
	<li>0 &le;&nbsp;<strong>P<sub>G</sub></strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100;</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is either &quot;Possible&quot; or &quot;Broken&quot;.</p>

### 힌트

<p>In Case #3, I could have played 5 games today&nbsp;(<strong>D</strong>&nbsp;= 5)&nbsp;and 25 games in total&nbsp;(<strong>G</strong>&nbsp;= 25), and won 4 games today&nbsp;&nbsp;(80% of 5)&nbsp;and 14 games in total&nbsp;(56% of 25).</p>