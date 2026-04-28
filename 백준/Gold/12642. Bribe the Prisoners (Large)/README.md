# [Gold I] Bribe the Prisoners (Large) - 12642

[문제 링크](https://www.acmicpc.net/problem/12642)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 63, 맞힌 사람: 56, 정답 비율: 64.368%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In a kingdom there are prison cells (numbered 1 to&nbsp;<strong>P</strong>) built to form a straight line segment. Cells number&nbsp;<strong>i</strong>&nbsp;and&nbsp;<strong>i+1</strong>&nbsp;are adjacent, and prisoners in adjacent cells are called &quot;neighbours.&quot; A wall with a window separates adjacent cells, and neighbours can communicate through that window.&nbsp;</p>

<p>All prisoners live in peace until a prisoner is released. When that happens, the released prisoner&#39;s neighbours find out, and each communicates this to his other neighbour. That prisoner passes it on to&nbsp;<em>his</em>&nbsp;other neighbour, and so on until they reach a prisoner with no other neighbour (because he is in cell 1, or in cell&nbsp;<strong>P</strong>, or the other adjacent cell is empty). A prisoner who discovers that another prisoner has been released will angrily break everything in his cell, unless he is bribed with a gold coin. So, after releasing a prisoner in cell&nbsp;<strong>A</strong>, all prisoners housed on either side of cell&nbsp;<strong>A</strong>&nbsp;- until cell 1, cell&nbsp;<strong>P</strong>&nbsp;or an empty cell - need to be bribed.</p>

<p>Assume that each prison cell is initially occupied by exactly one prisoner, and that only one prisoner can be released per day. Given the list of&nbsp;<strong>Q</strong>&nbsp;prisoners to be released in&nbsp;<strong>Q</strong>days, find the minimum total number of gold coins needed as bribes if the prisoners may be released in any order.</p>

<p>Note that each bribe only has an effect for one day. If a prisoner who was bribed yesterday hears about another released prisoner today, then he needs to be bribed again.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow. Each case consists of 2 lines. The first line is formatted as</p>

<pre>
P Q</pre>

<p>where&nbsp;<strong>P</strong>&nbsp;is the number of prison cells and&nbsp;<strong>Q</strong>&nbsp;is the number of prisoners to be released.<br />
This will be followed by a line with&nbsp;<strong>Q</strong>&nbsp;distinct cell numbers (of the prisoners to be released), space separated, sorted in ascending order.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li><strong>Q</strong>&nbsp;&le;&nbsp;<strong>P</strong></li>
	<li>Each cell number is between 1 and&nbsp;<strong>P</strong>, inclusive.</li>
	<li>1 &le;&nbsp;<strong>P</strong>&nbsp;&le; 10000</li>
	<li>1 &le;&nbsp;<strong>Q</strong>&nbsp;&le; 100</li>
</ul>

### 출력

<p>For each test case, output one line in the format</p>

<pre>
Case #X: C</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the case number, starting from 1, and&nbsp;<strong>C</strong>&nbsp;is the minimum number of gold coins needed as bribes.</p>

### 힌트

<p>In the second sample case, you first release the person in cell 14, then cell 6, then cell 3. The number of gold coins needed is 19 + 12 + 4 = 35. If you instead release the person in cell 6 first, the cost will be 19 + 4 + 13 = 36.</p>