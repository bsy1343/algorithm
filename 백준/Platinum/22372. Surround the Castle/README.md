# [Platinum II] Surround the Castle - 22372

[문제 링크](https://www.acmicpc.net/problem/22372)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 10, 맞힌 사람: 7, 정답 비율: 17.073%

### 분류

그래프 이론, 브루트포스 알고리즘, 최단 경로, 데이크스트라, 격자 그래프, 평면 그래프

### 문제 설명

<p>You just started a simulation game of the Age of Civil Wars! In this game, there is an infinite two-dimensional grid. Each cell in this grid is either a <em>plain cell</em>, a <em>castle cell</em> or a <em>moat cell</em>.</p>

<p>Your territory is a rectangle of cells that consists of $R$ rows and $C$ columns. Your territory now consists of only one castle cell and the other $RC - 1$ plain cells. You can change each plain cell to a moat cell by paying some costs depending on the cell.</p>

<p>To protect your castle cell from foreign enemies, you decided to <em>surround</em> your castle cell with moat cells. More precisely, your castle cell is considered surrounded by moat cells if any cell outside your territory can&#39;t be reached from your castle cell by repeatedly moving to a cell that is not your moat cell and is horizontally, vertically, or diagonally adjacent to the current cell.</p>

<p>Figures D-1 to D-3 show examples of your territories whose borders are depicted as bold rectangles. In Figure D-1 the moat cells, which are depicted as blue squares, surround the castle cell. On the other hand, in Figures D-2 and D-3 the moat cells don&#39;t surround the castle cells.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/19b68903.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/19b68903.png" data-original-src="https://upload.acmicpc.net/4e532d8a-c89f-402e-b217-ae886c07e8db/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 255px;" /></p>

<p style="text-align: center;">Figure D-1. An example of a castle cell surrounded by moat cells</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/8da6391a.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/8da6391a.png" data-original-src="https://upload.acmicpc.net/08fcc7f0-c245-4f8f-9d28-9eb41f7dce32/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 255px;" /></p>

<p style="text-align: center;">Figure D-2. An example of a castle cell not surrounded by moat cells</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/4eb7de09.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/22372.%E2%80%85Surround%E2%80%85the%E2%80%85Castle/4eb7de09.png" data-original-src="https://upload.acmicpc.net/e5ed250f-9b4b-43f0-894f-3a5e02e8fcf2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 255px;" /></p>

<p style="text-align: center;">Figure D-3. Another example of a castle cell not surrounded by moat cells</p>

<p>You are given the location of your castle cell and the cost to change each of the other plain cells to a moat cell. Find the minimum total cost to surround your castle cell with moat cells.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$R$ $C$</p>

<p>$a_{11}$ $\dots$ $a_{1C}$</p>

<p>$\vdots$</p>

<p>$a_{R1}$ $\dots$ $a_{RC}$</p>
</blockquote>

<p>$R$ and $C$ represent the number of rows and columns of your territory ($3 \le R \le 20$, $3 \le C \le 10^4$). Each $a_{ij}$ ($a_{ij} = -1$ or $1 \le a_{ij} \le 10^9$) gives the information of the cell of the $i$-th row and the $j$-th column of your territory. If it is $-1$, then the cell is your castle cell. Otherwise, the cell is initially a plain cell and $a_{ij}$ equals the cost to change it to a moat cell.</p>

<p>It is guaranteed that there is exactly one castle cell in the input. In addition, your castle cell never locates at the first row, the $R$-th row, the first column nor the $C$-th column. In other words, it is guaranteed that you can surround your castle cell with moat cells.</p>

### 출력

<p>Output the minimum total cost to surround your castle cell with moat cells.</p>