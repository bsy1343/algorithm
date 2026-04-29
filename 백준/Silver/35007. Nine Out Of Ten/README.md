# [Silver V] Nine Out Of Ten - 35007

[문제 링크](https://www.acmicpc.net/problem/35007)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 47, 정답: 37, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

사칙연산, 수학

### 문제 설명

<p>A mad scientist conducted $n$ independent identical experiments and claimed that $x$ of them were successful. It is well known that the mad scientist is wrong in exactly 90\% of cases when determining the success of a single experiment. Your task is to write a program that calculates the minimum and the maximum possible number of successful experiments for all $x$ from $0$ to $n$. It is guaranteed that the total number of experiments is always divisible by $10$.</p>

### 입력

<p>The first line contains a single integer $n$, which is a multiple of ten ($10 \le n \le 10\,000$).</p>

### 출력

<p>Print $n + 1$ lines. On the $i$-th line, output two integers separated by a space: the minimum and the maximum possible number of successful experiments for $x = i - 1$.</p>