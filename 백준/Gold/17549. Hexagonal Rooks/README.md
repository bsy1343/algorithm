# [Gold III] Hexagonal Rooks - 17549

[문제 링크](https://www.acmicpc.net/problem/17549)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 27, 맞힌 사람: 26, 정답 비율: 56.522%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>It is game night and Alice and Bob are playing chess. After beating Bob at chess several times, Alice suggests they should play a chess variant instead called hexagonal chess. Although the game is very rarely played nowadays, Alice knows the rules very well and has obtained a hexagonal chessboard from her subscription to the magazine of Bizarre Artifacts for Playing Chess.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/17549.%E2%80%85Hexagonal%E2%80%85Rooks/cbebdcfa.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/17549.%E2%80%85Hexagonal%E2%80%85Rooks/cbebdcfa.png" data-original-src="https://upload.acmicpc.net/0d61f10e-a32e-49d2-8eca-df34a8a98a57/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 548px; height: 291px;" /></p>

<p style="text-align: center;">Figure H.1: The field naming of the hexagonal chess board and the directions in which a rook can move.</p>

<p>The hexagonal chess board, shown above, consists of 91 hexagonal cells arranged in the shape of a hexagon with side length 6 as depicted in the above diagrams. The board is divided into 11 columns, each called a file, and the files are labeled a to k from left to right. It is also divided into 11 v-shaped rows, each called a rank, which are labeled 1 to 11 from bottom to top. The unique cell in file x and rank y is then denoted by the coordinate xy. For example, rank 11 contains only a single cell f11 and rank 7 is occupied entirely by the black player&rsquo;s pawns.</p>

<p>Alice begins by explaining how all the pieces move. The simplest piece is the rook, which can move an arbitrary positive number of steps in a straight line in the direction of any of its 6 adjacent cells, as depicted in the figure on the right. Bob immediately realises that the hexagonal rook already is more difficult to work with than its regular chess counterpart.</p>

<p>In order to attack one of the opponents pieces, it is useful to know which cells his rook can move to such that it attacks the opposing piece. The more of these cells there are, the more valuable the current position of his rook is. However, calculating this number is too much for Bob. After losing so many games of regular chess, Alice allows Bob to use a program to assist in his rook placement. While Alice explains the rest of the game you get busy coding.</p>

<p>As a small simplification, Bob will compute the number of ways his rook can move to the destination cell assuming there are no other pieces on the board, not even the piece he wants to attack.</p>

### 입력

<ul>
	<li>The input consists of one line, containing two different coordinates on the hexagonal chess board, the current positions of your rook and the piece you want to attack.</li>
</ul>

### 출력

<p>Output a single integer, the number of ways the rook can move from its current position to the position of the piece it wants to attack in exactly two moves, assuming there are no other pieces on the board.</p>