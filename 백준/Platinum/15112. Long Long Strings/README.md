# [Platinum II] Long Long Strings - 15112

[문제 링크](https://www.acmicpc.net/problem/15112)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 116, 정답: 34, 맞힌 사람: 29, 정답 비율: 35.366%

### 분류

구현, 자료 구조, 시뮬레이션

### 문제 설명

<p>To store long DNA sequences, your company has developed a <code>LongLongString</code> class that can store strings with more than ten billion characters. The class supports two basic operations:</p>

<ul>
	<li><code>Ins(p, c)</code>: Insert the character c at position p.</li>
	<li><code>Del(p)</code>: Delete the character at position p.</li>
</ul>

<p>A DNA editing program is written as a series of <code>Ins</code> and <code>Del</code> operations. Your job is to write a program that compare two DNA editing programs and determine if they are identical, i.e., when applied to any sufficiently long string, whether the end result is the same. For example:</p>

<ul>
	<li><code>Del(1)</code> <code>Del(2)</code> and <code>Del(3)</code> <code>Del(1)</code> are identical.</li>
	<li><code>Del(2)</code> <code>Del(1)</code> and <code>Del(1)</code> <code>Del(2)</code> are different.</li>
	<li>An empty sequence and <code>Ins(1, x)</code> <code>Del(1)</code> are identical.</li>
	<li><code>Ins(14, b)</code> <code>Ins(14, a)</code> and <code>Ins(14, a)</code> <code>Ins(15, b)</code> are identical.</li>
	<li><code>Ins(14, a)</code> <code>Ins(15, b)</code> and <code>Ins(14, b)</code> <code>Ins(15, a)</code> are different.</li>
</ul>

### 입력

<p>Input will consist of the descriptions of two DNA editing programs. Each program will consist of some number of operations (between 0 and 2,000). Each operation will be given on its own line. The first character of the line will be <code>D</code> for a <code>Del</code> operation, <code>I</code> for an <code>Ins</code> operation, or <code>E</code> marking the end of the program.</p>

<p>A <code>Del</code> operation will have the <code>D</code> character, followed by a space, and then a single integer between 1 and 10<sup>10</sup>, indicating the character position to delete. All characters after this deleted character will be shifted one position lower.</p>

<p>An <code>Ins</code> operation will have the <code>I</code> character, followed by a space, and then a single integer between 1 and 10<sup>10</sup>, indicating the location to insert the new character; all pre-existing characters with this index and higher will be shifted one position higher. Following this integer will be another space and then an uppercase alphabetic character that is the character to insert.</p>

### 출력

<p>If the two programs are identical, print &ldquo;0&rdquo; on a single line (without quotation marks). Otherwise, print &ldquo;1&rdquo; on a single line (without quotation marks).</p>