# [Bronze I] Sculpture - 16426

[문제 링크](https://www.acmicpc.net/problem/16426)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 168, 정답: 137, 맞힌 사람: 118, 정답 비율: 81.379%

### 분류

구현

### 문제 설명

<p>A modern artist has created a large outdoor sculpture. It consists of a rectangular grid, where each square cell of the grid is raised to a different height. Because the sculpture is to be placed outdoors, the artist is worried about rainwater pooling in the lower cells. He needs to figure out which cells need to have drains installed. A cell will need a drain if the four cells above, below, left and right are all higher. A cell on the edge or corner of the grid will never need a drain.</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will begin with a line with two space-separated integers r and c (1 &le; r,c &le; 100), which are the dimensions of the artist&rsquo;s grid.</p>

<p>Each of the next r rows will contain c space-separated integers h (0 &le; h &le; 1,000), which are the heights of the cells in inches. It is guaranteed that every cell&rsquo;s height will be different from those immediately above, below, to the left, and to the right.</p>

### 출력

<p>Output r lines with c space-separated integers each. Output a 1 if that cell needs a drain, 0 if it doesn&rsquo;t.</p>