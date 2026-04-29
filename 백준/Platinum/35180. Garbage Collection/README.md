# [Platinum II] Garbage Collection - 35180

[문제 링크](https://www.acmicpc.net/problem/35180)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 9, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

값 / 좌표 압축, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스위핑, 자료 구조

### 문제 설명

<p>The North Sea is littered with $N$ pieces of garbage, numbered $1 \dots N$. The $i$'th piece is at position $(x_i, y_i)$ and has a weight of $w_i$. As part of a cleanup effort, all garbage within a rectangular area will be collected. This area has a width of $W$ and a height of $H$, but its location has not yet been decided.</p>

<p>Determine the maximum total weight of garbage that will be collected if the cleanup area is positioned optimally.</p>

### 입력

<p>The first line contains the integers $N$, $W$ and $H$.</p>

<p>The $i$'th of the next $N$ lines contains the integers $x_i$, $y_i$ and $w_i$.</p>

### 출력

<p>Print an integer: the maximum total weight of garbage that can be collected.</p>

### 제한

<ul>
<li>$1 \le N \le 10^5$.</li>
<li>$1 \le W, H \le 10^9$.</li>
<li>$0 \le x_i, y_i \le 10^9$ for all $i : 1 \le i \le N$.</li>
<li>$1 \le w_i \le 10^9$ for all $i : 1 \le i \le N$.</li>
</ul>