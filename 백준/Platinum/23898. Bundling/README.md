# [Platinum IV] Bundling - 23898

[문제 링크](https://www.acmicpc.net/problem/23898)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 29, 맞힌 사람: 26, 정답 비율: 78.788%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 트리, 트라이

### 문제 설명

<p>Pip has&nbsp;<b>N</b>&nbsp;strings. Each string consists only of letters from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>. Pip would like to bundle their strings into&nbsp;<i>groups</i>&nbsp;of size&nbsp;<b>K</b>. Each string must belong to exactly one group.</p>

<p>The&nbsp;<i>score</i>&nbsp;of a group is equal to the length of the longest prefix shared by all the strings in that group. For example:</p>

<ul>
	<li>The group&nbsp;<code>{RAINBOW, RANK, RANDOM, RANK}</code>&nbsp;has a score of 2 (the longest prefix is&nbsp;<code>&#39;RA&#39;</code>).</li>
	<li>The group&nbsp;<code>{FIRE, FIREBALL, FIREFIGHTER}</code>&nbsp;has a score of 4 (the longest prefix is&nbsp;<code>&#39;FIRE&#39;</code>).</li>
	<li>The group&nbsp;<code>{ALLOCATION, PLATE, WORKOUT, BUNDLING}</code>&nbsp;has a score of 0 (the longest prefix is&nbsp;<code>&quot;</code>).</li>
</ul>

<p>Please help Pip bundle their strings into groups of size&nbsp;<b>K</b>, such that the sum of scores of the groups is maximized.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>K</b>. Then,&nbsp;<b>N</b>&nbsp;lines follow, each containing one of Pip&#39;s strings.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum sum of scores possible.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<b>N</b>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>2 &le;&nbsp;<b>K</b>&nbsp;&le;&nbsp;<b>N</b>.</li>
	<li><b>K</b>&nbsp;divides&nbsp;<b>N</b>.</li>
	<li>Each of Pip&#39;s strings contain at least one character.</li>
	<li>Each string consists only of letters from&nbsp;<code>A</code>&nbsp;to&nbsp;<code>Z</code>.</li>
</ul>