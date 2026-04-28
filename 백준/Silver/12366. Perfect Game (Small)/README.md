# [Silver V] Perfect Game (Small) - 12366

[문제 링크](https://www.acmicpc.net/problem/12366)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 122, 정답: 85, 맞힌 사람: 74, 정답 비율: 69.159%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You&#39;re playing a video game, in which you will get an achievement if you complete all of the levels consecutively without dying. You can play the levels in any order, and each time you play a level you&#39;ll either complete it or die. Each level has some probability that you&#39;ll complete it, and takes some amount of time. In what order should you play the levels so that the expected time it takes you to get the achievement is minimized? Assume that it takes equally long to beat a level or to die in it, and that you will start again from the first level in your ordering as soon as you die.</p>

<p>Note: If you fail to complete a level, you do not personally die&mdash;only your character in the game dies. If that were not the case, only a few people would try to earn this achievement.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, each of which consists of three lines. The first line of each test case contains a single integer&nbsp;<strong>N</strong>, the number of levels. The second line contains&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>L<sub>i</sub></strong>.&nbsp;<strong>L<sub>i</sub></strong>&nbsp;is the number of seconds level&nbsp;<code>i</code>&nbsp;lasts, which is independent of whether you complete the level or die. The third line contains&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>P<sub>i</sub></strong>.&nbsp;<strong>P<sub>i</sub></strong>&nbsp;is the percent chance that you will&nbsp;<em><strong>die</strong></em>&nbsp;in any given attempt to complete level&nbsp;<code>i</code>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<strong>P<sub>i</sub></strong>&nbsp;&lt; 100.</li>
	<li><span style="line-height:1.6em">1 &le;&nbsp;<strong style="line-height:1.6em">N</strong><span style="line-height:1.6em">&nbsp;&le; 20.</li>
	<li><strong>L<sub>i</sub></strong>&nbsp;= 1.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: &quot;, where x is the case number (starting from 1), followed by&nbsp;<strong>N</strong>&nbsp;space-separated integers. The&nbsp;<code>j</code><sup>th</sup>&nbsp;integer in the list should be the index of the&nbsp;<code>j</code><sup>th</sup>&nbsp;level you should attempt to beat in order to minimize the amount of time you expect to spend earning the achievement.</p>

<p>Indices go from&nbsp;<code>0</code>&nbsp;to&nbsp;<code>N-1</code>. If there are multiple orderings that would give the same expected time, output the lexicographically least ordering. Out of two orderings, the lexicographically smaller one is the one with the smaller index at the first location where they differ; out of many orderings, the lexicographically least one is the one that is lexicographically smaller than every other ordering.</p>

### 힌트

<p>Note that the second and third samples do not satisfy the constraints for the small input.</p>