# [Gold IV] Magical BF 1 - 29886

[문제 링크](https://www.acmicpc.net/problem/29886)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 38, 맞힌 사람: 33, 정답 비율: 45.833%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>John learned at school that in many East Asian languages texts can be written from left to right as well as from top to bottom. He got especially curious whether it&#39;s possible to write a text such that it can simultaneously be read both ways. John kept puzzling in programming class as well and now wants to write code such that it would solve the tasks when read by rows (top to bottom and left to right), as well as when read by columns (left to right and top to bottom). Naturally, he needed a suitable language for this and John chose a language called BF for experimenting.</p>

<p>The memory of a BF program is an infinite array $M$ with cells numbered from left to right ($M_0$, $M_1$, \ldots). Each cell contains a nonnegative integer that can be arbitrarily large. Additionally there is a data pointer that in the beginning of execution points to the leftmost cell ($M_0$).</p>

<p>The execution of a program starts from its first command and in general after the execution of each command the program moves on to the next command in the sequence. Altogether there are six commands in the language, each one denoted by one character:</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>Command</th>
			<th>Meaning</th>
		</tr>
		<tr>
			<td><code>&gt;</code></td>
			<td>Moves the data pointer to the right by one cell.</td>
		</tr>
		<tr>
			<td><code>&lt;</code></td>
			<td>Moves the data pointer to the left by one cell if the data pointer does not point to the leftmost cell; otherwise does nothing.</td>
		</tr>
		<tr>
			<td><code>+</code></td>
			<td>Increases the cell at the data pointer by one.</td>
		</tr>
		<tr>
			<td><code>-</code></td>
			<td>Decreases the cell at the data pointer by one if the cell is currently positive; otherwise does nothing.</td>
		</tr>
		<tr>
			<td><code>[</code></td>
			<td>If the cell at the data pointer is zero, then jumps forward to the corresponding &#39;<code>]</code>&#39; symbol; otherwise does nothing.</td>
		</tr>
		<tr>
			<td><code>]</code></td>
			<td>If the cell at the data pointer is nonzero, then jumps back to the corresponding &#39;<code>[</code>&#39; symbol; otherwise does nothing.</td>
		</tr>
	</tbody>
</table>

<p>Help John write magical BF programs for solving the five tasks listed below.</p>

<p>As a solution to each task submit an $N \times N$ grid of BF program code (where $1 \le N \le 1000$). The code does not have to be the same when read by rows and by columns, but must solve the task correctly in both cases. The solution text can only contain the characters &#39;<code>&gt;</code>&#39;, &#39;<code>&lt;</code>&#39;, &#39;<code>+</code>&#39;, &#39;<code>-</code>&#39;, &#39;<code>[</code>&#39; and &#39;<code>]</code>&#39; and must completely fill the grid. For any allowed input, the code must not execute more than $10$ million commands.</p>

<p>Task: The cells $M_0$ and $M_1$ of the array contain the integers $x$ and $y$ ($0 \le y \le x \le 200$), all other cells contain zeros. Write the difference $x-y$ into the cell $M_0$.</p>

<p>Input example: <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/29886.%E2%80%85Magical%E2%80%85BF%E2%80%851/8ba4e050.png" data-original-src="https://upload.acmicpc.net/675c2f3e-ea43-49f7-963c-886bc9927568/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 139px; height: 27px;" /></p>

<p>Output example: <img alt="" src="%EB%B0%B1%EC%A4%80/Gold/29886.%E2%80%85Magical%E2%80%85BF%E2%80%851/31c12879.png" data-original-src="https://upload.acmicpc.net/92ec46e7-3be9-40cb-a931-ecd74163f3a1/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 169px; height: 27px;" /></p>

<p>In the output, it only matters that the cell $M_0$ contains the difference of $x$ and $y$ (in this case, $7 - 5 = 2$), other cells may contain any numbers (for example, $1500$, $0$, $42$, \ldots).</p>

### 입력



### 출력

