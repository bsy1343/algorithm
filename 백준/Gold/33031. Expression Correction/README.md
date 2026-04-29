# [Gold IV] Expression Correction - 33031

[문제 링크](https://www.acmicpc.net/problem/33031)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 22, 맞힌 사람: 22, 정답 비율: 66.667%

### 분류

구현, 문자열, 브루트포스 알고리즘, 사칙연산, 수학, 파싱

### 문제 설명

<p>Eve is studying mathematics in school. They've already learned how to perform addition and subtraction of decimal numbers and are practicing it by solving fun puzzles. The specific type of the puzzle they are solving is described below. They are given an equality with addition and subtraction which may or may not be a correct one. They have to verify the equality, and if it is not a correct one, then they have to tell if it is possible to turn it into a correct one by moving one digit to a different place in the equality.</p>

<p>Let us formally define the equality in this puzzle:</p>

<ul>
	<li><em>Number</em> is a string of <strong>at least one and at most 10 decimal digits</strong> ('<code>0</code>' to '<code>9</code>') that has no extra leading zeroes (the only number that is allowed to start with the zero digit is "<code>0</code>").</li>
	<li><em>Expression</em> is a string composed of one or more numbers, as defined above, that are separated with addition ('<code>+</code>') or subtraction ('<code>-</code>') operators.</li>
	<li><em>Equality</em> is a string composed of an expression, as defined above, followed by an equals sign ('<code>=</code>'), followed by another expression.</li>
	<li><em>Correct equality</em> is an equality where both expressions on the left and right hand sides of the equals sign evaluate to the same decimal number according to the standard arithmetic. Note that while all the numbers in the expression are positive, the evaluated number can be negative. Also, the evaluated number can be longer than 10 digits. </li>
	<li><em>Moving a digit</em> in an equality means removing a digit from any position in the string and inserting it into another position so that the resulting string is again an equality. </li>
</ul>

<p>The puzzle is pretty straightforward once you know how to add and subtract decimal numbers, but it is tenuous. It is easy to get distracted and make a mistake while performing computation. Your task is to write a program that solves the expression correction puzzle to help Eve.</p>

### 입력

<p>The input file consists of a single line --- an equality as defined in the problem statement. The total length of the input string does not exceed 100 characters.</p>

### 출력

<p>Write a single line to the output. If the input contains a correct equality, output a single word "<code>Correct</code>". Otherwise, if the input equality can be turned into a correct one by moving one digit, output the resulting correct equality. If there are multiple possible correct equalities after moving one digit, you may output any one of them. Otherwise, output a single word "<code>Impossible</code>".</p>