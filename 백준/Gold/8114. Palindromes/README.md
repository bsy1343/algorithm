# [Gold II] Palindromes - 8114

[문제 링크](https://www.acmicpc.net/problem/8114)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 48, 정답: 17, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>A word is a palindrome if and only if it remains the same when read backwards. A palindrome is even if it has an even positive number of letters.</p>

<p>The word&nbsp;<code>abaaba</code>&nbsp;is an example of an even palindrome.</p>

<p>An even palindrome decomposition of a word is its division into separate parts, every one of which is an even palindrome.</p>

<p>For the word:</p>

<pre>
bbaabbaabbbaaaaaaaaaaaabbbaa</pre>

<p>the following are even palindrome decompositions:</p>

<pre>
bbaabb aabbbaaaaaaaaaaaabbbaa</pre>

<p>and</p>

<pre>
bb aa bb aa bb baaaaaaaaaaaab bb aa
</pre>

<p>The first decomposition consists of the least possible number of even palindromes, and the second one is a decomposition having the maximal possible number of even palindromes.</p>

<p>Notice that a word might have many different even palindrome decompositions or might have no such a decomposition.</p>

<p>Write a program which:</p>

<ul>
	<li>reads a word from the standard input and examines whether it can be decomposed into even palindromes,</li>
	<li>if not, then the program writes to the standard output only one word&nbsp;<code>NIE</code>&nbsp;(&quot;<i>no</i>&quot;),</li>
	<li>if the word can be decomposed, then the program writes the decompositions of the word into the minimal and maximal number of even palindromes.</li>
</ul>

### 입력

<p>The standard input contains one word consisting of at least 1 and at most 200 small letters of English alphabet. The word is written in one line with no spaces between letters.</p>

<p>We assume that the given word is written correctly in the standard input, and your program need not verify that.</p>

### 출력

<p>The standard output should contain:</p>

<ul>
	<li>only one word&nbsp;<code>NIE</code></li>
</ul>

<p>or</p>

<ul>
	<li>in the first line - a sequence of words separated by spaces, forming a decomposition of the given word into the minimal number of even palindromes</li>
	<li>in the second line - a decomposition of the given word into the maximal number of even palindromes</li>
</ul>