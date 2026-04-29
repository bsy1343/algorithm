# [Bronze III] Partial Transmission - 34450

[문제 링크](https://www.acmicpc.net/problem/34450)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 147, 정답: 127, 맞힌 사람: 118, 정답 비율: 86.765%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>Maria works for the government helping catch spies. She listens to radio transmissions that occur every hour and attempts to decrypt numbers from the transmission to determine the location of the spy.</p>

<p>She has figured out a pattern with one frequency she listens to: the transmission starts out with a integer $n$, the next integer is a integer $p$, and then a sequence of integers $S$ follows with $n$ unique integers. The smallest integer in this sequence is $p$, and all integers in the sequence are always less than $p + n$.</p>

<p>Today, the last integer in the transmission is being cut off by her faulty receiver, but she believes that she can discover this number using a computer program. Write Maria a program which tells her the missing integer.</p>

### 입력

<p>The first line of input consists of the integer $n$ ($2 \le n &lt; 100$).</p>

<p>The next line of input consists of the integer $p$ ($0 \le p &lt; 1\,000$).</p>

<p>The third and last line of input consists of the sequence $S$ with the last integer missing.</p>

### 출력

<p>Output the missing integer on its own line.</p>