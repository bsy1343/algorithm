# [Bronze IV] Innohorse - 21875

[문제 링크](https://www.acmicpc.net/problem/21875)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 644, 정답: 520, 맞힌 사람: 492, 정답 비율: 81.188%

### 분류

구현

### 문제 설명

<p>In Innokingdom there are special horses for chess knights, innohorses. Each innohorse is represented by a pair of integers $(x, y)$, $0 \le x \le y$. Innohorse moves in the following way: first it moves $x$ cells in one of the four general directions, then turns 90 degrees to the left or to the right, then finally moves $y$ more cells. For instance, an ordinary chess knight horse is an innohorse of type $(1, 2)$.</p>

<p>Alex and Jane has just seen one innohorse, it jumped from cell A to cell B. They wonder what is the type of this innohorse. Help them answer this question.</p>

### 입력

<p>Chessboard consists of 8 rows and 8 columns. Rows are assigned integers from 1 to 8, and columns are assigned letters from &#39;<code>a</code>&#39; to &#39;<code>h</code>&#39;. So every cell is represented by a pair of a letter and a digit.</p>

<p>Two lines consist of descriptions of cells A and B respectively.</p>

### 출력

<p>Print two integers $x$ and $y$ ($0 \le x \le y$), representing the type of innohorse.</p>