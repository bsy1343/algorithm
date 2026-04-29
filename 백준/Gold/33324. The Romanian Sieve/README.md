# [Gold II] The Romanian Sieve - 33324

[문제 링크](https://www.acmicpc.net/problem/33324)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 56, 정답: 23, 맞힌 사람: 12, 정답 비율: 38.710%

### 분류

수학, 이분 탐색, 정수론, 조화수

### 문제 설명

<p>Ionuț Cercel (the son of Petrică Cercel) achieved everything there was to achieve in music after the absolute hit "Made in Romania".</p>

<p>Now he got an interest in competitive programming. In his preparation for the training camp in Phapos, he came across a concept called "The Romanian Sieve", which can be summarized by the following piece of code:</p>

<pre>    int64_t iters = 0;
    for (int64_t i = 1; i ≤ n; i++) {
        for (int64_t j = i; j ≤ n; j += i) {
            max_div[j] = i;
            iters++;
        }
    }
</pre>

<p>As a curious individual, Ionuț asks himself: "Given an integer $t$, what is the largest value of $n$ such that <code>iters</code> $\leq t$ after running the Romanian Sieve algorithm?" Please help him answer this question.</p>

### 입력

<p>The first line contains an integer $t$ ($1 \leq t \leq 3 \cdot 10^{13}$).</p>

### 출력

<p>Print one integer: the maximum $n$ such that <code>iters</code> $\leq t$ after running the algorithm.</p>