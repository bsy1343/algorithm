# [Gold II] Downhill - 19457

[문제 링크](https://www.acmicpc.net/problem/19457)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 37, 정답: 24, 맞힌 사람: 20, 정답 비율: 60.606%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>A climber stands on top of a very steep mountain of height $H$ meters. He has a rope and wants to get down to the foothills. There are $n$ ledges on a mountain, $i$-th of them is $a_i$ meters over the foothills. A climber can stand on every ledge or on the top, but cannot stand anywhere else on the mountain.&nbsp;</p>

<p>The climber uses his rope to go from one ledge to another. He can tie his rope to the ledge, go down and then cut it being on the ledge. In this case the cut part of the rope stays hanging forever because there is no possibility to untie it after getting down, but the remaining piece of rope stays with the climber and he can use it further.</p>

<p>While hanging on a rope, the climber can cut it in the place he holds it and make a loop on its end, then push the remaining rope through the loop (this can also be done while standing on the ledge). Then he can go down by the second rope, folded in half, and pull it back after descending. Please refer to the <em>Notes</em> section for better understanding.</p>

<p>What is the minimum length of the rope required for the climber to get to the foothills from the top? You may assume that the rope is infinitely thin and can be cut or tied with negligible (zero) loss of the material.</p>

### 입력

<p>First line of input contains two space-separated integers $n$ and $H$ ($0 \leq n \leq 10^6$, $0 \leq H \leq 10^9$) --- number of ledges and height of the mountain in meters.</p>

<p>The next line contains $n$ space-separated integers $a_1$, $\ldots$, $a_n$ --- heights of ledges ($H &gt; a_1 &gt; \ldots &gt; a_n &gt; 0$).</p>

### 출력

<p>Print one real number --- required rope length with absolute or relative error not exceeding $10^{-6}$.</p>

### 힌트

<p>Consider three possible ways to get down for the first sample.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bf5e80f4-acfb-46c6-a7e2-b6155a6a7308/-/preview/" style="width: 212px; height: 400px;" /><img alt="" src="https://upload.acmicpc.net/3e2e58f9-d6b1-4604-9cce-5c865251d846/-/preview/" style="width: 242px; height: 400px;" /><img alt="" src="https://upload.acmicpc.net/c3b47bbe-5db3-4ef0-9f22-dc3940d998f1/-/preview/" style="width: 242px; height: 400px;" /></p>

<p>The first way is to simply use 100 meters rope to get from the top to the bottom. The second way is to make a loop at the top, put double rope through the loop, get to the ledge and retrieve the rope. Repeating this to get from the ledge to the ground, we obtain another way to get down with 100 meters rope.</p>

<p>If we combine two approaches, we can do much better and get down with only 75 meters of rope. Let us hang 25 meters from the top on a single rope, make a loop there and double-rope to the ledge. This way we forfeit 25 initial meters, but save 50 meters we used for double-roping. These 50 meters are just enough to single-rope to the ground.</p>