# [Silver I] Numerology - 5126

[문제 링크](https://www.acmicpc.net/problem/5126)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

수학, 구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>In many cultures, certain numbers are associated with particular beliefs. For instance, 666 is often associated with the Devil, and 777 is often associated with good luck. These numbers tend to follow patterns, and if one is a numerologist trying to predict the end of the world, one might be interested in finding further numbers with such patterns.</p>

<p>One issue is that a particular number might only exhibit an interesting pattern if it&rsquo;s represented in the appropriate base. For example, the number 666, when represented in hexadecimal, becomes 29a, which is much less interesting than its base 10 representation. In order to account for all the different bases that past (and possibly alien!) cultures may have used, you&rsquo;d like to check whether a number matches a pattern of interest when represented in a different base.</p>

<p>For our purposes, we&rsquo;ll represent a number converted to a base b as a sequence of symbols S = &lt;s<sub>1</sub>, s<sub>2</sub>, ..., s<sub>L</sub>&gt;, where each symbol is simply an integer. For instance, the decimal number 6, when converted to base 2, would have S = &lt;1, 0, 1, 0&gt;, giving L = 4. The pattern we&rsquo;d like to match against will be represented as a string, for example &ldquo;ab&rdquo;. A sequence of symbols S matches a pattern p if and only if both of the following conditions hold:</p>

<ol>
	<li>The length of S is at least as long as the length of p.</li>
	<li>There exists a one-to-one mapping between the set of characters in p and the set of symbols in S, such that when p is repeatedly concatenated with itself and then truncated so that the length of the resulting string r matches the length of S, the sequence S can be obtained from r by substituting each character in r with its corresponding mapped symbol.</li>
</ol>

<p>Hence, in our example, the result of 6 converted to base 2 ends up matching the pattern &ldquo;ab&rdquo;.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets. Each data set consists of a single line which contains a positive integer n and a string p, the number you&rsquo;re concerned with and the pattern you&rsquo;d like to match against, respectively. The number n is guaranteed to fit in a 64-bit integer, and p is at most 10 characters. Further, the only possible characters the pattern can contain are lower case &lsquo;a&rsquo; through &lsquo;j&rsquo;.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the smallest base b where 2 &le; b &le; 1000000, such that n converted to base b matches the pattern specified by p. On the next line output the integer symbols of the matching sequence, each separated by a single space, with no trailing whitespace. If no such base results in a pattern match, instead output &ldquo;No such base.&rdquo; Each data set should be followed by a blank line.</p>