# [Gold III] Distance in Crosses - 23582

[문제 링크](https://www.acmicpc.net/problem/23582)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 35, 맞힌 사람: 20, 정답 비율: 74.074%

### 분류

수학, 애드 혹, 선형대수학

### 문제 설명

<p>Consider a plane partitioned into squares with side $1$. Let us choose a square and draw coordinate axes from its center parallel to its sides.</p>

<p>Next, let us draw a cross consisting of the central square and its four neighbors: the squares which share a side with it. Then pick the square centered at point $(2, 1)$ and draw another cross consisting of this square and its four neighbors. Tile the whole plane with such crosses: their centers will be in points with coordinates $(2 i + j, i - 2 j)$ for all possible integer $i$ and $j$. The tiling is shown alongside the examples.</p>

<p>Emilia stands at the center of some square on the plane. In one step, she can move from a square to one of its neighbors. If a step brings her to a different cross of the tiling, she has to pay one coin for this step. Steps such that Emilia remains in the same cross are free.</p>

<p>Let the <em>distance in crosses</em> between two squares $A$ and $B$ be the minimum possible number of coins that Emilia has to pay in order to get from $A$ to $B$. You are given the coordinates of two points on the plane: center of the initial square and center of the target square. Find the distance in crosses between them.</p>

### 입력

<p>The first line contains two integers $x_1$ and $y_1$, the coordinates of the initial square. The second line contains two integers $x_2$ and $y_2$, the coordinates of the destination square. All given coordinates do not exceed $10^{9}$ by absolute value.</p>

### 출력

<p>Print one integer: the distance in crosses from the initial square to the destination square.</p>