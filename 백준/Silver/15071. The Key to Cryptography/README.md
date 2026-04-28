# [Silver III] The Key to Cryptography - 15071

[문제 링크](https://www.acmicpc.net/problem/15071)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 121, 정답: 87, 맞힌 사람: 82, 정답 비율: 71.930%

### 분류

문자열

### 문제 설명

<p>Suppose you need to encrypt a top secret message like &ldquo;SEND MORE MONKEYS&quot;. You could use a simple substitution cipher, where each letter in the alphabet is replaced with a different letter. However, these ciphers are easily broken by using the fact that certain letters of the alphabet (like &lsquo;E&rsquo;, &lsquo;S&rsquo;, and &lsquo;A&rsquo;) appear more frequently than others (like &lsquo;Q&rsquo;, &lsquo;Z&rsquo;, and &lsquo;X&rsquo;). A better encryption scheme would vary the substitutions used for each letter. One such system is the autokey cipher.</p>

<p>To encrypt a message, you first select a secret word &ndash; say &ldquo;ACM&quot; &ndash; and prepend it to the front of the message. This longer string is truncated to the length of the message and called the key, and the n th letter of the key is used to encrypt the n th letter of the original message. This encryption is done by treating each letter in the key as a cyclic shift value for the corresponding letter in the message, where &lsquo;A&rsquo; indicates a shift of 0, &lsquo;B&rsquo; a shift of 1, and so on. Using &ldquo;ACM&quot; as the secret word, we would encrypt our message as follows:</p>

<pre>
 SENDMOREMONKEYS (message)
 ACMSENDMOREMONK (key)
------------------------------
 SGZVQBUQAFRWSLC (ciphertext)</pre>

<p>Note that the letter &lsquo;E&rsquo; in the message was encrypted as &lsquo;G&rsquo; the first time it was encountered (since the corresponding letter in the key was &lsquo;C&rsquo; indicating a shift of 2), but then as &lsquo;Q&rsquo; and &lsquo;S&rsquo; the next two times.</p>

<p>Your task is simple: given a ciphertext and the secret word, you must determine the original message.</p>

### 입력

<p>Input consists of two lines. The first contains the ciphertext and the second contains the secret word. Both lines contain only uppercase alphabetic letters.</p>

### 출력

<p>Display the original message that generated the given ciphertext using the given secret word.</p>