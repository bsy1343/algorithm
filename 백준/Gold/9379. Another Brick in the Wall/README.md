# [Gold V] Another Brick in the Wall - 9379

[문제 링크](https://www.acmicpc.net/problem/9379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 28, 정답: 20, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>After years as a brick-layer, you&#39;ve been called upon to analyze the instability of brick walls. The instability of a wall can be approximated by the maximum damage to a wall in case of taking one brick out. A brick will fall if all bricks that are directly underneath it are removed. Note that if the space underneath a brick is partially empty, it does not fall. You are given the description of all bricks in a wall, and must determine the instability of the wall as described in the following sections.</p>

### 입력

<p>There are multiple test cases in the input. Each test case consists of a single line, &quot;M N&quot; (1 &le; M, N &le; 100) where M and N indicate the height and width (in units), respectively, of the input wall.</p>

<p>Each of the next M lines is a string of N digits which specifies a row in the wall. Each brick in a row is represented by a substring of the row (like s) such that every digit in s is the same, which is equal to the length of s too. For example, 333 and 22 are two bricks of length 3 and 2 respectively, but 111 specifies three bricks of length one. A 0 in a row means there is no brick in that place of wall. Note that the height of each brick is one. The input terminates with a line containing 0 0. You may assume that the input is correct. This means:</p>

<ol>
	<li>There is no brick such that the length of the brick does not conform to the digits in the brick (like 222 in the row 12221).</li>
	<li>No brick can fall initially.</li>
</ol>

### 출력

<p>For each test case, write a single line containing maximum sum of the bricks&rsquo; lengths that will fall if we take one brick out (including that brick).</p>