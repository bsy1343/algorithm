# [Gold IV] All Your Base - 4506

[문제 링크](https://www.acmicpc.net/problem/4506)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 33, 정답: 8, 맞힌 사람: 8, 정답 비율: 33.333%

### 분류

임의 정밀도 / 큰 수 연산, 수학, 파싱, 문자열

### 문제 설명

<p><strong>Premise:</strong> Given a specification for a &ldquo;base&rdquo; (well, actually a mixed radix number system), take in pairs of numbers written in our &ldquo;base&rdquo;, perform a specified operation on them and output the result in our base.</p>

<p><strong>The Base:</strong> A number system where the right-most digit (digit 1) can be a counting number between 0 and 1, the second right-most digit (digit 2) can be a counting number between 0 and 2 and, more generally, each digit <em>n</em> (as labeled from the right) can have values between 0 and <em>n</em>. After 9, upper case letters are used, starting with A and going through Z. After the highest digit (which can be 0-Z), no further digits are possible; any numbers which go past that digit are invalid. Negative numbers are prefixed with a single &ldquo;-&rdquo; sign. Numbers never have leading zeros, with the exception of zero itself, which is represented by a single &ldquo;0&rdquo; character.</p>

<p><strong>Operations:</strong> Addition (+) and subtraction (-): The numbers are added or subtracted as normal (including carrying, borrowing, etc).</p>

### 입력

<ul>
	<li>The first line of input is the number (base 10) of operations that need to be performed.</li>
	<li>Each following line will be at most 1000 bytes and will consist of a variable-radix number, a space, a single character indicating the operation (+, or -), a space, another variable-radix number, and a newline (LF).</li>
	<li>Either number for any operation (and also the result) may be negative.</li>
</ul>

### 출력

<ul>
	<li>For each operation in the input, a single line of output should be produced containing either the result (a variable-radix number) or the string &ldquo;Invalid&rdquo;) (without quotes) followed by a newline (LF).</li>
	<li>If either of the input numbers or the resulting number is not valid in the number system, or an error is encountered while performing the operation, the result is invalid.</li>
</ul>