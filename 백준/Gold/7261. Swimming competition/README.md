# [Gold III] Swimming competition - 7261

[문제 링크](https://www.acmicpc.net/problem/7261)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 37.500%

### 분류

이분 탐색, 다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>Every pupil can participate in an open swimming competition in Bitlandia. Since registration in advance is not mandatory, organisers never know how many pupils will participate.</p>

<p>This year, the number of pupils attending is smaller than the number of swimlanes in Bitlandia, which is 500 000. The organisers decided to split the participants into smaller groups with at least A and at most B participants each.</p>

<p>Also, the organisers want to make the competition as fun as possible by making the speed of the swimmers in each group as similar as possible.</p>

<p>Write a program that divides the swimmers into groups so that the maximum, over all groups, of the absolute time difference between the slowest and the fastest swimmers is the smallest possible.</p>

### 입력

<p>There are three numbers given in the first line: the number of participants who came to competition (N) and the minimum (A) and maximum (B) possible number of swimmers in each group.</p>

<p>The following N lines contain the times t<sub>i</sub> that the swimmers take to complete the distance.</p>

<p>The input always leads to an existing solution.</p>

### 출력

<p>The output should be a single number &ndash; the smallest possible maximum, over all groups, of the difference between the times of the slowest and the fastest swimmers.</p>

### 제한

<ul>
	<li>2 &le; N &le; 1 000 000</li>
	<li>2 &le; A &le; B &le; 500 000</li>
	<li>1 &le; t<sub>i</sub> &le; 1 000 000 for all i</li>
</ul>