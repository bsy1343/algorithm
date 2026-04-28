# [Platinum I] Modern Art 3 - 21230

[문제 링크](https://www.acmicpc.net/problem/21230)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 258, 정답: 110, 맞힌 사람: 91, 정답 비율: 42.130%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Having become bored with standard 2-dimensional artwork (and also frustrated at others copying her work), the great bovine artist Picowso has decided to switch to a more minimalist, 1-dimensional style. Her latest painting can be described by a 1-dimensional array of colors of length $N$ ($1 \leq N \leq 300$), where each color is specified by an integer in the range $1\ldots N$.</p>

<p>To Picowso&#39;s great dismay, her competitor Moonet seems to have figured out how to copy even these 1-dimensional paintings! Moonet will paint a single interval with a single color, wait for it to dry, then paint another interval, and so on. Moonet can use each of the $N$ colors as many times as she likes (possibly none).</p>

<p>Please compute the number of such brush strokes needed for Moonet to copy Picowso&#39;s latest 1-dimensional painting.</p>

### 입력

<p>The first line of input contains $N$.</p>

<p>The next line contains $N$ integers in the range $1 \ldots N$ indicating the color of each cell in Picowso&#39;s latest 1-dimensional painting.</p>

### 출력

Output the minimum number of brush strokes needed to copy the painting.