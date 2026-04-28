# [Platinum IV] Football - 20594

[문제 링크](https://www.acmicpc.net/problem/20594)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

기하학

### 문제 설명

<p>You are standing at position $(0, 0)$ on the plane and want to pass the ball to your teammate standing at $(x_t, y_t)$. Unfortunately, there is a player from the opposing team in position $(x_o, y_o)$ who wants to intercept this pass.</p>

<p>A player gets the ball at a certain moment if their positions on the plane coincide at that moment. Both players can move with speed $s_p$, and you can make the ball fly with constant speed $s_b$. Note that, at some moment, the ball will touch the ground and the friction will stop it, so there is no case when players can&#39;t catch the ball at all, but for simplicity we assume that it will happen far far away.</p>

<p>Your task is to determine whether you can make a pass to your teammate, that is, throw the ball so that your teammate gets to it faster than the opponent. Output &quot;<code>+</code>&quot; (without quotes) if you can make such a pass that your teammate will be the first to get the ball, &quot;<code>0</code>&quot; if you can&#39;t, but you can make such a pass that both players will get the ball simultaneously, and &quot;<code>-</code>&quot; otherwise.</p>

### 입력

<p>The first line contains an integer $n$ ($n \leq 10^5$): the number of test cases. Each of the following $n$ lines describes a separate test case and contains six integers $x_t, y_t, x_o, y_o, s_b, s_p$ ($-75 \leq x_t, y_t, x_o, y_o \leq 75$; $1 \leq s_b, s_p \leq 75$): coordinates of the teammate, coordinates of the opponent, and speeds of the ball and players, respectively. Your position, the teammate&#39;s position, and the opponent&#39;s position are pairwise different.</p>

### 출력

<p>Output $n$ answers on a single line without spaces.</p>