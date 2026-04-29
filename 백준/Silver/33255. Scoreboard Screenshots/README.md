# [Silver IV] Scoreboard Screenshots - 33255

[문제 링크](https://www.acmicpc.net/problem/33255)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 41, 정답: 28, 맞힌 사람: 20, 정답 비율: 66.667%

### 분류

구현, 정렬

### 문제 설명

<p>The MITIT 2025 Winter Contest has successfully ended with the participation of $K$ teams, and Busy Beaver has to write a report for the contest.</p>

<p>For the report, Busy Beaver took $N$ screenshots of the scoreboard during the contest. Each screenshot contains the scores of all $K$ teams when the screenshot was taken.</p>

<p>Unfortunately, Busy Beaver forgot in which order he took the screenshots! He assumes that if there were no regrades during the contest, each team’s score will be <strong>nondecreasing</strong> over time. Under this assumption, Busy Beaver wants to recover the order of the screenshots.</p>

<p>Determine if there is a valid ordering such that no team’s score decreases over time, and if it exists, print any such order.</p>

### 입력

<p>The first line contains two integers $N$ and $K$ ($2\leq N\leq 400$; $1\leq K\leq 400$) — the number of screenshots and teams.</p>

<p>The $i$-th of the next $N$ lines contains $K$ integers $a_{i,1},a_{i,2},\cdots ,a_{i,k}$ ($0\leq a_{i,j}\leq 900$), where $a_{i,j}$ is the score of the $j$-th team in the $i$-th screenshot.</p>

### 출력

<p>If a valid ordering exists, print “<code>YES</code>” (without quotes) on the first line. On the second line, print $N$ integers $b_1,\cdots ,b_N$, where $b_i$ is the index of the $i$-th screenshot in the valid ordering. If there are multiple solutions, you can print any of them.</p>

<p>If there is no valid ordering, print “<code>NO</code>” (without quotes).</p>