# [Gold III] Evacuation - 33641

[문제 링크](https://www.acmicpc.net/problem/33641)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 6, 맞힌 사람: 6, 정답 비율: 27.273%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>A city specified by a set of districts and bridges is under threat. Initially, each district can reach any other district through some series of bridges.</p>

<p>A tornado has touched down at district $D_1$ and is destroying everything in its way. The latest model suggests the tornado will destroy districts $D_1,\dots ,D_K$ following the bridges between $(D_i,D_{i+1})$. Upon reaching district $D_K$ the model is not accurate enough to precisely determine the tornadoes course.</p>

<p>Given the tornadoes predicted course you must determine the minimum time it would take to travel from your home located in district $H$ to the evacuation shelter located in district $E$. Of course, once the tornado begins travelling down a bridge it becomes unstable disallowing its use; that is, if the tornado arrives at $D_i$ at time $T_i$ and is heading towards $D_j$, the bidirectional bridge $(D_i,D_j)$ will no longer be safe to use at any time $T≥T_i$, even if you would nearly be finished crossing it.</p>

<p>Due to their size, residing in the same district as the tornado poses no threat.</p>

### 입력

<p>The first line of input will contain three integers, $N$, $M$, $K$, indicating there are $2≤N≤10^4$ districts, $N-1≤M≤\min(10^5,\frac{N(N+1)}{2}$) bridges, and the tornadoes predicted course contains $2≤K≤N$ districts.</p>

<p>The next line of input contains two integers $1≤H,E≤N$ indicating the district of your home and the evacuation shelter respectively.</p>

<p>The following $M$ lines contain three integers each, $U_i$, $V_i$, $T_i$, indicating there is a bidirectional bridge between districts $1≤U_i≤N$ and $1≤V_i≤N$ that takes $1≤T_i≤100$ time to cross. There will be at most one bridge between any pair of districts and $U_i \ne V_i$ for each bridge.</p>

<p>The final line contains $K$ space separated integers indicating the districts which the tornado is predicted to destroy. All bridges the tornado follows are guaranteed to exist, the tornado crosses each bridge in the same amount of time it would take for you to cross.</p>

### 출력

<p>Output a single integer indicating the minimum amount of time it will take to reach district $E$ from district $H$ while avoiding all unstable bridges. Output $-1$ if it is impossible to reach $E$ from $H$.</p>