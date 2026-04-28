# [Platinum III] Prank at IKEA - 21637

[문제 링크](https://www.acmicpc.net/problem/21637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 9, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

애드 혹, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Popular video blogger Pasha has decided to make a prank video in order to increase his subscribers count. He has chosen a well-known furniture store IKEA as a shooting location.</p>

<p>One of the store halls can be represented as a grid of size $n \times m$. Some grid cells are occupied by couches. Currently all the couches are folded, so each couch occupies exactly two adjacent cells. No two couches are intersecting, so each cell is occupied by at most one couch. The cells that are not occupied are empty.</p>

<p>Pasha has decided to unfold as many couches as possible to make it difficult to walk around the hall, and then capture customers reactions. When a couch is unfolded, it occupies a $2 \times 2$ square that contains two cells initially occupied by this couch, and another two cells that are uniquely determined by the direction of couch unfolding.</p>

<p>Help Pasha to determine the maximum number of couches that can be unfolded. Output the instruction which couches should be unfolded.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- the size of the grid ($1 \le n, m \le 1\,000$).</p>

<p>The next $n$ lines describe hall. Each line contains $m$ characters. Character &quot;<code>.</code>&quot; corresponds to empty cells. Cells occupied by couches are denoted by lowercase or uppercase English letters. Two cells occupied by the same couch are denoted by the same character. Cells of two adjacent couches are denoted by distinct characters. If a couch is denoted by a lowercase letter, it unfolds upwards or to the left. If a couch is denoted by an uppercase letter, it unfolds downwards or to the right.</p>

### 출력

<p>The first line should contain a single integer --- the maximum number of couches that can be unfolded. Each of the following $n$ lines should contain $m$ characters --- the description of the hall with unfolded couches. Character &quot;<code>.</code>&quot; denotes an empty cell. Cells occupied by couches should be denoted by digits. Cells occupied by the same couch should be denoted by the same digit. Two adjacent couches should be denoted by distinct digits.</p>