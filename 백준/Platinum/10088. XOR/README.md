# [Platinum I] XOR - 10088

[문제 링크](https://www.acmicpc.net/problem/10088)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 73, 정답: 5, 맞힌 사람: 4, 정답 비율: 22.222%

### 분류

수학, 비트마스킹

### 문제 설명

<p>The operation &ldquo;bitwise exclusive or&rdquo; (we denote it with \(\oplus \)) is standardly defined on each couple of non-negative integers (\(a\), \(b\)) as follows:</p>

<p>Let \(a = \overline &nbsp;{ a_{n-1}a_{n-2}a_{n-3}\cdots a_0}\) and \(b = \overline &nbsp;{ b_{n-1}b_{n-2}b_{n-3}\cdots b_0}\) be the \(n\)-digit binary notations of the number \(a\) and \(b\), i.e., \(a_i\) and \(b_i\) are zeroes or ones (if the binary digits of the smaller one are less than n, its notation is filled up with &ldquo;leading zeroes&rdquo;). Then the number \(c = a \oplus b\) is defined in this way: its ith binary digit \(c_i\) (\(c = \overline &nbsp;{c_{n-1}c_{n-2}c_{n-3}\cdots c_0}\)) is obtained by applying the operation &ldquo;exclusive or&rdquo; on the ith binary digits of \(a\) and \(b\) respectively, i. e., \(c_i = a_i \text{ xor } b_i \) for each \(i\) from \(0\) to \(n-1\). The xor operation is defined on binary digits as follows: \(0 \text{ xor } 0 = 0\); \(0 \text{ xor } 1 = 1\); \(1 \text{ xor } 0 = 1\); \(1 \text{ xor } 1 = 0\).</p>

<p>The operation is easily extended for more operands. More specifically, for the consecutive positive integers in the interval [\(a\),\(b\)] we can denote \(\oplus_{i=a}^{b} i = a \oplus (a+1) \oplus (a+2) \oplus \dots \oplus b\), assuming operation execution from left to right. Consider the positive integers \(a\) and \(b\) (\(a\) &lt; \(b\)), defining the closed interval of integers [\(a\),\(b\)], as well as the positive integer \(n\) (\(1\) &le; \(n\) &le; \(b-a+1\)). Consider the operation &ldquo;bitwise exclusive or&rdquo; on every possible \(n\)-tuple of consecutive integers in the interval [\(a\),\(b\)].</p>

<p>Write a program xor to find out the largest value M which this process can produce.</p>

<p>Let&rsquo;s, for clarity, take a closer look at the case \(a=10\), \(b=20\), \(n=6\). I. e., we consider the interval [\(10\), \(20\)] of integers, more precisely &ndash; all sextuples of consecutive integers in it. For each of them we apply the generalized operation &ldquo;bitwise exclusive or&rdquo;:</p>

<ul>
	<li>\(10 \oplus 11 \oplus 12 \oplus 13 \oplus 14 \oplus 15 = 1010_2 \oplus 1011_2 \oplus 1100_2 \oplus 1101_2 \oplus 1110_2 \oplus 1111_2 = 0001_2 = 1\)</li>
	<li>\(11 \oplus 12 \oplus 13 \oplus 14 \oplus 15 \oplus 16&nbsp;=&nbsp;1011_2 \oplus 1100_2 \oplus 1101_2 \oplus 1110_2 \oplus 1111_2 \oplus 10000_2 = 11011_2 = 27\)</li>
	<li>\(12 \oplus 13 \oplus 14 \oplus 15 \oplus 16 \oplus 17&nbsp;=&nbsp;1100_2 \oplus 1101_2 \oplus 1110_2 \oplus 1111_2 \oplus 10000_2 \oplus 10001_2 = 00001_2 = 1\)</li>
	<li>\(13 \oplus 14 \oplus 15 \oplus 16 \oplus 17 \oplus 18&nbsp;=&nbsp;1101_2 \oplus 1110_2 \oplus 1111_2 \oplus 10000_2 \oplus 10001_2 \oplus 10010_2 = 11111_2 = 31\)</li>
	<li>\(14 \oplus 15 \oplus 16 \oplus 17 \oplus 18 \oplus 19&nbsp;=&nbsp;1110_2 \oplus 1111_2 \oplus 10000_2 \oplus 10001_2 \oplus 10010_2 \oplus 10011_2 = 00001_2 = 1\)</li>
	<li>\(15 \oplus 16 \oplus 17 \oplus 18 \oplus 19 \oplus 20&nbsp;=&nbsp;1111_2 \oplus 10000_2 \oplus 10001_2 \oplus 10010_2 \oplus 10011_2 \oplus 10100_2 = 11011_2 = 27\)</li>
</ul>

<p>Obviously, in this case the solution is 31, resulting in the sextuple which starts with 13.</p>

### 입력

<p>One line is read from the standard input, containing the space separated positive integers \(a\), \(b\) and \(n\).&nbsp;</p>

<p>\(a\), \(b\) and \(n\) are positive integers with no more than 18 decimal digits; \(a\) &lt;&nbsp;\(b\); \(1\) &lt; \(n\) &le; \(b &ndash; a + 1\), \(n\) &lt; \(10^8\).</p>

### 출력

<p>The program should write to the standard output one line, containing only one non-negative integer \(M\) which is the biggest possible number, obtained by applying the operation &ldquo;bitwise exclusive or&rdquo; on at least one of the n-tuples of consecutive integers in the interval [\(a\), \(b\)].&nbsp;</p>