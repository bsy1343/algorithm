# [Platinum III] Periodic Ruler - 23179

[문제 링크](https://www.acmicpc.net/problem/23179)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 112, 정답: 42, 맞힌 사람: 41, 정답 비율: 44.565%

### 분류

수학, 정수론

### 문제 설명

<p>Hitagi has a ruler of infinite length. It has a mark on every integer, where the mark on integer $i$ has color $c_i$. Each color is represented by an integer from $1$ to $100$.</p>

<p>She noticed that the ruler&#39;s color pattern repeats with a period of $t$. The period $t$ is defined by the <strong>smallest</strong> positive integer that satisfies $c_i = c_{i+t}$ for all integers $i$.</p>

<p>Hitagi told Koyomi the colors of $n$ marks of her choice. Koyomi wants to find all positive integers that <strong>cannot</strong> be a period of the ruler, regardless of the colors of unchosen marks. Write a program to find all such numbers, and output their count and sum.</p>

### 입력

<p>The first line contains a single integer $n\ (1 \le n \le 50)$.</p>

<p>The following $n$ lines each contain two integers $x_i\ (|x_i| \le 10^9)$ and $a_i\ &nbsp;(1 \le a_i \le 100)$. This indicates that the integer $x_i$ is marked with the color $a_i$.</p>

<p>If $i \neq j$, then $x_i \neq x_j$.</p>

### 출력

<p>Output two integers on one line. The first integer is the number of positive integers that cannot be the period of the ruler. The second integer is their sum.</p>