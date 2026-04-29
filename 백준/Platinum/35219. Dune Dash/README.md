# [Platinum IV] Dune Dash - 35219

[문제 링크](https://www.acmicpc.net/problem/35219)

### 성능 요약

시간 제한: 7 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 18, 맞힌 사람: 18, 정답 비율: 52.941%

### 분류

기하학, 애드 혹, 정렬

### 문제 설명

<p>You signed up for the <em>Dune Dash</em>, a running race across the desert. Everything went well — except that in the excitement, you forgot to start <em>StrideTrack</em>, the app that records how far you’ve run. All you have now are the official checkpoint locations, but not the order in which you passed through them.</p>

<p>Formally, the race consisted of $N$ checkpoints, each given by its coordinates in the Euclidean plane. The sequence in which they were visited is unknown to you, but the organizers designed the course to prevent anyone from straying off route. In particular, if $q_1, q_2, \dots, q_N$ is the correctly ordered list of the checkpoints along the race, then for every triple $i &lt; j &lt; k$ it holds that</p>

<p>$$\text{dist}(q_i, q_k) &gt; \max(\text{dist}(q_i, q_j), \text{dist}(q_j, q_k) )$$</p>

<p>where $\text{dist}(p,q)$ denotes the Euclidean distance between points $p$ and $q$. Your task is to determine the total length of the race.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35219.%E2%80%85Dune%E2%80%85Dash/9b64d75d.png" data-original-src="https://boja.mercury.kr/assets/problem/35219-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 339px;"></p>

<p style="text-align: center;">Figure D.1: Illustration of sample 2. The dashed line shows where the race went.</p>

### 입력

<p>The first line consists of the integer $N$ ($2 \leq N \leq 2 \cdot 10^5$). The following $N$ lines each contain two integers $x_i$ and $y_i$ ($-10^9 \leq x_i, y_i \leq 10^9$). These are the coordinates of each checkpoint. </p>

<p>The checkpoints are not necessarily in the order in which they were visited during the race. It is guaranteed that there is some ordering of the checkpoints such that they satisfy the distance requirements above.</p>

<p>The $N$ points given in the input are all distinct.</p>

### 출력

<p>Print one floating point number, the length of the race. Your answer will be correct if it has an absolute or relative error of at most $10^{-6}$.</p>