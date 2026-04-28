# [Platinum V] Square Overlap - 5855

[문제 링크](https://www.acmicpc.net/problem/5855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 93, 정답: 31, 맞힌 사람: 19, 정답 비율: 37.255%

### 분류

스위핑

### 문제 설명

<p>Farmer John is planning to build N (2 &lt;= N &lt;= 50,000) square fenced-in pastures on his farm, each of size exactly K x K (1 &lt;= K &lt;= 1,000,000). Pasture i is centered at point (x_i, y_i) with integer coordinates in the range -1,000,000...1,000,000.  However, in his haste to complete his plans, FJ realizes that he may have accidentally placed two pastures in locations that overlap (by overlap, this means the two pastures share a positive area in common).  No two pastures share the exact same center point.</p><p>Given the locations of each of the planned square pastures, please help FJ compute the area shared by the two overlapping pastures.  Output zero if no two squares overlap, and -1 if overlap occurs between more than a single pair of pastures.</p>

### 입력

<ul><li>Line 1: Two space-separated integers, N and K.  K is guaranteed to be even.</li><li>Lines 2..1+N: Line i+1 contains the integers x_i and y_i, describing the center of the ith pasture.</li></ul>

### 출력

<ul><li>Line 1: The area shared by the two overlapping squares.  Output zero if no two squares overlap, and -1 if overlap occurs between more than a single pair of pastures.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 squares, each of size 6 x 6.  The first square is centered at (0,0), and so on.</p><h4>Output Details</h4><p>Pastures #1 and #3 overlap in 20 units of area.</p>