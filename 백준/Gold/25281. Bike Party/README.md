# [Gold V] Bike Party - 25281

[문제 링크](https://www.acmicpc.net/problem/25281)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>There will be multiple great parties tonight after the competition, and Robin is very excited for a night out. At each party Robin will be served one drink containing a fixed amount of alcohol measured in alcohol units, that is consumed immediately upon arrival. The hosts of the parties are not all equally generous. They put different amounts of alcohol in their drinks and some might even serve a non-alcoholic drink!</p>

<p>The parties are located along a circular route. Robin will bike along the circle, visiting every party once, going to bed at the last party which is the same as the first party. Each meter of biking sobers up one unit of alcohol (i.e., the alcohol level is reduced by one). Robin starts completely sober (i.e., at alcohol level zero).</p>

<p>Find a party to start (and end) the journey at such that Robin never becomes sober at any point in time during the night. It is not even allowed to become sober in the moment of arrival to a new location (even if Robin immediately drinks more alcohol upon arrival, the brief moment of soberness would ruin the experience). The only exception is that it is allowed to become sober in the moment when Robin reaches the final party and goes to bed.</p>

<p>Robins alcohol level has no upper limit.</p>

### 입력

<p>The first line of input contains a single integer $ 3 \leq N \leq 100\,000 $, the number of parties.</p>

<p>Then follow $N$ lines. Each line, numbered $i \in \{ 1, 2, \ldots, N \}$, consists of two integers $ 0 \leq A_i \leq 10^9 $ and $ 0 &lt; D_i \leq 10^9 $, where $A_i$ is the amount of alcohol Robin will receive at the $i$th party in alcohol units, and $D_i$ is the distance to the next party along the circle (to party $i+1$ if $i &lt; N$, and to party $1$ if $i == N$) in meters.</p>

### 출력

<p>A single integer, the $1$-based index of the party where Robin should start the bike party without running out of alcohol.</p>

<p>If no solution exists output a single line with the string &quot;impossible&quot;.</p>

<p>If there are multiple possible answers, any will be considered correct.</p>