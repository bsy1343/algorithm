# [Platinum I] Freestyle Masonry - 28374

[문제 링크](https://www.acmicpc.net/problem/28374)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 116, 정답: 36, 맞힌 사람: 34, 정답 비율: 43.038%

### 분류

그리디 알고리즘

### 문제 설명

<p>Fred got a simple task, he just has to build a $w\times h$ wall. To make this even easier, he was provided with enough $2\times1$ bricks and also a few $1\times1$ bricks to complete the wall. Knowing that this task should not be too hard, Fred went to work and started building the wall without thinking too much about the design. Only when he ran out of $1\times1$ bricks, Fred noticed that this might have been a bad idea...</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/28374.%E2%80%85Freestyle%E2%80%85Masonry/dbc5da07.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/28374.%E2%80%85Freestyle%E2%80%85Masonry/dbc5da07.png" data-original-src="https://upload.acmicpc.net/cc97b2ce-1f8b-4b69-81d5-66a380deb79d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 197px; height: 100px;" /></p>

<p style="text-align: center;">Figure F.1: Visualization of Sample Input $2$. The red bricks have already been placed by Fred. The blue bricks still need to be placed to complete the wall (the only possible design in this case).</p>

<p>Maybe he should have made a plan before starting to build the wall, but now it is too late. Fred only has a bunch of $2\times1$ bricks left and wants to finish the wall. Can he still complete it with the remaining $2\times 1$ bricks? Note that the wall to be built should have a width of exactly $w$ units and a height of exactly $h$ units.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $w$ and $h$ ($1\leq w\leq2\cdot10^5$, $1\leq h\leq10^6$), the width and height of the wall Fred wants to build.</li>
	<li>One line with $w$ integers $h_1,\dots,h_n$ ($0\leq h_i\leq 10^6$), where $h_i$ is the current height of the wall at position $i$.</li>
</ul>

### 출력

<p>Output &quot;<code>possible</code>&quot; if Fred can complete his wall and &quot;<code>impossible</code>&quot; otherwise.</p>