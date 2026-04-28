# [Silver II] Cow Jog - 10654

[문제 링크](https://www.acmicpc.net/problem/10654)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 576, 정답: 265, 맞힌 사람: 207, 정답 비율: 48.252%

### 분류

구현, 자료 구조, 스택

### 문제 설명

<p>The cows are out exercising their hooves again! &nbsp;There are N cows jogging on an infinitely-long single-lane track (1 &lt;= N &lt;= 100,000). Each cow starts at a distinct position on the track, and some cows jog at different speeds.</p>

<p>With only one lane in the track, cows cannot pass each other. &nbsp;When a faster cow catches up to another cow, she has to slow down to avoid running into the other cow, becoming part of the same running group.</p>

<p>The cows will run for T minutes (1 &lt;= T &lt;= 1,000,000,000). &nbsp;Please help Farmer John determine how many groups will be left at this time. Two cows should be considered part of the same group if they are at the same position at the end of T minutes.</p>

### 입력

<p>The first line of input contains the two integers N and T.</p>

<p>The following N lines each contain the initial position and speed of a single cow. &nbsp;Position is a nonnegative integer and speed is a positive integer; both numbers are at most 1 billion. &nbsp;All cows start at &nbsp;distinct positions, and these will be given in increasing order in the input.</p>

### 출력

<p>A single integer indicating how many groups remain after T minutes.</p>