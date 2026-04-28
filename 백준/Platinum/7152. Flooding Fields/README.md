# [Platinum I] Flooding Fields - 7152

[문제 링크](https://www.acmicpc.net/problem/7152)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 6, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최대 유량

### 문제 설명

<p>Farmer John has a problem: it&rsquo;s raining, and his pastures are at risk of flooding. Luckily he&rsquo;s invested in a state-of-the-art drain system that ensures that the water level is the same across the farm. He hasn&rsquo;t been as lucky with the terrain. Farmer John&rsquo;s cows can only stand on dry land: if the land becomes wet, any cow on that land drowns. Luckily, cows can move one grid sector each hour, giving them a chance to escape the water (the levels of which rise and fall each hour).</p>

<p>Farmer John has divided his field into grid sectors, which he indexes with a row and column. Each grid sector is small enough to only be able to hold one cow.</p>

<p>Given a description of Farmer John&rsquo;s field, the starting locations of his cows, and the height of the water at each hour, and assuming that Farmer John&rsquo;s cows are extremely intelligent and prescient, and so can always make the best move, what is the maximum number of Farmer John&rsquo;s cows that could survive?</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with three integers, n (1&le;n&le;100), k (0&le;k&le;100), and h (1&le;h&le;24), where n represents the size of Farmer John&rsquo;s field (it&rsquo;s nxn grid sectors), k is the number of cows in the field, and h is the number of hours he needs to track.</p>

<p>Each of the next n lines will contain n integers each, which represent the height of each grid sector of Farmer John&rsquo;s field (0&le;height&le;100). The first row in the input is row 0, and the last is row n-1. The first column in each row is column 0, and the last is column n-1.</p>

<p>The following k lines will each contain a pair of integers, r followed by c (0&lt;=r,c&lt;n). Each line indicates the grid sector position of one cow at hour 0, where r is the row and c is the column. No two cows will be in the same position.</p>

<p>The next h lines will each contain a single integer, indicating the level of the flood at that hour (0&le;level&le;100). These lines are given in order: hour 1 first, then hour 2, and so on. Note that the times start at hour 1, and the cows&rsquo; positions are given at hour 0, so the cows have an opportunity to move (or MOOOOve) before the first hour&rsquo;s flood. A grid square is considered to be flooded if its height&le;level of the flood at a given hour.</p>

<p>The input will end with a line with three 0s.&nbsp;</p>

### 출력

<p>For each test case, output a single integer denoting the maximum possible number of surviving cows. Do not output any spaces, and do not print any blank lines between answers.</p>