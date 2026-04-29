# [Platinum II] Joining Cats - 33389

[문제 링크](https://www.acmicpc.net/problem/33389)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 25, 정답: 13, 맞힌 사람: 3, 정답 비율: 33.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Suzukaze Aoba has a magical fan. There are $n$ cats sitting on a straight line. Aoba wonders if she can merge all cats into one by using the magical fan $k$ times.</p>

<p>The $i$-th activation of the fan produces a gust of wind of strength exactly $s_i$.</p>

<p>For each gust of wind, Aoba picks its starting position and direction (eastward or westward). Then the gust of wind starts moving continuously in that direction with constant speed. Aoba can decide to turn the fan off at any moment, in which case, the wind disappears.</p>

<p>When the gust of wind encounters a cat, if the weight of the cat is strictly larger than the strength of the wind, the fan turns off automatically. Otherwise, the cat will be continuously pushed to the direction the wind is blowing.</p>

<p>When two cats meet, they merge into a cat whose weight is equal to the sum of their weights. The above rules then apply to the newly merged cat.</p>

<p>Determine if joining all cats is possible by using the fan at most $k$ times.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 \leq n, k \leq 5000$).</p>

<p>The second line contains $n$ integers $w_1, \ldots, w_n$ ($1 \leq w_i \leq 10^9$), denoting the initial weights of the cats from left to right. No two cats initially sit on the same spot.</p>

<p>The third line contains $k$ integers $s_1, \ldots, s_k$ ($1 \leq s_i \leq 10^9$).</p>

### 출력

<p>Print a line with one word (case-sensitive): "<code>Yes</code>" if it is possible to merge all cats into one by using the magical fan at most $k$ times, or "<code>No</code>" otherwise.</p>