# [Gold III] Cutting with Lasers - 26203

[문제 링크](https://www.acmicpc.net/problem/26203)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 16, 맞힌 사람: 15, 정답 비율: 83.333%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>A laser cutting machine for wood sheets has a laser head that can move in only two directions, horizontal and vertical. You have been hired to be part of the testing team for the machine.</p>

<p>One of the tests consists of programming the machine to perform a non-empty sequence of consecutive cuts that starts and ends at the same point. Each cut in the sequence, except the first, starts at the point at which the previous cut ended. No cuts touch the edge of the sheet to be cut. Figures (a) and (b) below show two examples of cutting sequences, with respectively $8$ and $14$ cuts.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/aff9affd-c9ce-4bf6-8ba8-1834e2e78199/-/preview/" style="width: 271px; height: 119px;" /></p>

<p>Your boss asked you to determine the area of the largest piece produced by the sequence of cuts, disregarding the piece attached to the edges of the cut sheet. That is, only the pieces contained in the polygon formed by the cut lines should be considered. Figures (c) and (d) below show respectively the largest pieces produced by the cuts of figures (a) and (b).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f823a285-b0ea-4895-ae98-00f44a2f3a8c/-/preview/" style="width: 298px; height: 119px;" /></p>

<p>To illustrate, figures (e) and (f) below show the discarded piece (which contains the edges of the wood sheet) of the cut sequences of figures (a) and (b), respectively.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6ada4c75-ad2d-4a7d-991a-0beff90bd0d3/-/preview/" style="width: 298px; height: 119px;" /></p>

### 입력

<p>The first line contains an integer $N$, the number of cuts in the sequence ($4 &le; N &le; 10^4$). The second line contains two integers $X_0$ and $Y_0$, the initial position of the laser head in the sequence of cuts ($1 &le; X_0 &le; 10^3$ and $1 &le; Y_0 &le; 10^3$). Each of the next $N$ lines contains two integers $X_i$ and $Y_i$ , the final position of the cut $i$ ($1 &le; X_i &le; 10^3$ and $1 &le; Y_i &le; 10^3$, for $1 &le; i &le; N$, and $(X_N , Y_N ) = (X_0, Y_0)$). All positions given in the input are distinct, except the first and the last positions.</p>

### 출력

<p>Your program must output a single line, containing a single integer, the area of the largest piece produced by the sequence of cuts.</p>