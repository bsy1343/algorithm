# [Gold V] Slimming Plan - 16816

[문제 링크](https://www.acmicpc.net/problem/16816)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 54, 맞힌 사람: 42, 정답 비율: 30.435%

### 분류

수학, 구현, 시뮬레이션

### 문제 설명

<p>Chokudai loves eating so much. However, his doctor Akensho told him that he was overweight, so he finally decided to lose his weight.</p>

<p>Chokudai made a slimming plan of a $D$-day cycle. It is represented by $D$ integers $w_0, \ldots, w_{D-1}$. His weight is $S$ on the $0$-th day of the plan and he aims to reduce it to $T \ (S &gt; T)$. If his weight on the $i$-th day of the plan is $x$, it will be $x + w_{i \% D}$ on the $(i+1)$-th day. Note that $i \% D$ is the remainder obtained by dividing $i$ by $D$. If his weight successfully gets less than or equal to $T$, he will stop slimming immediately.</p>

<p>If his slimming plan takes too many days or even does not end forever, he should reconsider it.</p>

<p>Determine whether it ends or not, and report how many days it takes if it ends.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre class="mathjax">$S \ T \ D$ $w_0 \cdots w_{D-1}$</pre>

<p>The first line consists of three integers $S, T, D \ (1 \le S,T,D \le 100{,}000, \ S &gt; T)$. The second line consists of $D$ integers $w_0, \ldots, w_{D-1}$ ($-100{,}000 \le w_i \le 100{,}000$ for each $i$).</p>

### 출력

<p>If Chokudai&#39;s slimming plan ends on the $d$-th day, print $d$ in one line. If it never ends, print $-1$.</p>