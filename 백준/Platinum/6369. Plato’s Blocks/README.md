# [Platinum IV] Plato’s Blocks - 6369

[문제 링크](https://www.acmicpc.net/problem/6369)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 58, 정답: 13, 맞힌 사람: 8, 정답 비율: 36.364%

### 분류

구현, 그래프 이론, 그리디 알고리즘, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색, 플러드 필

### 문제 설명

<p>Plato believed what we perceive is but a shadow of reality. Recent archaeological excavations have uncovered evidence that this belief may have been encouraged by Plato&rsquo;s youthful amusement with cleverly-designed blocks. The blocks have the curious property that, when held with any face toward a light source, they cast shadows of various letters, numbers, shapes, and patterns. It is possible for three faces incident to a corner to correspond to three different shadow patterns. Opposite faces, of course, cast shadows which are mirror images of one another.</p>

<p>The blocks are formed by gluing together small cubes to form a single, connected object. As an example, the figures below show, layer by layer, the internal structure of a block which can cast shadows of the letters &ldquo;E&rdquo;, &ldquo;G&rdquo;, or &ldquo;B&rdquo;.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6369.%E2%80%85Plato%E2%80%99s%E2%80%85Blocks/ee0229d1.gif" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6369/p2283.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Only a partial set of blocks was discovered, but the curious scientists would like to determine what combinations of shadows are possible. Your program, the solution to this problem, will help them! The program will input groups of shadow patterns, and for each group will report whether or not a solid can be constructed that will cast those three shadows.</p>

### 입력

<p>The input contains a sequence of data sets, each specifying a dimension and three shadow patterns. The first line of a data set contains a positive integer 1 &le; n &le; 20 that specifies the dimensions of the input patterns. The remainder of the data set consists of 3n lines, each containing a string of n &ldquo;X&rdquo; and &ldquo;-&rdquo; characters. Each group of n lines represents a pattern. Where an &ldquo;X&rdquo; appears a shadow should be cast by the final solid, and where a &ldquo;-&rdquo; appears, light should pass through. For this problem, the input patterns may be assumed to have at least one &ldquo;X&rdquo; along each edge of the pattern. The input is terminated by a line containing a single zero in place of a valid dimension.</p>

<p>&nbsp;</p>

### 출력

<p>For each data set in the input, output the data set number and one of the following messages:</p>

<p style="margin-left:40px">Valid set of patterns<br />
Impossible combination</p>

<p>For a set of patterns to be considered valid, it must be possible to construct, by gluing unit cubes together along their faces, a one-piece solid capable of casting the shadow of each of the input patterns.</p>