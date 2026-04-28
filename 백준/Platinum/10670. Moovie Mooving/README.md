# [Platinum III] Moovie Mooving - 10670

[문제 링크](https://www.acmicpc.net/problem/10670)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 185, 정답: 90, 맞힌 사람: 75, 정답 비율: 53.571%

### 분류

이분 탐색, 비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Bessie is out at the movies. &nbsp;Being mischievous as always, she has decided to hide from Farmer John for L (1 &lt;= L &lt;= 100,000,000) minutes, during which time she wants to watch movies continuously. She has N (1 &lt;= N &lt;= 20) movies to choose from, each of which has a certain duration and a set of showtimes during the day. &nbsp;Bessie may enter and exit a movie at any time during one if its showtimes, but she does not want to ever visit the same movie twice, and she cannot switch to another showtime of the same movie that overlaps the current showtime.</p>

<p>Help Bessie by determining if it is possible for her to achieve her goal of watching movies continuously from time 0 through time L. &nbsp;If it is, determine the minimum number of movies she needs to see to achieve this goal (Bessie gets confused with plot lines if she watches too many movies).&nbsp;</p>

### 입력

<p>The first line of input contains N and L.</p>

<p>The next N lines each describe a movie. &nbsp;They begin with its integer duration, D (1 &lt;= D &lt;= L) and the number of showtimes, C (1 &lt;= C &lt;= 1000). &nbsp;The remaining C integers on the same line are each in the range 0..L, and give the starting time of one of the showings of the movie. &nbsp;Showtimes are distinct, in the range 0..L, and given in increasing order.</p>

### 출력

<p>A single integer indicating the minimum number of movies that Bessie needs to see to achieve her goal. &nbsp;If this is impossible output -1 instead.&nbsp;</p>

### 힌트

<p>Bessie should attend the first showing of the fourth movie from time 0 to time 20. &nbsp;Then she watches the first showing of the first movie from time 20 to time 65. &nbsp;Finally she watches the last showing of the second movie from time 65 to time 100.&nbsp;</p>