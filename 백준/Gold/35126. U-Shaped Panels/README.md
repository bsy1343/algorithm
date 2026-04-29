# [Gold IV] U-Shaped Panels - 35126

[문제 링크](https://www.acmicpc.net/problem/35126)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 28, 정답: 23, 맞힌 사람: 20, 정답 비율: 80.000%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션, 애드 혹

### 문제 설명

<p>A rectangular pond is in the backyard of your house. As the length and width of the pond are integer multiples of one meter, the pond can be considered to consist of one-meter-square sections.</p>

<p>You always feel the pond is too large, and you want to cover some of its sections using the panels kept in the barn. All of these panels have the same size and the same shape, consisting of one-meter-square boards arranged in a U shape. The overall size of the panels is $k$ meters by $k$ meters, and $3k − 2$ boards are on the three edges of that square. The rest, the $(k − 2) \times (k − 1)$ rectangular area, is void. Figure H.1 illustrates a panel of size $k = 5$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35126.%E2%80%85U-Shaped%E2%80%85Panels/e325cc91.png" data-original-src="https://boja.mercury.kr/assets/problem/35126-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 363px; height: 133px;"></p>

<p style="text-align: center;">Figure H.1. A panel of size $k = 5$ (left) and its top view (right)</p>

<p>You plan to cover certain one-meter-square sections of the pond with the panels and leave the rest uncovered. Panels should be placed so that each of their boards fits exactly one section. As long as this is satisfied, orientations of the panels can be arbitrarily chosen. Panels should not overlap one another nor stick out of the pond.</p>

<p>Determine whether your plan is feasible or not.</p>

### 입력

<p>The input contains one or more test cases. The first line of the input contains an integer $t$ ($1 ≤ t ≤ 10$), which is the number of test cases. The descriptions of the $t$ test cases follow, each in the following format.</p>

<blockquote>
<p>$n$ $m$ $k$</p>

<p>$s_1$</p>

<p>$\vdots$</p>

<p>$s_n$</p>
</blockquote>

<p>The first line contains three integers $n$, $m$, and $k$. The integers $n$ and $m$ denote the length and the width of the pond, respectively ($5 ≤ n ≤ 1000$, $5 ≤ m ≤ 1000$). The integer $k$ denotes the size of the U-shaped panels ($5 ≤ k ≤ 1000$). The following $n$ lines represent your plan. The $i$-th of them contains a string $s_i$ of length $m$ consisting of the characters ‘<code>#</code>’ and ‘<code>.</code>’. Let us say a one-meter-square section is at $(r, c)$ if it lies between $r − 1$ meters and $r$ meters from the front edge, and between $c − 1$ meters and $c$ meters from the left edge. For each $i$ and $j$, if the $j$-th character of $s_i$ is ‘<code>#</code>’, the section at $(i, j)$ should be fully covered with a board of a panel. Otherwise, the section should remain fully uncovered.</p>

<p>The sum of $n$’s over all the test cases does not exceed $1000$. The same applies to $m$.</p>

### 출력

<p>For each test case, output in a line <code>yes</code> if your plan is feasible; <code>no</code> otherwise.</p>