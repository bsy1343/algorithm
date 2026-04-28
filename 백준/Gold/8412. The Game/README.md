# [Gold I] The Game - 8412

[문제 링크](https://www.acmicpc.net/problem/8412)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

해 구성하기

### 문제 설명

<p>The board consists of 2<em>n</em> + 1&nbsp;numbered fields. There are&nbsp;<em>n</em>&nbsp;black and&nbsp;<em>n</em>&nbsp;white pawns. The black pawns are located on&nbsp;<em>n</em>&nbsp;first fields of the board (the fields numbered from 1 to&nbsp;<em>n</em>), whereas the white pawns are located on the last&nbsp;<em>n</em>&nbsp;fields (the fields numbered from <em>n</em> + 2&nbsp;to 2<em>n</em> + 1). Initially, only the (<em>n</em> + 1)-th field is empty.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b3cd5a13-f7af-40f7-9486-d014c919aa2b/-/preview/" /><br />
<b>a.</b>&nbsp;the initial configuration of pawns on the board for <em>n</em> = 3&nbsp;and possible moves of the pawns<br />
<b>b.</b>&nbsp;the board after moving the white pawn from the field number 5 and possible moves of the pawns</p>

<p>During the game, two types of moves can be performed. The first one is a&nbsp;<i>shift</i>&nbsp;of a pawn to the adjacent free field. The second move -&nbsp;<i>jump</i>, consists of jumping over a single adjacent pawn of a different colour and landing on the free field.</p>

<p>The goal of the game is to exchange the positions of white and black pawns. In the other words, the black pawns have to be moved to the fields numbered from <em>n</em> + 2&nbsp;to 2<em>n</em> + 1, while the white pawns should be moved to the fields numbered from 1 to&nbsp;<em>n</em>. Find the shortest sequence of moves which accomplishes the goal of the game.</p>

<p>Write a program, which:</p>

<ul>
	<li>reads a number <em>n</em>&nbsp;denoting the number of white and black pawns,</li>
	<li>determines the shortest sequence of moves leading to the goal of the game,</li>
	<li>writes the answer.</li>
</ul>

### 입력

<p>The first and only line of standard input contains a single integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 100).</p>

### 출력

<p>The first line of standard output should contain number <em>m</em>&nbsp;denoting the minimal length of a sequence of moves leading to the goal of the game. Each of the following&nbsp;<em>m</em>&nbsp;lines should contain one integer from the range [1,2<em>n</em> + 1]. Integer from the line number (<em>i</em> + 1)&nbsp;(for 1 &le; <em>i</em> &le; <em>m</em>) defines the number of the field, from which the pawn is being moved during&nbsp;<em>i</em>-th move.</p>

<p>If there are many possible solutions, your program can output any of them.</p>