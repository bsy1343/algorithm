# [Gold V] Mixed Messages - 33357

[문제 링크](https://www.acmicpc.net/problem/33357)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 21, 맞힌 사람: 20, 정답 비율: 66.667%

### 분류

이분 탐색

### 문제 설명

<p>Nikita received some messages today. One of the messages was the code word "<code>spbsu</code>". Before and after the code word, there may have been any number of other messages as well. The other messages are arbitrary strings of lowercase English letters.</p>

<p>All the messages were sent via a secret channel, one by one. So, the string in the channel initially was a concatenation of all the messages.</p>

<p>However, being secret, the channel may introduce noise: different messages may interfere with each other. Formally, the noise comes in form of <em>swaps</em>. In each swap, the channel selects and exchanges two adjacent letters in the string <strong>that initially belonged to different messages</strong>. For letters of any particular message, the relative order is preserved.</p>

<p>After all swaps, the resulting string is received by Nikita. Given the resulting string, find the minimum possible number of swaps made by the channel.</p>

### 입력

<p>The first line contains a single integer $n$: the number of received characters ($5 \leq n \leq 10^5$).</p>

<p>The next line contains a string $s$ consisting of $n$ lowercase English letters: the resulting string received by Nikita. It is guaranteed that this string is the result of the process described above.</p>

### 출력

<p>Output a single integer: the answer to the problem.</p>