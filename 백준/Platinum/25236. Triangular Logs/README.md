# [Platinum I] Triangular Logs - 25236

[문제 링크](https://www.acmicpc.net/problem/25236)

### 성능 요약

시간 제한: 12 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 223, 정답: 64, 맞힌 사람: 51, 정답 비율: 32.692%

### 분류

자료 구조, 정렬, 애드 혹, 세그먼트 트리, 스위핑, 제곱근 분할법

### 문제 설명

<p>The local forest has a lot of trees! Each tree is located at integer coordinates and has an integer height. Cutting down any tree gives you a log with a length equal to its height. You want to obtain three triangular logs (that is, three logs that form a non-degenerate triangle) by cutting down three trees.</p>

<p>Given a list of queries which each specify an axis-aligned rectangular region, can you obtain three triangular logs by cutting down three trees in that region, possibly including those on the boundary of the rectangle?</p>

### 입력

<p>The first line of input contains two integers $n$ and $q$ ($1 \le n,q \le 10^5$), where $n$ is the number of trees and $q$ is the number of queries.</p>

<p>Each of the next $n$ lines contains three integers $x$, $y$ and $h$ ($1 \le x,y,h \le 10^9$), which describes a tree at location ($x,y$) with height $h$. All tree locations are distinct.</p>

<p>Each of the next $q$ lines contains four integers $x_{low}$, $y_{low}$, $x_{high}$ and $y_{high}$ ($1 \le x_{low} \le x_{high} \le 10^9$, $1 \le y_{low} \le y_{high} \le 10^9$), describing an axis-aligned rectangular region for a query.</p>

### 출력

<p>Output $q$ lines. Each line contains a single integer, which is the answer to the given query. Output <code>1</code> if there are three trees in the queried region that can form a non-degenerate triangle, and <code>0</code> otherwise. Output answers to the queries in the order of the input. </p>