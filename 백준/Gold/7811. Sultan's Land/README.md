# [Gold IV] Sultan's Land - 7811

[문제 링크](https://www.acmicpc.net/problem/7811)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 159, 정답: 30, 맞힌 사람: 22, 정답 비율: 15.827%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>Sultan Al-Bandar, the ruler of Old West Sumatra Sultanate, has decided to give his land to his only son. Although the Sultan believes that his son will not misuse the land for some bad purposes, he still has some doubts on his son&#39;s capability to rule the land. Therefore, he decided to give his son a test, a puzzle test.</p>

<p>The Sultan drew N x N grids (virtually of course) on his land where any two adjacent grid intersections would have the same length. Then he placed some pillars on the land where each pillar was placed at one intersection. Then he summoned his son to come to the land.</p>

<p>&quot;Well, my dear son, if you are to choose four pillars to form an area where each pillar serves as a corner of that area, how many possible selections are there?&quot; asked the Sultan. His son replied him with a big smile. Just at the time the Sultan remembered that his son works for the Sultanate&#39;s Advance Combinatorial Ministry, so this problem might be too easy. Then he quickly added, &quot;Oh! Each side of the area should be parallel to the grid I have drawn before.&quot;</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/sultan.gif" style="height:221px; width:600px" /></p>

<p>To tell the truth, the Sultan himself actually had not prepared any answers since he spontaneously asked his after the big smile. Help this Sultan by writing a program to count how many possible selections can be made by applying the rules above.</p>

### 입력

<p>The input contains several test cases. Each case begins with two integers, N (2 &lt;= N &lt;= 100) the grid-size, and P (2 &lt;= P &lt;= N2) the number of pillars. Each grid will be numbered from 1 to N. The next P following lines each will contains two integers: r and c (1 &lt;= r, c &lt;= N) the row and column where the pillar is placed.</p>

<p>Input is terminated by a line containing two zeroes. This input should not be processed.</p>

### 출력

<p>For each case, output a line containing the number of possible selections can be made to form an area whose sides are parallel to the grid.</p>