# [Silver V] Allocation - 23895

[문제 링크](https://www.acmicpc.net/problem/23895)

### 성능 요약

시간 제한: 15 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 335, 정답: 228, 맞힌 사람: 200, 정답 비율: 69.686%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>There are&nbsp;<b>N</b>&nbsp;houses for sale. The i-th house costs&nbsp;<b>A<sub>i</sub></b>&nbsp;dollars to buy. You have a budget of&nbsp;<b>B</b>&nbsp;dollars to spend.</p>

<p>What is the maximum number of houses you can buy?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a single line containing the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>B</b>. The second line contains&nbsp;<b>N</b>&nbsp;integers. The i-th integer is&nbsp;<b>A<sub>i</sub></b>, the cost of the i-th house.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of houses you can buy.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>B</b>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>1 &le;&nbsp;<b>A<sub>i</sub></b>&nbsp;&le; 1000, for all i.</li>
</ul>

### 힌트

<p>In Sample Case #1, you have a budget of 100 dollars. You can buy the 1st and 3rd houses for 20 + 40 = 60 dollars.</p>

<p>In Sample Case #2, you have a budget of 50 dollars. You can buy the 1st, 3rd and 4th houses for 30 + 10 + 10 = 50 dollars.</p>

<p>In Sample Case #3, you have a budget of 300 dollars. You cannot buy any houses (so the answer is 0).</p>