# [Platinum I] E(length(CH)) - 25100

[문제 링크](https://www.acmicpc.net/problem/25100)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 23, 맞힌 사람: 20, 정답 비율: 54.054%

### 분류

기하학, 기댓값의 선형성, 수학, 확률론, 스위핑, 두 포인터

### 문제 설명

<p>You are given $n$ points on a plane. The i-th of them is <em>activated</em> with probability $p_i$, provided as part of the input. Find the expected circumference of the convex hull of all activated points.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25100.%E2%80%85E(length(CH))/bf4f4b9e.png" data-original-src="https://upload.acmicpc.net/1abe79dd-c13e-4891-ab6f-489174c5d195/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 299px; height: 230px;" /></p>

### 입력

<p>The first line contains the number of points $n$ and the number $p^&lowast;$. All points are activated with the probability $p_i = p^&lowast;$, except for the first three, which are always activated ($p_1 = p_2 = p_3 = 1$); this way, the definition of the convex hull circumference is always sound. This is followed by $n$ lines, each containing space-separated coordinates of the $i$-th point, $x_i$, $y_i$.</p>

### 출력

<p>Print out a single number &mdash; the expected circumference of the convex hull. Your result should differ by less than $0.001$ from the reference solution to be considered correct.</p>

### 제한

<ul>
	<li>$3 &le; n &le; 1000$; $0 &le; p^&lowast; &le; 1$</li>
	<li>$0 &le; x_i , y_i &le; 10\,000$; $x_i , y_i &isin; Z$</li>
	<li>No three points are colinear. No two points share an $x$ or $y$ coordinate.</li>
</ul>