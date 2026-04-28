# [Gold II] Key Knocking - 13955

[문제 링크](https://www.acmicpc.net/problem/13955)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 291, 정답: 77, 맞힌 사람: 59, 정답 비율: 32.597%

### 분류

해 구성하기, 많은 조건 분기

### 문제 설명

<p>Goran is recovering from his knee surgery and is experimenting with a smart card used for storing cryptographic keys. In this problem, a key is a bitstring of size 3n where n is a positive integer. Particular bits of the key are indexed with integers 1 through 3n left to right. Weight of a key is the number of pairs of different neighbouring bits increased by one. For example, the weight of the key &ldquo;000&rdquo; is 1, while the weight of the key &ldquo;011010100&rdquo; is 7.</p>

<p>He has discovered that he can tamper with the key by sending small jolts of electricity through the circuits of the smart card. In particular, he can reliably perform the following operation: pick two arbitrary neighbouring bits of the key and flip both of them. For example, one operation can change the key &ldquo;000&rdquo; to &ldquo;110&rdquo;.</p>

<p>Given a key of size 3n find any sequence of at most n operations that transforms the given key to a key of weight at least 2n. You may assume that a solution always exists.</p>

### 입력

<p>The first line contains a string consisting of digits &ldquo;0&rdquo; and &ldquo;1&rdquo; &mdash; the initial key. The length of the key is 3n where n is a positive integer such that 1 &le; n &le; 100 000.</p>

### 출력

<p>The first line should contain an integer m where 0 &le; m &le; n &mdash; the number of operations in your solution. The following line should contain m integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>m</sub> describing your solution. The number a<sub>k</sub> is the index of the left one of two bits being flipped in the k-th step.</p>

<p>If the initial key already has weight at least 2n you may output only the integer 0.</p>