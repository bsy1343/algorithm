# [Gold I] Fractal Painting - 34786

[문제 링크](https://www.acmicpc.net/problem/34786)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

(분류 없음)

### 문제 설명

<p>A fractal painting consists of an infinite number of line segments. The first segment, called A, connects points $(0, 0)$ and $(x_0, y_0)$.</p>

<p>The next two segments B and C connect $(x_0, y_0)$ to $(x_1, y_1)$ and $(x_0, y_0)$ to $(x_2, y_2)$, respectively.</p>

<p>The rest of the painting is defined recursively. We draw two segments D and E from $(x_1, y_1)$ so that the segments B, D, E are <em>similar</em> to the segments A, B, C. Here, <em>similar</em> segments mean that they can be matched point-to-point by performing translating, rotating, and scaling on the original segments.</p>

<p>Similarly, we draw segments F and G from $(x_2, y_2)$ so that the segments C, F, G are similar to the segments A, B, C.</p>

<p>This procedure continues indefinitely.</p>

<p>Find out whether it is possible to find a rectangle (of any size) that contains the entire fractal painting.</p>

### 입력

<p>The first line of input contains a single integer $T$ $(1 \le T \le 10^4)$, representing the number of test cases. Each of the next $T$ lines describes a single test case. Each test case consists of a single line with six integers $x_0$, $y_0$, $x_1$, $y_1$, $x_2$, and $y_2$ in order. All coordinates are between $-10^4$ and $10^4$, inclusive. It is guaranteed that $(0, 0)$, $(x_0, y_0)$, $(x_1, y_1)$, and $(x_2, y_2)$ are all distinct points.</p>

### 출력

<p>For every test case, output <code>YES</code> if the entire fractal painting can fit in some rectangular frame. Output <code>NO</code> if there is no such rectangle.</p>