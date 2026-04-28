# [Platinum III] Wonderland Chase - 27824

[문제 링크](https://www.acmicpc.net/problem/27824)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 3, 맞힌 사람: 3, 정답 비율: 50.000%

### 분류

애드 혹, 너비 우선 탐색, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Alice is trapped in Wonderland&#39;s labyrinth, being chased by the Queen of Hearts and her herald! The labyrinth is a set of $\mathbf{J}$ junctions numbered $1$ through $\mathbf{J}$, connected by $\mathbf{C}$ bidirectional corridors.</p>

<p>Alice and the Queen of Hearts take turns making moves, and each knows the location of the other at all times. A move (by either of them) consists of either staying at the current junction or moving to another one that is connected to it by a corridor.</p>

<p>The Queen&#39;s herald, however, announces the next move the Queen makes in advance. That means that before anyone makes a move, he announces the Queen&#39;s first move. Then, Alice moves first. Then, each time the Queen moves, she must respect the previous announcement, and then decide her next move so the herald can announce it. Alice hears the announcements, so she always knows the Queen&#39;s next move before making her own.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/c738d617.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/c738d617.png" data-original-src="https://upload.acmicpc.net/9cee39d7-df40-422f-b909-ee40ef64c48c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>If Alice and the Queen are at the same junction after either of them moves, then Alice is caught. Otherwise, the pursuit continues. After $10^9$ total moves (half of them for Alice and half for the Queen), if Alice and the Queen are not in the same junction, then the Queen will give up and Alice will be safe.</p>

<p>Alice chooses her moves optimally to escape. If she cannot escape, she chooses her moves to maximize the total number of moves until she is caught. The Queen chooses her moves optimally to try to catch Alice in as few total moves as possible.</p>

<p>Given the labyrinth&#39;s layout and the initial locations of both the Queen and Alice, find out whether Alice will be caught by the Queen and, if so, in how many moves.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow. Each test case starts with a line containing four integers $\mathbf{J}$, $\mathbf{C}$, $\mathbf{A}$, and $\mathbf{Q}$: the number of junctions, the number of corridors, the junction where Alice starts, and the junction where the Queen starts, respectively. Then, $\mathbf{C}$ lines follow. The $i$⁠-⁠th of these lines contains two integers $\mathbf{U_i}$ and $\mathbf{V_i}$, indicating that the $i$⁠-⁠th corridor bidirectionally connects junctions $\mathbf{U_i}$ and $\mathbf{V_i}$.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is <code>SAFE</code> if Alice can avoid being caught for $10^9$ total moves. Otherwise, $y$ is the total number of moves (including Alice&#39;s and the Queen&#39;s) that it takes for the Queen to catch Alice.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le \mathbf{A} \le \mathbf{J}$.</li>
	<li>$1 \le \mathbf{Q} \le \mathbf{J}$.</li>
	<li>$\mathbf{A} \ne \mathbf{Q}$.</li>
	<li>$1 \le \mathbf{U_i} \lt \mathbf{V_i} \le \mathbf{J}$, for all $i$.</li>
	<li>$(\mathbf{U_i}, \mathbf{V_i}) \ne (\mathbf{U_j}, \mathbf{V_j})$, for all $i \ne j$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the one pictured in the problem statement. Alice&#39;s optimal first move is to move to junction $4$.</p>

<p>Sample Case #2 is the same as Sample Case #1 but the Queen starts at junction $2$. The Queen can catch Alice by first announcing a move to junction $4$. If Alice were to move to junction $4$⁠, she would be caught in $2$ moves. Alice can evade capture for an extra $2$ moves by staying put and waiting until the Queen then moves to junction $5$ where she is located.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/1c552c7a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/1c552c7a.png" data-original-src="https://upload.acmicpc.net/cd71634e-4376-4337-90d0-d7713622e532/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #3, the Queen cannot reach Alice no matter what she does.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/c3636d57.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/c3636d57.png" data-original-src="https://upload.acmicpc.net/f9c515cc-da31-46e9-b505-0a6246dd20e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>In Sample Case #4, the Queen can begin by announcing that she will move to Alice&#39;s current junction. Alice has to move before then. If Alice moves to where the Queen already is, she gets caught immediately; if Alice remains in place, then she gets caught when the Queen moves. The second option is better, since it requires $2$ total moves (Alice&#39;s and the Queen&#39;s) instead of $1$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/04fc9fce.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/27824.%E2%80%85Wonderland%E2%80%85Chase/04fc9fce.png" data-original-src="https://upload.acmicpc.net/6805e1eb-a392-4ac6-97be-addb1d168a6e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>