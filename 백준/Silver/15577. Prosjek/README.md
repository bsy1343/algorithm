# [Silver IV] Prosjek - 15577

[문제 링크](https://www.acmicpc.net/problem/15577)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 413, 정답: 341, 맞힌 사람: 313, 정답 비율: 85.989%

### 분류

수학, 자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Little Ivica received N math grades and wants to calculate their average. He knows that the average of two numbers a and b is calculated as (a + b) / 2, but he still doesn&rsquo;t know how to do it for multiple numbers. He calculates the average by writing down N grades and repeating the following operations N - 1 times:</p>

<ol>
	<li>He chooses two numbers and erases them.</li>
	<li>He writes down the average of the two chosen numbers.</li>
</ol>

<p>After precisely N - 1 steps, the only number written down will be the one representing the average grade to Ivica. It is your task to determine the largest average that can be obtained this way.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 20), the number from the task.</p>

<p>The i<sup>th</sup> of the following N lines contains the integer X<sub>i</sub> (1 &le; X<sub>i</sub> &le; 5), the i<sup>th</sup> grade.</p>

### 출력

<p>Output the largest possible average from the task. Your solution is allowed to deviate from the official one for 0.000001.</p>

### 힌트

<p><strong>Clarification of the third test case:</strong></p>

<p>Initially, the numbers 1, 3 and 5 are written down.</p>

<p>In the first step, Ivica chooses numbers 1 and 3, erases them and writes down 2. After the first step, 2 and 5 are written down.</p>

<p>In the second step, Ivica chooses the remaining two numbers which average is 3.5.</p>