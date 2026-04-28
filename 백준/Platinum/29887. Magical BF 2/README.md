# [Platinum I] Magical BF 2 - 29887

[문제 링크](https://www.acmicpc.net/problem/29887)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 6, 정답 비율: 50.000%

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

<p>Task: The cell $M_0$ contains an integer $x$ ($0 \le x \le 200$), all other cells contain zeros. Write the remainder of dividing $x$ by $7$ into the cell $M_0$. By the end of the execution of the program cells other than $M_0$ may contain any numbers.</p>

<p>Input example: <img alt="" src="https://upload.acmicpc.net/335c3285-98ff-4c9f-adb5-aff9ebbd5594/-/preview/" style="width: 146px; height: 27px;" /></p>

<p>Output example: <img alt="" src="https://upload.acmicpc.net/3dbdaf36-bb34-45d5-a6d2-bc45e096bba9/-/preview/" style="width: 138px; height: 27px;" /></p>

### 입력



### 출력

