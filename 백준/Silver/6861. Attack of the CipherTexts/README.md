# [Silver IV] Attack of the CipherTexts - 6861

[문제 링크](https://www.acmicpc.net/problem/6861)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 29, 맞힌 사람: 27, 정답 비율: 26.471%

### 분류

구현, 문자열

### 문제 설명

<p>Ruby is a code-breaker. She knows that the very bad people (Mr. X and Mr. Z) are sending secret messages about very bad things to each other.</p>

<p>However, Ruby has managed to intercept a plaintext message and the corresponding ciphertext message. By plaintext, we mean the message before it was encrypted (i.e., readable English sentences), and by ciphertext, we mean the message after it was encrypted (i.e., gibberish). To encrypt a message, each letter is changed to a new letter, so that if you read the ciphertext message, it is not obvious what the plaintext message is.</p>

<p>However, Ruby being the outstanding code-breakershe is, knows the algorithm that Mr. X and Mr. Z use. She knows they simply map one letter to another (possibly different) letter when they encrypt their messages. Of course, this map must be &ldquo;one-to-one&rdquo;, meaning that each plaintext letter must correspond to exactly one ciphertext letter, as well as &ldquo;onto&rdquo;, meaning that each ciphertext letter has exactly one corresponding plaintext letter.</p>

<p>You job is to automate Ruby&rsquo;s codebreaking and help save the world.</p>

### 입력

<p>The input consists of 3 strings, with each string on a separate line. The first string is the plaintext message which Ruby knows about. The second string is the ciphertext message which corresponds to the plaintext message. The third string is another ciphertext message. You may assume that all strings have length of at least 1 character and at most 80 characters. You can also assume that there are only 27 valid characters: the uppercase letters (&lsquo;A&rsquo; through &lsquo;Z&rsquo;) as well as the space character (&lsquo; &rsquo;). That is, there will be no punctuation, lowercase letters, or special characters (like &lsquo;!&rsquo; or &lsquo;@&rsquo;) in either the plaintext or ciphertext messages.</p>

### 출력

<p>The output is a (plaintext) string which corresponds to the second ciphertext input. It may not be possible to determine each character of the second ciphertext string, however. If this is the case, the output should have a period (&lsquo;.&rsquo;) character for those letters which cannot be determined.</p>