# [Platinum II] Cell Game - 26857

[문제 링크](https://www.acmicpc.net/problem/26857)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 28, 맞힌 사람: 26, 정답 비율: 43.333%

### 분류

애드 혹, 해 구성하기, 다이나믹 프로그래밍, 게임 이론, 배낭 문제

### 문제 설명

<p>Two brothers, Aldo and Bondan, are stuck in their home as their city is going into lockdown again due to the worsening situation of the COVID-19 pandemic. They have finished their semester and are on holiday, but what kind of holiday can you enjoy if you cannot get out of your house. However, boredom does spark creativity. They created a new game during their boring holiday.</p>

<p>The game is played on a board of R rows and C columns where each cell contains zero or one token. Each token is painted with one of the 26 colors that is represented by a character from &lsquo;a&rsquo; to &lsquo;z&rsquo;. There is at least one token on the board.</p>

<p>Two opposing players play alternatingly. In their turn, the player chooses one token and move it to a not necessarily empty adjacent cell (i.e. in north, south, west, or east direction). A move is a good move if and only if the player moves a token of color x to a cell that already contains a token of the same color x. The objective of the game is to have as many good moves as possible. The player with strictly more good moves wins the game. If both players have the same number of good moves, then it&rsquo;s a tie and no one wins.</p>

<p>This game can be played indefinitely. However, Aldo and Bondan agree to play it for a total of 10<sup>100</sup> moves for both with Aldo having the first move.</p>

<p>Bondan thinks that this kind of game is boring, so he decides to play it lazily. Whenever it is Bondan&rsquo;s turn, he will choose the same token that has just been moved by Aldo in his last previous turn, and move that token to an adjacent cell uniformly at random.</p>

<p>Despite that, Bondan doesn&rsquo;t like to lose. Before the game starts, he might need to alter the board by changing the board size or moving the tokens&rsquo; initial location such that there is exactly zero chance for Aldo to win the game even though Bondan plays lazily. Specifically, the board can be extended from R &times; C into R&#39; &times; C&#39; where R&#39; &ge; R and C&#39; &ge; C, and each token&rsquo;s initial location can be moved to another cell while ensuring that each cell contains at most one token. No token can be discarded and no new token can be added to the board.</p>

<p>Your task in this problem is to find a new board setting such that there is zero chance for Aldo (the first player) to win the game with a total of 10100 played moves although Bondan plays it lazily. The new board setting should have a minimum total number of cells. If there is more than one solution, you only need to output (any) one of them.</p>

### 입력

<p>Input begins with a line containing two integers R C (1 &le; R, C &le; 1000) representing the initial number of rows and the number of columns in the board, respectively. It is guaranteed that there are at least 2 cells on the board. Each of the next R lines contains C characters representing the initial board condition. The character &lsquo;<code>.</code>&rsquo; represents an empty cell while a character from the lowercase alphabets (&lsquo;<code>a-z</code>&rsquo;) represents a token with such a color. It is guaranteed that there is at least 1 token on the board.</p>

### 출력

<p>Output begins with a line containing two integers R&#39; C&#39; representing the number of rows and the number of columns in the new board, respectively. Each of the next R&#39; lines contains C&#39; characters representing the new board condition. The character &lsquo;<code>.</code>&rsquo; represents an empty cell while a character from the lowercase alphabets (&lsquo;<code>a-z</code>&rsquo;) represents a token with such a color. The new board should guarantee a zero chance for Aldo (the first player) to win the game with a total of 10<sup>100</sup> played moves although Bondan plays it lazily. It should have a minimum total number of cells and should have the same set of tokens as the initial board.</p>