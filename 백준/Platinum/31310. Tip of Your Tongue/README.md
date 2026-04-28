# [Platinum II] Tip of Your Tongue - 31310

[문제 링크](https://www.acmicpc.net/problem/31310)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

자료 구조, 해싱, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Has this scenario ever happened to you? You&#39;re having a lovely conversation with someone, begin to say a word you&#39;ve used hundreds of times, and the word escapes your mind, leaving you sputtering the first syllable. Well worry no more, because the Institute for Cancelling Pauses in Conversation (ICPC) has developed software to curtail this issue.</p>

<p>If there&#39;s a word on the tip of your tongue, enter the first few characters of the word into the ICPC software, and it will tell you how many words in the dictionary have those characters as a prefix. The ICPC quickly discovered that many of their clients don&#39;t only have tip-of-your-tongue problems, but also base-of-your-tongue problems, where users only remember some suffix of a word.</p>

<p>To be as useful as possible, the ICPC software needs to support the following queries:</p>

<ol>
	<li><code>AND</code> $p$ $s$. Count the number of words in the dictionary that have $p$ as a prefix and $s$ as a suffix.</li>
	<li><code>OR</code> $p$ $s$. Count the number of words in the dictionary that have $p$ as a prefix or $s$ as a suffix.</li>
	<li><code>XOR</code> $p$ $s$. Count the number of words in the dictionary that have $p$ as a prefix or $s$ as a suffix, but not both.</li>
</ol>

<p>Prefixes and suffixes of a word may be the whole world, and can overlap within the word. Due to a quirk in the ICPC software, $p$ and $s$ must be the same length. You must help the software developers answer all the incoming queries.</p>

### 입력

<p>The first line of input contains two integers $n$ and $q$ ($1 \le n,q \le 2 \cdot 10^5$), where $n$ is the number of words in the dictionary and $q$ is the number of queries.</p>

<p>Each of the next $n$ lines contains a single string $w$, which is a word in the dictionary. All characters in dictionary words and queries are lowercase Latin characters (&#39;<code>a</code>&#39;--&#39;<code>z</code>&#39;). All words in the dictionary will be distinct.</p>

<p>Each of the next $q$ lines contains three strings $o$, $p$, and $s$, where $o$ is one of the operations <code>&#39;AND&#39;</code>, <code>&#39;OR&#39;</code>, or <code>&#39;XOR&#39;</code>, and $p$ and $s$ are strings of one or more lowercase Latin characters (&#39;<code>a</code>&#39;---&#39;<code>z</code>&#39;) with $|p| = |s|$.</p>

<p>The total number of characters in the dictionary and across all queries is at most $10^6$; this does not include query operations <code>&#39;AND&#39;</code>, <code>&#39;OR&#39;</code>, or <code>&#39;XOR&#39;</code>, whitespace, or newline characters. Said another way, there are at most $10^6$ lowercase letters in the input.</p>

### 출력

<p>Output $q$ lines, one per query, in the order the queries were given. On each line output a single integer, which is the number of words in the dictionary that match that particular query. </p>