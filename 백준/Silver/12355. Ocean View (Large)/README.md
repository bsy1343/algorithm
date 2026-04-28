# [Silver II] Ocean View (Large) - 12355

[문제 링크](https://www.acmicpc.net/problem/12355)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 270, 정답: 169, 맞힌 사람: 157, 정답 비율: 66.525%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Ocean View is a small town on the edge of a small lake, populated by people with high self-esteem. There is only one street in this town, Awesome Boulevard, running away from the lake on the west towards the hill in the east. All of the houses in Ocean View are situated along one side of Awesome Boulevard and are numbered starting at #1 on the edge of the lake all the way up to #<strong>N</strong> at the foot of the hill.</p>

<p>Each resident of Ocean View wants to be able to see the lake. Unfortunately, some of the houses may be blocking the view for some of the higher numbered houses. House #A blocks the view for house #B whenever A is smaller than B, but house #A is as tall as or taller than house #B.</p>

<p>Tired of hearing complaints about obstructed views, the Supreme Ruler of Ocean View has decided to solve the problem using his favorite tool of governance -- violence. He will order his guards to destroy some of the houses on Awesome Boulevard in order to ensure that every remaining house has a view of the lake. Of course, if he destroys too many houses, he might have a rebellion to deal with, so he would like to destroy as few houses as possible.</p>

<p>What is the smallest number of houses that need to be destroyed in order to ensure that every remaining house has an unobstructed view of the lake?</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case will consist of two lines. The first line will contain a single integer <strong>N</strong>, the number of houses on Awesome Boulevard. The next line will list the height of each house, from west to east, all positive integers separated by single spaces.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>The height of each house will be between 1 and 1000, inclusive.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 1000;</span></li>
	<li>The answer may be larger than 4.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of houses that need to be destroyed.</p>

### 힌트

<p>Explanation of examples</p>

<p>Case #1 has several possible solutions. We can keep house #1, but we have to destroy any two of the remaining 3 houses. In particular, it is not enough to destroy only the tallest house because house #3 will continue to block the view from house #4.</p>

<p>Case #2 does not require any destruction. Every resident can already see the lake.</p>

<p>Case #3 is hopeless. We must destroy all but one of the houses. It does not matter which one we leave standing.</p>

<p>In case #4, only the resident of the shortest house is complaining about his lack of a view. We could destroy the 3 houses to the west of him, but we might as well destroy his house instead. That&#39;ll teach him not to complain.</p>