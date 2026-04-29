# [Platinum V] Bojanje - 32972

[문제 링크](https://www.acmicpc.net/problem/32972)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 26, 정답: 15, 맞힌 사람: 14, 정답 비율: 60.870%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 누적 합, 브루트포스 알고리즘, 해 구성하기

### 문제 설명

<p>Marin, having become exceptionally skilled in competitive programming, decided to find a new hobby to keep himself entertained while waiting for you to catch up. While you were solving previous problems, Marin discovered a great love for painting.</p>

<p>He took a blank white canvas and two colors, red and blue. He began painting perfectly horizontal and vertical strokes on the canvas, from one edge to the opposite edge. The canvas can be imagined as an $n \cdot n$ grid, where rows and columns are numbered from $1$ to $n$, and it starts completely white. Each of Marin’s strokes can be imagined as choosing one of the two colors and a row or column, then coloring all the cells in that row/column with the chosen color, regardless of what was previously on the field. Marin will make a finite number of strokes and complete his painting.</p>

<p>However, his friend Stjepan found a painting that resembles Marin’s but is unsure if it is really his. The painting he found can again be imagined as an $n \times n$ grid where each cell is white, blue, or red. The painting is <em>possibly Marin’s</em> if there exists a sequence of strokes on a blank canvas, as described above, that produces an image identical to the one found. Stjepan has asked you to help him determine whether the painting might be Marin’s and, if so, to find a sequence of strokes that produces the found painting.</p>

### 입력

<p>The first line contains a positive integer $n$ ($1 ≤ n ≤ 2000$).</p>

<p>In the next $n$ lines, there are $n$ integers $a_{i,j}$ ($0 ≤ a_{i,j} ≤ 2$), where each represents the color in the $i$-th row and $j$-th column ($0$ if white, $1$ if red, and $2$ if blue).</p>

### 출력

<p>If the painting is possibly Marin’s, then in the first line, print the number of strokes $K$ ($0 ≤ K ≤ 4000$). In the next $K$ lines, you should print three integers. The first will indicate whether the $i$-th stroke was on a row or a column ($1$ for a row, $2$ for a column). The second number will indicate the index of the row or column where the stroke is performed, and the third number will indicate the color in the same way as described in the Input section.</p>

<p>If the painting is certainly not Marin’s, print "<code>-1</code>" (without quotes) in the first and only line.</p>