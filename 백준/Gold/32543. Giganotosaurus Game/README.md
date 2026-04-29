# [Gold III] Giganotosaurus Game - 32543

[문제 링크](https://www.acmicpc.net/problem/32543)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 172, 정답: 43, 맞힌 사람: 32, 정답 비율: 26.016%

### 분류

다이나믹 프로그래밍, 제곱근 분할법

### 문제 설명

<p>Suffering from a poor internet connection, you are playing a casual game in your web browser to pass the time. You, the player, control a Giganotosaurus that is running through a linear world with obstacles (cactuses). You win the game if you reach the end of the world without hitting any cactuses.</p>

<p>The world consists of $n$ cells, which can either be empty or contain a cactus. You start at the leftmost cell (which is always empty) and the goal is to get past the rightmost cell. At each cell, the Giganotosaurus can either move one position to the right, or jump over some fixed number of cells. For the first jump, you skip one cell, but with each subsequent jump, you skip one additional cell compared to the previous jump. That is, the $k$th jump skips exactly $k$ cells.</p>

<p>You quickly master this simple game, so you pose a more interesting challenge: count how many ways there are to win the game. As an example, consider the second sample case, visualized in Figure G.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32543.%E2%80%85Giganotosaurus%E2%80%85Game/9d2cbabf.png" data-original-src="https://boja.mercury.kr/assets/problem/32543-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 120px;"></p>

<p style="text-align: center;">Figure G.1: Visualization of the second sample input, for which there are three ways to win the game.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \le n \le 10^5$), the length of the world.</li>
	<li>One line with $n$ characters, each character being either '<code>#</code>' or '<code>.</code>', indicating a cactus or an empty cell, respectively.</li>
</ul>

### 출력

<p>Output the number of ways to win the game, modulo $10^9 + 7$.</p>