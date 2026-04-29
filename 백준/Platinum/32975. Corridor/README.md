# [Platinum V] Corridor - 32975

[문제 링크](https://www.acmicpc.net/problem/32975)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 6, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

누적 합, 다이나믹 프로그래밍

### 문제 설명

<p>David wants to exit a secret science laboratory. He is in a corridor on the opposite end from the exit, so he will have to walk along the entire length of the corridor.</p>

<p>It would be straightforward to leave, but some teleporters are being tested in the corridor. The corridor consists of $N$ segments. Some segments contain a teleporter.</p>

<p>Each teleporter is configured to teleport stuff into a particular target segment. The target segment is always further from the exit (and thus closer to David's starting position) than the teleporter itself. Also each teleporter may be switched on or off.</p>

<p>When David enters (either walks or is teleported into) a segment with a turned-on teleporter, he is teleported into the target segment, and the teleporter turns off. When David enters a segment with a turned-off teleporter, he is not teleported, but the teleporter turns on.</p>

<p>All teleporters are turned on initially.</p>

<p>Find how long it will take David to leave the laboratory.</p>

<p>It takes one second for David to walk from one segment to the next. Teleportation is instantaneous. David will always walk towards the exit. Exiting the laboratory from the last segment of the corridor also takes one second.</p>

<p>Since the answer may be very large, output the remainder when David's total walking time (in seconds) is divided by $10^9 + 7$.</p>

### 입력

<p>The first line contains one integer $N$ ($1 \le N \le 100\,000$), the number of segments the corridor consists of.</p>

<p>The second line contains $N$ integers $A_1, A_2, \ldots, A_N$ ($1 \le A_i \le i$) denoting the teleporter targets. If $A_i = i$, then the $i$-th segment is empty. Otherwise the $i$-th segment contains a teleporter which teleports stuff into the $A_i$-th segment.</p>

<p>David starts at the $1$-st segment.</p>

### 출력

<p>Output one integer, David's time to exit the lab, modulo $10^9 + 7$.</p>