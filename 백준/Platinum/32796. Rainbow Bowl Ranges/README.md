# [Platinum V] Rainbow Bowl Ranges - 32796

[문제 링크](https://www.acmicpc.net/problem/32796)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 93, 정답: 24, 맞힌 사람: 20, 정답 비율: 28.986%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You have a set of $n$ bowls, arranged in a circle.</p>

<p>You have many balls of various colors. There are $m$ different colors, and you have $c_i$ balls of the $i^<code>th</code>$ color.</p>

<p>You want to distribute all the balls into the bowls. To do this, for each color, you choose a contiguous range of bowls of size $c_i$ and place one ball of that color in each bowl in the range. A contiguous range of bowls is a set of consecutive bowls around the circle. Ranges from different colors are allowed to overlap.</p>

<p>A bowl is <em>rainbow</em> if it contains one ball of each color. A <em>rainbow bowl range</em> is a contiguous range of rainbow bowls that cannot be extended by including another rainbow bowl.</p>

<p>You want to arrange balls in bowls to maximize the number of rainbow ranges.</p>

<p>Given the number of bowls and the number of balls of each color, what is the maximum number of rainbow bowl ranges that can be formed?</p>

### 입력

<p>The first line contains two integers, $n$ $(2 \le n \le 10^9)$, $m$ $(1 \le m \le 10^5)$.</p>

<p>The next $m$ lines each contain a single integer, $c_i$ $(1 \le c_i \le n)$.</p>

### 출력

<p>Print a single integer, the maximum number of rainbow bowl ranges that can be formed.</p>