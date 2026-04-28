# [Bronze I] Pac-Man - 20246

[문제 링크](https://www.acmicpc.net/problem/20246)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 169, 정답: 88, 맞힌 사람: 82, 정답 비율: 53.947%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Pac-Man is a maze-chase video game developed in 1980s. The player controls the character &ldquo;Pac-Man&rdquo; to eat dots in a maze while avoiding enemy characters &ldquo;ghosts.&rdquo; All characters may move in four directions: up, down, left, right. The game ends when one of the following two conditions is met:</p>

<ol>
	<li>Pac-Man eats all dots in the maze. In this case, the player wins.</li>
	<li>A ghost catches Pac-Man. In this case, the player loses.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/20246.%E2%80%85Pac-Man/1a105df9.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/20246.%E2%80%85Pac-Man/1a105df9.png" data-original-src="https://upload.acmicpc.net/66a2a5f4-3947-4b16-a9b1-da78165b71bf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">Figure 1: Pac-Man gameplay (image from <a href="https://en.wikipedia.org/wiki/File:Pac-man.png">Wikipedia</a>)</p>

<p>Adam is learning how to create games with modern programming tools. To practice the skills, he tries to reproduce the Pac-Man game with some modification. In Adam&rsquo;s game, the playable character is a &ldquo;ghost,&rdquo; and the enemy character is &ldquo;Pac-Man.&rdquo; Since he changes the roles of the ghost and Pac-Man, he also changes the ending conditions of the game.</p>

<ol>
	<li>Pac-Man eats all dots in the maze. In this case, the player loses.</li>
	<li>The ghost controlled by the player catches Pac-Man. In this case, the player wins.</li>
</ol>

<p>Adam has almost developed the first full functioning version of his game. He wants to test his game and creates a simple stage for testing. The maze of the stage is based on a 10-by-10 grid. We label the cell at the intersection of row r and column c with (r, c). In this problem, rows and columns are numbered from 0 to 9. Each grid cell contains exact one dot. The exterior boundary of the grid are walls. No characters may move to the area outside of the grid. Inside the grid, there are no walls or obstacles. All characters may move freely from a cell to any cell adjacent to it. Note that two grid cells (r<sub>1</sub>, c<sub>1</sub>) and (r<sub>2</sub>, c<sub>2</sub>) are adjacent to each other if and only if |r<sub>1</sub> &minus; r<sub>2</sub>| + |c<sub>1</sub> &minus; c<sub>2</sub>| = 1.</p>

<p>Adam has to prepare the movements of Pac-Man for the testing. He needs a set of Pac-Man&rsquo;s trajectories with diversity, but any trajectory must satisfy the following requirements.</p>

<ul>
	<li>Pac-Man eats all dots in the maze if it follows the trajectory.</li>
	<li>Pac-Man moves at most 10000 steps.</li>
</ul>

<p>Adam needs your help to generate a trajectory starting at cell (x, y). Please write a program to generate a trajectory of Pac-Man satisfying all requirements above and starting at cell (x, y).</p>

### 입력

<p>The input has exactly one line which consists of two space-separated integers x and y. You are asked to generate a trajectory starting at cell (x, y).</p>

### 출력

<p>You must output a requested trajectory in the following format: The trajectory is represented by m + 1 lines where m is the number of steps of the trajectory. The i-th line contains two integers r<sub>i</sub> and c<sub>i</sub> separated by exactly one space. The trajectory starts at the cell (r<sub>1</sub>, c<sub>1</sub>), and Pac-Man will be in cell (r<sub>i</sub>, c<sub>i</sub>) after moving i &minus; 1 steps along the trajectory for 1 &lt; i &le; m + 1.</p>

<p>If there are multiple solutions, then you may output any of them.</p>

### 제한

<ul>
	<li>m &le; 10000</li>
	<li>x, y, r<sub>i</sub>, c<sub>i</sub> &isin; {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} for all i &isin; {1, 2, . . . , m + 1}.</li>
	<li>Cells (r<sub>i</sub>, c<sub>i</sub>) and (r<sub>i+1</sub>, c<sub>i+1</sub>) are adjacent to each other for all i &isin; {1, 2, . . . , m}.</li>
	<li>{(r<sub>1</sub>, c<sub>1</sub>)} &cup; {(r<sub>2</sub>, c<sub>2</sub>)} &cup; &middot; &middot; &middot; &cup; {(r<sub>m+1</sub>, c<sub>m+1</sub>)} = {(r, c) : r &isin; {0, 1, . . . , 9}, c &isin; {0, 1, . . . , 9}}</li>
</ul>