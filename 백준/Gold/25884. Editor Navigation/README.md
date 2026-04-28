# [Gold V] Editor Navigation - 25884

[문제 링크](https://www.acmicpc.net/problem/25884)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 19, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현, 시뮬레이션

### 문제 설명

<p>You are using a very simple text editor to create a document. You have typed in several lines, with the flashing cursor advancing as you type, but then you see a mistake on a previous line. Unfortunately, the mouse doesn&rsquo;t work! You will have to press arrow keys to move the cursor back to the position where you can fix the mistake. Of course, you want to get to this position as quickly as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25884.%E2%80%85Editor%E2%80%85Navigation/caa47cda.png" data-original-src="https://upload.acmicpc.net/a89a89d5-17a7-4e89-bab2-f0bdf02cdfc2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 566px; height: 170px;" /></p>

<p>This simple editor uses a monospace font, so each character is exactly the same width. The cursor can be at the beginning of the line (before the first character), end of the line (after the last character), or at a horizontal position between two characters on a given line. The following keys can be pressed to move the cursor (each keypress is independent of any preceding keypress):</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>&larr; (Left arrow key)</td>
			<td>Moves the cursor one character to the left on the same line, unless the cursor is at the beginning of the line, in which case it moves to the end of the previous line. If the cursor is at the beginning of the line and there is no previous line, the cursor does not move.</td>
		</tr>
		<tr>
			<td>&rarr; (Right arrow key)</td>
			<td>Moves the cursor one character to the right on the same line, unless the cursor is at the end of the line, in which case it moves to the beginning of the next line. If the cursor is at the end of the line and there is no next line, the cursor does not move.</td>
		</tr>
		<tr>
			<td>&uarr; (Up arrow key)</td>
			<td>Moves the cursor up to the previous line; keeps the same horizontal position, unless the previous line is shorter, in which case the cursor goes to the end of the previous line. If there is no previous line, the cursor does not move.</td>
		</tr>
		<tr>
			<td>&darr; (Down arrow key)</td>
			<td>Moves the cursor down to the next line; keeps the same horizontal position, unless the next line is shorter, in which case the cursor goes to the end of the next line. If there is no next line, the cursor does not move.</td>
		</tr>
	</tbody>
</table>

<p>Given the line lengths of a text file that was loaded in this simple editor, along with the current cursor position and a different, desired cursor position (e.g., to fix a mistake), you are to determine the minimum number of keypresses, using arrow keys only, required to move the cursor to the desired position</p>

### 입력

<p>The first input line contains a positive integer, n, indicating the number of editor navigation scenarios to process. Each scenario will occupy exactly 4 input lines. The first line of each scenario contains an integer f (1 &le; f &le; 120), indicating the number of lines of text in the file that is loaded in the editor. The next input line contains f integers, s<sub>1</sub> to s<sub>f</sub>, where each value s<sub>i</sub> (0 &le; s<sub>i</sub> &le; 80) indicates the number of characters on line i of the file; the values will be separated by exactly one space. A value s<sub>i</sub> = 0 means that there are no characters on line i. The newline character (common character indicating end of a line) does not count as a character on the line.</p>

<p>The third input line of each scenario will contain two integers (separated by a space) providing the current cursor position in the file: r<sub>c</sub> (1 &le; r<sub>c</sub> &le; f) and c<sub>c</sub> (0 &le; c<sub>c</sub> &le; 80), where r<sub>c</sub> represents the line of the file, counting from 1 (as with i), and c<sub>c</sub> represents the horizontal position of the cursor on that line, 0 for the beginning (before the first character). It is guaranteed that the cursor position is valid, so if, for instance, r<sub>c</sub> = 17 and s<sub>17</sub> = 56, then 0 &le; c<sub>c</sub> &le; 56; the maximum value of c<sub>c</sub> is the end of the line. The fourth input line of each scenario is similar to the third and indicates the desired cursor position to begin fixing the mistake, i.e., this line consists of two integers separated by a space, r<sub>m</sub> (1 &le; r<sub>m</sub> &le; f) and c<sub>m</sub> (0 &le; c<sub>m</sub> &le; 80). The constraints on the values for r<sub>c</sub> and c<sub>c</sub> also apply to r<sub>m</sub> and c<sub>m</sub>.</p>

### 출력

<p>For each scenario in the input, output a single integer on a line by itself indicating the minimum number of keypresses needed to move the cursor from its current position (r<sub>c</sub>, c<sub>c</sub>) to the desired position (r<sub>m</sub>, c<sub>m</sub>) for fixing the mistake.</p>

### 힌트

<p>For Case #1, one possible sequence for the minimum number of keypresses to move the cursor from its current position to the desired position is: Up, Up, Right, Up, Left, Up, Left 15 times.</p>