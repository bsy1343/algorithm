# [Platinum III] Finding Routers - 19931

[문제 링크](https://www.acmicpc.net/problem/19931)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 163, 정답: 31, 맞힌 사람: 19, 정답 비율: 15.323%

### 분류

이분 탐색

### 문제 설명

<p>There is a street of length $l$ meters stretching from left to right, with $n$ small routers occupying various distinct positions along it. The&nbsp;<strong>origin</strong>&nbsp;is defined to be the leftmost point of the street. The routers are labelled $0$ to $n-1$ from left to right, and router $i$ is placed $p[i]$ meters away from the origin.</p>

<p>It is guaranteed that router $0$ is at the origin, and the distance in meters from each router to the origin is an&nbsp;<strong>even integer</strong>.&nbsp;</p>

<p>You wish to find out the position of each of the $n$ routers. As the routers are very small and difficult to spot from afar, you&#39;ve decided to use the following procedure to find them:</p>

<ul>
	<li>Place a detector on a spot that is $x$ meters away from the origin,</li>
	<li>Use the detector to find the label of the router closest to it. If there are two routers that are the same distance away from it, it will respond with the router with the smaller label.</li>
</ul>

<p>You are allowed to use the detector at most $q$ times. Devise a strategy to find the positions of all the routers.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$p[0]=0$</li>
	<li>$0 \leq p[i] \leq l$ and $p[i]$ is even. (for all $0 \leq i \leq n-1$)</li>
	<li>$p[i] &lt; p[i+1]$ (for all $0 \leq i \leq n-2$)</li>
</ul>