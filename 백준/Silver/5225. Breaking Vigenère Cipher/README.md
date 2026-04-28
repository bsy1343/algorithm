# [Silver I] Breaking Vigenère Cipher - 5225

[문제 링크](https://www.acmicpc.net/problem/5225)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 22, 맞힌 사람: 16, 정답 비율: 94.118%

### 분류

구현, 자료 구조, 집합과 맵

### 문제 설명

<p>Nick Fury has gotten wind of the secret communications between Black Widow and Hawkeye (who are using a Vigen&egrave;re Cipher), and is worried about a possible rebellion. He started reading the description of the Vigen&egrave;re cipher on Wikipedia, and was discouraged to find in the first paragraph that it is considered <em>le chiffre inchiffrable</em> (&rsquo;the indecipherable cipher&rsquo;). He now wants your help to break it, in return promising not to tell The Hulk about how you ate his lunch.</p>

<p>You are however smarter than Nick, and continue reading the description of Vigen&egrave;re cipher, and discover that it is considered quite insecure and easy to break. In fact, Charles Babbage, considered a &ldquo;father of the computer&rdquo;, decrypted a sample of encrypted ciphertext in 1846, using a technique later published by Kasiski, and called &ldquo;Kasiski examination&rdquo;.</p>

<p>Without getting into too many specific details, Kasiski examination relies on guessing the length of the keyword by looking for repeated groups of letters in the ciphertext. For example, consider the following plaintext, keyword (repeated sufficiently), and ciphertext.</p>

<ul>
	<li><code>Keyword: ABCDABCDABCDABCDABCDABCDABCD</code></li>
	<li><code>Plaintext: <u>CRYPTO</u>ISSHORTFOR<u>CRYPTO</u>GRAPHY</code></li>
	<li><code>Ciphertext: <u>CSASTP</u>KVSIQUTGQU<u>CSASTP</u>IUAQJB</code></li>
</ul>

<p>The plaintext contains a repeated text <code>CRYPTO</code>, and because of the fortuitous (for you) alignment, both the occurrences were encrypted to the same ciphertext <code>CSASTP</code>. We will denote such a pair of repeated text in the ciphertext by a triple: &lt;<em>text</em>, <em>position</em>1, <em>position</em>2&gt;. The above repetition is denoted by: &lt;<code>CSASTP</code>, 1, 17&gt;.</p>

<p>For each such triple, we can compute the distance between the two occurences (in this case 17 - 1 = 16) and guess the keyword to be of a factor of that distance (in this case, the possibilities are: 1, 2, 4, 8, or 16). Since 1 and 2 are too small, best guesses are 4, 8, or 16.</p>

<p>The repeated group of letters may also be a coincidence, so a keyword length-guessing algorithm needs to be aware of that possibility.</p>

<p>Your goal is to try to find possible key lengths given a ciphertext. For that purpose, you have to find every repeated group of letters of length exactly 3 in the ciphertext. Say you find n such pairs of repeated groups:</p>

<p style="text-align: center;">&lt;<em>text</em>1, <em>pos</em>1<em><sub>1</sub></em>, <em>pos</em>2<em><sub>1</sub></em>&gt;, &lt;<em>text</em><sub>2</sub>, <em>pos</em>1<sub>2</sub>, <em>pos</em>2<sub>2</sub>&gt;, &middot; &middot; &middot; ,&lt;<em>text<sub>n</sub></em>, <em>pos</em>1<em><sub>n</sub></em>, <em>pos</em>2<em><sub>n</sub></em>&gt;</p>

<p>Let x<sub>1</sub> = <em>pos</em>2<em><sub>1</sub></em> &minus; <em>pos</em>1<em><sub>1</sub></em>, &middot; &middot; &middot; , x<sub>n</sub> = <em>pos</em>2<em><sub>n</sub></em> &minus; <em>pos</em>1<em><sub>n</sub></em> be the distances between the repeated occurences. The possible guesses are found as follows: a number k is a guess for the length of the keyword if and only if it is a factor of (i.e., it divides) at least 90% of the numbers in {x<sub>1</sub>, &middot; &middot; &middot; , x<sub>n</sub>}. Further, we will assume that the key length is between 4 and 20 (inclusive).</p>

<p>For example, consider the ciphertext:</p>

<ul>
	<li><code>Ciphertext: <u>VHVS</u>SP<u>QUCE</u>MRVBVBBB<u>VHVS</u>URQGIBDUGRNICJ<u>QUCE</u>RVUAXSSR</code></li>
</ul>

<p>There are two repeated group of length 4, giving us a total of 4 groups of length 3: VHV, HVS, QUC, and UCE. We will count these VHV and HVS as separate groups even though they overlap, naturally giving higher weight to longer repeated groups. The sequence of lengths is 18, 18, 30 and 30, respectively, and the only possible guess that satisfies the conditions above is 6.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case with a single string, the ciphertext. You can assume that the ciphertext contains only capital letters (from A to Z) &ndash; all numbers or punctuation marks (including white spaces) are stripped out.</p>

### 출력

<p>For each test case, you are to output the guesses for keyword length between 4 and 20 (inclusive). The exact form of the output is shown below.</p>