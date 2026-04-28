# [Silver V] Tightly Packed - 32023

[문제 링크](https://www.acmicpc.net/problem/32023)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 68, 맞힌 사람: 42, 정답 비율: 38.182%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Consider packing widgets for shipping where widgets cannot be stacked upon each other (2D packing). Each widget has a 1x1 footprint and is 1 unit high.</p>

<p>Boxes are available in any $W$ by $H$ by 1 size such that $H/2 \leq W \leq 2H$, with $W$ and $H$ being integers. The company wants to minimize the amount of packing material that will be needed to fill empty squares in a box.</p>

<p>Given $N$, the number of widgets to be shipped, what is the smallest number of squares that will be left empty when those widgets are packed for shipping?</p>

### 입력

<p>Input consists of one line containing an integer $N$, the number of widgets to be packed.   $1 \leq N \leq 10^{16}$. </p>

### 출력

<p>Print a single line containing an integer denoting the minimum number of empty squares. </p>