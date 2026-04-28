# [Gold IV] Square Counting - 23989

[문제 링크](https://www.acmicpc.net/problem/23989)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 37, 맞힌 사람: 26, 정답 비율: 70.270%

### 분류

조합론, 수학

### 문제 설명

<p>Mr. Panda has recently fallen in love with a new game called Square Off, in which players compete to find as many different squares as possible on an evenly spaced rectangular grid of dots. To find a square, a player must identify four dots that form the vertices of a square. Each side of the square must have the same length, of course, but it does not matter what that length is, and the square does not necessarily need to be aligned with the axes of the grid. The player earns one point for every different square found in this way. Two squares are different if and only if their sets of four dots are different.</p>

<p>Mr. Panda has just been given a grid with&nbsp;<b>R</b>&nbsp;rows and&nbsp;<b>C</b>&nbsp;columns of dots. How many different squares can he find in this grid? Since the number might be very large, please output the answer modulo 10<sup>9</sup>&nbsp;+ 7 (1000000007).</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;lines follow. Each line has two integers&nbsp;<b>R</b>&nbsp;and&nbsp;<b>C</b>: the number of dots in each row and column of the grid, respectively.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of different squares can be found in the grid.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>The pictures below illustrate the grids from the three sample cases and a valid square in the third sample case.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/18bc243c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/18bc243c.png" data-original-src="https://upload.acmicpc.net/f181a6dc-a5c7-494c-a3dd-a61657c642c9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/dbc4cbfc.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/dbc4cbfc.png" data-original-src="https://upload.acmicpc.net/e8ae0c35-cd65-40d0-8ba2-6a133349eb1d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/3565d3f9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/23989.%E2%80%85Square%E2%80%85Counting/3565d3f9.png" data-original-src="https://upload.acmicpc.net/2f65a4c4-0786-4f0a-8ed0-ec168ccd66ed/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>