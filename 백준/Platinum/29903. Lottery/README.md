# [Platinum V] Lottery - 29903

[문제 링크](https://www.acmicpc.net/problem/29903)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

조합론, 기댓값의 선형성, 수학, 모듈로 곱셈 역원, 정수론, 확률론

### 문제 설명

<p>Jack spends a lot of time and money playing the lottery.</p>

<p>The lottery machine consists of $N$ parallel ramps (as shown on the figure). Each ramp is divided into $M$ sections of equal lengths. Under the ramps are $M$ baskets, each labeled with an integer.</p>

<p>The drawing works as follows. First some ramp sections from among the $N \cdot M$ are removed. For each section, a $B$-sided die (with the sides numbered $1, \ldots, B$) is rolled and if the result is at most $A$, the section is removed. After that, a ball is released from the top-left corner of the machine, above the topmost ramp. If the ball ends up in a basket, the player&#39;s prize is the amount written on the basket.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29903.%E2%80%85Lottery/fbb28e80.png" data-original-src="https://upload.acmicpc.net/5d50b05b-7324-4fb9-9f0f-018e72e6071c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/29903.%E2%80%85Lottery/1a230b2c.png" data-original-src="https://upload.acmicpc.net/58e9c6a1-14a9-40ce-b494-f19c5f423f9a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>You try to explain to Jack that in general, he always loses money in such games. To prove your point, you want to compute the expected average value of the prize of this game.</p>

<p>It can be shown that the expected value can be expressed as $\frac{p}{q}$ where $p$ and $q$ are integers and $\frac{p}{q}$ is an irreducible fraction. Compute the value $pr \bmod (10^9 + 7)$ where $r$ is such an integer that $qr \bmod (10^9 + 7) = 1$.</p>

### 입력

<p>The first line contains space-separated integers $N$ and $M$ ($2 \le N, M \le 5 \cdot 10^5$), the dimensions of the lottery machine. The second line contains space-separated integers $A$ and $B$ ($0 \le A \le B &lt; 10^9 + 7$, $B \ne 0$), the parameters of the die rolls.</p>

<p>The third line contains $M$ space-separated integers $C_1, C_2, \ldots, C_M$ ($0 \le C_i \le 10^9$ for each $i$), the values of the baskets from left to right.</p>

### 출력

<p>Output a single integer: the expected value of Jack&#39;s prize, in the format described above.</p>

### 힌트

<p>To format your output in this task, you need to compute $r$ such that $qr \equiv 1 \pmod{K}$ (in our case, $K = 10^9 + 7$). This number is called the <em>inverse of $q$ modulo $K$</em>; it can be shown that if $q \not\equiv 0 \pmod{K}$ and $K$ is prime, then $r$ can be computed as $r = q^{K - 2} \bmod K$.</p>