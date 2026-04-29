# [Gold IV] Divisibility Test - 33018

[문제 링크](https://www.acmicpc.net/problem/33018)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 28, 맞힌 사람: 23, 정답 비율: 88.462%

### 분류

수학, 정수론

### 문제 설명

<p>Daisy has recently learned divisibility rules for integers and she is fascinated by them. One of the tests she learned is a divisibility test by 3. You can find a sum of all digits of a decimal number and check if the resulting sum is divisible by 3. Moreover, the resulting sum of digits is congruent modulo 3 to the original number --- the remainder modulo 3 is preserved. For example, $75 \equiv 7 + 5 \pmod 3$. Daisy is specifically interested in such <em>remainder preserving</em> divisibility tests.</p>

<p>There are more examples like that that she learned for decimal integers (integers base 10):</p>

<ul>
	<li>To test divisibility modulo 11, find an alternating sum of digits. Counting digits from the last (least significant) digit, add digits on odd positions (the last, 3rd to the last, etc) and subtract digits on even positions (2nd to the last, 4th to the last, etc) to get the sum that is congruent modulo 11 to the original number. For example, $123 \equiv 1 - 2 + 3 \pmod {11}$.</li>
	<li>To test divisibility modulo 4, keep the last <strong>two digits</strong>. Their value is congruent modulo 4 to the original number. For example, $876543 \equiv 43 \pmod 4$.</li>
	<li>To test divisibility modulo 7, find an alternating sum of groups of <strong>three digits</strong>. For example, $4389328 \equiv 4 - 389 + 328 \pmod 7$.</li>
</ul>

<p>Similar tests can be found in other bases. For example, to test divisibility modulo 5 for octal numbers (base 8), find an alternating sum of groups of <strong>two digits</strong>. For example, $1234_8 \equiv -12_8 + 34_8 \pmod 5$.</p>

<p>Daisy wants to find such rules for a given base $b$. She is interested in three kinds of divisibility rules:</p>

<ul>
	<li><strong>Kind 1</strong> --- take the last $k$ digits of an integer in base $b$.</li>
	<li><strong>Kind 2</strong> --- take a sum of groups of $k$ digits of an integer in base $b$.</li>
	<li><strong>Kind 3</strong> --- take an alternating sum of groups of $k$ digits of an integer in base $b$.</li>
</ul>

<p>It is not always possible to find such a divisibility rule. For example, in base 10 there is no such test for divisibility modulo 6, even though different approaches to testing divisibility by 6 exist.</p>

<p>Given base $b$ and modulo $n$, Daisy wants to know the smallest group size $k$ for which such a divisibility test exits.</p>

### 입력

<p>There are several tests in the input. The first line of the input contains an integer $t$ --- the number of tests. The next $t$ lines describe the tests.</p>

<p>Each test consists of a line with two integers $b$ and $n$ --- the base and the modulo ($b, n \ge 2$). The sum of all $b$ values in the input does not exceed $10^6$, and the sum of all $n$ values in the input does not exceed $10^6$.</p>

### 출력

<p>Write $t$ lines --- a line for each test in the input. On a line for a test write a single integer $0$ if the divisibility test for a given $b$ and $n$ does not exist. Otherwise, write two integers $a$ and $k$, where $a$ is the kind of the divisibility test (1, 2, or 3) and $k$ is the number of digits in a group for the test, such that $k$ is the lowest among all possible divisiblity tests for the given $b$ and $n$.</p>