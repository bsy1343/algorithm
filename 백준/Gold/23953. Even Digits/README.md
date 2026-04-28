# [Gold IV] Even Digits - 23953

[문제 링크](https://www.acmicpc.net/problem/23953)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 35, 맞힌 사람: 34, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 수학

### 문제 설명

<p>Supervin has a unique calculator. This calculator only has a display, a plus button, and a minus button. Currently, the integer&nbsp;<b>N</b>&nbsp;is displayed on the calculator display.</p>

<p>Pressing the plus button increases the current number displayed on the calculator display by 1. Similarly, pressing the minus button decreases the current number displayed on the calculator display by 1. The calculator does not display any leading zeros. For example, if&nbsp;<code>100</code>&nbsp;is displayed on the calculator display, pressing the minus button once will cause the calculator to display&nbsp;<code>99</code>.</p>

<p>Supervin does not like odd digits, because he thinks they are &quot;odd&quot;. Therefore, he wants to display an integer with only even digits in its decimal representation, using only the calculator buttons. Since the calculator is a bit old and the buttons are hard to press, he wants to use a minimal number of button presses.</p>

<p>Please help Supervin to determine the minimum number of button presses to make the calculator display an integer with no odd digits.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each begins with one line containing an integer&nbsp;<b>N</b>: the integer initially displayed on Supervin&#39;s calculator.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the minimum number of button presses, as described above.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, the integer initially displayed on the calculator has no odd digits, so no button presses are needed.</p>

<p>In Sample Case #2, pressing the minus button three times will cause the calculator to display&nbsp;<code>8</code>. There is no way to satisfy the requirements with fewer than three button presses.</p>

<p>In Sample Case #3, either pressing the minus button once (causing the calculator to display&nbsp;<code>0</code>) or pressing the plus button once will cause the calculator to display an integer without an odd digit.</p>

<p>In Sample Case #4, pressing the plus button twice will cause the calculator to display&nbsp;<code>2020</code>. There is no way to satisfy the requirements with fewer than two button presses.</p>