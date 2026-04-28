# [Silver III] Run, Run, Runaround Numbers - 6423

[문제 링크](https://www.acmicpc.net/problem/6423)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 32, 맞힌 사람: 23, 정답 비율: 76.667%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션, 문자열

### 문제 설명

<p>An <em>N</em>-digit runaround number is characterized as follows:</p>

<ul>
	<li>It is an integer with exactly <em>N</em> digits, each of which is between 1 and 9, inclusively.</li>
	<li>The digits form a sequence with each digit telling where the next digit in the sequence occurs. This is done by giving the number of digits to the right of the digit where the next digit in the sequence occurs. If necessary, counting wraps around from the rightmost digit back to the leftmost.</li>
	<li>The leftmost digit in the number is the first digit in the sequence, and the sequence must return to this digit after all digits in the number have been used exactly once.</li>
	<li>No digit will appear more than once in the number. <em>This rule was accidentally left out of the problem description at the competition.</em></li>
</ul>

<p>For example, consider the number 81362. To verify that this is a runaround number, we use the steps shown below:</p>

<ol>
	<li>Start with the leftmost digit, 8
	<pre>
8 1 3 6 2
-</pre>
	</li>
	<li>Count 8 digits to the right, ending on 6 (note the wraparound).
	<pre>
8 1 3 6 2
-     -</pre>
	</li>
	<li>Count 6 digits to the right, ending on 2.
	<pre>
8 1 3 6 2
-     - -</pre>
	</li>
	<li>Count 2 digits to the right, ending on 1.
	<pre>
8 1 3 6 2
- -   - -</pre>
	</li>
	<li>Count 1 digit to the right, ending on 3.
	<pre>
8 1 3 6 2
- - - - -</pre>
	</li>
	<li>Count 3 digits to the right, ending on 8, where we began.
	<pre>
8 1 3 6 2
= - - - -</pre>
	</li>
</ol>

### 입력

<p>In this problem you will be provided with one or more input lines, each with a single integer&nbsp;<em>R</em>&nbsp;having between 2 and 7 digits followed immediately by the end of line. For each such number, determine the smallest runaround number that is equal to or greater than&nbsp;<em>R</em>. There will always be such a number for each of the input numbers.&nbsp;The last line of the input will contain only the digit 0 in column 1.</p>

### 출력

<p>Display the resulting number in the format illustrated below.&nbsp;</p>