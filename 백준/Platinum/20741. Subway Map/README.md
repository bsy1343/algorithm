# [Platinum IV] Subway Map - 20741

[문제 링크](https://www.acmicpc.net/problem/20741)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 4, 맞힌 사람: 4, 정답 비율: 26.667%

### 분류

그래프 이론, 자료 구조, 트리, 분리 집합, 최소 스패닝 트리, 최소 공통 조상, 희소 배열, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>In the year 2120 there is a vast subway network under all of Lund, consisting of $N$ stations and $M$ tunnels. Each tunnel connects two stations and the stations are numbered $1$, $\ldots$, $N$.</p>

<p>Erik has had enough of Sk&aring;netrafiken&#39;s terrible route planning software and plans to build his own. To do this, he needs to know the length of each of the tunnels, but the subway map is incomplete in this regard. By looking out the window, Erik has noticed that some tunnels have special cables running alongside them, probably for providing power to the stations. The cables connect the stations so that every station is connected to the central station (the station numbered $1$). Knowing how greedy Sk&aring;netrafiken is, he is certain that the cables are placed so that the total length of cable is minimized.</p>

<p>Erik knows the precise length of some tunnels, and which tunnels contain cables. Using this information he wants to find the minimum possible length for each tunnel with unknown length. Unfortunately, Erik&#39;s algorithm isn&#39;t efficient enough to process the enormous size of Lund&#39;s subway network. Can you help him by implementing a more efficient algorithm?</p>

### 입력

<p>The first line of input contains two integers $N$ and $M$, where $2 \leq N \leq 10^5$ and &nbsp;$N - 1 \leq M \leq 2 \cdot 10^5$, the number of stations and the number of tunnels, respectively. Each of the next $M$ lines contains the values $a_i$, $b_i$, $l_i$ and $c_i$. The integers $a_i$ and $b_i$, with $1 \leq a_i, b_i \leq N$ and $a_i\neq b_i$, denote the two stations connected by the $i$th tunnel. The value $l_i$ is either an integer satisfying $1 \leq l_i \leq 10^9$, the length of the $i$th tunnel if it is known, or a question mark &ldquo;<code>?</code>&rdquo;. Finally, $c_i$ is $1$ if the $i$th tunnel contains a cable, and $0$ if not.</p>

<p>It is guaranteed that there is at most one tunnel connecting the same pair of stations, and that it is possible to travel between any pair of stations using the subway. It is also guaranteed that there exists a path between any station and station number $1$ using only tunnels where $c_i = 1$.</p>

### 출력

<p>For each tunnel with $l_i=<code>?</code>$, output one line with a single integer, the minimum possible length for that tunnel. Tunnel lengths should be output in the same order as the tunnels are listed in the input.</p>

### 힌트

<p>In the first sample case, the minimal distance for the unknown tunnel (between stations $3$ and $1$) is $5$. This is because, if the length were less than $5$, it would be more efficient for Sk&aring;netrafiken to run cables through the second and third tunnels.</p>