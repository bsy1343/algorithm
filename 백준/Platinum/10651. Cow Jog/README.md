# [Platinum V] Cow Jog - 10651

[문제 링크](https://www.acmicpc.net/problem/10651)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 576, 정답: 218, 맞힌 사람: 178, 정답 비율: 37.712%

### 분류

자료 구조, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Farmer John&#39;s N cows (1 &lt;= N &lt;= 100,000) are out exercising their hooves again, jogging along an infinite track. &nbsp;Each cow starts at a distinct position on the track, and some cows run at different speeds.</p>

<p>The track is divided into lanes so that cows may move past each other. No two cows in the same lane may ever occupy the same position. Farmer John doesn&#39;t want any cow to have to change lanes or adjust speed, and he wonders how many lanes he will need to accomplish this if the cows are going to run for T minutes (1 &lt;= T &lt;= 1,000,000,000).</p>

### 입력

<p>The first line of input contains N and T.</p>

<p>The following N lines each contain the initial position and speed of a single cow. &nbsp;Position is a nonnegative integer and speed is a positive integer; both numbers are at most 1 billion. &nbsp;All cows start at distinct positions, and these will be given in increasing order in the input.</p>

### 출력

<p>A single integer indicating the minimum number of lanes necessary so that no two cows in the same lane ever occupy the same location (including at time T).</p>