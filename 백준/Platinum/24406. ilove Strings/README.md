# [Platinum III] ilove Strings - 24406

[문제 링크](https://www.acmicpc.net/problem/24406)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 15, 맞힌 사람: 14, 정답 비율: 82.353%

### 분류

다이나믹 프로그래밍, 포함 배제의 원리, 중간에서 만나기

### 문제 설명

<p>It&rsquo;s that time of year when love is in the air. You&rsquo;re no stranger to love. You are obsessed with strings but not just any strings. You love &ldquo;ilove&rdquo; Strings. An &ldquo;ilove&rdquo; String is a string of length 5 with the following properties:</p>

<ul>
	<li>Alternates between vowels (excluding &lsquo;y&rsquo; and &lsquo;Y&rsquo;) and consonants (including &lsquo;y&rsquo; and &lsquo;Y&rsquo;)</li>
	<li>Begins with a vowel (excluding &lsquo;y&rsquo; and &lsquo;Y&rsquo;)</li>
	<li>Consists of 5 pairwise distinct characters (distinguishing between upper and lower case)</li>
</ul>

<p>Examples of &ldquo;ilove&rdquo; Strings includes &ldquo;<code>ilove</code>&rdquo;, &ldquo;<code>image</code>&rdquo;, &ldquo;<code>IxoXO</code>&rdquo;, and &ldquo;<code>abide</code>&rdquo;. Examples of non-&ldquo;ilove&rdquo; Strings include , &ldquo;<code>ideas</code>&rdquo;, &ldquo;<code>maker</code>&rdquo;, &ldquo;<code>inane</code>&rdquo;, &ldquo;<code>oxOXo</code>&rdquo; and &ldquo;<code>abides</code>&rdquo;.</p>

<p>The loveliness of a string is the number of subsequences of the string that form an &ldquo;ilove&rdquo; String. Although &ldquo;<code>ilooove</code>&rdquo; is not an &ldquo;ilove&rdquo; String, it does have a loveliness of 3.</p>

### 입력

<p>Input contains a single string of between $1$ and $100\,000$ lowercase and uppercase Latin characters, representing the string whose loveliness is to be computed.</p>

### 출력

<p>For the provided string, print one line with a single integer $L$ &mdash; the loveliness of the string modulo $10^9 + 7$.</p>