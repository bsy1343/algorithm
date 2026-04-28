# [Gold III] Total control - 26255

[문제 링크](https://www.acmicpc.net/problem/26255)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

기하학, 이분 탐색, 다각형의 넓이

### 문제 설명

<p>ByteCity is the capital of Byteland. It can be described as a convex polygon with $n$ vertices, surrounded by walls.</p>

<p>The mayor of Bytecity decided to upgrade the weapons that the army of ByteCity is using. If new guns have a firing range $d$ ($d \ge 0$) then the mayor of the city would consider all terrain inside the city and all terrain on the distance no further than $d$ from the city walls as loyal.</p>

<p>Pride of the mayor will be satisfied if loyal area will be at least $S$. What is the minimum value of guns&#39; firing range he need to buy for his army?</p>

### 입력

<p>In the first line you are given two integers $n$ and $S$ ($3 \le n \le 5 \cdot 10^4, 1 \le S \le 10^{13}$) --- number of vertices in city polygon and needed area of loyal terrain.</p>

<p>In each of the next $n$ lines you are given two integers $x$ and $y$ ($-10^6 \le x, y \le 10^6$) --- coordinates of polygon vertices.</p>

<p>It is guaranteed that these $n$ points are vertices of convex polygon given in counterclockwise order.</p>

### 출력

<p>Output a single number --- minimum fire range of guns. Your answer considered will be correct if its absolute or relative error doesn&#39;t exceed $10^{-6}$.</p>