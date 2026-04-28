# [Platinum II] Lysergic Acid Diethylamide - 26413

[문제 링크](https://www.acmicpc.net/problem/26413)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 11, 맞힌 사람: 11, 정답 비율: 29.730%

### 분류

수학, 애드 혹, 정수론

### 문제 설명

<p><em>might or might not had been used during making of this problem.</em></p>

<p>In this problem <strong>functions</strong> are implictly assumed to have a single non-negative integer as an argument and produce a single non-negative integer as a result.</p>

<p>$f$ is a function. $f(x) = 1 + 2 + \ldots + x$. More formally, $f(x)$ is the sum of all positive integers less than or equal to $x$.</p>

<p>$s_k$ is a family of functions. $s_0$ is an identity function ($s_0(x) = x$) and $s_k(x) = s_{k-1}(f(x) + k)$.</p>

<p>You are given $t$ test cases. $i$-th test case contains three integers $x_i$, $k_i$ and $p_i$. For each test case find an integer $m_i$ such that $-1 \leq m \leq p_i-1$, $s_{k_i}(x_i) \bmod p_i \not \equiv m_i$. You may use $m_i = -1$ no more than 20 times. $p_i$ are pairwise distinct. Note, that $a \bmod p \geq 0$, where $a$ is an arbitrary integer, so $m_i = -1$ is correct for any particular test case.</p>

<p><em>Why would you do that? It&#39;s simple. Finding correct answers is easy and conformist. On the other hand, finding incorrect answers is challenging and original. However, in this problem it&#39;s a bit too challenging, because of $p=1$ case. So you decided, that you will skip some test cases with $m_i = -1$ wildcard. Sounds reasonable (not). </em></p>

### 입력

<p>The first line of input contains a single integer $t$ ($1 \leq t \leq 5000$) --- the number of test cases.</p>

<p>$t$ lines follow. $i$-th of them contains three integers $x_i, k_i, p_i$ ($1 \leq x_i \leq 10^9, 0 \leq k_i \leq 10^5, 1 \leq p_i \leq 10^4$).</p>

<p>It is guaranteed that $\forall_{i \neq j} p_i \neq p_j$.</p>

### 출력

<p>Output $t$ integers. $i$-th of them should be equal to $m_i$.</p>

<p>The number of indices $i$ such that $m_i = -1$ should not exceed 20.</p>