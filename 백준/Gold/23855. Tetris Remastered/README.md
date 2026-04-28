# [Gold V] Tetris Remastered - 23855

[문제 링크](https://www.acmicpc.net/problem/23855)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 93, 정답: 47, 맞힌 사람: 43, 정답 비율: 58.108%

### 분류

자료 구조, 구현, 스택

### 문제 설명

<p>Mila likes to play Tetris. Today she learnt about a new game that is similar to Tetris. The new game has an infinite rectangular field with the bottom and width equal to $n$, divided into cells of size $1 \times 1$. Unlike real Tetris in this game horizontal pieces with height $1$ and width $x$ consisting of $x$ cells --- of size $1 \times x$, are used. Before the next piece starts to fall, a player can choose it&#39;s size $x$ as any integer between $1$ and $n$, inclusive. Pieces can&#39;t be rotated, but they can be moved left or right. A piece falls until it reaches an occupied cell under it or the bottom of the field.</p>

<p>Mile doesn&#39;t like to leave empty cells under the pieces. Her goal is to fill lower rows of the field in the way that all occupied cells form a rectangle of width $n$.</p>

<p>You are given a field state: $a_1, a_2, \ldots, a_n$, where $a_i$ --- the number of occupied cells in the $i$-th column of the field. In the given field no empty cell is under the occupied one. For example, if sequence $a$ is $3, 2, 4, 2, 2, 4$, the field looks like this:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/be898f53-092b-4ca3-9493-76101c0352b7/-/preview/" style="width: 146px; height: 149px;" /></p>

<p>Find the minimum number of pieces Mila needs to play to occupy the lower rows of the field forming a rectangle of width $n$.</p>

### 입력

<p>The first line contains a single integer $n$ --- the width of the field ($1 \le n \le 2 \cdot 10^5$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ --- the number of occupied cells in each column of the field ($0 \le a_i \le 10^9$).</p>

<p>At least on of the $a_i$ is strictly greater than $0$.</p>

### 출력

<p>Print a single integer: the minimum number of pieces Mila will need to build a rectangle of width $n$.</p>

### 힌트

<p>In the example Mile can use the following four pieces:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/95d33fbb-2fb6-4579-80a0-9ed20cb97069/-/preview/" style="width: 146px; height: 149px;" /></p>