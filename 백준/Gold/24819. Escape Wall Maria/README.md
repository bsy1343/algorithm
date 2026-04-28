# [Gold V] Escape Wall Maria - 24819

[문제 링크](https://www.acmicpc.net/problem/24819)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 123, 정답: 72, 맞힌 사람: 64, 정답 비율: 57.143%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Wall Maria has been broken! Eren must evacuate as soon as possible from his house. He must find the fastest route to escape within Wall Maria before the titans rush in. Wall Maria is represented as a $N \times M$ grid in which Eren can move horizontally or vertically.</p>

<p>There are burning houses and buildings which prevent Eren from passing through them. The burning houses and buildings are represented as &#39;<code>1</code>&#39;. Unburned or safe areas are represented as &#39;<code>0</code>&#39;. There are some areas which can be entered but only from a specific direction. These areas can be represented by either &#39;<code>U</code>&#39;, &#39;<code>D</code>&#39;, &#39;<code>L</code>&#39;, or &#39;<code>R</code>&#39;. For example, if there is an &#39;<code>R</code>&#39; that means that area can only be entered from the right neighboring tile within Wall Maria&#39;s grid. Similarly, &#39;<code>U</code>&#39; tiles can only be entered from above, &#39;<code>D</code>&#39; tiles can only be entered from below, and &#39;<code>L</code>&#39; tiles can only be entered from the left.</p>

<p>Eren knows the time $t$ at which the titans will rush in. It takes $1$ unit of time to traverse $1$ zone (which corresponds to $1$ tile in the grid). Once he reaches any border of Wall Maria he is safe.&nbsp;</p>

<p>Eren&#39;s starting position is represented by the letter &#39;<code>S</code>&#39;. If Eren escapes at or before time $t$, he is safe. Given his position within Wall Maria determine if it is possible to escape. If it is possible determine the number of zones that must be traversed to lead to the quickest escape.&nbsp;</p>

### 입력

<p>The input consists of a single test case. The first line contains three integers $t$ ($1 \le t \le 200$) , $N$ ($1 \le N \le 100$) and $M$ ($1 \le M \le 100$). The rest of N lines will be Wall Maria&#39;s grid containing characters &#39;<code>1</code>&#39;, &#39;<code>0</code>&#39;, &#39;<code>S</code>&#39;, &#39;<code>U</code>&#39;, &#39;<code>D</code>&#39;, &#39;<code>L</code>&#39;, or &#39;<code>R</code>&#39;. There is exactly one &#39;<code>S</code>&#39; in the input.</p>

### 출력

<p>If it is possible to escape Wall Maria, output the minimum number of zones that must be traversed to escape. If it is not possible to escape, print &quot;<code>NOT POSSIBLE</code>&quot;!</p>