# [Platinum I] Rooks - 8415

[문제 링크](https://www.acmicpc.net/problem/8415)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 31, 맞힌 사람: 22, 정답 비율: 73.333%

### 분류

수학, 그래프 이론, 선형대수학, 가우스 소거법

### 문제 설명

<p>ByteGuy Sponge University in Byteland has recently been leading in collegiate programming contests. Its best team - Byteland Vultures - won championships of the universe in this elite domain. Not only have they won all of the qualification rounds, but also each time they solved all problems long before the end of the contest (standard 5 hours). In order not to get bored, while other teams were trying to solve some problems, Byteland Vultures played the following game:</p>

<p>The first player takes a square board of dimensions <em>n</em>&nbsp;&times; <em>n</em>&nbsp;and removes some of its fields. The second player has to put <em>n</em>&nbsp;rooks onto the remaining fields of the board, obeying following rules:</p>

<ul>
	<li>a rook can be put only onto a field which has not been removed,</li>
	<li>there can be at most one rook on each field,</li>
	<li>no two rooks can check each other (in each row and each column there must be exactly one rook).</li>
</ul>

<p>This version of the game turned out to be too simple for the galactic champions, so they modified the rules in the following way. The players no longer place rooks. Instead, the are to find the number of ways to put&nbsp;<em>n</em>&nbsp;rooks onto the board obeying the above rules. The player who gives the correct answer first becomes the winner. The number of possible configurations can be huge, e.g. in case of a board with no fields removed, rooks can be positioned in <em>n</em>!&nbsp;ways. However, is that a problem for the champions of the universe? They perform all calculations in mind.</p>

<p>You might not be the world champion yet, so the task for you will be simpler. It is sufficient to write a program which determines whether the number of configurations of rooks is even or odd.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads description of the board,</li>
	<li>determines, if the number of configurations of rooks is even or odd.</li>
	<li>writes the answer.</li>
</ul>

### 입력

<p>The first line contains one natural number <em>t</em>&nbsp;- the number of boards (1 &le; <em>t</em> &le; 10). Following, there are <em>t</em>&nbsp;data sets. The first line of each data set consists of one natural number <em>n</em>&nbsp;- the dimension of the board (1 &le; <em>n</em> &le; 250). In the following&nbsp;<em>n</em>&nbsp;lines there are descriptions of consecutive rows of the board. In each of these rows there are&nbsp;<em>n</em>&nbsp;numbers from the set {0, 1}, separated with single spaces. The number 0&nbsp;means that a given field has been removed, while 1&nbsp;means that a rook can be put onto this field.</p>

### 출력

<p>Your program should write <em>t</em>&nbsp;integers, each of them in a separate line. The <em>i</em>-th line should contain exactly one number 0&nbsp;or 1.&nbsp;0, if the number of configurations of rooks for the <em>i</em>-th board is even, or 1&nbsp;otherwise.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8415.%E2%80%85Rooks/b3539206.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8415.%E2%80%85Rooks/b3539206.png" data-original-src="https://upload.acmicpc.net/b45f0527-0d6d-44a0-90c4-a59a1bb3c1de/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">The illustration of all possible configurations of rooks for the first board from the example input.</p>