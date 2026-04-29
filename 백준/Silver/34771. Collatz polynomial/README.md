# [Silver V] Collatz polynomial - 34771

[문제 링크](https://www.acmicpc.net/problem/34771)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 33, 정답: 27, 맞힌 사람: 18, 정답 비율: 78.261%

### 분류

구현, 비트마스킹, 수학

### 문제 설명

<p>Everyone knows (or has heard of) the famous Collatz Conjecture: take a positive integer. If it is odd, multiply by $3$ and add $1$. If it is even, divide by $2$. Repeat the process until you reach $1$. Despite its simplicity, no one knows how to prove whether the sequence really always reaches $1$, regardless of the initial number.</p>

<p>Aline, a fan of this type of curiosity, decided to create a variation using polynomials instead of numbers. To keep things simple, she works only with polynomials whose coefficients are $0$ or $1$, that is, each power of $x$ appears at most once.</p>

<p>The game works like this:</p>

<ul>
<li>If the polynomial has a constant term (a term that does not depend on $x$), Aline multiplies the polynomial by $(x + 1)$ and then adds $1$. If any resulting coefficient equals $2$, the corresponding term is discarded (note that coefficients greater than $2$ cannot arise).</li>
<li>If the polynomial has no constant term, Aline divides the polynomial by $x$.</li>
</ul>

<p>This process is repeated until the polynomial reduces to $P(x) = 1$.</p>

<p>Consider $P(x) = x^3 + 1$. In the first step there is a constant term, so we calculate:</p>

<p style="text-align: center;">$(x^3 + 1) \cdot (x + 1) + 1 = x^4 + x^3 + x + 1 + 1$.</p>

<p>Since the coefficient of the constant term is $2$, this term is discarded, leaving:</p>

<p style="text-align: center;">$x^4 + x^3 + x$.</p>

<p>Next, since there is no constant term, we divide by $x$:</p>

<p style="text-align: center;">$x^3 + x^2 + 1$.</p>

<p>Continuing:</p>

<ul>
<li>Step $3$: $x^4 + x^2 + x$</li>
<li>Step $4$: $x^3 + x + 1$</li>
<li>Step $5$: $x^4 + x^3 + x^2$</li>
<li>Step $6$: $x^3 + x^2 + x$</li>
<li>Step $7$: $x^2 + x + 1$</li>
<li>Step $8$: $x^3$</li>
<li>Step $9$: $x^2$</li>
<li>Step $10$: $x$</li>
<li>Step $11$: $1$</li>
</ul>

<p>In total, it took $11$ operations to reach the polynomial $P(x) = 1$.</p>

<p>Aline needs help to study this variation of the Collatz Conjecture. Since doing these calculations manually is prone to errors, write a program that determines the number of operations needed until the polynomial becomes $P(x) = 1$.</p>

### 입력

<p>The first line contains an integer $N$ ($0 ≤ N ≤ 20$), indicating the degree of the polynomial.</p>

<p>The second line contains $N + 1$ integers $a_N , a_{N−1}, \dots , a_0$ (each equal to $0$ or $1$), where $a_i = 1$ indicates that the term $x^i$ is present in the polynomial, and $a_i = 0$ indicates that it is not. Note that $a_N = 1$, since the degree of the polynomial is $N$.</p>

### 출력

<p>Your program must output a single line, containing an integer, representing the number of operations needed until the polynomial becomes $P(x) = 1$.</p>