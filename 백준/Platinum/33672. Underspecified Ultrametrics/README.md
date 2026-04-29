# [Platinum II] Underspecified Ultrametrics - 33672

[문제 링크](https://www.acmicpc.net/problem/33672)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

분리 집합, 자료 구조, 작은 집합에서 큰 집합으로 합치는 테크닉, 정렬

### 문제 설명

<p>Given a set of points $X$ with distances $d(u,v)$ between any $u,v \in X$, we say that $(X,d)$ is an <b>ultrametric</b> if the following properties are satisfied:</p>

<ul>
	<li>$d(u,v)≥0$ for any two points $u$, $v$ with $d(u,v)=0$ if and only if $u=v$</li>
	<li>$d(u,v)=d(v,u)$ for any two points $u$, $v$</li>
	<li>$d(u,v)≤\max\{d(u,w),d(w,v)\}$ for any three points $u$, $v$, $w$</li>
</ul>

<p>That is, distances in an ultrametric satisfy a slightly stronger property than the usual triangle inequality $d(u,v)≤d(u,w)+d(w,v)$.</p>

<p>You have measured distances between some pair of points from some set $X$ and start to wonder if you might be looking at an ultrametric. Write a program to help you determine if this is the case!</p>

### 입력

<p>The first line of input contains two integers $N$ ($3≤N≤100\,000$) and $M$ ($0≤M≤400\,000$) where $N$ is the number of points in the set $X$ and $M$ is the number of distances you have determined so far. The points are numbered from $0$ to $N-1$.</p>

<p>Then $M$ lines follow, each containing three integers $u$, $v$, $ℓ$ ($0≤u&lt;v&lt;N$ and $1≤ℓ≤10^9$) where $u$, $v$ are two points in $X$ and $ℓ$ is the distance $d(u,v)$ you have determined between these points. No pair of points will have their distance specified on more than on line.</p>

### 출력

<p>Output <code>possibly ultrametric</code> if there is an ultrametric $(X,d')$ where the distances satisfy $d'(u,v)=d(u,v)$ for any $u,v \in X$ such that one of the $M$ given distances you have already determined is for the pair $(u,v)$. Otherwise, output the message <code>not ultrametric</code>.</p>