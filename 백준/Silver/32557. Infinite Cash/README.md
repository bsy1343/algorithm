# [Silver I] Infinite Cash - 32557

[문제 링크](https://www.acmicpc.net/problem/32557)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 118, 정답: 31, 맞힌 사람: 26, 정답 비율: 31.325%

### 분류

구현, 수학

### 문제 설명

<p>Svalur Handsome has finally graduated with a degree in computer science, and it couldn't have happened sooner. He has some rather unwise spending habits which he hopes will be more sustainable now that he can get a high paying job as a programmer. He has applied to a few places, and now has a contract in his hands that he could sign and start working almost immediately. But before he takes the offer he wants to figure out how long it could support his spending habits.</p>

<p>At the start of every day Svalur spends half of his remaining money, rounded up. The new job would pay $s$ ISK at the end of every $d$-th day, starting with the $d$-th day. He currently has $m$ ISK to spend as well.</p>

### 입력

<p>The input has three lines, each containing the positive integers $s, d, m$ respectively. They satisfy $1 \leq s, d, m \leq 2^{1000}$. As these payment details are for a computer science job the numbers are all given in binary, naturally.</p>

### 출력

<p>Print the number of the day that Svalur wants to spend money, but has none. This should naturally also be printed in binary. If he can support his spending habits indefinitely instead print <code>Infinite money!</code>.</p>