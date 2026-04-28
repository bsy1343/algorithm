# [Platinum III] Or Machine - 23177

[문제 링크](https://www.acmicpc.net/problem/23177)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 408, 정답: 85, 맞힌 사람: 70, 정답 비율: 20.958%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>We are developing the Or Machine, a computer heavily optimized solely for one kind of operation: the \verb |= \ operator in C++&#39;s term.</p>

<p>The Or Machine has $n$ registers, each containing a nonnegative integer less than $2^8$. We label them $x_1, x_2, \cdots, x_n$. A program is represented by a list of $l$ operations. Each operation is represented by a pair of integers $(a, b)$, meaning that the machine should update $x_a$ with the bitwise OR of $x_a$&#39;s and $x_b$&#39;s values.</p>

<p>The Or Machine takes a program, the initial values of the registers, and a positive integer $t$. When run, the program performs each operation in the program one by one. When the last operation is performed, it goes back to the first operation and repeats the process. The machine stops after performing exactly $t$ operations.</p>

<p>We want our machine to be much faster than general-purpose computers, and hardware optimization is probably not enough. Can you help us with some software optimization?</p>

### 입력

<p>The first line contains three integers, $n$, $l$, and $t\ (1 \leq n, l \leq 2^{18}$, $1 \leq t \leq 10^{18})$. $l$ is the length of the program.</p>

<p>The program is given on the next $l$ lines. Each line contains two integers $a$ and $b\ (1 \leq a, b \leq n)$ representing the pair of registers that participate in the given operation.</p>

<p>The final line contains $n$ integers, the initial values of the registers $x_1, \cdots, x_n\ (0 \le x_i &lt; 2^8)$.</p>

### 출력

<p>Output $n$ integers on a single line, the values of the registers $x_1, \cdots, x_n$ after $t$ operations.</p>