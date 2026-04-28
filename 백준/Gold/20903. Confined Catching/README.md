# [Gold I] Confined Catching - 20903

[문제 링크](https://www.acmicpc.net/problem/20903)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 40, 맞힌 사람: 33, 정답 비율: 39.759%

### 분류

해 구성하기, 게임 이론

### 문제 설명

<p>You are playing a board game against an AI on a square grid consisting of $n\times n$ cells. You have two game pieces and the AI has one, and each piece is placed in one of the grid cells. Your goal is to &quot;catch&quot; the AI&#39;s piece, that is, one (or both) of your pieces has to lie in the same cell as the AI&#39;s piece after one of your turns. When this happens, you win and the game ends. You lose if you have not won after 600 turns.</p>

<p>Each turn, you have up to five movement options per piece: You can move a piece up, down, left, or right to an adjacent cell (if there is one) or let the piece remain in its current cell. The AI has the same options for its piece in each of its turns. Of course, you can move your pieces completely independently from one another and even have them occupy the same cell.</p>

<p>Your goal is simple: Win the game! You can safely assume that this is always possible.</p>

### 입력

<p>Before it is your first turn, your program will receive:</p>

<ul>
	<li>One line with an integer $n$ ($3 \le n \le 100$), giving the size of the grid.</li>
	<li>One line with four integers $x_1,y_1,x_2,y_2$ ($1 \le x_1,y_1,x_2,y_2 \le n$), giving your pieces&#39; initial positions.</li>
	<li>One line with two integers $x,y$ ($1 \le x,y \le n$), giving the AI&#39;s piece&#39;s initial position.</li>
</ul>

<p>You can safely assume that your pieces do not lie in the same cell as the AI&#39;s piece (but they may lie in the same cell as each other).</p>

### 출력

