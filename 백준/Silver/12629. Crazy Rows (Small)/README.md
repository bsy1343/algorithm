# [Silver III] Crazy Rows (Small) - 12629

[문제 링크](https://www.acmicpc.net/problem/12629)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 62, 맞힌 사람: 56, 정답 비율: 76.712%

### 분류

구현, 브루트포스 알고리즘, 정렬

### 문제 설명

<p>You are given an&nbsp;<strong>N</strong>&nbsp;x&nbsp;<strong>N</strong>&nbsp;matrix with 0 and 1 values. You can swap any two&nbsp;<em>adjacent</em>&nbsp;rows of the matrix.</p>

<p>Your goal is to have all the 1 values in the matrix below or on the main diagonal. That is, for each X where 1 &le; X &le; N, there must be no 1 values in row X that are to the right of column X.</p>

<p>Return the minimum number of row swaps you need to achieve the goal.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow.<br />
The first line of each test case has one integer,&nbsp;<strong>N</strong>. Each of the next&nbsp;<strong>N</strong>&nbsp;lines contains&nbsp;<strong>N</strong>characters. Each character is either 0 or 1.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 60</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 8</li>
</ul>

### 출력

<p>For each test case, output</p>

<pre>
Case #X: K</pre>

<p>where&nbsp;<strong>X</strong>&nbsp;is the test case number, starting from 1, and&nbsp;<strong>K</strong>&nbsp;is the minimum number of row swaps needed to have all the 1 values in the matrix below or on the main diagonal.</p>

<p>You are guaranteed that there is a solution for each test case.</p>