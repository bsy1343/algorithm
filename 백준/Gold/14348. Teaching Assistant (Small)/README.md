# [Gold III] Teaching Assistant (Small) - 14348

[문제 링크](https://www.acmicpc.net/problem/14348)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 21, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 그리디 알고리즘, 스택

### 문제 설명

<p>You are taking a programming course which is graded using problem sets of different types. The course goes for a positive even number of days. You start the course with no problem sets. On each day of the course, you&nbsp;must&nbsp;do&nbsp;exactly one&nbsp;of the following:</p>

<ul>
	<li>Request a &quot;Coding&quot; problem set.</li>
	<li>Request a &quot;Jamming&quot; problem set.</li>
	<li>Submit a problem set for grading. You must have at least one problem set to choose this option. If you have multiple problem sets, you must submit the one among those that was&nbsp;requested most recently, regardless of its type.</li>
</ul>

<p>All problem sets are different. There is no requirement on how many sets of each type must be submitted. Once you submit a set, you no longer have that set. Any problem sets that you have not submitted before the end of the course get you no points.</p>

<p>The problem sets are requested from and submitted to an artificially-intelligent teaching assistant. Strangely, the assistant has different moods &mdash; on each day it is in the mood for either &quot;Coding&quot; or &quot;Jamming&quot;.</p>

<ul>
	<li>When you request a problem set:
	<ul>
		<li>If the requested topic matches the assistant&#39;s mood, it assigns a problem set worth a maximum of 10 points.</li>
		<li>If the requested topic does not match its mood, it assigns a problem set worth a maximum of 5 points.</li>
	</ul>
	</li>
	<li>When you submit a problem set:
	<ul>
		<li>If the topic of the submitted set matches the assistant&#39;s mood that day, it gives you the maximum number of points for that set.</li>
		<li>If the topic of the submitted set does not match its mood that day, it gives you 5 points fewer than the maximum number of points for that set.</li>
	</ul>
	</li>
</ul>

<p>For example:</p>

<ul>
	<li>If you request a &quot;Coding&quot; problem set on a day in which the assistant is in a &quot;Coding&quot; mood, and submit it on a day in which it is in a &quot;Jamming&quot; mood, you will earn 5 points: the problem set is worth a maximum of 10, but the assistant gives 5 points fewer than that.</li>
	<li>If you request a &quot;Jamming&quot; problem set on a day in which the assistant is in a &quot;Coding&quot; mood, and submit it on a day in which it is in a &quot;Jamming&quot; mood, you will earn 5 points: the set is worth a maximum of 5, and the assistant gives you the maximum number of points.</li>
</ul>

<p>Thanks to some help from a senior colleague who understands the assistant very well, you know what sort of mood the assistant will be in on each day of the course. What is the maximum total score that you will be able to obtain?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T;&nbsp;T&nbsp;test cases follow. Each test case consists of one line with a string&nbsp;S&nbsp;of&nbsp;<code>C</code>&nbsp;and/or&nbsp;<code>J</code>&nbsp;characters. The i-th character of&nbsp;Sdenotes the assistant&#39;s mood on the i-th day of the course. If it is&nbsp;<code>C</code>, it is in the mood for &quot;Coding&quot;; if it is&nbsp;<code>J</code>, it is in the mood for &quot;Jamming&quot;.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>The length of&nbsp;S&nbsp;is even.</li>
	<li>2 &le; the length of&nbsp;S&nbsp;&le; 50.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of points you can obtain for that case.</p>

### 힌트

<p>This strategy is optimal for sample case #1:<br />
Day 1: Request a &quot;Coding&quot; problem set (call it C1).<br />
Day 2: Submit C1.<br />
Day 3: Request a &quot;Jamming&quot; problem set (call it J1).<br />
Day 4: Submit J1.</p>

<p>The following strategy is optimal for sample cases #2, #3, and #4: request C1, request J1, submit J1, submit C1.</p>

<p>For case #2, for example, note that you could&nbsp;<em>not</em>&nbsp;request C1, request J1, and then submit C1. Only the most recently requested problem set can be submitted.</p>

<p>In sample case #5, you can alternate between requesting a &quot;Coding&quot; problem set on one day, and submitting it on the next day.</p>