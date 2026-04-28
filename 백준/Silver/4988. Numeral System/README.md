# [Silver IV] Numeral System - 4988

[문제 링크](https://www.acmicpc.net/problem/4988)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 35, 맞힌 사람: 35, 정답 비율: 97.222%

### 분류

수학, 문자열, 사칙연산, 많은 조건 분기, 파싱

### 문제 설명

<p>Prof. Hachioji has devised a new numeral system of integral numbers with four lowercase letters &quot;m&quot;, &quot;c&quot;, &quot;x&quot;, &quot;i&quot; and with eight digits &quot;2&quot;, &quot;3&quot;, &quot;4&quot;, &quot;5&quot;, &quot;6&quot;, &quot;7&quot;, &quot;8&quot;, &quot;9&quot;. He doesn&#39;t use digit &quot;0&quot; nor digit &quot;1&quot; in this system.</p>

<p>The letters &quot;m&quot;, &quot;c&quot;, &quot;x&quot; and &quot;i&quot; correspond to 1000, 100, 10 and 1, respectively, and the digits &quot;2&quot;, ...,&quot;9&quot; correspond to 2, ..., 9, respectively. This system has nothing to do with the Roman numeral system.</p>

<p>For example, character strings</p>

<ul>
	<li>&quot;5m2c3x4i&quot;, &quot;m2c4i&quot; and &quot;5m2c3x&quot;</li>
</ul>

<p>correspond to the integral numbers 5234 (=5*1000+2*100+3*10+4*1), 1204 (=1000+2*100+4*1), and 5230 (=5*1000+2*100+3*10), respectively. The parts of strings in the above example, &quot;5m&quot;, &quot;2c&quot;, &quot;3x&quot; and &quot;4i&quot; represent 5000 (=5*1000), 200 (=2*100), 30 (=3*10) and 4 (=4*1), respectively.</p>

<p>Each of the letters &quot;m&quot;, &quot;c&quot;, &quot;x&quot; and &quot;i&quot; may be prefixed by one of the digits &quot;2&quot;, &quot;3&quot;, ..., &quot;9&quot;. In that case, the prefix digit and the letter are regarded as a pair. A pair that consists of a prefix digit and a letter corresponds to an integer that is equal to the original value of the letter multiplied by the value of the prefix digit.</p>

<p>For each letter &quot;m&quot;, &quot;c&quot;, &quot;x&quot; and &quot;i&quot;, the number of its occurrence in a string is at most one. When it has a prefix digit, it should appear together with the prefix digit. The letters &quot;m&quot;, &quot;c&quot;, &quot;x&quot; and &quot;i&quot; must appear in this order, from left to right. Moreover, when a digit exists in a string, it should appear as the prefix digit of the following letter. Each letter may be omitted in a string, but the whole string must not be empty. A string made in this manner is called an MCXI-string.</p>

<p>An MCXI-string corresponds to a positive integer that is the sum of the values of the letters and those of the pairs contained in it as mentioned above. The positive integer corresponding to an MCXI-string is called its MCXI-value. Moreover, given an integer from 1 to 9999, there is a unique MCXI-string whose MCXI-value is equal to the given integer. For example, the MCXI-value of an MCXI-string &quot;m2c4i&quot; is 1204 that is equal to 1000 + 2*100 + 4*1. There are no MCXI-strings but &quot;m2c4i&quot; that correspond to 1204. Note that strings &quot;1m2c4i&quot;, &quot;mcc4i&quot;, &quot;m2c0x4i&quot;, and &quot;2cm4i&quot; are not valid MCXI-strings. The reasons are use of &quot;1&quot;, multiple occurrences of &quot;c&quot;, use of &quot;0&quot;, and the wrong order of &quot;c&quot; and &quot;m&quot;, respectively.</p>

<p>Your job is to write a program for Prof. Hachioji that reads two MCXI-strings, computes the sum of their MCXI-values, and prints the MCXI-string corresponding to the result.</p>

### 입력

<p>The input is as follows. The first line contains a positive integer n (&lt;= 500) that indicates the number of the following lines. The k+1 th line is the specification of the k th computation (k=1, ..., n).</p>

<pre>
n&nbsp;
specification1&nbsp;
specification2&nbsp;
...
specificationn&nbsp;</pre>

<p>Each specification is described in a line:</p>

<pre>
MCXI-string1 MCXI-string2</pre>

<p>The two MCXI-strings are separated by a space.</p>

<p>You may assume that the sum of the two MCXI-values of the two MCXI-strings in each specification is less than or equal to 9999.</p>

### 출력

<p>For each specification, your program should print an MCXI-string in a line. Its MCXI-value should be the sum of the two MCXI-values of the MCXI-strings in the specification. No other characters should appear in the output.</p>