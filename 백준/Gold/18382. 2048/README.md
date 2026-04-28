# [Gold V] 2048 - 18382

[문제 링크](https://www.acmicpc.net/problem/18382)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 133, 정답: 78, 맞힌 사람: 57, 정답 비율: 60.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>2048 is a sliding block puzzle game. The game&#39;s objective is to slide numbered tiles on a grid to combine them to create a tile with the number 2048. It is played on a 4&times;4 grid, with numbered tiles that slide smoothly when the player moves them using the four arrow keys. Every turn, a new tile will randomly appear in an empty spot on the board with a value of either 2 or 4. Tiles slide as far as possible in the chosen direction until they are stopped by either another tile or the edge of the grid. If two tiles of the same number collide while moving, they will merge into a tile with the total value of the two tiles that collided. The resulting tile cannot merge with another tile again in the same move. The user&#39;s score starts at zero, and is incremented whenever two tiles combine, by the value of the new tile.</p>

<p>Write a program that takes the current user score, M number of moves and random appeared numbers (and their location on grid) and the current grid values as inputs and print the final score of the user.</p>

### 입력

<p>First line contains current user score. 0 &le;&nbsp;S &le; 500</p>

<p>Next line contains M next moves. 0 &le;&nbsp;M &le; 10</p>

<ul>
	<li>[move][2|4][at-row][at-column] eg: L200, Left arrow is pressed and then a new 2 is appeared at 0x0</li>
	<li>Move: L for left, U for up, R for right, D for down</li>
</ul>

<p>Next line contains current grid content in a flatten string.</p>

<ul>
	<li>From top left (0x0) to right bottom (3x3)</li>
	<li>Value can be 2,4,8,16,32,64,128,256,512, or 0 (zero indicate empty cell) separated by space.</li>
</ul>

### 출력

<p>Print the user score after given moves.</p>

### 힌트

<p>Note the user score is 200</p>

<p>The below is 2048 grid for the input &quot;0 2 0 0 0 4 0 0 2 8 2 0 8 32 16 2&quot;:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/e37905fd.png" data-original-src="https://upload.acmicpc.net/27fc8e52-03ca-4193-9e73-bbc64d5c9eef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 136px; height: 132px;" /></p>

<p>Input moves are: L213,D202,R211,D210,D200,D212,R410,R200,D401,L212</p>

<table class="table table-bordered" style="width:100%;">
	<tbody>
		<tr>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/36f182b0.png" data-original-src="https://upload.acmicpc.net/f719c16b-6c86-46f5-bdf3-bfbff28d72e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 125px;" /></td>
			<td style="width: 34%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/844e8577.png" data-original-src="https://upload.acmicpc.net/fc4af662-a0d1-479d-b668-02cc5b716a04/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 128px; height: 128px;" /></td>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/356770a1.png" data-original-src="https://upload.acmicpc.net/7324d1e2-a51e-4032-bea9-3c86cce391c2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 129px;" /></td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;">
			<p>L213: 			Left, a new 2 at 1x3 			No merge</p>
			</td>
			<td style="width: 34%; text-align: center;">D202: 			Down, a new 2 at 0x2 			<u><strong>4</strong></u> at 3x3</td>
			<td style="width: 33%; text-align: center;">R211: 			Right, a new 2 at 1x1 			<u><strong>4</strong></u> at 0x3</td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/55ea64de.png" data-original-src="https://upload.acmicpc.net/31f8e414-94d0-4a2c-9c8f-7dc0ba2457bd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 126px; height: 127px;" /></td>
			<td style="width: 34%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/bf061026.png" data-original-src="https://upload.acmicpc.net/ea4bafdc-8f98-499d-9e94-83602db029ad/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 126px; height: 128px;" /></td>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/57ea814a.png" data-original-src="https://upload.acmicpc.net/c828e66a-e7e0-4c99-9579-1d2346d72fd2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 128px;" /></td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;">D210: 			Down, a new 2 at 1x0 			<u><strong>8</strong></u> at 1x3, <strong><u>4</u></strong> at 2x1</td>
			<td style="width: 34%; text-align: center;">D200: 			Down, a new 2 at 0x0 			No merge</td>
			<td style="width: 33%; text-align: center;">D212: 			Down, a new 2 at 1x2 			<u><strong>4</strong></u> at 2x0</td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/b4b31650.png" data-original-src="https://upload.acmicpc.net/25a230b0-8a12-437a-bba1-cfd664255833/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 124px; height: 126px;" /></td>
			<td style="width: 34%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/bff3fa03.png" data-original-src="https://upload.acmicpc.net/a9605280-8e01-4f24-86d1-c1bb4581d1f0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 124px; height: 124px;" /></td>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/39dc87c4.png" data-original-src="https://upload.acmicpc.net/d2c40967-d1d9-49d2-a21f-681c6abfb2c2/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 122px; height: 125px;" /></td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;">R410: 			Right, a new 4 at 1x0 			<u><strong>8</strong></u> at 2x1</td>
			<td style="width: 34%; text-align: center;">R200: 			Right, a new 2 at 0x0 			<u><strong>16</strong></u> at 2x2</td>
			<td style="width: 33%; text-align: center;">D401: 			Down, a new 4 at 0x1 			<u><strong>32</strong></u> a 3x2</td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18382.%E2%80%852048/73cb3720.png" data-original-src="https://upload.acmicpc.net/d07ec6c7-8ba6-4f5a-888e-5ca5094fa728/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 125px; height: 127px;" /></td>
			<td style="width: 34%; text-align: center;">&nbsp;</td>
			<td style="width: 33%; text-align: center;">&nbsp;</td>
		</tr>
		<tr>
			<td style="width: 33%; text-align: center;">L212: 			Left, a new 2 at 1x2 			<u><strong>4</strong></u> at 2x2, <u><strong>64</strong></u> at 3x1</td>
			<td style="width: 34%; text-align: center;">&nbsp;</td>
			<td style="width: 33%; text-align: center;">&nbsp;</td>
		</tr>
	</tbody>
</table>

<p>Add the merge scores together: 4 + 4 + 8 + 4 + 4 + 8 + 16 + 32 + 4 + 64 = 148</p>

<p>Add 148 to starting score: 200 + 148 = 348</p>