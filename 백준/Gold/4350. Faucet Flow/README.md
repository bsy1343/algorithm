# [Gold II] Faucet Flow - 4350

[문제 링크](https://www.acmicpc.net/problem/4350)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 6, 맞힌 사람: 6, 정답 비율: 23.077%

### 분류

애드 혹, 많은 조건 분기

### 문제 설명

<p>A faucet is pouring water into a long, thin aquarium with various vertical dividers (walls) in it. The aquarium is initially empty, and its bottom is perfectly level. How long will it take for water to spill over its left- or right-most divider? The faucet is above location x=0, and the dividers are located at x=-1, -3, -5, ..., <em>leftx</em> and 1, 3, 5, ..., <em>rightx</em>. The dividers are attached perpendicular to the floor and sides of the aquarium, and have various heights. The aquarium&#39;s length is greater than <em>rightx</em>-<em>leftx</em>, its walls are higher than the highest divider, and its width is 1 unit everywhere. Water pours from the faucet at a rate of 1 cubic unit per second. [You may assume that water is an ideal liquid: it always flows downhill and if it cannot flow downhill it spreads at an equal rate in all horizontal directions.]</p>

### 입력

<p>Each test case consists of two integers <em>leftx</em> (an odd number &lt;= -1) and <em>rightx</em> (an odd number &gt;= 1). Subsequent lines contain the height (a positive integer) of each divider from left to right. There will be no more than 1000 dividers in any test case. Input is terminated with a line containing two zeros.</p>

### 출력

<p>For each case, output an integer on a single line, indicating how long it will take, in seconds, before water starts spilling over either the left or right divider.</p>