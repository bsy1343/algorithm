# [Silver III] Sudoku - 30649

[문제 링크](https://www.acmicpc.net/problem/30649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 48, 맞힌 사람: 43, 정답 비율: 78.182%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Sudoku is a logic-based, combinatorial number-placement puzzle. The objective is to fill a 9 &times; 9 grid with digits from 1 to 9 in such a way that the following statements hold:</p>

<ul>
	<li>Each row contains exactly one occurrence of each digit from 1 to 9.</li>
	<li>Each column contains exactly one occurrence of each digit from 1 to 9.</li>
	<li>Each of the nine 3 &times; 3 subgrids contains exactly one occurrence of each digit from 1 to 9.</li>
</ul>

<p>For a given not yet finished sudoku grid, determine if there is a mistake in it.</p>

<p>Note: It is not necessary to check whether the sudoku grid is solvable.</p>

### 입력

<p>The input describes the sudoku grid.</p>

<p>The characters &rsquo;|&rsquo;, &rsquo;-&rsquo; and &rsquo;+&rsquo; frame the 3 &times; 3 subgrids.</p>

<p>The character &rsquo;.&rsquo; represents an empty cell.</p>

<p>All the other characters in the input will be digits from &rsquo;1&rsquo; to &rsquo;9&rsquo;.</p>

<p>See the examples for clarification.</p>

### 출력

<p>Output the word <code>GRESKA</code> if there is a mistake in the sudoku board. Otherwise, output the word <code>OK</code>.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>There is no mistake, so the output is OK.</p>

<p>Clarification of the second example:</p>

<p>There is a mistake in the ninth column: the digit 5 appears twice; and there is also a mistake in the lower right 3 &times; 3 subgrid: the digit 5 appears twice.</p>

<p>Clarification of the third example:</p>

<p>There are two mistakes: the digit 2 appears twice in the second column, and the digit 6 appears twice in the seventh column.</p>