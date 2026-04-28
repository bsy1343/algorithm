# [Platinum II] Program Optimization - 23496

[문제 링크](https://www.acmicpc.net/problem/23496)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 25, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

누적 합

### 문제 설명

<p>Consider the following C++ code:</p>

<pre>
#include &lt;algorithm&gt;
#include &lt;random&gt;

int query_mex(const int *a, int l, int r);

int simulate(int n, int *a, int q, int k, int s) {
  std::mt19937 gen;
  gen.seed(s);
  int last = 0;
  while (q--) {
    int op = gen() % k;
    int i = (gen() + last) % n;
    if (!op &amp;&amp; i) {
      std::swap(a[i - 1], a[i]);
    } else {
      int j = gen() % n;
      last ^= query_mex(a, std::min(i, j), std::max(i, j));
    }
  }
  return last;
}</pre>

<p>In the program, <code>query_mex(a, l, r)</code> returns the minimum non-negative integers which does not occur in $a_l, a_{l + 1}, \dots, a_{r}$.</p>

<p>Given the value of $n$, $a$, $q$, $k$ and $s$, find the returned value of the function.</p>

### 입력

<p>The first line contains four integers $n$, $q$, $k$ and $s$ ($1 \leq n \leq 2\times 10^5$, $1 \leq q \leq 10^7$, $1 \leq k \leq 10^9$, $0 \leq s \leq 10^9$). The second line contains $n$ distinct integers $a_0, a_1, \dots, a_{n - 1}$ ($0 \leq a_i &lt; n$).</p>

### 출력

<p>Output an integer denoting the returned value.</p>