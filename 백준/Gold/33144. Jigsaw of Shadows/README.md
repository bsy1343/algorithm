# [Gold IV] Jigsaw of Shadows - 33144

[문제 링크](https://www.acmicpc.net/problem/33144)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 43, 정답: 34, 맞힌 사람: 31, 정답 비율: 77.500%

### 분류

기하학, 스위핑

### 문제 설명

<p>They finally did it! The flat-earthers managed to teleport themselves to an idealized flat world where no one can make fun of them anymore.</p>

<p>In this world, there is a perfectly straight, infinite road that runs along the $x$-axis. Instead of a sun, they have something more illuminating: a gigantic flashlight elevated above the road, positioned infinitely far away to the west (negative $x$-axis). This flashlight beams light at a precise angle with respect to the ground, illuminating the entire road.</p>

<p>There are $N$ flatlanders standing proudly at distinct positions along the road. As the light strikes each of them, it casts a shadow extending eastward (toward the positive $x$-axis).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33144.%E2%80%85Jigsaw%E2%80%85of%E2%80%85Shadows/dd577c5f.png" data-original-src="https://boja.mercury.kr/assets/problem/33144-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 219px;"></p>

<p>Eager to show off their flat-world knowledge, the citizens want to calculate how much of the road is covered by their shadows. However, with shadows potentially overlapping, they need your help to figure it out. Given the positions of the flatlanders and their heights, can you calculate the total length of the road covered by their shadows?</p>

### 입력

<p>The first line contains two integers $θ$ ($10 ≤ θ ≤ 80$) and $N$ ($1 ≤ N ≤ 10^5 $), indicating respectively the angle of the light beams and the number of flatlanders on the road. The angle is measured in degrees, clockwise from the ground to the light beams.</p>

<p>Each of the next $N$ lines contains two integers $X$ ($0 ≤ X ≤ 3 \cdot 10^5 $) and $H$ ($1 ≤ H ≤ 1000$), indicating that a flatlander of height $H$ is located at position $X$ along the road. It is guaranteed that no two flatlanders share the same location.</p>

### 출력

<p>Output a single line with the total length of the road covered by the shadows of all flatlanders. The output must have an absolute or relative error of at most $10^{-4}$.</p>