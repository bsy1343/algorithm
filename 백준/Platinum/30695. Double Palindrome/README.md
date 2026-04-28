# [Platinum I] Double Palindrome - 30695

[문제 링크](https://www.acmicpc.net/problem/30695)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

자료 구조, 문자열, 세그먼트 트리, 퍼시스턴트 세그먼트 트리, 매내처

### 문제 설명

<p>Vanya works at the factory producing palindromes. The factory has a workpiece --- a string $s$ line of length $n$, consisting of lowercase English letters, from which Vanya can cut out any substring for sale. We remind you that <em>palindrome</em> --- is a string that reads in the same way from left to right and from right to left.</p>

<p>A lot of people are fed up with a usual palindromes, so Vanya decided to produce double palindromes instead. <em>Double palindrome</em> is a string formed by a concatenation of two palindromes of <strong>equal</strong> length. For example, the strings &quot;<code>aabb</code>&quot;, &quot;<code>aaaa</code>&quot; are double palindromes, while strings &quot;<code>abba</code>&quot; and &quot;<code>aaaabb</code>&quot; are not.</p>

<p>Vanya wonders how many ways are there to cut out double palindrome from $s$. In other words, how many there are pairs $(l, r)$, such that substring $s_l s_{l+1} \ldots s_r$ is a double palindrome. Please help Vanya to find an answer to this question.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \leq n \leq 500\,000$) --- the length of the string $s$. The second contains a string $s$, consisting of lowercase English letters.</p>

### 출력

<p>Print a single integer --- the number of double palindrome substrings.</p>

### 힌트

<p>In the first example, there are 5 double palindromes of length 2 (&quot;<code>ab</code>&quot;, &quot;<code>ba</code>&quot;, &quot;<code>ac</code>&quot;, &quot;<code>ca</code>&quot; and &quot;<code>ac</code>&quot;), and the whole string is a double palindrome as well (&quot;<code>abacac</code>&quot;).</p>