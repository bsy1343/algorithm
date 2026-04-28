# [Platinum IV] Rubik’s Revenge in ... 2D!? 3D? - 11642

[문제 링크](https://www.acmicpc.net/problem/11642)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 54, 정답: 19, 맞힌 사람: 13, 정답 비율: 30.952%

### 분류

양방향 탐색, 그래프 이론, 구현, 중간에서 만나기

### 문제 설명

<p>You are given a puzzle that can be represented as a 4 &times; 4 grid of colored cells. The solved puzzle contains 4 monochromatic rows, in this order: red, green, blue, yellow. Although we will analyze this puzzle using its 2D representation, it is actually a 3D puzzle! Imagine that the grid is stretched over a torus (in other words, top edge is connected to the bottom one and left edge is connected to the right one). If you are not familiar with the word &ldquo;torus&rdquo; or what it is supposed to represent, just replace it with the word(s) &ldquo;donut (with the hole in the middle)&rdquo;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11642.%E2%80%85Rubik%E2%80%99s%E2%80%85Revenge%E2%80%85in%E2%80%85...%E2%80%852D!%3F%E2%80%853D%3F/341c5f10.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11642/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:81px; width:309px" />For each move you are allowed to either move one row left or right, or one column up or down. The fact that the outer edges are connected means that if a cell is &ldquo;pushed out&rdquo; of the grid, it will reappear on the other side of the grid. If you had a torus or a donut handy (or a cup! HAHAha...ha... &lt;sniff&gt;), this would be much clearer.</p>

<p>Given a description of a state of this puzzle, what is the minimum number of moves you need to solve it? Note that all possible puzzle configurations are solvable in less than 13 moves.</p>

### 입력

<p>Input file contains exactly 4 lines, containing 4 characters each, each character being either &ldquo;R&rdquo;, &ldquo;G&rdquo;, &ldquo;B&rdquo; or &ldquo;Y&rsquo;. The input will describe a valid state of the puzzle.</p>

### 출력

<p>Output the minimum number of moves needed to solve the given puzzle.</p>