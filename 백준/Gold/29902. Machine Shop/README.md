# [Gold II] Machine Shop - 29902

[문제 링크](https://www.acmicpc.net/problem/29902)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>Elise Isabella Oya works in the Cute Machine Shop. The shop sells many different machines. All of them can be bought from suppliers. Some of them can also be built in the shop from others; this may also be the case for the others in turn. For example, it may be possible to build the machine A from machines B and C, and the machine B in turn from machines D and E; thus, in this case, the machine A could also be built from machines C, D, and E.</p>

<p>Elise was asked for a price quote for a machine. To respond, she needs to know the lowest possible cost of obtaining the machine, whether by buying or by building it. The cost of labor in building a machine from others can be neglected.</p>

### 입력

<p>The first line contains space-separated integers $N$ and $K$ ($1 \le K \le N \le 1\,000$), the number of different machines and the number of the machine Elise needs to obtain. The machines are numbered $1, \ldots, N$.</p>

<p>The following $N$ lines describe the machines, in the order of their numbers. First on each line is $P_i$ ($0 \le P_i \le 10\,000$), the cost of buying the machine $i$. If the machine can only be obtained by buying it, the price is followed by a $0$ and there will be no more data on that line. Otherwise, the price is followed by $M_i$ ($1 \le M_i \le N$), the number of other machines needed to build the machine $i$, and then by $M_i$ space-separated integers: the numbers of the other machines; these $M_i$ numbers will always be distinct. Additionally, it is known that no machine is a component of itself when it is built, neither directly nor indirectly (in graph-theoretical terms, we have a directed acyclic graph).</p>

### 출력

<p>Output exactly one integer: the minimal cost of obtaining the machine $K$.</p>