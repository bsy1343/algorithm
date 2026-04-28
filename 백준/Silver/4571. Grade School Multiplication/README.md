# [Silver II] Grade School Multiplication - 4571

[문제 링크](https://www.acmicpc.net/problem/4571)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 75, 정답: 42, 맞힌 사람: 42, 정답 비율: 58.333%

### 분류

구현, 수학, 시뮬레이션, 문자열

### 문제 설명

<p>An educational software company, All Computer Math (ACM), has a section on multiplication of integers.&nbsp; They want to display the calculations in the traditional grade school format, like the following computation of 432&nbsp;&times;&nbsp;5678:</p>

<pre>
&nbsp;&nbsp;&nbsp; 432
&nbsp;&nbsp; 5678
-------
&nbsp;&nbsp;&nbsp;3456
&nbsp;&nbsp;3024
&nbsp;2592
2160
-------
2452896</pre>

<p>Note well that the final product is printed without any leading spaces, but that leading spaces are necessary on some of the other lines to maintain proper alignment. However, as per our regional rules, there should <em>never</em> be any lines with <em>trailing</em> white space. Note that the lines of dashes have length matching the final product.</p>

<p>As a special case, when one of the digits of the second operand is a zero, it generates a single&nbsp;0 in the partial answers, and the next partial result should be on the <em>same</em> line rather than the next line down. For example, consider the following product of 200001&nbsp;&times;&nbsp;90040:</p>

<pre>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;200001
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;90040
-----------
&nbsp;&nbsp;&nbsp;&nbsp;8000040
180000900
-----------
18008090040</pre>

<p>&nbsp;</p>

<p>The rightmost digit of the second operand is a&nbsp;0, causing a&nbsp;0 to be placed in the rightmost column of the first partial product. However, rather than continue to a new line, the partial product of 4&nbsp;&times;&nbsp;200001 is placed on the same line as that&nbsp;0. The third and fourth least-significant digits of the second operand are zeros, each resulting in a&nbsp;0 in the second partial product on the same line as the result of 9&nbsp;&times;&nbsp;200001.</p>

<p>&nbsp;</p>

<p>As a final special case, if there is only one line in the partial answer, it constitutes a full answer, and so there is no need for computing a sum. For example, a computation of 246 &times; 70 would be formatted as</p>

<pre>
&nbsp;&nbsp;246
&nbsp;&nbsp;&nbsp;70
-----
17220</pre>

<p>Your job is to generate the solution displays.</p>

### 입력

<p>The input contains one or more data sets.&nbsp; Each data set consists of two positive integers on a line, designating the operands in the desired order. Neither number will have more than 6&nbsp;digits, and neither will have leading zeros. After the last data set is a line containing only 0 0.</p>

### 출력

<p>For each data set, output a label line containing &quot;Problem &quot; with the number of the problem, followed by the complete multiplication problem in accordance with the format rules described above.</p>

<p>Warning:&nbsp; A standard int type cannot properly handle 12-digit numbers. You should use a 64-bit type (i.e., a <code>long</code> in Java, or a <code>long&nbsp;long</code> in C++).</p>