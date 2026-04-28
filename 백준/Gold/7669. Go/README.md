# [Gold V] Go - 7669

[문제 링크](https://www.acmicpc.net/problem/7669)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 64, 정답: 48, 맞힌 사람: 42, 정답 비율: 73.684%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색

### 문제 설명

<p>In the game of Go, two players alternate placing black and white stones on lattice points of an n &times; n grid, each attempting to surround as much territory (i.e., regions of unfilled lattice points) as possible. At the end of the game, the score for each player is the total area of the territory surrounded by his or her stones. Given the locations of black and white stones on a Go board at the end of a match, your task is to compute the score of each player in order to determine the winner.<sup>1</sup></p>

<p>Formally, two grid lattice points with coordinates (r, c) and (r&prime;, c&prime;) are adjacent if |r &minus; r&prime;| + |c &minus; c&prime;| = 1. A connected region of unfilled lattice points belongs to one player&rsquo;s territory if all adjacent filled lattice points contain stones belonging to that player (see Figure 1). Finally, a player&rsquo;s score consists of the number of unfilled lattice points in his or her territory.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7669.%E2%80%85Go/166feee8.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7669.%E2%80%85Go/166feee8.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7669/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:384px; width:374px" /></p>

<p style="text-align: center;">Figure 1: Diagram of a 9 &times; 9 Go board. Unfilled lattice points belonging to black&rsquo;s territory are marked with B, and unfilled lattice points belonging to white&rsquo;s territory are marked with W. Neutral unfilled lattice points are unmarked. In the game above, white wins by 21 &minus; 3 = 18.</p>

<p><sup>1</sup>Note that the scoring of Go boards described here does not correspond exactly to the real game of Go: we make the simplifying assumptions that all &ldquo;disputes&rdquo; have been settled so that any terri</p>

### 입력

<p>The input test file will contain multiple cases, each consisting of three lines. Each test case begins with a line containing three integers, n (where 1 &le; n &le; 19), b, and w (where b &ge; 0, w &ge; 0 and 1 &le; b + w &le; n 2 ). Here, n denotes the size of the board, b is the number of black pieces placed, and w is the number of white pieces placed. The second line of each test case contains b pairs of integers r<sub>1</sub> c<sub>1</sub> . . . r<sub>b</sub> c<sub>b</sub> (where 1 &le; r<sub>i</sub> , c<sub>i</sub> &le; n) indicating the positions of the b black stones. The third line of each test case contains w pairs of integers r&prime;<sub>1</sub> c&prime;<sub>1</sub> . . . r&prime;<sub>w</sub> c&prime;<sub>w</sub> (where 1 &le; r&prime;<sub>i</sub> , c&prime;<sub>i</sub> &le; n) indicating the positions of the w white stones. No two stones will be located at the same lattice point. Input is terminated by a single line containing only the number 0; do not process this line.</p>

### 출력

<p>For each test case, print either &ldquo;White wins by ______&rdquo;, &ldquo;Black wins by ______&rdquo;, or &ldquo;Draw&rdquo;.</p>