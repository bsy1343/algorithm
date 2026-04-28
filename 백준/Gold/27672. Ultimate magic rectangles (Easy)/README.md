# [Gold IV] Ultimate magic rectangles (Easy) - 27672

[문제 링크](https://www.acmicpc.net/problem/27672)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

브루트포스 알고리즘, 수학

### 문제 설명

<p>Bob is busy today, so Alice has found a single-player game.</p>

<p>In this game, Alice is given an integer <em>s</em> and an empty table with <em>r</em> = 3 rows and <em>c</em> columns. Alice has to fill in some <strong>nonnegative integers</strong> into the cells of the table.</p>

<p>Three cells are called a <em>triplet</em> if they lie in different rows and their centers lie on a straight line. The goal of the game is to fill the table in such a way that each triplet will have the same sum.</p>

<p>You are given the number of columns <em>c</em> and the desired sum of each triplet <em>s</em>. Compute the number of ways to fill the table in the desired way. Since this number may be large, compute it modulo 10<sup>9</sup> + 9.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27672.%E2%80%85Ultimate%E2%80%85magic%E2%80%85rectangles%E2%80%85(Easy)/09e93707.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/27672.%E2%80%85Ultimate%E2%80%85magic%E2%80%85rectangles%E2%80%85(Easy)/09e93707.png" data-original-src="https://upload.acmicpc.net/9b480dcc-41a2-45e2-aad3-904b59ef4f8d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Above: one of the many triplets on a board with <em>c</em> = 8 columns.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of one line containing two space-separated integers <em>c</em> and <em>s</em>.</p>

### 출력

<p>For each test case, print one integer on a separate line &ndash; the number of solutions, modulo 10<sup>9</sup> + 9.</p>

### 제한

<ul>
	<li>1 &le; <em>c</em> &le; 50</li>
	<li>0 &le; <em>s</em> &le; 50</li>
</ul>

### 힌트

<p>In the first test case there are five triplets: each column and both main diagonals of the 3 &times; 3 square. The sum of each triplet must be 1, which means that each triplet must contain two 0s and a 1. These are the five solutions:</p>

<pre>
<code>111   000   000   101   010
000   111   000   000   000
000   000   111   010   101</code></pre>

<p>In the second test case one of the 34 valid solutions is a 3 &times; 4 rectangle full of 1s.</p>