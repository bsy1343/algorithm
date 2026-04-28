# [Gold V] Huge Numbers - 24009

[문제 링크](https://www.acmicpc.net/problem/24009)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 431, 정답: 137, 맞힌 사람: 105, 정답 비율: 33.439%

### 분류

수학, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>Professor Shekhu has another problem for Akki today. He has given him three positive integers&nbsp;<b>A</b>,&nbsp;<b>N</b>&nbsp;and&nbsp;<b>P</b>&nbsp;and wants him to calculate the remainder when&nbsp;<b>A<sup>N!</sup></b>&nbsp;is divided by&nbsp;<b>P</b>. As usual,&nbsp;<b>N!</b>&nbsp;denotes the product of the first&nbsp;<b>N</b>&nbsp;positive integers.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;lines follow. Each line contains three integers&nbsp;<b>A</b>,&nbsp;<b>N</b>&nbsp;and&nbsp;<b>P</b>, as described above.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the answer.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, the answer is the remainder when 2<sup>1!</sup>&nbsp;= 2 is divided by 2, which is 0.</p>

<p>In Sample Case #2, the answer is the remainder when 3<sup>3!</sup>&nbsp;= 3<sup>6</sup>&nbsp;= 729 is divided by 2, which is 1.</p>