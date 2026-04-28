# [Bronze II] Caesar Word Salad - 20355

[문제 링크](https://www.acmicpc.net/problem/20355)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 180, 정답: 148, 맞힌 사람: 138, 정답 비율: 84.663%

### 분류

구현, 문자열

### 문제 설명

<p>The year is 46, B.C. Gaius Julius Caesar is the most powerful ruler in the world.</p>

<p>The newly named &ldquo;imperator&rdquo;, busy consolidating his power in Rome and waging wars abroad, needs a secure way to send messages to his representatives around the Roman world.</p>

<p>The now world-famous solution to this problem is the eponymous Caesar cipher, an encoding in which every letter from the plaintext is rotated through the alphabet by a fixed shift distance. For example, when encoded using a <em>shift distance</em> of 3, <code>alexandra</code> becomes <code>dohadqgud</code>.</p>

<p>Caesar is a master of strategy&mdash;he knows the value of an effective double-bluff and will not hesitate to use one. In fact, when possible, he will even send some messages with a shift distance of 0 to really confuse his enemies.</p>

<p>However, after a run in with the soothsayer Spurina, Caesar has become a worried man. He will hear no talk of any &ldquo;<code>i</code>&rdquo;s of March and so, wants to send only messages where the ciphertext contains no &ldquo;<code>i</code>&rdquo;s!</p>

<p>Given the plaintext of a message, how many distinct &ldquo;i-free&rdquo; shifts could be used for the encoding?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line containing the plaintext w. w will be at least one character long and no more than 100 characters in length. It will contain only lower-case letters.</li>
</ul>

### 출력

<p>If at least one &ldquo;i-free&rdquo; shift of w can be found, output the number of distinct shift distances that could be used.</p>

<p>Otherwise, output <code>impossible</code>.</p>

<p>You may consider 0 as a valid shift distance provided it does not lead to any &ldquo;<code>i</code>&rdquo;s.</p>