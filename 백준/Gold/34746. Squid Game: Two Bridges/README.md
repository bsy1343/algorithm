# [Gold V] Squid Game: Two Bridges - 34746

[문제 링크](https://www.acmicpc.net/problem/34746)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 28, 맞힌 사람: 24, 정답 비율: 70.588%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Sogang agent is participating in “Squid Game: Two Bridges”. There are two parallel bridges, A and B, each consisting of $N$ steps. Each step has a score. The player starts at the beginning and moves to the end for $N$ rounds. The player can only move forward along the bridge.</p>

<p>In each round, the player can either:</p>

<ol>
<li>jump to the next step on the same bridge without using any energy, or</li>
<li>spend one unit of energy to jump to the next step on the other bridge.</li>
</ol>

<p>When the player lands on a step, the step’s score is added to the total. Unlike the original <i><em>Squid Game</em></i>, there is no danger of dying in this version, and the agent will always finish the game.</p>

<p>Specifically, the agent starts on the starting point of the left bridge (A) with an initial score of $0$ and initial energy $K$, shown in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/34746.%E2%80%85Squid%E2%80%85Game%3A%E2%80%85Two%E2%80%85Bridges/fd2a5058.png" data-original-src="https://boja.mercury.kr/assets/problem/34746-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p> Given the score sequences $A$ (for the left bridge) and $B$ (for the right bridge), and the initial energy $K$, determine the maximum score the Sogang agent can achieve. The agent does not have to use all of the energy—it is also possible to use none at all.</p>

### 입력

<p>The first line contains two integers $N$ and $K$, the number of turns and the agent’s initial energy. $(1 \leq N \leq 100\,000, 0 \leq K \leq 4)$</p>

<p>The second lines contains $N$ integers, representing the left bridge's score sequence $A$. $(-1\,000 \leq A_i \leq 1\,000)$</p>

<p>The third line contains $N$ integers, representing the right birdge's sequence $B$. $(-1\,000 \leq B_i \leq 1\,000)$</p>

### 출력

<p>Print a single integer: the maximum score the Sogang agent can achieve.</p>