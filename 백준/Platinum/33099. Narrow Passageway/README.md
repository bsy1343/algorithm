# [Platinum I] Narrow Passageway - 33099

[문제 링크](https://www.acmicpc.net/problem/33099)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

그리디 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>You are a strategist of The ICPC Kingdom. You received an intel that there will be monster attacks on a narrow passageway near the kingdom. The narrow passageway can be represented as a grid with $2$ rows (numbered from $1$ to $2$) and $N$ columns (numbered from $1$ to $N$). Denote $(r, c)$ as the cell in row $r$ and column $c$. Each cell can be empty, which is represented by the character <code>.</code>; or blocked, which is represented by the character <code>#</code>.</p>

<p>There are three types of heroes that can be deployed to defend the passageway: swordsman, wizard, and defender. Currently, the kingdom has $C_s$ swordsmen, $C_w$ wizards, and $C_d$ defenders. Each swordsman, wizard, and defender has a power of $P_s$, $P_w$, and $P_d$, respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/33099.%E2%80%85Narrow%E2%80%85Passageway/2d88615c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/33099-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 275px; height: 75px;"></p>

<p>You can only deploy at most <strong>one</strong> hero on an empty cell, while no heroes can be deployed on a blocked cell. Furthermore, there should not be two cells sharing a side and both contain a swordsman; and there should not be two cells sharing a corner and both contain a wizard. Formally,</p>

<ul>
	<li>if $(r, c)$ contains a swordsman, then $(r - 1, c)$, $(r, c + 1)$, $(r + 1, c)$, and $(r, c - 1)$ should not contain a swordsman; and</li>
	<li>if $(r, c)$ contains a wizard, then $(r - 1, c - 1)$, $(r - 1, c + 1)$, $(r + 1, c + 1)$, and $(r + 1, c - 1)$ should not contain a wizard.</li>
</ul>

<p>Determine the maximum total power that can be deployed to defend the narrow passageway from the monster attacks.</p>

### 입력

<p>The first line consists of an integer $N$ ($1 ≤ N ≤ 1000$).</p>

<p>The second line consists of three integers $C_s$ $C_w$ $C_d$ ($0 ≤ C_s, C_w, C_d ≤ 1000$).</p>

<p>The third line consists of three integers $P_s$ $P_w$ $P_d$ ($1 ≤ P_s, P_w, P_d ≤ 100\, 000$).</p>

<p>Each of the next $2$ lines consists of a string with $N$ characters. They represent the narrow passageway as a grid. The $c$<sup>th</sup> character of the $r$<sup>th</sup> string represents $(r, c)$. Each character can only be either <code>.</code> or <code>#</code>.</p>

### 출력

<p>Output a single integer representing the maximum total power that can be deployed to defend the narrow passageway.</p>