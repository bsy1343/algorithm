# [Silver I] Hippity Hopscotch - 4421

[문제 링크](https://www.acmicpc.net/problem/4421)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 56, 정답: 34, 맞힌 사람: 29, 정답 비율: 70.732%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>The game of hopscotch involves chalk, sidewalks, jumping, and picking things up. Our variant of hopscotch involves money as well. The game is played on a square grid of dimension n: each grid location is labelled (p,q) where 0 &lt;= p &lt; n and 0 &lt;= q &lt; n. Each grid location has on it a stack of between 0 and 100 pennies.</p>

<p>A contestant begins by standing at location (0,0). The contestant collects the money where he or she stands and then jumps either horizontally or vertically to another square. That square must be within the jumping capability of the contestant (say, k locations) and must have more pennies than those that were on the current square.</p>

<p>Given n, k, and the number of pennies at each grid location, compute the maximum number of pennies that the contestant can pick up before being unable to move.</p>

### 입력

<ul>
	<li>a line containing two integers between 1 and 100: n and k</li>
	<li>n lines, each with n numbers: the first line contains the number of pennies at locations (0,0) (0,1) ... (0,n-1); the next line contains the number of pennies at locations (1,0), (1,1), ... (1,n-1), and so on.</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>a single integer giving the number of pennies collected</li>
</ul>