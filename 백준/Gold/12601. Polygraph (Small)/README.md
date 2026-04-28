# [Gold IV] Polygraph (Small) - 12601

[문제 링크](https://www.acmicpc.net/problem/12601)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 13, 맞힌 사람: 9, 정답 비율: 36.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>On the distant isle of Googlia, there are two cities, Truthtown and Liarville. People from Truthtown always tell the truth and people from Liarville always lie. While exploring Googlia, you have run across a group of N inhabitants, and you want to figure out which city each one came from.</p>

<p>To make life simpler, you begin by numbering these people 1 through N. You then question each person, and record their M statements in the short-hand described below.</p>

<table border="1" cellpadding="1" cellspacing="1" style="width:500px">
	<tbody>
		<tr>
			<td>Short-hand</td>
			<td>Meaning</td>
		</tr>
		<tr>
			<td>i T j</td>
			<td>Person #i says, &quot;Person #j is from Truthtown.&quot;</td>
		</tr>
		<tr>
			<td>i L j</td>
			<td>Person #i says, &quot;Person #j is from Liarville.&quot;</td>
		</tr>
		<tr>
			<td>i S j k</td>
			<td>Person #i says, &quot;Persons #j and #k are from the same city.&quot;</td>
		</tr>
		<tr>
			<td>i D j k</td>
			<td>Person #i says, &quot;Persons #j and #k are from different cities.&quot;</td>
		</tr>
	</tbody>
</table>

<p>Your task is to deduce which city each person came from. It is guaranteed that there will always be at least one solution.</p>

<p>For example, suppose you were given the following statements:</p>

<blockquote><code>1 D 2 3</code>,&nbsp;<code>1 D 2 4</code>,&nbsp;<code>1 D 3 4</code>, and&nbsp;<code>2 L 1</code>.</blockquote>

<p>Then, you could reason as follows:</p>

<ul>
	<li>There are only two cities, so persons #2, #3, and #4 could not all have come from different cities.</li>
	<li>Therefore, at least one of person #1&#39;s claims must have been a lie.</li>
	<li>Therefore, person #1 is from Liartown, and all of his claims must have been lies.</li>
	<li>Therefore, persons #2, #3, and #4 must all be from the same city.</li>
	<li>Person #2&#39;s claim is true, so he must be from Truthtown.</li>
	<li>Therefore, persons #3 and #4 are also from Truthtown.</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each case begins with a line containing the integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>M</strong>. The following&nbsp;<strong>M</strong>&nbsp;lines each contain a single statement from one inhabitant, formatted as described above.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le; T &le; 100</li>
	<li>1 &le; i, j, k &le; N</li>
	<li>j and k are distinct</li>
	<li>1 &le; N &le; 10</li>
	<li>1 &le; M &le; 500</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y<sub>1</sub>&nbsp;y<sub>2</sub>&nbsp;... y<sub>N</sub>&quot;, where x is the case number (starting from 1) and y<sub>i</sub>&nbsp;is a single letter indicating which city person #i is from:</p>

<ul>
	<li>If the statements you have been given imply person #i must be from Truthtown, then y<sub>i</sub>&nbsp;should be &#39;T&#39;.</li>
	<li>If the statements you have been given imply person #i must be from Liarville, then y<sub>i</sub>&nbsp;should be &#39;L&#39;.</li>
	<li>If the statements you have been given are not enough information to determine where person #i is from, then y<sub>i</sub>&nbsp;should be &#39;-&#39;.</li>
</ul>