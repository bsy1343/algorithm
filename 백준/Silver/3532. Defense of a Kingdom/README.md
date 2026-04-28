# [Silver IV] Defense of a Kingdom - 3532

[문제 링크](https://www.acmicpc.net/problem/3532)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 123, 정답: 55, 맞힌 사람: 42, 정답 비율: 40.385%

### 분류

정렬, 기하학

### 문제 설명

<p>Theodore implements a new strategy game &ldquo;Defense of a Kingdom&rdquo;. On each level player defends the Kingdom that is represented by a rectangular grid of cells. The player builds crossbow towers in some cells of the grid. The tower defends all the cells in the same row and the same column. No two towers share a row or a column.</p>

<p>The penalty of the position is a number of cells in the largest undefended rectangle. For example, the position shown on the picture has penalty 12.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3532.%E2%80%85Defense%E2%80%85of%E2%80%85a%E2%80%85Kingdom/0c5730a7.png" data-original-src="https://upload.acmicpc.net/6c6ebc3d-5343-4ec0-b9b7-68a137d18591/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 569px; height: 200px;" /></p>

<p>Help Theodore write a program that calculates the penalty of the given position.</p>

### 입력

<p>The first line of the input file contains three integer numbers: w &mdash; width of the grid, h &mdash; height of the grid and n &mdash; number of crossbow towers (1 &le; w, h &le; 40 000; 0 &le; n &le; min(w, h)).</p>

<p>Each of the following n lines of the input file contains two integer numbers x<sub>i</sub> and y<sub>i</sub> &mdash; the coordinates of the cell occupied by a tower (1 &le; x<sub>i</sub> &le; w; 1 &le; y<sub>i</sub> &le; h).</p>

### 출력

<p>Output a single integer number &mdash; the number of cells in the largest rectangle that is not defended by the towers.</p>