# [Bronze II] Vigenère Cipher - 5222

[문제 링크](https://www.acmicpc.net/problem/5222)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 204, 정답: 176, 맞힌 사람: 150, 정답 비율: 91.463%

### 분류

구현, 문자열

### 문제 설명

<p>Black Widow and Hawkeye need to discuss the plans for a surprise Birthday party for Nick Fury, and decide to use an encryption technique so that Nick can&rsquo;t read their messages. In particular, they decide to use the <em>Vigen&egrave;re Cipher</em>. Vigen&egrave;re cipher is a simple form of polyalphabetic substitution, and was described by Giovan Battista Bellaso in 1553. It was misattributed to Blaise de Vigen&egrave;re in the 19th century, because of a similar but stronger cipher presented by Vigen&egrave;re in 1586.</p>

<p>Vigen&egrave;re cipher is similar to the Caesar cipher. In Caesar cipher, each letter of the alphabet is shifted along some number of places; for example, in a Caesar cipher of shift 3, &ldquo;A&rdquo; would become &ldquo;D&rdquo;, &ldquo;B&rdquo; would become &ldquo;E&rdquo;, &ldquo;Y&rdquo; would become &ldquo;B&rdquo; and so on. The Vigen&egrave;re cipher consists of several Caesar ciphers in sequence with different shift values.</p>

<p>For example, suppose that the plaintext to be encrypted is:</p>

<pre>
ATTACKATDAWN</pre>

<p>The person sending the message chooses a <em>keyword</em> and repeats it until it matches the length of the plaintext, for example, the keyword &ldquo;LEMON&rdquo;:</p>

<pre>
LEMONLEMONLE</pre>

<p>Each letter in the plaintext is shifted according to the corresponding letter in the keyword. So the first letter &ldquo;A&rdquo; is shifted according to &ldquo;L&rdquo;, second letter &ldquo;T&rdquo; is shifted according to &ldquo;E&rdquo;, the third letter &ldquo;T&rdquo; is shifted according to &ldquo;M&rdquo;, and so on.</p>

<p>The shifting itself works as follows. If we are shifting according to, say, &ldquo;L&rdquo;, then: &ldquo;A&rdquo; becomes &ldquo;L&rdquo;, &ldquo;B&rdquo; becomes &ldquo;M&rdquo;, &ldquo;C&rdquo; becomes &ldquo;N&rdquo;, and so on. If we reach the end of the alphabet, then we wrap around to the beginning. So &ldquo;O&rdquo; becomes &ldquo;Z&rdquo;, and &ldquo;P&rdquo; becomes &ldquo;A&rdquo;.</p>

<p>If the keyword letter is &ldquo;E&rdquo;, then each letter is shifted by 4 (so &ldquo;T&rdquo; becomes &ldquo;X&rdquo; and so on).</p>

<p>The plaintext above is encrypted to ciphertext:</p>

<pre>
LXFOPVEFRNHR</pre>

<p>You are to write a program that helps Black Widow and Hawkeye encrypt their messages.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 100). After that, each line contains one test case with two strings: the first string is the <em>keyword</em>, and the second string is the <em>plaintext</em>. Both the keyword and plaintext only contain capital letters (from A to Z) &ndash; all numbers or punctuation marks (including white spaces) are stripped out.</p>

### 출력

<p>For each test case, you are to output the encrypted ciphertext. The exact form of the output is shown below.</p>