# [Platinum II] Rectpoints - 24320

[문제 링크](https://www.acmicpc.net/problem/24320)

### 성능 요약

시간 제한: 0.4 초, 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 31, 맞힌 사람: 26, 정답 비율: 31.325%

### 분류

값 / 좌표 압축, 자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스위핑

### 문제 설명

<p>Deni and Bob wonder how to spend the free time between their classes. They come up with the following. Deni marked N points on a graph paper. It is possible that some of the points are marked on the same place but they are still counted as different points. The graph paper is rectangular in shape with width d<sub>1</sub> and height d<sub>2</sub>, and on which the lower left vertex is assumed as a point with coordinates (0, 0), and the upper right vertex - with coordinates (d<sub>1</sub>, d<sub>2</sub>). Bob then came up with the numbers w and h, and together they began to search for a rectangle of width w and height h, with sides parallel to the sides of the graph paper and containing as many points as possible (including points on the sides of the sought rectangle). The big problem, however, was that they were not sure if they had found the maximum possible number of points that can be contained in such a rectangle. Deni knows that you are a very good programmer, so she asks you to write a program rectpoints.cpp that for given N points and sizes w and h for a rectangle, finds the maximum number of points that are contained in a rectangle of that size.</p>

### 입력

<p>From the first line of the standard input, your program reads three integers N, w and h - the number of points marked on the graph paper and the sizes of the rectangle they are looking for. From each of the next N lines, your program reads two integers x and y, separated by a space - the two coordinates of each of the marked points on the graph paper.</p>

### 출력

<p>On a single line, your program prints an integer equal to the maximum number of points that can be contained in a rectangle with sizes w and h, which has sides parallel to the sides of the graph paper.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10<sup>5</sup></li>
	<li>1 &le; x, y, w, h &le; 10<sup>8</sup></li>
</ul>