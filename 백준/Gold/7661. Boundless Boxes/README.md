# [Gold V] Boundless Boxes - 7661

[문제 링크](https://www.acmicpc.net/problem/7661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 39, 맞힌 사람: 31, 정답 비율: 60.784%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Remember the painter Peer from the 2008 ACM ICPC World Finals? Peer was one of the inventors of monochromy, which means that each of his paintings has a single color, but in different shades. He also believed in the use of simple geometric forms.</p>

<p>Several months ago, Peer was painting triangles on a canvas from the outside in. Now that triangles are out and squares are in, his newest paintings use concentric squares, and are created from the inside out! Peer starts painting on a rectangular canvas divided into a perfect square grid. He selects a number of single grid cells to act as central seeds, and paints them with the darkest shade. From each of the seed squares, Peer paints a larger square using a lighter shade to enclose it, and repeats with larger squares to enclose those, until the entire canvas is covered. Each square is exactly one grid cell larger and one shade lighter than the one it encloses. When squares overlap, the grid cell is always filled using the darker shade.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7661/1.png" style="height:396px; width:321px" /></p>

<p style="text-align: center;">Figure 1: Example of one of Peer&rsquo;s most recent works using six shades of color.</p>

<p>After Peer decides where to place the initial squares, the only difficult part in creating these paintings is to decide how many different shades of the color he will need. To help Peer, you must write a program that computes the number of shades required for such a painting, given the size of the canvas and the locations of the seed squares.</p>

### 입력

<p>The input test file will contain multiple cases. Each test case begins with a single line containing three integers, m, n, and s, separated by spaces. The canvas contains exactly m &times; n grid cells (1 &le; m,n &le; 1000), numbered 1,... ,m vertically and 1,... ,n horizontally. Peer starts the painting with s (1 &le; s &le; 1000) seed cells, described on the following s lines of text, each with two integers, r<sub>i</sub> and c<sub>i</sub> (1 &le; r<sub>i</sub> &le; m, 1 &le; c<sub>i</sub> &le; n), describing the respective grid row and column of each seed square. All seed squares are within the bounds of the canvas.</p>

<p>A blank line separates input test cases, as seen in the sample input below. A single line with the numbers &ldquo;0 0 0&rdquo; marks the end of input; do not process this case.</p>

### 출력

<p>For each test case, your program should print one integer on a single line: the number of different shades required for the painting described.</p>