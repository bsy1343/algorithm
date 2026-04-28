# [Gold V] Nonogram - 9778

[문제 링크](https://www.acmicpc.net/problem/9778)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Nonogram is a logic puzzle with simple rules and challenging solutions. The rules are simple. You have a grid of squares, which must be either filled in black (we denote this with 1) or marked with X/blank (we denote this with 0). Beside each row of the grid are listed the lengths of the runs of black squares on that row. Above each column are listed the lengths of the runs of black squares in that column. Your aim is to find all black squares.</p>

### 입력

<p>The first line of input contains a positive integer TC, the number of nonogram puzzles that you have to solve. Each test case starts with a blank line, followed by two positive integers W and H in the next line that denote the width and the height of the puzzle. We guarantee that 1 &le; W*H &le; 20.</p>

<p>Then there will be two blocks of puzzle description that started with a blank line: one for rows (that contains H lines) and another for columns (that contains W lines). In those two blocks, you will be given comma separated values that denote the lengths of the runs of black squares in each row/columns (note: it can be blank).</p>

### 출력

<p>For each test case (puzzle), determine if the answer is unique. If it is unique, output a 2D binary matrix of H lin es containing W characters. Put 1 if the corresponding cell is black, or 0 otherwise. If it is not unique, just print &quot;not unique&quot; in one line (without &quot; ). Separate the output of two test cases with a blank line.</p>

### 힌트

<p>Visualization of the first Sample Input &amp; Sample Output</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/9778.%E2%80%85Nonogram/6ead1251.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/9778.%E2%80%85Nonogram/6ead1251.png" data-original-src="https://upload.acmicpc.net/256a8b95-e5ac-4e3d-b8ad-da11f283177e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 249px; height: 107px;" /></p>