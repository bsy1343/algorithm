# [Gold II] Count the Orders - 33451

[문제 링크](https://www.acmicpc.net/problem/33451)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

그리디 알고리즘, 수학, 조합론

### 문제 설명

<p>There are $n$ positions on a circle, numbered successively by integers from $1$ to $n$. The positions $i$ and $i + 1$ are adjacent; the positions $n$ and $1$ are also adjacent.</p>

<p>Consider $n$ distinct integers $a_1, a_2, \ldots, a_n$. We arrange them somehow on the circle, so that there is a single integer in each of the $n$ positions. The cost of an arrangement is defined as the sum of the absolute values of the difference between every two adjacent integers.</p>

<p>Two arrangements are different if and only if at least one integer has different positions in them.</p>

<p>You need to find the maximum cost of an arrangement. Additionally, calculate the number of different arrangements that have this cost. As their number can be very large, find it modulo $10^9 + 7$.</p>

### 입력

<p>The first line contains a single integer $n$ ($3 \le n \le 10^6$).</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \le a_i \le 10^9$).</p>

<p>It is guaranteed that $a_1, a_2, \ldots, a_n$ are pairwise distinct.</p>

### 출력

<p>Output a single line with two integers. The first one should be the maximum cost. The second one should be the number of different arrangements that have this cost, modulo $10^9 + 7$.</p>