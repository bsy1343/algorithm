# [Silver I] Displacing Particles - 26204

[문제 링크](https://www.acmicpc.net/problem/26204)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 24, 맞힌 사람: 21, 정답 비율: 95.455%

### 분류

수학

### 문제 설명

<p>A square has its vertices at the coordinates $(0, 0)$, $(0, 2^N)$, $(2^N , 2^N )$, $(2^N , 0)$. Each vertex has an attractor. A particle is placed initially at position $(2^{N-1} , 2^{N-1})$. Each attractor can be activated individually, any number of times. When an attractor at position $(i, j)$ is activated, if a particle is at position $(p, q)$, it will be moved to the midpoint between $(i, j)$ and $(p, q)$.</p>

<p>Given $N$ and a point $(x, y)$, calculate the least number of times you have to activate the attractors so that the particle ends up at position $(x, y)$.</p>

### 입력

<p>The input consists of a single line containing three integers $N$, $x$ and $y$, such that $1 &le; N &le; 20$ and $0 &lt; x, y &lt; 2^N$.</p>

### 출력

<p>Print a single line, containing the least number of times you have to active the attractors.</p>