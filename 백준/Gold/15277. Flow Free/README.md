# [Gold I] Flow Free - 15277

[문제 링크](https://www.acmicpc.net/problem/15277)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 22, 맞힌 사람: 22, 정답 비율: 62.857%

### 분류

백트래킹, 비트마스킹, 브루트포스 알고리즘, 구현

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/15277.%E2%80%85Flow%E2%80%85Free/d95f7827.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/15277.%E2%80%85Flow%E2%80%85Free/d95f7827.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15277/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:198px; margin-left:10px; width:196px" />Flow Free is a puzzle that is played on a 2D grid of cells, with some cells marked as endpoints of certain colors and the rest of cells being blank.</p>

<p>To solve the puzzle, you have to connect each pair of colored endpoints with a path, following these rules:</p>

<ul>
	<li>there is a path connecting two points with the same color, and that path also has that color</li>
	<li>all cells in the grid are used and each cell belongs to exactly one path (of the same color as the endpoints of the path)</li>
</ul>

<p>The rules imply that different colored paths cannot intersect.</p>

<p>The path is defined as a connected series of segments where each segment connects two neighbouring cells. Two cells are neighbours if they share a side (so all segments are either horizontal or vertical). By these definitions and rules above, each colored cell will be an endpoint of exactly one segment and each blank cell will be an endpoint of exactly two segments.</p>

<p>In this problem we will consider only the 4 &times; 4 puzzle, with 3 or 4 pairs of colored endpoints given.</p>

<p>Your task is to determine if a given puzzle is solvable or not.</p>

### 입력

<p>The input consists of 4 lines, each line containing 4 characters. Each character is from the set {R, G, B, Y, W} where W denotes the blank cells and the other characters denote endpoints with the specified color. You are guaranteed that there will be exactly 3 or 4 pairs of colored cells. If there are 3 colors in the grid, Y will be omitted.</p>

### 출력

<p>On a single line output either &ldquo;solvable&rdquo; or &ldquo;not solvable&rdquo; (without the quotes).</p>