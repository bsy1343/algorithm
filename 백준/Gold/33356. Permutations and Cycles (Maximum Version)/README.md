# [Gold IV] Permutations and Cycles (Maximum Version) - 33356

[문제 링크](https://www.acmicpc.net/problem/33356)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 57.143%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>For a given $x$, a permutation of size $n$ is called <em>good</em> if for each $1 \le i &lt; n$ the condition $p_i + p_{i + 1} \le x$ holds. Find any good permutation with the <strong>maximum</strong> number of cycles.</p>

<p>A permutation of size $n$ is a sequence of $n$ distinct integers from $1$ to $n$.</p>

<p>A cycle of a permutation $p$ is a sequence of indices $i_1, i_2, \ldots, i_k$ such that $p_{i_1} = i_2$, $p_{i_2} = i_3$, $\ldots$, $p_{i_k} = i_1$. The cycles obtained by a cyclic shifting of the sequence are considered to be the same.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \le t \le 2 \cdot 10^5$), the number of test cases. The test cases follow.</p>

<p>Each test case is given on a line with two integers $n$ ($2 \le n \le 2 \cdot 10^5$) and $x$ ($n + 1 \le x \le 2 \cdot n - 1$). These constraints guarantee that at least one <em>good</em> permutation exists.</p>

<p>The sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print two lines. The first one should contain the maximum number of cycles in a good permutation of length $n$. The second line should consist of $n$ integers: the permutation itself. If multiple such permutations exist, print any one of them.</p>