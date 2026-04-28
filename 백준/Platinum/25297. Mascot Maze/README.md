# [Platinum II] Mascot Maze - 25297

[문제 링크](https://www.acmicpc.net/problem/25297)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

그래프 이론, 그리디 알고리즘, 위상 정렬, 방향 비순환 그래프

### 문제 설명

<p>The Google Coding Competitions team is setting up a new theme park. As in any good theme park, we want to have actors dressed up as mascots to interact with visitors. Because we are in a rush to open, we decided to use the letters from <code>CODE JAM</code>, <code>KICK START</code>, and <code>HASH CODE</code> as mascots, for a total of $13$ different mascots (the letters <code>ACDEHIJKMORST</code>).</p>

<p>The park&#39;s only attraction is a maze that has a set of $\mathbf{N}$ rooms numbered from $1$ to $\mathbf{N}$. Each room has a left exit and a right exit. Each exit takes the visitor to another room. Exits cannot be used in reverse; for example, if room $2$ has an exit to room $3$, you cannot go back from room $3$ to room $2$ unless room $3$ also happens to have an exit to room $2$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/bf737dca-d77d-4259-8626-61a0eddb36f6/-/preview/" /></p>

<p>We want to place exactly one of our $13$ mascots in each room. Each letter may be present in zero, one, or more rooms of the maze. To increase variety, we want to place mascots so that any three (not necessarily distinct) rooms that a visitor can visit consecutively have three different mascots.</p>

<p>Can you help us choose a mascot for each room such that this goal is met, or let us know that it cannot be done?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case consists of $3$ lines. The first line contains a single integer $\mathbf{N}$, representing the number of rooms in the maze. The second line contains $\mathbf{N}$ integers $\mathbf{L_1}, \mathbf{L_2}, \dots, \mathbf{L_N}$, representing that the left exit from room $i$ leads to room $\mathbf{L_i}$. The third and last line contains $\mathbf{N}$ integers $\mathbf{R_1}, \mathbf{R_2}, \dots, \mathbf{R_N}$, representing that the right exit from room $i$ leads to room $\mathbf{R_i}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is <code>IMPOSSIBLE</code> if there is no way to assign mascots while obeying the rules explained above. Otherwise, $y$ is an $\mathbf{N}$ character long string. The $i$-th character of $y$ should be an uppercase letter from the set <code>ACDEHIJKMORST</code>, representing that you wish to assign that mascot to the $i$-th room.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$\mathbf{L_i} \neq i$, for all $i$. $\mathbf{R_i} \neq i$, for all $i$. $1 \le \mathbf{L_i} \lt \mathbf{R_i} \le \mathbf{N}$, for all $i$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the image in the problem statement. It is possible to visit rooms 1, 2, and 1 consecutively (which visits room 1 twice), so the case is impossible.</p>

<p>Sample Case #2 has the following layout (blue arrows represent the left exits and red arrows represent the right exits):</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/c5f4b04a-4038-466c-9b4e-ebd7e11a3340/-/preview/" /></p>

<p>One of many valid answers is to assign mascots as indicated. Notice that although we do not need to assign two <code>T</code> mascots in this case, we have done so in a way that does not break the rules.</p>

<p>Sample Cases #3 and #4 are possible, but require the use of multiple copies of some mascots.</p>