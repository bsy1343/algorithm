# [Gold III] Break a Prison - 30367

[문제 링크](https://www.acmicpc.net/problem/30367)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 41, 맞힌 사람: 38, 정답 비율: 77.551%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Jennifer is a software engineer at a Tech company. Her company decided to join ICPC (Inter-Company Prison breaking Contest) and she was chosen as a representative of the company.</p>

<p>In ICPC, every participant needs to escape from a prison. The prison can be represented as an $n \times m$ grid i.e. it has $n$ rows and $m$ columns of rooms. The room in the $i$-th row and $j$-th column in the prison is denoted as room $(i, j)$. Two rooms $(i_1, j_1)$ and $(i_2, j_2)$ are adjacent if and only if $|i_2 - i_1| + |j_2 - j_1| = 1$. Weirdly, there is an unlocked door between each pair of adjacent rooms. Some rooms in the prison are under surveillance. Participants can move to a room only if it&#39;s not under surveillance. A participant will start from a room. The goal of all participants is to reach an exit. It&#39;s guaranteed that the room with the exit and the room that participants start from are not under surveillance.</p>

<p>To show talents in the company, the CEO asked Jeniffer not to turn right during the contest. In other words, there should not be any two consecutive moves between rooms that fulfill the following condition.</p>

<p>Condition: Given that Jeniffer moved from room $(i_1, j_1)$ to $(i_2, j_2)$, and then she moved to room $(i_3, j_3)$. Then, $(i_2 - i_1) \times (j_3 - j_2) - (j_2 - j_1) \times (i_3 - i_2) = -1$ holds.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/61908384-f6f7-4df0-a27f-a4cce78bcc85/-/preview/" style="width: 266px; height: 271px;" /></p>

<p style="text-align: center;">Figure B.1. Example of allowed and denied moves</p>

<p>For example, in figure B.1., if the last move is along the dashed arrow, you cannot move downward but you can move the other three directions.</p>

<p>Note that U-turns are allowed with this condition.</p>

<p>As a Jeniffer&#39;s colleague, your mission is to write a program to find the minimum number of moves between rooms to reach the exit for her.</p>

### 입력

<p>The input consists of a single test case in the following format.</p>

<blockquote>
<p>$n$ $m$</p>

<p>$c_{1,1}c_{1,2}\dots c_{1,m}$</p>

<p>$c_{2,1}c_{2,2}\dots c_{2,m}$</p>

<p>$\vdots$</p>

<p>$c_{n,1}c_{n,2}\dots c_{n,m}$</p>
</blockquote>

<p>$n$ and $m$ represent the size of the prison, each of which is an integer between $2$ and $500$. $c_{i,j}$ ($1 \le i \le n$, $1 \le j \le m$) is a character that describes the status of a room in the $i$-th row and $j$-th column. The character is either</p>

<ul>
	<li>&lsquo;S&#39; which means a start room for a participant,</li>
	<li>&lsquo;E&#39; which means a room with an exit,</li>
	<li>&lsquo;.&#39; which means the room is not under surveillance, or</li>
	<li>&lsquo;#&#39; which means the room is under surveillance.</li>
</ul>

<p>It is guaranteed that &lsquo;S&#39; and &lsquo;E&#39; appear exactly once in the input respectively.</p>

### 출력

<p>Print the minimum number of moves between rooms for Jenniffer to reach the exit. If she cannot reach the exit, print $-1$.</p>

### 힌트

<p>In Sample Input 3, one of the optimal routes is below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1b49621d-44eb-4055-b19a-5e2dbbb11b70/-/preview/" style="width: 254px; height: 140px;" /></p>

<p style="text-align: center;">Figure B.2. The optimal route in Sample Input 3</p>