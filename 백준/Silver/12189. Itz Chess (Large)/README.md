# [Silver I] Itz Chess (Large) - 12189

[문제 링크](https://www.acmicpc.net/problem/12189)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 19, 맞힌 사람: 17, 정답 비율: 43.590%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Given an arranged chess board with pieces, figure out the total number of different ways in which any piece can be killed <strong>in one move</strong>. Note: in this problem, the pieces can be killed despite of the color.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/12188/images-2.jpeg" style="height:301px; width:301px" /></p>

<p>For example, if there are 3 pieces King is at B2, Pawn at A1 and Queen at H8 then the total number of pieces that an be killed is 3. H8-Q can kill B2-K, A1-P can kill B2-K, B2-K can kill A1-P</p>

<p>A position on the chess board is represented as A1, A2... A8,B1.. H8</p>

<p>Pieces are represented as</p>

<ul>
	<li>(K) King can move in 8 direction by one place.</li>
	<li>(Q) Queen can move in 8 direction by any number of places, but can&#39;t overtake another piece.</li>
	<li>(R) Rook can only move vertically or horitonzally, but can&#39;t overtake another piece.</li>
	<li>(B) Bishop can only move diagonally, but can&#39;t overtake another piece.</li>
	<li>(N) Knights can move to a square that is two squares horizontally and one square vertically <strong>OR</strong> one squares horizontally and two square vertically.</li>
	<li>(P) Pawn can only kill by moving diagonally upwards (towards higher number i.e. A -&gt; B, B-&gt;C and so on).</li>
</ul>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> Test cases follow. Each test case consists of the number of pieces , <strong>N</strong>. <strong>N</strong> lines follow, each line mentions where a piece is present followed by <strong>-</strong> with the piece type</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> &le; 64.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the the total number of different ways in which any piece can be killed.</p>