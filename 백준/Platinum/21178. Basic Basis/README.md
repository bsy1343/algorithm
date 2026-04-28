# [Platinum II] Basic Basis - 21178

[문제 링크](https://www.acmicpc.net/problem/21178)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 16, 맞힌 사람: 14, 정답 비율: 46.667%

### 분류

임의 정밀도 / 큰 수 연산, 비트마스킹, 그리디 알고리즘, 구현, 선형대수학, 수학

### 문제 설명

<p>You are given a sequence of $n$ bit strings $b_1, b_2, \dots , b_n$, each with $k \times 4$ bits.</p>

<p>You are also given another sequence of $m$ bit strings $a_1, a_2, \dots , a_m$, each also with $k \times&nbsp;4$ bits.</p>

<p>Let $f(x)$ denote the minimum index $i$ such that it is possible to take a non-empty subset of $b_1, b_2, \dots , b_i$ , XOR them all together, and get $x$. If there is no such index, $f(x) = -1$.</p>

<p>Print the values $f\left(a_1\right), f\left(a_2\right), \dots , f\left(a_m\right)$.</p>

### 입력

<p>The first line of input contains three integers $n$ ($1 \le n \le 1,000$), $m$ ($1 \le m \le 1,000$) and $k$ ($1 \le k \le 40$), where $n$ is the length of sequence $b$, $m$ is the length of sequence $a$, and the elements of both sequences are bit strings with $k \times 4$ bits.</p>

<p>Each of the next $n$ lines contains a hexadecimal representation of $b_i$ as a string of length $k$. The strings consist only of hexadecimal digits (&lsquo;<code>0</code>&rsquo;&ndash;&lsquo;<code>9</code>&rsquo; and &lsquo;<code>a</code>&rsquo;&ndash;&lsquo;<code>f</code>&rsquo;).</p>

<p>Then, each of the next $m$ lines contains a hexadecimal representation of $a_i$ in the same format as above.</p>

### 출력

<p>Output $m$ lines with a single integer on each line, where the integer on the $i$th line is $f\left(a_i\right)$.</p>