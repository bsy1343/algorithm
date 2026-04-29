# [Silver V] Alternative Encryption - 32886

[문제 링크](https://www.acmicpc.net/problem/32886)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 60, 정답: 56, 맞힌 사람: 40, 정답 비율: 93.023%

### 분류

문자열, 해 구성하기

### 문제 설명

<p>In the fight against theft of intellectual property by rivalling universities, TU Delft has decided to implement a system of secure communication, to be called New Well-Encrypted Remote Communication. All internal communication will be encrypted before being sent over the network, and then decrypted upon arrival. They have already set up the infra-structure, they have come to you for the encryption.</p>

<p>You are tasked to design an algorithm for both encryption and decryption of text consisting of only English lowercase letters. You do not need to tell them how you do it, in fact, they encourage you to keep it a secret, to improve security. Your algorithm only needs to meet the following criteria:</p>

<ul>
	<li>No matter what the text is, encrypting it and then decrypting the result should obviously yield the original text.</li>
	<li>To make sure there are no issues with the transmission, the encrypted text should also consist of only English lowercase letters and should have the same number of letters as the original text.</li>
	<li>To make sure the code cannot be broken easily, for all $i$, the $i$th letter of the encrypted text should differ from the $i$th letter of the original text.</li>
</ul>

<p>The word "<code>nwercjury</code>" for example may not be encrypted as "<code>irritating</code>", because the number of letters does not match. Nor may you encrypt it as "<code>imbecilic</code>", since the fifth letter is a '<code>c</code>' in both. An example of an acceptable encryption is "<code>fantastic</code>" (both have an '<code>n</code>' and a '<code>c</code>', but in different positions).</p>

<p>Your program will be run twice for each test case. In the first pass, your program will be given a number of strings to encrypt. In the second pass, your program will be given the strings as encrypted by the first pass, which it should then decrypt to retrieve the original input.</p>

<p>A testing tool is provided to help you develop your solution.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with either "<code>encrypt</code>" or "<code>decrypt</code>", indicating the action your program has to perform.</li>
	<li>One line with an integer $n$ ($1 \le n \le 1000$), the number of strings.</li>
	<li>$n$ lines, each with a string $s$ ($1 \le |s| \le 100$), the text to encrypt or decrypt. All input strings consist of only English lowercase letters (<code>a-z</code>).</li>
</ul>

### 출력

<p>For each string, output its encryption or decryption, as required.</p>