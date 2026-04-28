# [Platinum I] MountainCraft - 31956

[문제 링크](https://www.acmicpc.net/problem/31956)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 99, 정답: 50, 맞힌 사람: 46, 정답 비율: 54.118%

### 분류

자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 값 / 좌표 압축

### 문제 설명

<p>It&#39;s a glorious day in the video game meta-world of MountainCraft! True to its name, MountainCraft boasts an expansive open world full of mountains to explore. Your avatar in the game wakes up on a remote island, and stares at the mountains on the horizon.</p>

<p>The view of the horizon can be modeled as a Cartesian plane, with the $x$-axis ($y = 0$) separating land from sea. Each mountain peak is represented by a point $(x, y)$, and the mountain&#39;s sides have slope $+1$ and $-1$, forming a triangle with that peak at the top.</p>

<p>Your avatar can only see the parts of the mountains which are in a viewport. The visible edges of the mountains, where they do not overlap other mountains, are rendered in bold. If mountains overlap, the overlapping parts are not rendered in bold. Edges do not have to intersect for mountains to overlap.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31956.%E2%80%85MountainCraft/9e4a8833.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/31956.%E2%80%85MountainCraft/9e4a8833.png" data-original-src="https://upload.acmicpc.net/4fd64ae7-71de-4a85-9609-6fd4e0350aee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 300px;" /></p>

<p style="text-align: center;">Figure H.1: The first sample input after all mountains appear.</p>

<p>Unfortunately, due to graphical glitches, mountains can appear and disappear. After each change, you want to know the total length of all the bold lines currently visible in the viewport.</p>

### 입력

<p>The first line of input contains two integers $q$ ($1 \leq q \leq 2 \cdot 10^{5}$) and $w$ ($1 \leq w \leq 10^9$), where $q$  is the number of queries and $w$ is the width of the viewport. The viewport stretches from $0$ to $w$.</p>

<p>Each of the next $q$ lines contains two integers $x$ ($0 \leq x \leq w$) and $y$ ($0 &lt; y \leq 10^{9}$), the peak of some mountain. If $(x, y)$ is the peak of a mountain that is visible, that mountain will disappear. Otherwise, that mountain will become visible.</p>

### 출력

<p>Output $q$ lines. For each query in order, output a single line with a single number, which is the total length of the bold lines rendered. Your answer will be accepted if the absolute or relative error is within $10^{-6}$ of the judge&#39;s answer.</p>

### 힌트

<p>In the first sample, the first two mountains intersect at the point $(4.5, 0.5)$ The parts of the mountains below that point are not rendered in bold.</p>

<p>In the second sample, the left mountain appears, then disappears, then appears again. The right mountain appears and then disappears.</p>