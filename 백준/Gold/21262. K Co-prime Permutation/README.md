# [Gold III] K Co-prime Permutation - 21262

[문제 링크](https://www.acmicpc.net/problem/21262)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 72, 맞힌 사람: 45, 정답 비율: 76.271%

### 분류

수학, 애드 혹, 정수론, 해 구성하기

### 문제 설명

<p>Kotori is very good at math (really?) and she loves playing with permutations and primes.</p>

<p>One day, she thinks of a special kind of permutation named <em>$k$ co-prime permutation</em>. A permutation $p_1,p_2,\cdots,p_n$ of $n$ is called a $k$ co-prime permutation of $n$ if there exists exactly $k$ integers $i$ such that $1 \le i \le n$ and $\text{gcd}(p_i,i)=1$, where $\text{gcd}(x,y)$ indicates the greatest common divisor of $x$ and $y$.</p>

<p>Given $n$ and $k$, please help Kotori construct a $k$ co-prime permutation of $n$ or just report that there is no such permutation.</p>

<p>Recall that a permutation of $n$ is a sequence of length $n$ containing all integers from $1$ to $n$.</p>

### 입력

<p>There is only one test case in each test file.</p>

<p>The first and only line contains two integers $n$ and $k$ ($1 \le n \le 10^6$, $0 \le k \le n$).</p>

### 출력

<p>Output one line containing $n$ integers $p_1, p_2, \cdots, p_n$ separated by one space, indicating the permutation satisfying the given constraints. If no such permutation exists output &quot;-1&quot; (without quotes) instead. If there are multiple valid answers you can print any of them.</p>

<p>Please, DO NOT output extra spaces at the end of each line, otherwise your answer may be considered incorrect!</p>