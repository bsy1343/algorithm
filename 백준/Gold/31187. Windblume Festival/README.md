# [Gold IV] Windblume Festival - 31187

[문제 링크](https://www.acmicpc.net/problem/31187)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 25, 맞힌 사람: 21, 정답 비율: 43.750%

### 분류

애드 혹

### 문제 설명

<p>The Windblume Festival in Mondstadt is coming! People are preparing windblumes for Barbatos and for those they love and adore. The Windblume Festival is also an opportunity to improve the relationships people have.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31187.%E2%80%85Windblume%E2%80%85Festival/8d28f45a.png" data-original-src="https://upload.acmicpc.net/36f9010f-a9f4-4ea3-a5fd-b2cf6f567bdf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 333px; height: 249px;" /></p>

<p style="text-align: center;">Source: Genshin Impact Official</p>

<p>During the festival, a famous game will be played every year, invented by Jean, the Acting Grand Master of the Knights of Favonius. In the game, $n$ players numbered from $1$ to $n$ stand in a circle, each holding an integer with them. Each turn, one player will be removed. The game will end when there is only one player left.</p>

<p>For each turn, let $k$ be the number of players remaining and $a_i$ be the integer player $i$ holds. Two adjacent players, $x$ and $(x \bmod k + 1)$ are selected and player $(x \bmod k + 1)$ is removed from the game. Player $x$&#39;s integer will then change from $a_x$ to $(a_x - a_{x \bmod k + 1})$. Player $y$ in this turn will become player $(y - 1)$ in the next turn for all $x &lt; y \le k$, though the integer they hold will not change.</p>

<p>Jean wants to know the maximum possible integer held by the last remaining player in the game by selecting the players in each round optimally.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains one integer $T$ indicating the number of test cases. For each test case:</p>

<p>The first line contains one integer $n$ ($1 \le n \le 10^6$) indicating the initial number of players.</p>

<p>The next line contains $n$ integers $a_i$ ($-10^9 \le a_i \le 10^9$) where $a_i$ is the integer held by player $i$ at the beginning.</p>

<p>It is guaranteed that the sum of $n$ of all test cases will not exceed $10^6$.</p>

### 출력

<p>For each test case output one line containing one integer indicating the maximum possible integer.</p>

### 힌트

<p>For the first sample test case follow the strategy shown below, where the underlined integers are the integers held by the players selected in each turn.</p>

<p>$\{\underline{1}, -3, 2, \underline{-4}\}$ (select $x = 4$) $\to$ $\{-3, \underline{2, -5}\}$ (select $x = 2$) $\to$ $\{\underline{-3, 7}\}$ (select $x = 2$) $\to$ $\{10\}$.</p>