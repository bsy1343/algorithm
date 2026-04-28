# [Platinum V] K Best - 3639

[문제 링크](https://www.acmicpc.net/problem/3639)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 293, 정답: 83, 맞힌 사람: 65, 정답 비율: 26.531%

### 분류

정렬, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Demy has $n$ jewels. Each of her jewels has some value $v_i$ and weight $w_i$.&nbsp;</p>

<p>Since her husband John got broke after recent financial crises, Demy has decided to sell some jewels. She has decided that she would keep $k$ best jewels for herself.</p>

<p>She decided to keep such jewels that their specific value is as large as possible. That is, denote the specific value of some set of jewels $S = \{i_1, i_2, \ldots, i_k\}$ as&nbsp;</p>

<p>$$s(S) = \frac{\sum\limits_{j = 1}^k{v_{i_j}}}{\sum\limits_{j = 1}^k{w_{i_j}}}.$$</p>

<p>Demy would like to select such $k$ jewels that their specific value is maximal possible. Help her to do so.</p>

### 입력

<p>The first line of the input file contains $n$ --- the number of jewels Demy got, and $k$ --- the number of jewels she would like to keep ($1 \le k \le n \le 100\,000$).&nbsp;</p>

<p>The following $n$ lines contain two integer numbers each --- $v_i$ and $w_i$ ($0 \le v_i \le 10^6$, $1 \le w_i \le 10^6$, both the sum of all $v_i$ and the sum of all $w_i$ do not exceed $10^7$).&nbsp;</p>

### 출력

<p>Output $k$ numbers --- the numbers of jewels Demy must keep. If there are several solutions, output any one.</p>