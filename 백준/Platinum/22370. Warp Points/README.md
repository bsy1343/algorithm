# [Platinum V] Warp Points - 22370

[문제 링크](https://www.acmicpc.net/problem/22370)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 13, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 자료 구조, 브루트포스 알고리즘, 우선순위 큐

### 문제 설명

<p>You are constructing an interstellar transportation network. There are $N$ stars in your area, and your task is to make it possible to go to any star from any star. Currently, all of these stars are isolated, and we cannot go anywhere from each star.</p>

<p>As an interstellar transportation network designer, you can set warp points. Stars are numbered from $1$ to $N$, and a warp point enables coming and going between consecutively numbered stars. The construction cost for a warp point depends on the &quot;potentials&quot; for stars and the warp point. The potential for $i$-th star is given as an integer, and you can set the potential for the warp point to any integer. The cost is calculated as the summation of the absolute difference between the warp point&#39;s potential and each contained star&#39;s potential.</p>

<p>You can construct any number of warp points. Your task is to calculate the minimum total cost to enable coming and going between any pair of stars using some warp points.</p>

<p>For the sample input 1, you should plan to construct one warp point with potential 2.</p>

<p>For the sample input 2, three warp points are needed to minimize the total cost. The first warp point connects from the first to the fourth star. The second warp point connects from the fourth to the sixth stars. The third warp point connects from the sixth to tenth stars.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$N$</p>

<p>$a_1$ $\dots$ $a_N$</p>
</blockquote>

<p>$N$ represents the number of stars ($1 \le N \le 3,000$). Numbers $a_1$ through $a_N$ are the potentials of the stars. It is guaranteed that these potentials are integers in the range between $-1,000,000,000$ and&nbsp;$1,000,000,000$.</p>

### 출력

<p>Output the minimum total cost to connect all stars.</p>