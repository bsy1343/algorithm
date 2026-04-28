# [Gold II] Platform Placing - 27391

[문제 링크](https://www.acmicpc.net/problem/27391)

### 성능 요약

시간 제한: 1.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 20, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

그리디 알고리즘

### 문제 설명

<p>The city of Atlantis is making an above-water section. They are doing so by building floating platforms that are anchored at their centers to foundation points that lie in a straight line at the bottom of the ocean. Each platform is a fixed-width rectangle aligned to the foundation line; specifically, a platform of length $\ell$ anchored to a foundation point at position $x$ along the line occupies the interval $[x - \frac{\ell}{2}, x + \frac{\ell}{2}]$ along the line on the ocean surface. The platforms can be of different lengths, but have both a minimum and a maximum length. Gaps are allowed between consecutive platforms, and platforms are allowed to exactly touch, but they may not overlap. Each foundation point must be attached to exactly one platform.</p>

<p>Help the Atlanteans maximize their above-water section: given the locations of the foundation points and the minimum and maximum allowed platform lengths, determine the maximum possible sum of platform lengths.</p>

### 입력

<p>The first line of input contains three space separated integers $n$ ($1 \le n \le 10^5$), $s$ and $k$ ($1 \le s \le k \le 10^5$), where $n$ is the number of foundation points, $s$ is the smallest platform length possible, and $k$ is the largest platform length possible.</p>

<p>Each of the next $n$ lines contains a single integer $x$ ($1 \le x \le 10^9$), representing the location of a foundation point. No two foundation points will be the same.</p>

### 출력

<p>Output a single integer, which is the maximum possible sum of platform lengths, or $-1$ if it isn&#39;t possible to place the platforms.</p>