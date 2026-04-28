# [Gold III] Plates - 23896

[문제 링크](https://www.acmicpc.net/problem/23896)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 41, 맞힌 사람: 35, 정답 비율: 67.308%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Dr. Patel has&nbsp;<b>N</b>&nbsp;stacks of plates. Each stack contains&nbsp;<b>K</b>&nbsp;plates. Each plate has a positive&nbsp;<i>beauty value</i>, describing how beautiful it looks.</p>

<p>Dr. Patel would like to take exactly&nbsp;<b>P</b>&nbsp;plates to use for dinner tonight. If he would like to take a plate in a stack, he must also take all of the plates above it in that stack as well.</p>

<p>Help Dr. Patel pick the&nbsp;<b>P</b>&nbsp;plates that would maximize the total sum of beauty values.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the three integers&nbsp;<b>N</b>,&nbsp;<b>K</b>&nbsp;and&nbsp;<b>P</b>. Then,&nbsp;<b>N</b>&nbsp;lines follow. The i-th line contains&nbsp;<b>K</b>&nbsp;integers, describing the beauty values of each stack of plates from top to bottom.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum total sum of beauty values that Dr. Patel could pick.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>K</b>&nbsp;&le; 30.</li>
	<li>1 &le;&nbsp;<b>P</b>&nbsp;&le;&nbsp;<b>N</b>&nbsp;*&nbsp;<b>K</b>.</li>
	<li>The beauty values are between 1 and 100, inclusive.</li>
</ul>

### 힌트

<p>In Sample Case #1, Dr. Patel needs to pick&nbsp;<b>P</b>&nbsp;= 5 plates:</p>

<ul>
	<li>He can pick the top 3 plates from the first stack (10 + 10 + 100 = 120).</li>
	<li>He can pick the top 2 plates from the second stack (80 + 50 = 130) .</li>
</ul>

<p>In total, the sum of beauty values is 250.</p>

<p>In Sample Case #2, Dr. Patel needs to pick&nbsp;<b>P</b>&nbsp;= 3 plates:</p>

<ul>
	<li>He can pick the top 2 plates from the first stack (80 + 80 = 160).</li>
	<li>He can pick no plates from the second stack.</li>
	<li>He can pick the top plate from the third stack (20).</li>
</ul>

<p>In total, the sum of beauty values is 180.</p>