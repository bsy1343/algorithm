# [Silver V] Checkerboard - 18003

[문제 링크](https://www.acmicpc.net/problem/18003)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 110, 맞힌 사람: 95, 정답 비율: 75.397%

### 분류

구현

### 문제 설명

<p>An <em>r</em> &times; <em>c</em> grid of squares is to be colored in a checkerboard style. The board will be filled with rectangles made up of the grid squares. The heights and widths of the rectangles will be specified. <strong>Black</strong> and <strong>White</strong> are the only two colors of the rectangles. Any two adjacent rectangles that share a side should be colored differently. The top-left rectangle should be <strong>Black</strong>. Print the checkerboard.</p>

### 입력

<p>The first line contains four space-separated integers <em>r</em>, <em>c</em>, <em>v</em>&nbsp;and <em>h</em> (1 &le; <em>v</em> &le; <em>r</em> &le; 50, 1 &le; <em>h</em> &le; <em>c</em> &le; 50) where the checkerboard is to have <em>r</em> rows and <em>c</em> columns, with <em>v</em> rectangles vertically and <em>h</em> rectangles horizontally.</p>

<p>Each of the next <em>v</em> lines contain a single positive integer <em>a</em>. The sum of the <em>a</em> values will be exactly <em>r</em>. These are the heights of the <em>v</em> rectangles in each column, in order from top to bottom.</p>

<p>Each of the next <em>h</em> lines contain a single positive integer <em>b</em>. The sum of the <em>b</em> values will be exactly <em>c</em>. These are the widths of the <em>h</em> rectangles in each row, in order from left to right.</p>

### 출력

<p>Print the described checkerboard, in the form of <em>r</em> strings of length <em>c</em>, one per line. The strings should only contain the characters upper-case <strong>B</strong> (for a <strong>Black</strong> square) and upper-case <strong>W</strong> (for a <strong>White</strong> square).</p>