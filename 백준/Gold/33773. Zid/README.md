# [Gold I] Zid - 33773

[문제 링크](https://www.acmicpc.net/problem/33773)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

누적 합, 두 포인터, 브루트포스 알고리즘, 슬라이딩 윈도우

### 문제 설명

<p>Mr. Malnar wants to put up a picture of himself on the wall. The wall can be represented as a matrix with $n$ rows and $m$ columns. Since he has placed his picture on the wall many times before, some positions still have nails embedded in them. Such positions are marked with the symbol "<code>#</code>", while empty spots are marked with the symbol "<code>.</code>".</p>

<p>The picture has a rectangular shape with arbitrary dimensions and is placed on the wall in a way that it covers a rectangular area. The picture can be placed on the wall if it covers at most one position that contains a nail.</p>

<p>Help Mr. Malnar calculate the number of ways he can place his picture on the wall.</p>

### 입력

<p>The first line of input contains $n$ and $m$ ($1 ≤ n, m ≤ 500$), the dimensions of the wall.</p>

<p>In each of the next $n$ lines, there are $m$ characters $c_{ij}$, describing the wall. Each character will be either "<code>.</code>" or "<code>#</code>" (without quotes).</p>

### 출력

<p>In a single line of output, print the number of possible ways to place the picture on the wall.</p>

### 힌트

<p>Clarification of the first example: Each placement of the picture is valid as long as it covers at most one nail.</p>

<p>Clarification of the second example: The picture cannot be placed in a way that it covers positions $(3, 1)$ and $(4, 1)$ simultaneously.</p>