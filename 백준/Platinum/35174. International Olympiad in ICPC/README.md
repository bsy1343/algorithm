# [Platinum I] International Olympiad in ICPC - 35174

[문제 링크](https://www.acmicpc.net/problem/35174)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 5, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 두 포인터, 분할 정복, 분할 정복을 사용한 최적화, 세그먼트 트리, 이분 탐색, 자료 구조

### 문제 설명

<p>Your university is hosting a competition called the IOI. As an event organiser, you want to create a banner for it. The banner you are preparing can be represented as a $3 \times N$ grid, where each cell will be printed either white or black. Due to printing issues, some of the cells cannot be printed in black.</p>

<p>You start with a white banner, and want to print the word <code>IOI</code> on the banner as follows.</p>

<ul>
<li>Form the first letter <code>I</code> by printing a <strong>solid</strong> rectangle of size $3 \times p$ ($p \geq 1$) in black.</li>
<li>Form the letter <code>O</code> by printing a rectangular <strong>boundary</strong> of size $3 \times q$ ($q \geq 3$) in black.</li>
<li>Form the second letter <code>I</code> by printing a <strong>solid</strong> rectangle of size $3 \times r$ ($r \geq 1$) in black.</li>
</ul>

<p>The letter <code>O</code> must be formed between the letters <code>I</code>, and there must be <strong>at least</strong> one column between the letters. It is also required that the width of the letter <code>O</code> is <strong>at least</strong> the sum of the widths of the letters <code>I</code>, i.e. $q \geq p + r$. All other cells not part of the word <code>IOI</code> must remain white. Determine the maximum number of cells that you can print in black, or tell that it's impossible to print the word <code>IOI</code>.</p>

### 입력

<p>The first line contains an integer $N$ ($1 \le N \le 200000$), the size of the $3 \times N$ grid. Each of the next three lines contains $N$ characters representing the cells of the grid. Each of the $3N$ characters corresponds to a cell and is either <code>.</code> or <code>#</code>, meaning you can or cannot print the cell in black, respectively.</p>

### 출력

<p>A single line representing the maximum number of cells that you can print in black. If it's impossible to print the word <code>IOI</code>, output $-1$ instead.</p>