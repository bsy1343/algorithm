# [Gold III] Clumsy Cardinals - 24925

[문제 링크](https://www.acmicpc.net/problem/24925)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 13, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 정렬, 집합과 맵, 해시를 사용한 집합과 맵, 분리 집합

### 문제 설명

<p>Everyone knows that in the game&nbsp;<em>chess</em>, a bishop moves diagonally. Boring! Consider a new piece called a&nbsp;<b>cardinal</b>. A cardinal moves diagonally, like a bishop but they are clumsy. If its movement brings a cardinal adjacent to another piece, it&nbsp;<em>trips</em>&nbsp;and falls on the other piece. This results in the other piece being captured and removed from the board. The cardinal that was moving then rests on the captured piece&rsquo;s square. Note two squares are adjacent if they share a side, meaning they are directly horizontal or vertical from one another. A cardinal can also capture pieces like a bishop if the other piece lies on the same diagonal. A cardinal can only move if the movement results in the capture of another piece.</p>

<p>In this problem, you are given the initial locations of cardinal pieces on an infinite chessboard. Determine the minimum number of cardinals that remain on the board under some sequence of valid moves.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2bdadecc-c85a-4e5e-9967-9a9a4921ffe8/-/preview/" style="width: 300px; height: 309px;" /></p>

<center>
<p><b>Figure 1</b>: Illustration of a sequence of moves for sample input 3 that reduces the number of cardinals to 3.&nbsp;<b>Step 1</b>: Move the cardinal at&nbsp;$(1,2)$&nbsp;to capture the cardinal at $(3,4$).&nbsp;<b>Step 2</b>: Move the cardinal at&nbsp;$(1,0)$&nbsp;to capture the cardinal at&nbsp;$(7,5)$. That is, the moving cardinal &ldquo;trips&rdquo; beside the cardinal at&nbsp;$(7,5)$&nbsp;and captures it.&nbsp;<b>Step 3</b>: Move the cardinal that is currently at&nbsp;$(3,4)$&nbsp;to capture the cardinal at&nbsp;$(1,7)$.&nbsp;<b>Step 4</b>: Move the cardinal at&nbsp;$(7,1)$&nbsp;to capture the cardinal at&nbsp;$(1,7)$. Note at this time there is no cardinal at&nbsp;$(3,4)$&nbsp;so we move the cardinal past this square without &ldquo;tripping&rdquo; onto it. The final squares with cardinals are&nbsp;$(1,7)$,&nbsp;$(3,7)$, and&nbsp;$(7,5)$&nbsp;and we cannot move any remaining cardinal to capture another cardinal.</p>
</center>

### 입력

<p>The first line of input contains a single integer $N$ ($1&le;N&le;10^5$), which is the number of cardinal pieces to consider.</p>

<p>The next line contains&nbsp;$2N$&nbsp;space-separated integers&nbsp;$r_1,c_1,r_2,c_2,\dots ,r_N,c_N$&nbsp;($10^{-9}&le;r_i,c_i&le;10^9$). These give the initial cardinal locations, so cardinal&nbsp;$i$&nbsp;initially lies on square&nbsp;$(r_i,c_i)$. Furthermore,&nbsp;$|r_i-r_j|&ge;2$&nbsp;or&nbsp;$|c_i-c_j|&ge;2$&nbsp;(or both) for any&nbsp;$1&le;i&lt;j&le;N$.</p>

### 출력

<p>Display the minimum number of cardinals that remain on the board though some sequence of valid moves.</p>