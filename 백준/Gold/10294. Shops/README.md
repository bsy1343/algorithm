# [Gold III] Shops - 10294

[문제 링크](https://www.acmicpc.net/problem/10294)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 34, 정답: 19, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>In a country fair, the shopping area is divided into N x 5 cells with N columns and 5 rows. (1 &lt;= N &lt;= 50,000) Each cell is out for rent. You have survey the site and, for any cell, calculate the estimated profit if you rent that cell. Ideally, as you have unlimited money for renting, you would like to rent all the cells, but the fair organizer prevents any company to rent any two cells which are adjacent. (Two cells are adjacent if they are next to each other in the up, down, left and right direction.)&nbsp;</p>

<p>Your task is to write a program that calculate the maximum profit that you can get by renting cells that are all non-adjacent.&nbsp;</p>

### 입력

<p>The first line of the input denotes an integer T, (1 &lt;= T &lt;= 5) the number of test cases. Then T test cases follows in the format described next.&nbsp;</p>

<ul>
	<li>The first line of the test case contains an integer N (1 &lt;= N &lt;= 50,000)</li>
	<li>The next 5 lines shows the profits on all the cells. That is, line 1+i contains N nonnegative integers representing the profits on all cells in row i. The profits will be at most 10,000.&nbsp;</li>
</ul>

### 출력

<p>For each test case, output one integer which is the maximum total profit that you can get by renting cells which are non-adjacent.</p>