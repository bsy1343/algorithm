# [Platinum IV] Make it Smooth (Large) - 12586

[문제 링크](https://www.acmicpc.net/problem/12586)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 24, 맞힌 사람: 22, 정답 비율: 22.680%

### 분류

많은 조건 분기, 다이나믹 프로그래밍

### 문제 설명

<p>You have a one-dimensional array of&nbsp;<strong>N</strong>&nbsp;pixels. Each pixel has a value, represented by a number between 0 and 255, inclusive. The&nbsp;<em>distance</em>&nbsp;between two pixels is the absolute difference of their numbers.</p>

<p>You can perform each of the following operations zero or more times:</p>

<ol>
	<li>With cost&nbsp;<strong>D</strong>, delete any pixel, so its original neighbors become neighboring pixels.</li>
	<li>With cost&nbsp;<strong>I</strong>, insert one pixel of any value into any position -- either between two existing pixels, or before the first pixel, or after the last pixel.</li>
	<li>You can change the value of any pixel. The cost is the absolute difference of the old value of the pixel and the new value of the pixel.</li>
</ol>

<p>The array is&nbsp;<em>smooth</em>&nbsp;if any neighboring pixels have distance at most&nbsp;<strong>M</strong>. Find the minimum possible cost of a sequence of operations that makes the array smooth.</p>

<p>Note: The empty array -- the array containing no pixels -- is considered to be smooth.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow, each with two lines. The first line is in the form &quot;<strong>D</strong>&nbsp;<strong>I</strong>&nbsp;<strong>M</strong>&nbsp;<strong>N</strong>&quot;, the next line contains&nbsp;<strong>N</strong>&nbsp;numbers&nbsp;<strong>a<sub>i</sub></strong>: the values of the pixels from left to the right.</p>

<h3>Limits</h3>

<ul>
	<li>All the numbers in the input are integers.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>0 &le;&nbsp;<strong>D</strong>,&nbsp;<strong>I</strong>,&nbsp;<strong>M</strong>,&nbsp;<strong>a<sub>i</sub></strong>&nbsp;&le; 255</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1), and y is the minimum cost to make the input array smooth.</p>

### 힌트

<p>In Case #1, decreasing the 7 to 3 costs 4 and is the cheapest solution. In Case #2, deleting is extremely expensive; it&#39;s cheaper to insert elements so your final array looks like&nbsp;<code>[1, 6, 11, 16, 21, 26, 31, 36, 41, 46, 50, 45, 40, 35, 30, 25, 20, 15, 10, 7]</code>.</p>