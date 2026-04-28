# [Bronze III] Simplified Calendar System - 25774

[문제 링크](https://www.acmicpc.net/problem/25774)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 331, 정답: 252, 맞힌 사람: 220, 정답 비율: 75.342%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Consider a simplified calendar system where each year is 12 months and each month is 30 days, i.e., each year is 360 days. This sure makes the math easy, or does it?</p>

<p>Given a date and what day of the week it is, determine what day of the week a second date is. The second date will be after (timewise) the first date.</p>

### 입력

<p>There are two input lines. The first input line contains four integers:</p>

<ul>
	<li>d (1 &le; d &le; 30), providing what day of the month the first date is,</li>
	<li>m (1 &le; m &le; 12), providing what month of the year the first date is,</li>
	<li>y (1000 &le; y &le; 2999), providing what year the first date is, and</li>
	<li>n (1 &le; n &le; 7), providing what day of the week the given date is (1 represents Sunday, 2 represents Monday, &hellip;, 7 represents Saturday).</li>
</ul>

<p>The second input line provides the second date; it contains three integers (similar to the first three integers of the first input line). Again, the second date will be later than the first date (timewise).</p>

### 출력

<p>Print an integer (between 1 and 7, inclusive) indicating what day of the week the second date is.</p>