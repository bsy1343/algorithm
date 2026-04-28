# [Gold I] Lattice Animals - 7396

[문제 링크](https://www.acmicpc.net/problem/7396)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 16, 맞힌 사람: 13, 정답 비율: 81.250%

### 분류

구현, 브루트포스 알고리즘, 기하학, 런타임 전의 전처리

### 문제 설명

<p><em>Lattice animal</em> is a set of connected sites on a lattice. Lattice animals on a square lattice are especially popular subject of study and are also known as <em>polyominoes</em>. Polyomino is usually represented as a set of sidewise connected squares. Polyomino with $n$ squares is called $n$-polyomino.</p>

<p>In this problem you are to find a number of distinct <em>free</em> $n$-polyominoes that fit into rectangle $w \times h$. Free polyominoes can be rotated and flipped over, so that their rotations and mirror images are considered to be the same.</p>

<p>For example, there are 5 different pentominoes (5-polyominoes) that fit into $2 \times 4$ rectangle and 3 different octominoes (8-polyominoes) that fit into $3 \times 3$ rectangle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7396.%E2%80%85Lattice%E2%80%85Animals/48adc1cd.png" data-original-src="https://upload.acmicpc.net/974a0a36-6cd2-487e-94ba-4b53b21912a1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 326px; height: 181px;" /></p>

### 입력

<p>The input file consists of a single line with 3 integer numbers $n$, $w$, and $h$ ($1 \le n \le 10$, $1 \le w, h \le n$).</p>

### 출력

<p>Write to the output file a single integer number --- the number of distinct free $n$-polyominoes that fit into rectangle $w \times h$.</p>