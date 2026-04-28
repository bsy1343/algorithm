# [Platinum IV] String Equations - 4854

[문제 링크](https://www.acmicpc.net/problem/4854)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 1, 맞힌 사람: 1, 정답 비율: 100.000%

### 분류

수학, 문자열, 선형대수학, 가우스 소거법

### 문제 설명

<p>We all understand equations such as:</p>

<blockquote>
<p>3 + 8 = 4 + 7</p>
</blockquote>

<p>But what happens if we look at equations with strings instead of numbers? What would addition and equality mean?</p>

<p>Given two strings x and y, we define x + y to be the concatenation of the two strings. We also define x = y to mean that x is an anagram of y. That is, the characters in x can be permuted to form y.</p>

<p>You are given n distinct nonempty strings, each containing at most 10 lowercase characters. You may also assume that at most 10 distinct characters appear in all the strings. You need to determine if you can choose strings to put on both sides of an equation such that the &quot;sums&quot; on each side are &quot;equal&quot; (by our definitions above). You may use each string on either side 0 or more times, but no string may be used on both sides.</p>

### 입력

<p>The input consists of a number of cases. Each case starts with a line containing the integer n (2 &lt;= n &lt;= 100). The next n lines contain the n strings. The input is terminated with n = 0.</p>

### 출력

<p>For each case, print either &quot;yes&quot; or &quot;no&quot; on one line indicating whether it is possible to form an equation as described above. If it is possible, print on each of the next n lines how many times each string is used, with the strings listed in the same order as the input. On each line, print the string, followed by a space, followed by the letter &quot;L&quot;, &quot;R&quot;, or &quot;N&quot; indicating whether the string appears on the left side, the right side, or neither side in the equation. Finally, this is followed by a space and an integer indicating how many times the string appears in the equation. Each numeric output should fit in a 64&minus;bit integer.</p>

<p>If there are multiple solutions, any solution is acceptable.</p>