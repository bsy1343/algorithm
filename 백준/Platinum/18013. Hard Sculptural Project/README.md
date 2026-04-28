# [Platinum III] Hard Sculptural Project - 18013

[문제 링크](https://www.acmicpc.net/problem/18013)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 3, 맞힌 사람: 3, 정답 비율: 30.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 누적 합

### 문제 설명

<p><strong>The problem statement is almost identical to <a href="/problem/18012">the previous problem</a> with a few modified sentences in bold.</strong></p>

<p>As a sculptor from his youth, da Vinci had designed many sculptures, however few of them had been brought to completion and only one of them, <em>The Virgin with the Laughing Child</em>, survived. It took da Vinci a long time and lots of materials to complete this sculpture.</p>

<p>Specifically, da Vinci planned to spend n days on the first phase of this project. Initially, da Vinci did not have any materials to sculpt. On each day, he would either take a day off (marked as &lsquo;o&rsquo;) and go to the market to buy 1 unit of materials, or work (marked as &lsquo;w&rsquo;) on the sculpture and consume 1 unit of materials. However, after creating the schedule, da Vinci noticed that it was not realistic &ndash; on some workdays, he might not have any material to work on at all, and finally he might end up with unused materials. To ensure smooth progress on this sculptural project, da Vinci decided to cancel some of his activities on certain days so that:</p>

<ol>
	<li>Starting with no material, da Vinci would have at least 1 unit of materials to sculpt on each workday.</li>
	<li>After n days, da Vinci would end up with no material left.</li>
	<li>The number of canceled activities is minimized. (da Vinci did not want to modify his original schedule too much!)</li>
</ol>

<p><strong>Da Vinci would like to know the number of ways to cancel the minimum number of activities to satisfy these conditions. Two schedules are considered different if there exists at least one activity canceled in one schedule but preserved in the other.</strong></p>

### 입력

<p>The first line contains a number 1 &le; K &le; 10, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>Each data set is described by a single line containing a non-empty string S, describing da Vinci&rsquo;s original schedule. The length of S is at most 1000 and it consists of &lsquo;w&rsquo; and &lsquo;o&rsquo; only. You can compute n by reading the length of S.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p><strong>Then output the number of ways to cancel the minimum activities to make the schedule feasible. Since the answer might be very large, you should output the answer modulo 10<sup>9</sup> + 7.</strong></p>

<p>Each data set should be followed by a blank line.</p>