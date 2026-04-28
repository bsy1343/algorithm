# [Gold IV] Easy Chess - 16664

[문제 링크](https://www.acmicpc.net/problem/16664)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 108, 정답: 48, 맞힌 사람: 47, 정답 비율: 54.023%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Elma is learning chess figures.</p>

<p>She learned that a rook can move either horizontally or vertically. To enhance her understanding of rook movement Elma&rsquo;s grandmother gave Elma an 8 &times; 8 chess board and asked her to find a way to move the rook from <code>a1</code> to <code>h8</code> making exactly n moves, so that all visited cells are different.</p>

<p>A visited cell is the initial cell <code>a1</code> and each cell on which the rook lands after a move.</p>

### 입력

<p>The input contains a single integer n (2 &le; n &le; 63) &mdash; the desired number of moves.</p>

### 출력

<p>Output a space-separated list of n+ 1 visited cells in the order they are visited by the rook. All cells must be different. The list should start with <code>a1</code> and end with <code>h8</code>. A solution always exists.</p>