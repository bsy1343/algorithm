# [Platinum IV] EvenOdd - 15224

[문제 링크](https://www.acmicpc.net/problem/15224)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 130, 정답: 47, 맞힌 사람: 41, 정답 비율: 41.000%

### 분류

수학, 재귀

### 문제 설명

<p>Consider the following function f(X), which takes a single positive integer as argument, and returns an integer.</p>

<pre>
function f(X):
    iterations := 0
    while X is not 1:
        if X is even:
            divide X by 2
        else:
            add 1 to X
        add 1 to iterations
    return iterations</pre>

<p>It can be shown that for any positive integer X, this function terminates. Given an interval [L, R], compute the sum</p>

<p>S = f(L) + f(L + 1) + &middot; &middot; &middot; + f(R &minus; 1) + f(R).</p>

### 입력

<p>The first and only line of input contains two integers L and R (1 &le; L &le; R &le; 10<sup>18</sup>).</p>

### 출력

<p>Output the result S modulo the prime 10<sup>9</sup> + 7.</p>