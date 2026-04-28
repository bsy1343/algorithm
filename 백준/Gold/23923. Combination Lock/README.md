# [Gold I] Combination Lock - 23923

[문제 링크](https://www.acmicpc.net/problem/23923)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 27, 맞힌 사람: 21, 정답 비율: 51.220%

### 분류

수학, 정렬, 누적 합, 슬라이딩 윈도우

### 문제 설명

<p>A combination lock has&nbsp;<b>W</b>&nbsp;wheels, each of which has the integer values 1 through&nbsp;<b>N</b>&nbsp;on it, in ascending order.</p>

<p>At any moment, each wheel shows a specific value on it.&nbsp;<b>X<sub>i</sub></b>&nbsp;is the initial value shown on the i-th wheel.</p>

<p>You can use a single move to change a wheel from showing the value X to showing either X+1 or X-1, wrapping around between 1 and&nbsp;<b>N</b>. For example, if a wheel currently shows the value 1, in one move you can change its value to 2 or&nbsp;<b>N</b>.</p>

<p>Given all wheels&#39; initial values, what is the minimum number of moves to get all wheels to show the same value?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow.</p>

<p>The first line of each test case contains the two integers&nbsp;<b>W</b>&nbsp;and&nbsp;<b>N</b>.</p>

<p>The second line contains&nbsp;<b>W</b>&nbsp;integers. The i-th integer is&nbsp;<b>X<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of moves to get all wheels to show the same value.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>X<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the best solution is to get all wheels to show value 3, which would take a total of 2 moves: the first wheel would move once (from value 2 to value 3), the second wheel would not move (it already shows value 3), and the third wheel would move once (from value 4 to value 3).</p>

<p>For reference, it would take 5 moves to get all wheels to show value 1, 3 moves to get all wheels to show value 2, 3 moves to get all wheels to show value 4, and 5 moves to get all wheels to show value 5.</p>

<p>In Sample Case #2, the best solutions are to get all wheels to show either value 1, 2, 9 or 10, which would take a total of 8 moves.</p>