# [Gold III] Gone Fishing - 9183

[문제 링크](https://www.acmicpc.net/problem/9183)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

구현, 다이나믹 프로그래밍, 자료 구조, 그리디 알고리즘, 브루트포스 알고리즘, 우선순위 큐, 역추적

### 문제 설명

<p>John is going on a fishing trip. He has h hours available (1 &lt;= h &lt;= 16), and there are n lakes in the area (2 &lt;= n &lt;= 25), L<sub>1</sub>, ..., L<sub>n</sub>, all reachable along a single, one-way road. John starts at lake 1, but he can finish at any lake he wants. He can only travel from one lake to the next one, but he does not have to stop at any lake unless he wishes to. For each i = 1, ..., n-1, the number of 5-minute intervals it takes to travel from L<sub>i</sub> to L<sub>i+1</sub>&nbsp;is denoted t<sub>i</sub> (0 &lt; t<sub>i</sub> &lt;= 192). For example, t<sub>3</sub> = 4 means that it takes 20 minutes to travel from L<sub>3</sub> to L<sub>4</sub></p>

<p>To help plan his fishing trip, he has gathered some information about the lakes. For each lake L<sub>i</sub>, the number of fish expected to be caught in the initial 5 minutes, denoted F<sub>i</sub> (F<sub>i</sub> &gt;= 0), is known. Each 5 minutes of fishing decreases the number of fish expected to be caught in the next 5-minute interval by a constant rate of d<sub>i</sub> (d<sub>i</sub> &gt;= 0). If the number of fish expected to be caught in an interval is less than d<sub>i</sub>, there will be no more fish left in the lake in the next interval. To simplify the planning, John assumes that no one else will be fishing at the lakes to affect the number of fish in the lakes.&nbsp;</p>

<p>Write a program to help John plan his fishing trip to maximize the number of fish expected to be caught. The number of minutes spent fishing at each lake must be a multiple of 5.&nbsp;</p>

### 입력

<p>You will be given a number of cases in the input. Each case starts with a line containing n. This is followed by a line containing h. This is followed by a line of n integers specifying F<sub>i</sub> (i = 1, ..., n), followed by a line of n integers d<sub>i</sub> (i = 1, ..., n), and finally, a line of n-1 integers t<sub>i</sub> (i = 1, ..., n-1). Input is terminated by a case in which n = 0.&nbsp;</p>

### 출력

<p>For each test case, print the number of minutes spent fishing at each lake, separated by commas, for the plan achieving the maximum number of fish expected to be caught (you should print the entire plan on one line even if it exceeds 80 characters). This is followed by a line containing the number of fish expected. If multiple plans exist, choose the one that spends as long as possible at L<sub>1</sub>, even if no fish are expected to be caught in some intervals. If there is still a tie, choose the one that spends as long as possible at L<sub>2</sub>, and so on. Insert a blank line between cases.&nbsp;</p>