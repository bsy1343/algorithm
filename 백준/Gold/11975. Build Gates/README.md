# [Gold III] Build Gates - 11975

[문제 링크](https://www.acmicpc.net/problem/11975)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 426, 정답: 237, 맞힌 사람: 179, 정답 비율: 57.929%

### 분류

그래프 이론, 그래프 탐색, 기하학, 집합과 맵, 깊이 우선 탐색, 오일러 지표 (χ=V-E+F)

### 문제 설명

<p>Farmer John decides to build a new fence around parts of his farm, but he keeps getting distracted and ends up building the fence into a much stranger shape than he intended!</p>

<p>Specifically, FJ starts at position \((0,0)\) and takes \(N\) steps, each moving one unit of distance north, south, east, or west. Each step he takes, he lays a unit of fence behind him. For example, if his first step is to the north, he adds a segment of fence from \((0,0)\) to \((0,1)\). FJ might re-visit points multiple times and he may even lay the same segment of fence multiple times. His fence might even cross over itself if his path cuts through a run of fencing he has already built.</p>

<p>Needless to say, FJ is rather dismayed at the result after he completes the fence. In particular, he notices that it may be the case that he has now partitioned off some areas of the farm from others, so that one can no longer walk from one region to another without crossing a fence. FJ would like to add gates to his fences to fix this problem. A gate can be added to any unit-length segment of fence he has built, allowing passage between the two sides of this segment.</p>

<p>Please determine the minimum number of gates FJ needs to build so that every region of the farm is once again reachable from every other region.</p>

### 입력

<p>The first line of input contains \(N\) (\(1 \leq N \leq 1000\)). The next line contains a string of length \(N\) describing FJ&#39;s path. Each character is either N (north), E (east), S (south), or W (west).</p>

### 출력

<p>Write out a single integer giving the minimum number of gates FJ needs to build to restore complete connectivity to all regions of his farm. Note that the answer could be zero if the farm is connected to begin with.</p>