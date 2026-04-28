# [Gold II] Emergency Exit - 25272

[문제 링크](https://www.acmicpc.net/problem/25272)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 5, 맞힌 사람: 4, 정답 비율: 23.529%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Patrick wants to organize a big event in the computer rooms at KTH. He has set up posters and sent out invitations, and it looks like quite a large crowd of people will show up. Now Patrick has to deal with an unexpected problem: fire safety regulations. People must be able to get out fast enough in case of an emergency, so only a certain number of people are allowed in the computer rooms, and it looks like Patrick&#39;s event will exceed this number. But Patrick has not given up, he wants to prove that everyone can still get out fast enough if they behave optimally.</p>

<p>The building can be represented by an $N \times M$ grid where some cells are blocked and others are empty. There will be <em>exactly one</em> door to the building. This means that one cell on the edge of the grid is empty and the rest are blocked. Some empty cells have people in them. In one time step, a person can move to an empty cell that shares a side with the cell they are currently in. It is also possible to not move in a time step. Everyone moves simultaneously, and no two people may occupy the same cell at the end of a time step. When someone exits the grid (through the one door), they disappear and can no longer collide with other people.</p>

<p>Your task is to calculate the minimum time to get everybody out, and instruct the people to move in such a way to make this happen.</p>

### 입력

<p>The first line contains two integers $N$ and $M$ ($3 \leq N, M \leq 100$), the number of rows and columns in the grid.</p>

<p>The following $N$ lines each contains a string of length $M$, representing each row of the grid. An empty cell without a person is denoted by &quot;<code>.</code>&quot;, a person is denoted by &quot;<code>P</code>&quot;, and a blocked cell is denoted by &quot;<code>#</code>&quot;.</p>

<p>Every cell on the edge of the grid will be blocked except for exactly one. The number of people in the grid will be between $1$ and $100$.</p>

### 출력

<p>If it is impossible for everyone to get out (i.e. someone is stuck inside the building), print one line with <code>-1</code>.</p>

<p>Otherwise, print one line with the integer $S$, the number of seconds it takes to get everyone out. Let $K$ be the number of people in the grid. Print $K$ lines each containing one string of length $S$ consisting of the characters &quot;<code>U</code>&quot; (up), &quot;<code>D</code>&quot; (down), &quot;<code>R</code>&quot; (right), &quot;<code>L</code>&quot; (left), &quot;<code>.</code>&quot; (wait). This string represents the actions the $i$-th person should take. The people are considered in the order they appear in the input, if the input grid is read row by row from left to right. When a person has exited the grid, give them wait instructions for the remaining time.</p>