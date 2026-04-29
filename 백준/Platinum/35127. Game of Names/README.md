# [Platinum II] Game of Names - 35127

[문제 링크](https://www.acmicpc.net/problem/35127)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 45, 정답: 21, 맞힌 사람: 19, 정답 비율: 54.286%

### 분류

게임 이론, 애드 혹

### 문제 설명

<p>Alice and Bob are playing a game on a board with a certain number of cells in a single row. Some (possibly none) of the cells have a player’s name written in them, either “Alice” or “Bob”. Other cells are initially blank.</p>

<p>Starting with Alice, the two players alternately take moves. In one move, the player in turn chooses a blank cell that does not have an adjacent cell with the player’s own name, and then writes the player’s name in the chosen blank cell. Note that the opponent’s name in an adjacent cell does not matter.</p>

<p>The player who cannot make a move loses the game. Given the initial state of the board, determine which of Alice and Bob will win when they play their best.</p>

### 입력

<p>The input contains one or more test cases. The first line of the input contains an integer $t$ ($1 ≤ t ≤ 2 \times 10^5$), which is the number of test cases. The descriptions of the $t$ test cases follow, each in the following format.</p>

<blockquote>
<p>$n$</p>

<p>$s$</p>
</blockquote>

<p>The integer $n$ represents the number of cells on the board ($1 ≤ n ≤ 2 \times 10^5$). The initial state of the board is given as a string $s$ of length $n$.</p>

<p>For each $i$ ($1 ≤ i ≤ n$), the $i$-th character $s_i$ of $s$ is either ‘<code>a</code>’, ‘<code>b</code>’, or ‘<code>.</code>’, and represents the initial state of the $i$-th cell from the left. Here, $s_i$ is ‘<code>a</code>’ if the $i$-th cell contains the name Alice, ‘<code>b</code>’ if it contains the name Bob, and ‘<code>.</code>’ if it is blank.</p>

<p>It is guaranteed that the initial board does not contain two adjacent cells with the same name.</p>

<p>The sum of $n$’s over all the test cases does not exceed $2 \times 10^5$.</p>

### 출력

<p>For each test case, output <code>alice</code> if Alice wins and <code>bob</code> if Bob wins, in one line.</p>