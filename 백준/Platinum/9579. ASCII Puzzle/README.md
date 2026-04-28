# [Platinum I] ASCII Puzzle - 9579

[문제 링크](https://www.acmicpc.net/problem/9579)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 81, 정답: 17, 맞힌 사람: 16, 정답 비율: 21.333%

### 분류

구현

### 문제 설명

<p>Fili and Floi play a puzzle game. Fili takes a rectangular piece of paper that is lined with a W &times; H grid of square cells, cuts it into pieces on its grid lines, and carefully shuffles the pieces so that pieces do not rotate. Floi has to recombine the pieces back into the rectangle without rotating them.</p>

<p>Fili observes a number of constraints while cutting an original paper into pieces to make sure that the resulting puzzle is well-formed. First of all, Fili picks three integer numbers w, h, and n, so that an original rectangular paper has a width of W = wn cells and a height of H = hn cells. Here w and h are known to Floi, but n, W, and H are not. This way, the original rectangular piece of paper can be cut into a trivial puzzle of k = n<sup>2</sup> rectangles with a width of w cells and a height of h cells each. However, this trivial puzzle for k &gt; 1 is not considered a well-formed puzzle for this game. Instead, the pieces int which the original rectangle is cut are based on these trivial w &times; h cell rectangles with the jagged edges between the adjacent pieces. Formally, the pieces into which the original W &times; H paper is cut satisfy the following constraints of a well-formed puzzle:</p>

<ul>
	<li>There are k = n<sup>2</sup> pieces.</li>
	<li>Each piece is a simple 4-connected region of cells without holes.</li>
	<li>Each cell of the original rectangular W &times; H paper is a part of exactly one piece.</li>
	<li>Each piece contains four corners of the corresponding w &times; h rectangle in the trivial puzzle for the original paper.</li>
	<li>The cells of each piece can come only from the corresponding w &times; h rectangle in the trivial puzzle, from the cells adjacent to this rectangle, and from the interior cells of the adjacent rectangles in the trivial puzzle.</li>
	<li>The cut between two adjacent pieces cannot be straight. Only pieces that lie on the border of the original W &times; H paper have straight sides.</li>
</ul>

<p>The corollary of these constraints is that each piece of a well-formed puzzle fits into a rectangle of (3w &minus; 2) &times; (3h &minus; 2) cells. Moreover, the description of each piece will be given as a (3w &minus; 2) &times; (3h &minus; 2) grid of cells in such a way, that the corresponding w &times; h rectangle of the trivial puzzle is exactly in the center.</p>

<p>The picture below to the left shows a sample rectangular piece of paper that is lined with a W&times;H = 12&times;9 square grid of cells and is cut into a trivial puzzle of k = 9 rectangles with a width of w = 4 cells and a height of h = 3 cells each with bold dashed lines. The corners of the central 3 &times; 4 piece of this trivial puzzle are shown in black. They have to be a part of the central piece of any well-formed puzzle. The other potential cells of the central piece of a well-formed puzzle are shown in gray. The bold black line shows (3w &minus; 2) &times; (3h &minus; 2) = 10 &times; 7 rectangular region that will be describing this central piece. The picture to the right shows the same for the piece in the upper-right corner of the puzzle.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9579.%E2%80%85ASCII%E2%80%85Puzzle/98ec6286.png" data-original-src="https://www.acmicpc.net/upload/images2/neerc_a.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:236px; width:584px" /></p>

<p>Your task is to help Floi solve the puzzle.</p>

### 입력

<p>The first line of the input file contains there integers k, w and h. Here k is the number of pieces in the puzzle, w is a width and h is a height of a trivial puzzle piece (k = n<sup>2</sup> for 1 &le; n &le; 4, 3 &le; w, h &le; 5). The rest of the input file contains descriptions of k pieces of a well-formed puzzle. Each piece is described by 3h &minus; 2 lines that contain 3w &minus; 2 characters each. Pieces are labeled with a consecutive English letters in uppercase (1st piece &mdash; &lsquo;A&rsquo;, 2nd piece &mdash; &lsquo;B&rsquo;, and etc). Each piece description uses only two characters on its 3h &minus; 2 lines of 3w &minus; 2 characters. The English letter corresponding to the piece denotes a cell that is a part of this piece, while &lsquo;.&rsquo; (dot) character denotes a cell that is not.</p>

<p>Empty lines separate different pieces.</p>

### 출력

<p>The first line of the output file shall contain W and H &mdash; the size of the original piece of paper that was cut into the puzzle pieces. The following H lines shall contain W English letters each, describing the solution of the puzzle. Letters denote the cells that belong to the corresponding puzzle pieces. If there are multiple ways to solve the puzzle, then print any solution.</p>