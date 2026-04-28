# [Platinum V] Text editor - 32042

[문제 링크](https://www.acmicpc.net/problem/32042)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 10, 맞힌 사람: 10, 정답 비율: 32.258%

### 분류

자료 구조, 데이크스트라, 그래프 이론, 최단 경로, 스택

### 문제 설명

<p>Robert is competing in CEOI 2024. He has almost finished his solution to the hardest problem of the day, and not just that, he&#39;s pretty sure it will get 100 points! There is just one small issue: He made a typo! What&#39;s worse, his favorite computer mouse, which he had been using since 2008, seems to have finally broken and isn&#39;t responding at all. Therefore, he will have to navigate to the typo using the arrow keys on his keyboard.</p>

<p>Robert&#39;s program has $N$ lines with lengths $l_1, l_2, \ldots, l_N$. Robert always ends his programs with an empty line, therefore $l_N = 0$. The cursor can be placed between two characters, as well as at the start or end of a line. As such, line $i$ has $l_i + 1$ possible cursor positions (called columns) numbered from $1$ to $l_i + 1$. For example, this is what a cursor placed on line 2 in column 6 would look like:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b21e72bf-3394-465e-a1b8-a6c67d1df47e/-/preview/" /></p>

<p>Robert wants to move his cursor from line $s_l$ column $s_c$ to line $e_l$ column $e_c$. He would like to know the minimum number of key presses needed to do so.</p>

<p>The horizontal arrow keys are quite simple. Pressing <em>left</em> will move the cursor to the previous column, unless the cursor was at the start of a line, in which case it will move to the end of the previous line. Similarly, pressing <em>right</em> will move the cursor to the next column, or to the start of the next line if the cursor was at the end of a line.</p>

<p>For example, <em>left</em> presses can look like this:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/6ec0f932-dce6-4998-86cf-a66a8b42f964/-/preview/" /></p>

<p>And <em>right</em> presses can look like this:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9c79b9b9-4a7b-48e1-a1ca-6cddcfbb5acc/-/preview/" /></p>

<p>Pressing <em>left</em> at the very start of the file or pressing <em>right</em> at the very end of the file will have no effect.</p>

<p>The vertical arrow keys are slightly more complicated. Pressing <em>up</em>will move the cursor to the previous line and pressing <em>down</em> will move it to the next line, without changing the column number. However, if this would put the cursor past the end of the new line, the cursor will jump to the end of that line instead.</p>

<p>For example, <em>up</em> presses can look like this:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/65174296-cf1d-405a-a867-3b16b5179586/-/preview/" /></p>

<p>And <em>down</em> presses can look like this:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3924a215-6ced-4e03-a31a-fcf581daa42d/-/preview/" /></p>

<p>If pressing <em>up</em> or <em>down</em> would put the cursor on a line that doesn&#39;t exist, the cursor won&#39;t move at all.</p>

### 입력

<p>The first line of input contains the integer $N$ &mdash; the number of lines of Robert&#39;s solution. The second line contains two integers $s_l$ and $s_c$ separated by spaces &mdash; the initial cursor position. Similarly, the third line contains two integers $e_l$ and $e_c$ &mdash; the target cursor position. The fourth line contains $N$ space-separated integers $l_1, l_2, \ldots, l_N$ &mdash; the length of each line.</p>

### 출력

<p>Your program should output a single line containing a single integer &mdash; the minimum number of key presses to move the cursor from $(s_l, s_c)$ to $(e_l, e_c)$.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 10^6$</li>
	<li>$0 \leq l_i \leq 10^9$ (for each $i$ such that $1 \leq i \leq N$)</li>
	<li>$l_N = 0$</li>
	<li>$1 \leq s_l, e_l \leq N$</li>
	<li>$1 \leq s_c \leq l_{s_l} + 1$</li>
	<li>$1 \leq e_c \leq l_{e_l} + 1$.</li>
</ul>