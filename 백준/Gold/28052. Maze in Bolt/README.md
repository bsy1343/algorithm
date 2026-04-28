# [Gold II] Maze in Bolt - 28052

[문제 링크](https://www.acmicpc.net/problem/28052)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 105, 정답: 72, 맞힌 사람: 57, 정답 비율: 67.857%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Usain has an online store specializing in selling 3D puzzles made by 3D printers. One of the best-selling puzzles these days is the Maze in Bolt. This puzzle is composed of two parts: a screw-shaped piece with an embossed labyrinth engraved on it, and a nut. The inner part of the nut may contain tips. These tips make the nut slide only through the corridors of the labyrinth.</p>

<p>Initially, the two parts of the puzzle are separated. The challenge is to slide the nut all the way through the maze until it reaches the head of the bolt. The nut can be moved clockwise, counterclockwise, down (towards the head of the bolt), and up (away from the head). Each of these movements is only possible when every tip in the inner part of the nut is not prevented from sliding to the new position due to some wall of the maze. Besides the mentioned movements, another one is allowed: when the bolt and the nut are separated, the nut can be flipped. The illustration below shows both parts of the puzzle as well as all the allowed moves.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28052.%E2%80%85Maze%E2%80%85in%E2%80%85Bolt/d5d64b7f.png" data-original-src="https://upload.acmicpc.net/03c4e6e8-c577-4835-aec5-8f7d5d04684c/-/crop/142x359/0,107/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 71px; height: 180px;" /> 			 </td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28052.%E2%80%85Maze%E2%80%85in%E2%80%85Bolt/3cf96b51.png" data-original-src="https://upload.acmicpc.net/03c4e6e8-c577-4835-aec5-8f7d5d04684c/-/crop/138x91/325,190/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 69px; height: 46px;" /></td>
			<td><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28052.%E2%80%85Maze%E2%80%85in%E2%80%85Bolt/f1ac10a3.png" data-original-src="https://upload.acmicpc.net/03c4e6e8-c577-4835-aec5-8f7d5d04684c/-/crop/271x457/592,9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 135px; height: 228px;" /></td>
		</tr>
		<tr>
			<td>(a) Screw-shaped piece</td>
			<td>(b) Nut piece</td>
			<td>(c) Movements of the nut</td>
		</tr>
	</tbody>
</table>

<p>A customer placed an order for a large quantity of the Maze in Bolt. Each puzzle is designed by Usain himself in a random and unique way but, due to the size of the order and the tight deadline, he believes he will not be able to check whether the created puzzles have a solution or not. Usain asked for your help in devising an algorithm that quickly checks any given pair of nut and bolt. For doing so, the inner part of the nut will be modeled as a binary circular string. Regarding the bolt, each row of the maze will be modeled the same way.</p>

### 입력

<p>The first line contains two integers $R$ ($1 &le; R &le; 1000$) and $C$ ($3 &le; C &le; 100$), indicating respectively the number of rows and columns of the maze. The second line contains a circular string $S$ of length $C$, representing the inner part of the nut. Each character of $S$ is &ldquo;<code>1</code>&rdquo; if the nut has a tip in the corresponding position, while an empty space is indicated by character &ldquo;<code>0</code>&rdquo;. Each of the next $R$ lines contains a circular string describing a row of the maze. In this case, each character of the string is &ldquo;<code>1</code>&rdquo; if the maze has a wall in the corresponding position, while an empty space is indicated by character &ldquo;<code>0</code>&rdquo;. Rows are given from top (the tip of the bolt) to bottom (the head).</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;<code>Y</code>&rdquo; if the puzzle has a solution, and the uppercase letter &ldquo;<code>N</code>&rdquo; otherwise.</p>

### 힌트

<p>The picture below explains the first sample. Images on the left represent 3D views of different stages of the game. In the middle, the images are flattened 2D versions of the corresponding 3D views. Finally, images on the right represent the stages of the game according to the described model (although for the sake of clarity, each character &ldquo;<code>1</code>&rdquo; has been replaced by a given symbol, and each character &ldquo;<code>0</code>&rdquo; is shown as an empty space).</p>

<p>It can be seen in the top three images that the nut (having three pins) and the bolt start separated. The second group of three images shows the situation of the game after the nut has been moved four rows down (towards the head of the bolt). Then the nut is rotated one position, moved down two more rows, rotated four positions in the opposite direction, and finally moved down three rows, which solves the puzzle. Note that in this case the nut has not been flipped, nor moved up (away from the head of the bolt).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/28052.%E2%80%85Maze%E2%80%85in%E2%80%85Bolt/0caa3ae7.png" data-original-src="https://upload.acmicpc.net/2506a3ee-6eea-4daa-9fa5-659f60e896af/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 459px; height: 898px;" /></p>