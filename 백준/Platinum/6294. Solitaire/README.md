# [Platinum II] Solitaire - 6294

[문제 링크](https://www.acmicpc.net/problem/6294)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 32, 맞힌 사람: 26, 정답 비율: 29.885%

### 분류

구현, 브루트포스 알고리즘, 집합과 맵, 중간에서 만나기

### 문제 설명

<p>Solitaire is a game played on a chessboard 8x8. The rows and columns of the chessboard are numbered from 1 to 8, from the top to the bottom and from left to right respectively.</p>

<p>There are four identical pieces on the board. In one move it is allowed to:</p>

<ul>
	<li>move a piece to an empty neighboring field (up, down, left or right),</li>
	<li>jump over one neighboring piece to an empty field (up, down, left or right).</li>
</ul>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6294.%E2%80%85Solitaire/cf48736b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/6294.%E2%80%85Solitaire/cf48736b.png" data-original-src="https://upload.acmicpc.net/8809564f-2d80-4bf0-bbb4-c057656ebe60/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 401px;" /></p>

<p>There are 4 moves allowed for each piece in the configuration shown above. As an example let&#39;s consider a piece placed in the row 4, column 4. It can be moved one row up, two rows down, one column left or two columns right.</p>

<p>Write a program that:</p>

<ul>
	<li>reads two chessboard configurations from the standard input,</li>
	<li>verifies whether the second one is reachable from the first one in at most 8 moves,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>Each of two input lines contains 8 integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>8</sub> separated by single spaces and describes one configuration of pieces on the chessboard. Integers a<sub>2j-1</sub> and a<sub>2j</sub> (1 &le; j &le; 4) describe the position of one piece -- the row number and the column number respectively.</p>

### 출력

<p>The output should contain one word YES if a configuration described in the second input line is reachable from the configuration described in the first input line in at most 8 moves, or one word NO otherwise.</p>