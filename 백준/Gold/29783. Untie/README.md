# [Gold IV] Untie - 29783

[문제 링크](https://www.acmicpc.net/problem/29783)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 29, 맞힌 사람: 18, 정답 비율: 46.154%

### 분류

다이나믹 프로그래밍, 많은 조건 분기

### 문제 설명

<p>A group of people are sitting in a circle, playing a special version of rock, paper, scissors. In this game, each person chooses <a href="https://en.wikipedia.org/wiki/Rock_paper_scissors" target="_blank">rock, paper, or scissors</a> in secret and then everyone reveals their choice to everyone else. Each person then compares their selection to their two neighbors, and can win, lose, or tie against each of them independently. The only way to tie is when both people make the same choice.</p>

<p>You want to make it so that no game is a tie. For each player, you can let them keep their choice, or you can ask them to change to any of the other two options (you choose to which one). What is the minimum number of people you need to request a change from to ensure that there are no ties between neighbors after those changes are made?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ lines follow. Each line represents a test case and contains a string $\mathbf{C}$. The $i$-th character of $\mathbf{C}$ represents the original choice of the $i$-th person in clockwise order using an uppercase <code>R</code> to mean rock, an uppercase <code>P</code> to mean paper, and an uppercase <code>S</code> to mean scissors.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the minimum number of changes that are required such that no two neighbors end up with the same choice.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>Each character of $\mathbf{C}$ is either an uppercase <code>R</code>, an uppercase <code>P</code>, or an uppercase <code>S</code>.</li>
</ul>

### 힌트

<p>In Sample Case #1, there is a pair of neighbors that both chose paper (the first and last character of the input) and another pair that both chose scissors. Therefore, we need at least two changes. One way of doing it with two changes is to change the leftmost paper to scissors and the rightmost scissors to rock, to obtain <code>SRSRP</code>.</p>

<p>In Sample Case #2, all $7$ participants chose rock. If we change at most $3$ selections, there will be at least $4$ remaining rocks, and at least two of them will be neighbors. Therefore, the minimum number of changes is at least $4$. One way to achieve exactly $4$ is to get <code>PRSRPRS</code>.</p>

<p>In Sample Case #3, no pair of neighbors tied, so no changes are needed.</p>