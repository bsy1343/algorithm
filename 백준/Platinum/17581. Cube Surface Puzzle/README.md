# [Platinum IV] Cube Surface Puzzle - 17581

[문제 링크](https://www.acmicpc.net/problem/17581)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 19, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

구현, 브루트포스 알고리즘, 시뮬레이션, 비트마스킹

### 문제 설명

<p>Given a set of six pieces, &ldquo;Cube Surface Puzzle&rdquo; is to construct a hollow cube with filled surface. Pieces of a puzzle is made of a number of small unit cubes laid grid-aligned on a plane. For a puzzle constructing a cube of its side length <i>n</i>, unit cubes are on either of the following two areas.</p>

<ul>
	<li>Core (blue): A square area with its side length <i>n</i>&minus;2. Unit cubes fill up this area.</li>
	<li>Fringe (red): The area of width 1 unit forming the outer fringe of the core. Each unit square in this area may be empty or with a unit cube on it.</li>
</ul>

<p>Each piece is connected with faces of its unit cubes. Pieces can be arbitrarily rotated and either side of the pieces can be inside or outside of the constructed cube. The unit cubes on the core area should come in the centers of the faces of the constructed cube.</p>

<p>Consider that we have six pieces in Fig. E-1 (The first dataset of Sample Input). Then, we can construct a cube as shown in Fig. E-2.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17581.%E2%80%85Cube%E2%80%85Surface%E2%80%85Puzzle/4ed8da10.png" data-original-src="https://upload.acmicpc.net/8c02fa2f-10aa-4a48-ab8e-4d6aa256ffaa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 853px; height: 461px;" /></p>

<p style="text-align: center;">Fig. E-1 Pieces from the first dataset of Sample Input</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17581.%E2%80%85Cube%E2%80%85Surface%E2%80%85Puzzle/e6786867.png" data-original-src="https://upload.acmicpc.net/492ee273-2c00-44fb-a63a-6aae2f151d81/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 779px; height: 560px;" /></p>

<p style="text-align: center;">Fig. E-2 Constructing a cube</p>

<p>Mr. Hadrian Hex has collected a number of cube surface puzzles. One day, those pieces were mixed together and he cannot find yet from which six pieces he can construct a cube. Your task is to write a program to help Mr. Hex, which judges whether we can construct a cube for a given set of pieces.</p>

### 입력

<p>The input consists of at most 200 datasets, each in the following format.</p>

<pre>
<i>n</i>
<i>x</i><sub>1,1</sub><i>x</i><sub>1,2</sub> &hellip; <i>x</i><sub>1,<i>n</i></sub>
<i>x</i><sub>2,1</sub><i>x</i><sub>2,2</sub> &hellip; <i>x</i><sub>2,<i>n</i></sub>
&hellip;
<i>x</i><sub>6<i>n</i>,1</sub><i>x</i><sub>6<i>n</i>,2</sub> &hellip; <i>x</i><sub>6<i>n</i>,<i>n</i></sub></pre>

<p>The first line contains an integer <i>n</i> denoting the length of one side of the cube to be constructed (3 &le; <i>n</i> &le; 9, <i>n</i> is odd). The following 6<i>n</i> lines give the six pieces. Each piece is described in <i>n</i> lines. Each of the lines corresponds to one grid row and each of the characters in the line, either &lsquo;X&rsquo; or &lsquo;.&rsquo;, indicates whether or not a unit cube is on the corresponding unit square: &lsquo;X&rsquo; means a unit cube is on the column and &lsquo;.&rsquo; means none is there.</p>

<p>The core area of each piece is centered in the data for the piece.</p>

<p>The end of the input is indicated by a line containing a zero.</p>

### 출력

<p>For each dataset, output &ldquo;<code>Yes</code>&rdquo; if we can construct a cube, or &ldquo;<code>No</code>&rdquo; if we cannot.</p>