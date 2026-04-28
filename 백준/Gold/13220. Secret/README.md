# [Gold V] Secret - 13220

[문제 링크](https://www.acmicpc.net/problem/13220)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 656, 정답: 323, 맞힌 사람: 194, 정답 비율: 46.301%

### 분류

문자열, KMP

### 문제 설명

<p>Alice needs to send a secret password to Bob. The password consists of N​space-separated integers. She decides to use a messenger, Eve, to send the password. To ensure that Eve does not steal the password, Alice uses a method of encoding she invented -- by writing it in a loop.</p>

<p>For example, if the password is &ldquo;37 20 71 33 97&rdquo;, Alice writes it down as &ldquo;20 71 33 97 37&rdquo;. She notifies Bob beforehand that the starting point for the message is the 5th integer, so he knows to decode the message starting from there. To make the password harder to guess, she may also use a different starting point. For example, Alice can also write the password as &ldquo;71 33 97 37 20&rdquo; where the starting point is the 4th integer.</p>

<p>Being an experienced hacker, Eve managed to figure out Alice&rsquo;s encoding scheme (but not the starting points). Furthermore, Eve was Alice&rsquo;s messenger twice, hence she has two of Alice&rsquo;s encoded messages. Eve wishes to know whether it is possible that Alice has sent the same secret password twice.</p>

<p>Your task is work out whether it is possible two of those encoded messages are for the same secret password.</p>

### 입력

<p>Line 1: A single positive integer N​corresponding to the number of integers in the secret password. (N​ &le; 100,000)</p>

<p>Line 2: N space-separated positive integers a<sub>i</sub> corresponding to the integers in the first encoded message. (a<sub>i</sub> &le; 1,500,000,000)</p>

<p>Line 3: N space-separated positive integers b<sub>i</sub>​&nbsp;corresponding to the integers in the second encoded message.&nbsp;(b<sub>i</sub>&nbsp;&le; 1,500,000,000)</p>

### 출력

<p>YES or NO indicating whether it is possible that both loops are for the same password.</p>