# [Silver III] Compact Encoding - 35020

[문제 링크](https://www.acmicpc.net/problem/35020)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 21, 맞힌 사람: 19, 정답 비율: 95.000%

### 분류

구현, 문자열, 비트마스킹

### 문제 설명

<p>Binary formats often use compact representations for integers. Consider writing a 32-bit unsigned integer to a file: you must always reserve 4 bytes to represent it (remember, 8 bits make one byte). However, in many real-life applications, integer values tend to be small. Writing these small values using a fixed 4-byte representation results in files that are mostly filled with zero bytes.</p>

<p>To make the representation more compact, we introduce the following encoding scheme. Each value is represented as a sequence of bytes $b_1, b_2, \ldots, b_k$, where each $b_i$ is an integer between $0$ and $255$, inclusive. The most significant bit of each byte serves as a continuation flag, and the lower $7$ bits carry the actual data. If the continuation flag is $1$, more bytes follow; for the last byte, it is $0$. The representation is <em>big-endian</em>, meaning that $b_1$ contains the most significant bits of the encoded value.</p>

<p>For example, here's how to find the compact representation of $n = 112025$. First, we find its binary representation:</p>

<p style="text-align: center;">$112025 = 11011010110011001_2$</p>

<p>Next, we split it into 7-bit chunks, padding with zeros on the left if necessary:</p>

<p style="text-align: center;">$0000110$ / $1101011$ / $0011001$</p>

<p>The first two chunks have a following chunk, so the corresponding bytes have their most significant bit set to $1$. The last chunk has no following chunk, so its most significant bit is $0$. This gives us:</p>

<p style="text-align: center;">$b_1 = 10000110_2 = 134$</p>

<p style="text-align: center;">$b_2 = 11101011_2 = 235$</p>

<p style="text-align: center;">$b_3 = 00011001_2 = 25$</p>

<p>You are given an integer $n$, and your task is to find its compact representation.</p>

### 입력

<p>The only line contains a single integer $n$ ($0 \le n \le 2^{31}-1$).</p>

### 출력

<p>Print a sequence of integers between $0$ and $255$, inclusive, representing the compact encoding of $n$. The encoding must not contain leading bytes with zero data bits: that is, it may not start with $128$.</p>