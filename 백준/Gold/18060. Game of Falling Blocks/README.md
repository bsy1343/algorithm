# [Gold IV] Game of Falling Blocks - 18060

[문제 링크](https://www.acmicpc.net/problem/18060)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 33, 맞힌 사람: 26, 정답 비율: 38.235%

### 분류

애드 혹

### 문제 설명

<p>In this problem you have to program a simple AI for the game Tetris. The objective is simple: complete at least one row. More specifically, for the purposes of this problem we play Tetris according to the following modified set of rules:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18060.%E2%80%85Game%E2%80%85of%E2%80%85Falling%E2%80%85Blocks/b84b21b2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18060.%E2%80%85Game%E2%80%85of%E2%80%85Falling%E2%80%85Blocks/b84b21b2.png" data-original-src="https://upload.acmicpc.net/c8ffd815-d5f0-4da8-9543-f2497b51ad61/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 482px; height: 89px;" /></p>

<p style="text-align: center;">Figure G.1: The seven tetrominoes in their initial orientations.</p>

<ul>
	<li>The playing area is a grid of height 20 and width 10, initially empty.</li>
	<li>One by one, the game presents the player with a random sequence of tetromino shaped pieces, as seen in Figure G.1. The game uses a bag randomiser for this, that is, the first seven pieces are all distinct, then the next seven pieces are distinct, and so on.</li>
	<li>The player may shift each piece sideways and rotate it by multiples of 90 degrees. These adjustments take place <strong>above</strong> the grid.</li>
	<li>The piece then drops down into the playing area and locks into place as soon as some part of it cannot drop any further because part of some previous piece is in the way. It is <strong>not</strong> possible to shift or rotate the piece during the drop.</li>
	<li>The game ends as soon as one of the following happens:
	<ul>
		<li>A horizontal row of the grid is fully occupied by tetromino tiles, the player wins.</li>
		<li>Some piece does not fully drop into the grid, the player loses.</li>
	</ul>
	</li>
</ul>

### 입력



### 출력



### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18060.%E2%80%85Game%E2%80%85of%E2%80%85Falling%E2%80%85Blocks/efe97756.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/18060.%E2%80%85Game%E2%80%85of%E2%80%85Falling%E2%80%85Blocks/efe97756.png" data-original-src="https://upload.acmicpc.net/e7c7ebfd-dac1-4600-9fc5-7695c0590dfc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 285px; height: 176px;" /></p>

<p style="text-align: center;">Figure G.2: Illustration of the example interaction.</p>