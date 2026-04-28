# [Gold V] Letters Q and F - 24649

[문제 링크](https://www.acmicpc.net/problem/24649)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 84, 정답: 36, 맞힌 사람: 34, 정답 비율: 51.515%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Little Lev is learning how to draw letters <code>Q</code> and <code>F</code>. Initially, he has a white grid of size $n \times m$. Then he will draw several letters of one of the following two shapes:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/dbd5fa17-096e-42c3-8d99-0b5c46aa4f31/-/preview/" style="width: 178px; height: 122px;" /></p>

<p>Lev will not rotate or mirror these two shapes. Every time he draws a new letter, he will choose a position for the letter inside the grid and paint all cells of the shape black. Lev will only draw letters in such a way that before drawing all black cells of the letter are white --- that is, he will never paint a cell twice.</p>

<p>You are given the final coloring of the grid. Count the number of letters <code>Q</code> and letters <code>F</code> drawn by Lev.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ --- the height and the width of the grid ($5 \le n \le 300$; $3 \le m \le 300$).</p>

<p>The next $n$ lines contain $m$ characters each, denoting the final state of the grid. A white cell is denoted by &#39;<code>.</code>&#39;, a black cell is denoted by &#39;<code>\#</code>&#39;.</p>

<p>It is guaranteed that the grid is a valid result of Lev&#39;s drawing.</p>

### 출력

<p>Print two integers --- the number of letters <code>Q</code> and the number of letters <code>F</code> drawn by Lev, respectively.</p>

### 힌트

<p>Illustration for the fourth example test:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7e35fef8-3c6b-486a-b384-8442bbed097d/-/preview/" style="width: 156px; height: 157px;" /></p>