# [Platinum V] Anti-Distance - 23651

[문제 링크](https://www.acmicpc.net/problem/23651)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 12, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘

### 문제 설명

<p>Consider a plane partitioned into squares with side $1$. Let us choose a square and draw coordinate axes from its center parallel to its sides.</p>

<p>Each fifth square contains an obstacle: more precisely, the obstacles are placed in all squares with centers at points $(2 i + j, i - 2 j)$ for all possible integer $i$ and $j$. The exact placement of obstacles is visualized in the example notes below. All other squares are free.</p>

<p>Amelia stands in some free square $A$ and wants to move to some free square $B$. In one step, she can move from a square to one of its neighbors: the squares sharing a side with it, but only if the corresponding neighboring square is free. What is the minimum possible number of steps Amelia must make to arrive to square $B$?</p>

### 입력

<p>The first line contains two integers $x_1$ and $y_1$, the coordinates of the initial square $A$. The second line contains two integers $x_2$ and $y_2$, the coordinates of the destination square $B$. All given coordinates are between $1$ and $10^{9}$. It is guaranteed that both given squares are free.</p>

### 출력

<p>Print one integer: the minimum possible number of steps from the initial square to the destination square.</p>