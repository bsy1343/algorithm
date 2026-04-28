# [Gold IV] Jigsaw Puzzles for Computers - 22822

[문제 링크](https://www.acmicpc.net/problem/22822)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 10, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>Ordinary Jigsaw puzzles are solved with visual hints; players solve a puzzle with the picture which the puzzle shows on finish, and the diverse patterns of pieces. Such Jigsaw puzzles may be suitable for human players, because they require abilities of pattern recognition and imagination.</p>

<p>On the other hand, &quot;Jigsaw puzzles&quot; described below may be just the things for simple-minded computers.</p>

<p>As shown in&nbsp;<b>Figure 1</b>, a puzzle is composed of nine square pieces, and each of the four edges of a piece is labeled with one of the following eight symbols:</p>

<p><b>&quot;R&quot;, &quot;G&quot;, &quot;B&quot;, &quot;W&quot;, &quot;r&quot;, &quot;g&quot;, &quot;b&quot;</b>, and&nbsp;<b>&quot;w&quot;.</b></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/76a93806.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/76a93806.png" data-original-src="https://upload.acmicpc.net/c6ed9c85-f68e-4fe3-a77a-86e47001a1d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><b>Figure 1</b>: The nine pieces of a puzzle</p>

<p>In a completed puzzle, the nine pieces are arranged in a 3 x 3 grid, and each of the 12 pairs of edges facing each other must be labeled with one of the following four combinations of symbols:</p>

<p><b>&quot;R&quot;</b>&nbsp;with&nbsp;<b>&quot;r&quot;</b>,&nbsp;<b>&quot;G&quot;</b>&nbsp;with&nbsp;<b>&quot;g&quot;</b>,&nbsp;<b>&quot;B&quot;</b>&nbsp;with&nbsp;<b>&quot;b&quot;</b>, and&nbsp;<b>&quot;W&quot;</b>&nbsp;with&nbsp;<b>&quot;w&quot;</b>.</p>

<p>For example, an edge labeled&nbsp;<b>&quot;R&quot;</b>&nbsp;can only face an edge with&nbsp;<b>&quot;r&quot;</b>.&nbsp;<b>Figure 2</b>&nbsp;is an example of a completed state of a puzzle. In the figure, edges under this restriction are indicated by shadowing their labels. The player can freely move and rotate the pieces, but cannot turn them over. There are no symbols on the reverse side of a piece !</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/5f299613.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/5f299613.png" data-original-src="https://upload.acmicpc.net/6f3f612b-2067-417e-b8c4-b89d303e5b3a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><b>Figure 2</b>: A completed puzzle example</p>

<p>Each piece is represented by a sequence of the four symbols on the piece, starting with the symbol of the top edge, followed by the symbols of the right edge, the bottom edge, and the left edge. For example,&nbsp;<b>gwgW</b>&nbsp;represents the leftmost piece in&nbsp;<b>Figure 1</b>. Note that the same piece can be represented as&nbsp;<b>wgWg</b>,&nbsp;<b>gWgw</b>&nbsp;or&nbsp;<b>Wgwg</b>&nbsp;since you can rotate it in 90, 180 or 270 degrees.</p>

<p><b>The mission for you</b>&nbsp;is to create a program which counts the number of solutions. It is needless to say that these numbers must be multiples of four, because, as shown in&nbsp;<b>Figure 3</b>, a configuration created by rotating a solution in 90, 180 or 270 degrees is also a solution.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/57d6c537.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22822.%E2%80%85Jigsaw%E2%80%85Puzzles%E2%80%85for%E2%80%85Computers/57d6c537.png" data-original-src="https://upload.acmicpc.net/c690360d-72bc-45c6-b4a0-945d3634f314/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><b>Figure 3</b>: Four obvious variations for a completed puzzle</p>

<p>A term&nbsp;<u>&quot;rotationally equal&quot;</u>&nbsp;is defined; if two different pieces are identical when one piece is rotated (in 90, 180 or 270 degrees), they are rotationally equal. For example,&nbsp;<b>WgWr</b>&nbsp;and&nbsp;<b>WrWg</b>&nbsp;are rotationally equal.</p>

<p>Another term&nbsp;<u>&quot;rotationally symmetric&quot;</u>&nbsp;is defined; if a piece is rotationally equal to itself, it is rotationally symmetric. For example, a piece&nbsp;<b>gWgW</b>&nbsp;is rotationally symmetric.</p>

<p>Given puzzles satisfy the following three conditions:</p>

<ol>
	<li>There is no identical pair of pieces in a puzzle.</li>
	<li>There is no&nbsp;<u>rotationally equal</u>&nbsp;pair of pieces in a puzzle.</li>
	<li>There is no&nbsp;<u>rotationally symmetric</u>&nbsp;piece in a puzzle.</li>
</ol>

### 입력

<p>The input consists of multiple puzzles.</p>

<pre>
<i>N</i>
<i>Puzzle</i><sub>1</sub>
<i>Puzzle</i><sub>2</sub>
<i>. . .</i>
<i>Puzzle<sub>N</sub></i>
</pre>

<p><i>N</i>&nbsp;is the number of puzzles. Each&nbsp;<i>Puzzle<sub>i</sub></i>&nbsp;gives a puzzle with a single line of 44 characters, consisting of four-character representations of the nine pieces of the puzzle, separated by a space character. For example, the following line represents the puzzle in&nbsp;<b>Figure 1</b>.</p>

<pre>
<code>gwgW RBbW GWrb GRRb BWGr Rbgw rGbR gBrg GRwb</code>
</pre>

### 출력

<p>For each&nbsp;<i>Puzzle<sub>i</sub></i>&nbsp;, the number of its solutions should be the output, each in a separate line.</p>