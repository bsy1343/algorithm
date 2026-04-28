# [Gold IV] Driving Lanes - 22283

[문제 링크](https://www.acmicpc.net/problem/22283)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 23, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>While driving around a curve on the highway, Sam realizes that if they use the inside lane, they travel a shorter distance. Sam wonders what is the minimum distance needed to travel to the destination.</p>

<p>The multilane highway consists of a sequence of straightaways that are connected by curves. When going around a curve, the distance travelled depends on which lane you are in. Each curve has a curvature $c$ and stretch $s$. Specifically, if Sam is in lane $i$, then they travel $s + c \cdot i$ meters while going around this curve.</p>

<p>Whenever Sam is on a straightaway, they may change from one lane into an adjacent lane. &nbsp;When changing to an adjacent lane, Sam moves forward $k$ meters, but travels a total of $k+r$ meters. &nbsp;Each lane change must be completed before the car reaches the end of the current straightaway. &nbsp;Sam may change lanes multiple times in the same straightaway. For safety reasons, changing lanes is not possible on curves.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/3110dd5f-ac94-4483-adf9-d53911139c32/-/preview/" style="width: 387px; height: 209px;" /></p>

<p>Sam starts in lane $1$ and wishes to end in lane $1$. What is the minimum distance they must travel?</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \leq n \leq 250$), which is the number of straightaways, and $m$ ($1 \leq m \leq 250$), which is the number of lanes on the highway. The lanes are numbered $1, 2, \dots, m$.</p>

<p>The second line of input contains two integers $k$ ($1 \leq k \leq 10^6$) and $r$ ($1 \leq r \leq 10^6$), which are the lane changing parameters.</p>

<p>The next $n$ lines describe the straightaways in order. Each of these lines contains a single integer $\ell$ ($1 \leq \ell \leq 10^6$), which is the length of this straightaway.</p>

<p>The next $n-1$ lines describe the curves in order. Each of these lines contains two integers $s$ ($1 \leq s \leq 10^6$), which is the stretch of this curve, and $c$ ($-10^6 \leq c \leq 10^6$), which is the curvature of this curve. It is guaranteed that $s + c \cdot m &gt; 0$.</p>

<p>The $i$th curve connects the $i$th and $(i+1)$th straightaway.</p>

### 출력

<p>Display the minimum distance Sam must travel.</p>