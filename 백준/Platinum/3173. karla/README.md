# [Platinum IV] karla - 3173

[문제 링크](https://www.acmicpc.net/problem/3173)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 4, 맞힌 사람: 3, 정답 비율: 12.500%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>The map of some area can be presented as a rectangular grid of squares arranged in M rows and N columns.</p>

<pre>
....vvvvv#..........
....vvvvv#....####..
...vvvvv#........#..
...vvvv#.........#..
...vvvv#...##sss.#..
...vvvvvvvv.#ssss#..
...vvvvvvvv###ss#...
...vvvvvvvv..#ss#sss
....vvvvvvv#.#..#sss
########...#.#ss#sss
...........#.#sss#ss
...........#.#...#ss
..##########.#...#ss
..#........#.#...#ss
....#......#.#......
....#........#......</pre>

<ul>
	<li><code>.</code> empty square</li>
	<li><code>#</code> rock</li>
	<li><code>v</code> water</li>
	<li><code>s</code> forest</li>
</ul>

<p>Karla is located in the top-left square and she must get to the bottom-right square using a sequence of moves. Each move is a step onto a neighboring square in any of the four directions (up, down, left, right). However, she doesn&#39;t want to swim through the water or walk through the forest (she can&#39;t go over rock at all).</p>

<p>We can build at most K bridges or burn down at most L forests to help her.</p>

<p>Each bridge must be built in the horizontal or vertical direction only above water and can be of any length. If two bridges intersect, they are built one above another so it is not possible to move from one bridge to another.</p>

<p>Burning one forest means erasing exactly one forest area. A forest area is a maximal set of forest squares such that there is a path that consists of only horizontal or vertical moves between every two squares.</p>

<p>Write a program that will find the bridges that have to be built and the forests that have to be burned in order to allow Karla to get from the start to the final position.&nbsp;</p>

### 입력

<p>The first line of input contains two integers M and N, 1 &le; M, N &le; 50.</p>

<p>The second line contains two integers K and L, 1 &le; K, L &le; 10.</p>

<p>Each of the following M lines contains a sequence of N characters &ndash; the map of the area. The top-left and bottom-right squares will be empty.</p>

### 출력

<p>Output the final layout of the map after building and burning.</p>

<p>Each horizontal segment of a built bridge should be represented by a &#39;&ndash;&#39; (minus), each vertical segment by &#39;|&#39; (vertical line), and squares where two bridges intersects by &#39;+&#39; (plus). Squares with burned forest should be represented by a &#39;.&#39; (dot), like empty square. Each bridge has to be fully built, and each forest has to be fully burned.</p>

<p>Note: the test data will be such that a solution, although not necessarily unique, always exists.</p>