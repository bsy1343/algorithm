# [Silver II] Unreliable Messengers - 3932

[문제 링크](https://www.acmicpc.net/problem/3932)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 37, 맞힌 사람: 33, 정답 비율: 82.500%

### 분류

구현, 시뮬레이션, 문자열

### 문제 설명

<p>The King of a little Kingdom on a little island in the Pacific Ocean frequently has childish ideas. One day he said, &ldquo;You shall make use of a message relaying game when you inform me of something.&rdquo; In response to the King&rsquo;s statement, six servants were selected as messengers whose names were Mr. J, Miss C, Mr. E, Mr. A, Dr. P, and Mr. M. They had to relay a message to the next messenger until the message got to the King.</p>

<p>Messages addressed to the King consist of digits (&lsquo;0&rsquo;&ndash;&lsquo;9&rsquo;) and alphabet characters (&lsquo;a&rsquo;&ndash;&lsquo;z&rsquo;, &lsquo;A&rsquo;&ndash; &lsquo;Z&rsquo;). Capital and small letters are distinguished in messages. For example, &ldquo;ke3E9Aa&rdquo; is a message.</p>

<p>Contrary to King&rsquo;s expectations, he always received wrong messages, because each messenger changed messages a bit before passing them to the next messenger. Since it irritated the King, he told you who are the Minister of the Science and Technology Agency of the Kingdom, &ldquo;We don&rsquo;t want such a wrong message any more. You shall develop software to correct it!&rdquo; In response to the King&rsquo;s new statement, you analyzed the messengers&rsquo; mistakes with all technologies in the Kingdom, and acquired the following features of mistakes of each messenger. A surprising point was that each messenger made the same mistake whenever relaying a message. The following facts were observed.</p>

<p>Mr. J rotates all characters of the message to the left by one. For example, he transforms &ldquo;aB23d&rdquo; to &ldquo;B23da&rdquo;.</p>

<p>Miss C rotates all characters of the message to the right by one. For example, she transforms &ldquo;aB23d&rdquo; to &ldquo;daB23&rdquo;.</p>

<p>Mr. E swaps the left half of the message with the right half. If the message has an odd number of characters, the middle one does not move. For example, he transforms &ldquo;e3ac&rdquo; to &ldquo;ace3&rdquo;, and &ldquo;aB23d&rdquo; to &ldquo;3d2aB&rdquo;.</p>

<p>Mr. A reverses the message. For example, he transforms &ldquo;aB23d&rdquo; to &ldquo;d32Ba&rdquo;.</p>

<p>Dr. P increments by one all the digits in the message. If a digit is &lsquo;9&rsquo;, it becomes &lsquo;0&rsquo;. The alphabet characters do not change. For example, he transforms &ldquo;aB23d&rdquo; to &ldquo;aB34d&rdquo;, and &ldquo;e9ac&rdquo; to &ldquo;e0ac&rdquo;.</p>

<p>Mr. M decrements by one all the digits in the message. If a digit is &lsquo;0&rsquo;, it becomes &lsquo;9&rsquo;. The alphabet characters do not change. For example, he transforms &ldquo;aB23d&rdquo; to &ldquo;aB12d&rdquo;, and &ldquo;e0ac&rdquo; to &ldquo;e9ac&rdquo;.</p>

<p>The software you must develop is to infer the original message from the final message, given the order of the messengers. For example, if the order of the messengers is A&rarr;J&rarr;M&rarr;P and the message given to the King is &ldquo;aB23d&rdquo;, what is the original message? According to the features of the messengers&rsquo; mistakes, the sequence leading to the final message is</p>

<p>\[32Bad\xrightarrow [ A ]{ &nbsp;} daB23\xrightarrow [ J ]{ &nbsp;} aB23d \xrightarrow [ M ]{ &nbsp;} aB12d\xrightarrow [ P ]{ &nbsp;} aB23d\]</p>

<p>As a result, the original message should be &ldquo;32Bad&rdquo;.</p>

### 입력

<p>The input format is as follows.</p>

<pre>
n
The order of messengers
The message given to the King
...
The order of messengers
The message given to the King
</pre>

<p>The first line of the input contains a positive integer n, which denotes the number of data sets. Each data set is a pair of the order of messengers and the message given to the King. The number of messengers relaying a message is between 1 and 6 inclusive. The same person may not appear more than once in the order of messengers. The length of a message is between 1 and 25 inclusive.</p>

### 출력

<p>The inferred messages are printed each on a separate line.</p>