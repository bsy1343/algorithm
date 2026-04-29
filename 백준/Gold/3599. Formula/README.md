# [Gold III] Formula - 3599

[문제 링크](https://www.acmicpc.net/problem/3599)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 3, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

(분류 없음)

### 문제 설명

<p>Nick is a mathematician and his speciality is Boolean logic, especially repetition-free functions. The Boolean function is repetition-free if it can be represented as a repetition-free formula. Formula is repetition-free if each variable occurs in the formula only once.</p>

<p>Let us fix the syntax of considered logical formulae:</p>

<ul>
	<li>Variables — letters from ‘<code>a</code>’ to ‘<code>k</code>’;</li>
	<li>Parentheses — if <em>E</em> is a formula, then (<em>E</em>) is another;</li>
	<li>Negation — ¬<em>E</em> is a formula for any formula E;</li>
	<li>Conjunction — <em>E</em><sub>1</sub> ∧ <em>E</em><sub>2</sub> ∧ · · · ∧ <em>E<sub>n</sub></em>.</li>
	<li>Disjunction — <em>E</em><sub>1</sub> ∨ <em>E</em><sub>2</sub> ∨ · · · ∨ <em>E<sub>n</sub></em>.</li>
</ul>

<p>The operations are listed from the highest priority to the lowest.</p>

<p>The problem is to represent given Boolean function by a repetition-free formula.</p>

### 입력

<p>The only line of input contains the Boolean function represented as a string consisting of characters ‘<code>a</code>’..‘<code>k</code>’, ‘<code>(</code>’, ‘<code>)</code>’, ‘<code> </code>’, ‘<code>&amp;</code>’ and ‘<code>|</code>’. The last three tokens stand for ¬, ∧ and ∨ respectively. Tokens can be separated by an arbitrary number of spaces. The line contains 1 000 characters at most. The formula in the file is syntactically correct.</p>

### 출력

<p>The first line of the output file must contain “Yes” if function is repetition-free and “No” otherwise.</p>

<p>In the former case the following line must contain the repetition-free formula for given Boolean function in the same format as in the input file. The line must contain no more than 1 000 characters.</p>