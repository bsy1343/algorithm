# [Platinum IV] Slagalica - 17045

[문제 링크](https://www.acmicpc.net/problem/17045)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 3, 맞힌 사람: 2, 정답 비율: 50.000%

### 분류

수학, 구현, 애드 혹, 정수론, 해 구성하기, 소인수분해

### 문제 설명

<p>Since he learnt how to solve the Rubik&#39;s cube, Jurica has also been interested in other puzzles of this kind and he recently created an enigmatic toy himself. We can imagine Jurica&rsquo;s puzzle as a triangular net in the form of a parallelogram whose nodes are arranged in N rows and M columns. The rows are labeled from 1 to N from the bottom up, and the columns are labeled 1 to M from left to right. Each node is denoted by coordinates (x, y), where x is the row and y is the column. Each node has a unique integer value between 1 and N&middot;M written in it, and the puzzle is considered solved when the first row contains numbers from 1 to M ordered from left to right, the second row contains numbers from M+1 to 2M in the same order, etc. The picture below shows a solved puzzle of 3 rows and 4 columns.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/394cd22f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/394cd22f.png" data-original-src="https://upload.acmicpc.net/bb7c5567-b02b-48d4-9a70-1c386b0d3ecf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 346px; height: 171px;" /></p>

<p>The layout of the puzzle can be changed in two ways:</p>

<ol>
	<li>By selecting the unit sized rhombus whose nodes are determined by the coordinates (x, y), (x+1, y), (x+1, y+1) and (x, y+1), and rotating the node values in the clockwise direction.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/b0609879.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/b0609879.png" data-original-src="https://upload.acmicpc.net/252312b2-5e7a-4811-a2ab-94455c7ae36f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 278px; height: 89px;" /></p>

<ol start="2">
	<li>By selecting a unit sized equilateral triangle whose nodes are determined by the coordinates (x, y), (x+1, y) and (x, y+1) and rotating of the node values in the clockwise direction.</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/99dc5afc.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/17045.%E2%80%85Slagalica/99dc5afc.png" data-original-src="https://upload.acmicpc.net/04579d89-97f6-4ee9-8653-34f2aa600a57/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 242px; height: 88px;" /></p>

<p>On one boring day, Jurica scrambled the puzzle, writing down the moves he had made on a piece of paper. This sequence of moves he called a mega-move, and explained the application of mega-move as the sequential application of the moves written on the paper. After that, he has repeatedly made the same mega-move several times. He noticed an unusual regularity soon. Starting from a solved puzzle, after exactly K mega-moves, the puzzle will again be solved (the first time since applying the mega-moves).</p>

<p>For given integers N, M and K, determine if there is a mega-move that will allow Jurica to solve the puzzle after exactly K repetition of that mega-move, and if so, print that sequence of moves. Note: The solution is not necessarily unique and does not have to be optimal in the number of the moves, but the number of moves is limited (see section Input).</p>

### 입력

<p>The first line contains three integers N, M (2 &le; N, M &le; 100) and K (2 &le; K &le; 10<sup>12</sup>), the numbers from the task description.</p>

### 출력

<p>If there is not such a mega-move that meet the conditions from the task, print -1 in the only line. Otherwise, print the number of moves B (1 &le; B &le; 500 000) in the first line and in the following B lines one move in the following form:</p>

<ul>
	<li>&quot;R x y&quot; (without the quotation marks) if it is a rotation of a rhombus (operation 1), or</li>
	<li>&quot;T x y&quot; (without the quotation marks) if it is a rotation of an equilateral triangle (operation 2),</li>
</ul>

<p>whereas the coordinate (x, y) represents the bottom left node of the rhombus or the triangle and it holds that 1 &le; x &lt; N and 1 &le; y &lt; M.</p>