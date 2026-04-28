# [Platinum III] Jigsaw Puzzle - 16071

[문제 링크](https://www.acmicpc.net/problem/16071)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 251, 정답: 45, 맞힌 사람: 38, 정답 비율: 20.994%

### 분류

구현

### 문제 설명

<p>You found a box with old games when cleaning up your attic, and among them was also a jigsaw puzzle. Unfortunately, the packaging was damaged, so a couple of puzzle pieces are scattered around the bottom of the box, and you suspect that some of the pieces may have been lost elsewhere. In fact, given the orderliness of your attic, some of the pieces in the box may even come from some entirely different puzzle! So now you have a pile of puzzle pieces lying in front of you and you are trying to assemble them into a solved puzzle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16071.%E2%80%85Jigsaw%E2%80%85Puzzle/9429b5e2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16071.%E2%80%85Jigsaw%E2%80%85Puzzle/9429b5e2.png" data-original-src="https://upload.acmicpc.net/738ba4e3-0783-48b5-8a81-fa17ff3fe260/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 244px; height: 167px;" /></p>

<p style="text-align: center;">Figure J.1: Illustration of the first sample.</p>

<p>More formally:</p>

<ul>
	<li>There are n square-shaped pieces, numbered from 1 to n, which need to be arranged side by side to form a single rectangle. All n pieces have to be used.</li>
	<li>The edges of the pieces are either straight or irregular. Straight edges must be placed on the boundary of the assembled rectangle and irregular edges must be placed on the inside.</li>
	<li>The irregular edges are all shaped differently, so that each edge shape occurs exactly two times, on two different puzzle pieces. Two pieces can only be placed next to each other if the shapes of the corresponding edges match.</li>
	<li>You may rotate the pieces, but you may not flip them over.</li>
</ul>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with one integer n (1 &le; n &le; 3 &middot; 10<sup>5</sup>), the number of pieces;</li>
	<li>n lines, each with four integers, the i-th line gives the connections (edge shapes) of the i-th piece in counter-clockwise order.</li>
</ul>

<p>A connection of type 0 stands for a straight edge. The other connection types are numbered with consecutive positive integers starting from 1 and each of them occurs exactly two times, on two different lines.</p>

### 출력

<p>If the pieces cannot be assembled as described above, output impossible. Otherwise, output the solved puzzle in the following format:</p>

<ul>
	<li>one line with two integers h, w (h, w &ge; 1, h &middot; w = n), the height and width of the grid;</li>
	<li>h lines, each with w integers, the numbers of the pieces.</li>
</ul>

<p>Any rotation of the correct solution will by accepted.</p>