# [Gold IV] Hidden Code - 7635

[문제 링크](https://www.acmicpc.net/problem/7635)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 12, 맞힌 사람: 11, 정답 비율: 84.615%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>It&rsquo;s time to put your hacking skills to the test! You&rsquo;ve been called upon to help crack enemy codes in the current war on... something or another. Anyway, the point is that you have discovered the encryption technique used by the enemy; it is quite simple, and proceeds as follows. Note that all strings contain only uppercase letters of the alphabet.</p>

<ol>
	<li>We are given a key K and a plaintext P which is encrypted character-by-character to produce a ciphertext C of the same length.</li>
	<li>If |K| is the length of the key K, then the first |K| characters of C are obtained by adding the first |K| characters of P to the characters of K, where adding two letters means interpreting them as numbers (A = 0, B = 1, and so on) and taking the sum modulo 26. That is, C<sub>i</sub> = (P<sub>i</sub> + K<sub>i</sub>) mod 26 for i = 1, . . . , |K|. If |K| &gt; |P|, then the extra characters in K are ignored.</li>
	<li>The remaining characters of P, i.e. P<sub>i</sub> for i &gt; |K|, are encrypted using the previous ciphertext characters by C<sub>i</sub> = (P<sub>i</sub> + C<sub>i&minus;|K|</sub>) mod 26 for i = |K| + 1, . . . , |P|.</li>
</ol>

<p>As an example, consider the encryption of the string &ldquo;STANFORD&rdquo; using the key &ldquo;ACM&rdquo;:</p>

<pre>
  STA NFORD
+ ACM SVMFA
  ----------
  SVM FAAWD</pre>

<p>Knowing this, you are well on your way to being able to read the enemy&rsquo;s communications. Luckily, you also have several pairs of plaintexts and ciphertexts which your team recovered, all of which are known to be encrypted with the same key. Help find the key that the enemy is using.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line containing a single integer N, 1 &le; N &le; 100, the number of plaintext and ciphertext pairs you will receive. The next N lines each contain two strings P and C, the plaintext and ciphertext, respectively. P and C will contain only uppercase letters (A-Z) and have the same length (at most 100 characters). The input terminates with a line with N = 0.</p>

### 출력

<p>For each test case, print a single line that contains the shortest possible key or &ldquo;Impossible&rdquo; (quotes added for clarity) if no possible key could have produced all of the encryptions.</p>