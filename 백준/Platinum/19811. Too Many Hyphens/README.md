# [Platinum IV] Too Many Hyphens - 19811

[문제 링크](https://www.acmicpc.net/problem/19811)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Document markup languages such as TeX and LaTeX, originally developed by Donald Knuth and Leslie Lamport, are often used in typesetting various articles, scientific texts, and even the statements for programming olympiads.</p>

<p>They provide special macros which allow one to use special characters that aren&#39;t present on the keyboard. For example, several hyphens in a row are converted into dashes of various lengths. Thus, when it&#39;s necessary to get a line of several hyphens in a document, you need to make some special actions.</p>

<p>In this case one can use braces to prevent a group of successive hyphens to be a macro. As in many programming languages (C++, for example) braces are used in TeX to group character blocks. Braces sequence should also form a correct parentheses sequence. That means that after removing all the characters from the line except braces, and then replacing the opening brace &quot;<code>{</code>&quot; with $+1$ and closing brace &quot;}&quot; with $-1$, the sum of all the elements of the resulting sequence should be equal to $0$, and the sum of any prefix of the resulting sequence should be non-negative.</p>

<p>To prevent the sequence of hyphens from being replaced by a dash there should be at least one brace between any two consecutive hyphens. Note that the group of consecutive pluses, unlike hyphens, does not correspond to any macro and thus there are no extra conditions for two consecutive pluses.</p>

<p>Let&#39;s consider the string $s$ consisting of pluses and hyphens. Let&#39;s add the minimum number of curly braces considering the rules described above, so that there are no two consecutive hyphens. Let&#39;s call the resulting string an <em>optimal escaped</em> string for $s$.</p>

<p>For example, for the string &quot;<code>++-{-</code>}&quot; there are exactly five optimal escaped strings: &quot;<code>++-{-</code>}&quot;, &quot;<code>++-{</code>-}&quot;, &quot;<code>++{-</code>-}&quot;, &quot;<code>+{+-</code>-}&quot;, &quot;<code>{++-</code>-}&quot;.</p>

<p>The lines above are listed in <em>lexicographical order</em>: they are ordered by the first unequal character (by the first, then by the second in case the first characters are equal, etc). Characters are ordered as &quot;<code>+</code>&quot;$\strut&lt;\strut$&quot;<code>-</code>&quot;$\strut&lt;\strut$&quot;<code>{</code>&quot;$\strut&lt;\strut$&quot;}&quot;.</p>

<p>Let&#39;s consider all the minimal length strings that can be obtained from $s$ by adding bracers by the described rules, namely all optimal escaped strings for $s$. You must find the $k$-th in lexicographical order optimal escaped string or detect that the given $k$ is too great.</p>

### 입력

<p>The first line of input contains the string $s$, consisting of pluses and hyphens. It&#39;s guaranteed that $s$ is not empty and has a length of no more than $60$ characters.</p>

<p>The second line contains a single integer $k$ ($1 \le k \le 10^{18}$).</p>

### 출력

<p>You need to print the $k$-th in lexicographical order optimal escaped string for the string $s$ specified in the input.</p>

<p>If $k$ is greater than the number of optimal escaped strings, your program should print &quot;<code>Overflow</code>&quot;.</p>