# [Gold V] Black and White - 11467

[문제 링크](https://www.acmicpc.net/problem/11467)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 170, 정답: 96, 맞힌 사람: 88, 정답 비율: 60.274%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>The jury has a great artistic idea &mdash; to create a rectangular panel out of a huge pile of black and white squares of the same size. The panel should have exactly b 4-connected areas made of black tiles, and w 4-connected areas made of white tiles.</p>

<p>Remember, a 4-connected area of some color is a maximal set of the panel tiles such that:</p>

<ul>
	<li>any two tiles of the area share the same color;</li>
	<li>for any two tiles of the area there is a tile sequence connecting them, such that any two consecutive tiles of the sequence share a common side.</li>
</ul>

<p>In addition to the artistic idea, the jury has already developed a program that produces design of the panel. But since this problem is about art, any new solution is extremely important for the jury.</p>

### 입력

<p>The only line of the input file contains two integers b and w &mdash; number of black and white areas (1 &le; b, w &le; 1000).</p>

### 출력

<p>The first line of the output file should contain the picture sizes r and c &mdash; the number of rows and columns (1 &le; r, c &le; 100 000). This line should be followed by r lines of c symbols each. Each symbol should be either &lsquo;@&rsquo; (for black tile) or &lsquo;.&rsquo; (for white one). There should be no more than 100 000 tiles in the panel.</p>