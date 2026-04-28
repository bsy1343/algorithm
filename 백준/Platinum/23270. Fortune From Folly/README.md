# [Platinum III] Fortune From Folly - 23270

[문제 링크](https://www.acmicpc.net/problem/23270)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 37, 맞힌 사람: 30, 정답 비율: 85.714%

### 분류

가우스 소거법, 선형대수학, 수학, 확률론

### 문제 설명

<p>Your friend &Oacute;mar&#39;s favourite video game is <em>Striker-Count</em>. But he has now grown tired of actually playing the game and is more interested in the lootboxes found in the game. Inside each lootbox there is an item of some level of rarity. &Oacute;mar is only interested in acquiring the rarest items in the game. When he starts the game, he chooses two numbers $n$ and $k$, such that $k \leq n$. He then opens lootboxes in the game until $k$ of the last $n$ lootboxes included an item of the highest rarity.</p>

<p>This activity amuses &Oacute;mar, but does not interest you in the slightest. You are more interested in the numbers: you know that each lootbox &Oacute;mar opens has probability $p$ of containing an item of highest rarity, independently for each lootbox. You want to find the expected number of lootboxes &Oacute;mar will open before concluding his process.</p>

### 입력

<p>The only line of the input contains the two integers $n$ and $k$ ($1 \le k \le n \le 6$), and the real number $p$ ($0 &lt; p \le 1$ and $p$ has at most four decimals after the decimal point), with meanings as described above.</p>

### 출력

<p>Output the expected number of lootboxes &Oacute;mar must open, with a relative error of at most $10^{-6}$. It is guaranteed that the input is such that this expected number does not exceed $10^9$.</p>