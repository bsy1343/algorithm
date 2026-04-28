# [Gold III] Bottle Flip - 26175

[문제 링크](https://www.acmicpc.net/problem/26175)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 80, 맞힌 사람: 77, 정답 비율: 81.053%

### 분류

수학, 물리학

### 문제 설명

<p>It marks the year 2022 where the <em>bottle flip challenge</em> finally reached the last people on earth; the NWERC Jury. As you may know, the objective of the challenge is to flip a bottle of water $360^{\circ}$ through the air and hope that it lands standing upright. Figure B.1 demonstrates a successful bottle flip.</p>

<p>After many failed attempts, we noticed that this task gets significantly easier if the bottle is filled with just the right amount of water. The simple reason for this is that the amount of water affects the centre of mass of our bottle as it is about to land.<sup>1</sup> A lower centre of mass makes it easier for the bottle to stay upright after it lands. Unfortunately, the optimal amount of water depends on the bottle, and we already wasted enough time on this challenge\dots</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/defdb2f7-f084-4e12-a172-9568997cf296/-/preview/" style="width: 400px; height: 200px;" /></p>

<p style="text-align: center;">Figure B.1: Sketch of a bottle flip. The bottle is filled to roughly $33\%$ to ease the challenge.}</p>

<p>Given that our bottle is a perfect cylinder of height $h$ and radius $r$, determine the optimal amount of water the bottle should contain so that our chances of landing a successful bottle flip are maximised. You can assume that both the water and the air contained in the bottle have uniform density, and that the weight of the bottle itself is negligible.</p>

<hr />
<p><sup>1</sup>For the sake of completeness, we define the centre of mass as the unique point at which the whole mass of the bottle could be concentrated without changing the bottle&#39;s reaction to gravity, regardless of the orientation of the bottle. Note that we implicitly assume that the water will stay at the bottom of the bottle. This defines exactly what you would intuitively think of as centre of mass.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with four integers $h$, $r$, $d_a$, and $d_w$ ($1 \leq h, r, d_a, d_w \leq 1000$, $d_a &lt; d_w$), where $h$ and $r$ are the height and radius of the bottle, and $d_a$ and $d_w$ are the densities of air and water, respectively.</li>
</ul>

### 출력

<p>Output the height such that filling the bottle with water up to this height results in the lowest possible centre of mass while the bottle is standing upright. Your answer should have an absolute or relative error of at most $10^{-6}$.</p>