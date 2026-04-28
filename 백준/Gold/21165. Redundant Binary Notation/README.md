# [Gold II] Redundant Binary Notation - 21165

[문제 링크](https://www.acmicpc.net/problem/21165)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 23, 맞힌 사람: 21, 정답 비율: 91.304%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/21165.%E2%80%85Redundant%E2%80%85Binary%E2%80%85Notation/3947a9fc.png" data-original-src="https://upload.acmicpc.net/3b37ef17-e719-44c1-b7e5-1532da671d39/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 229px;" /></p>

<p style="text-align: center;">Binomial trees of a binomial heap. Wikimedia, cc-by-sa</p>

<p>Redundant binary notation is similar to binary notation, except instead of allowing only $0$&rsquo;s and $1$&rsquo;s for each digit, we allow any integer digit in the range $[0, t]$, where $t$ is some specified upper bound. For example, if $t = 2$, the digit $2$ is permitted, and we may write the decimal number $4$ as $100$, $20$, or $12$. If $t=1$, every number has precisely one representation, which is its typical binary representation. In general, if a number is written as $d_l d_{l-1} \ldots d_1 d_0$ in redundant binary notation, the equivalent decimal number is $d_l\cdot2^l + d_{l-1}\cdot2^{l-1} + \cdots + d_1\cdot2^1 + d_0\cdot2^0$.</p>

<p>Redundant binary notation can allow carryless arithmetic, and thus has applications in hardware design and even in the design of worst-case data structures. For example, consider insertion into a standard binomial heap. This operation takes $O(\log n)$ worst-case time but $O(1)$ amortized time. This is because the binary number representing the total number of elements in the heap can be incremented in $O(\log n)$ worst-case time and $O(1)$ amortized time. By using a redundant binary representation of the individual binomial trees in a binomial heap, it is possible to improve the worst-case insertion time of binomial heaps to $O(1)$.</p>

<p>However, none of that information is relevant to this question. In this question, your task is simple. Given a decimal number $N$ and the digit upper bound $t$, you are to count the number of possible representations $N$ has in redundant binary notation with each digit in range $[0, t]$ with no leading zeros.</p>

### 입력

<p>Input consists of a single line with two decimal integers $N$ ($0 \leq N \leq 10^{16}$) and $t$ ($1 \leq t \leq 100$).</p>

### 출력

<p>Output in decimal the number of representations the decimal number $N$ has in redundant binary notation with each digit in range $[0, t]$ with no leading zeros. Since the number of representations may be very large, output the answer modulo the large prime $998\,244\,353$.</p>