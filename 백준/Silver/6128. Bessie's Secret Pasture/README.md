# [Silver IV] Bessie's Secret Pasture - 6128

[문제 링크](https://www.acmicpc.net/problem/6128)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 122, 정답: 100, 맞힌 사람: 71, 정답 비율: 82.558%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>Farmer John has cut an almost unlimited number of square pieces of sod (grass sections) of all integer side-lengths from the pasture (sometimes FJ doesn&#39;t engage the blade properly and even makes a 0-sided sod squares). He has placed them in nicely organized piles that Bessie spotted one afternoon.</p>

<p>Bessie, always hoping to put delicious grass in her secret pasture, decided to carry precisely four of these sod sections over to her pasture and carve them into 1x1 sections in order to tile its N (1 &lt;= N &lt;= 10,000) unit-square sections.</p>

<p>Bessie is interested in knowing how many different ways she can choose four sod sections to tile her secret pasture. If she had a pasture of size 4, she might haul sod squares in these five different ways: (1,1,1,1), (2,0,0,0), (0,2,0,0), (0,0,2,0), (0,0,0,2). &nbsp;Order counts: (4,3,2,1) is a different way of choosing than (1,2,3,4).</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the number of different ways Bessie can choose four sod sections for her pasture</li>
</ul>