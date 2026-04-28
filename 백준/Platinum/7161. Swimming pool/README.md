# [Platinum IV] Swimming pool - 7161

[문제 링크](https://www.acmicpc.net/problem/7161)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 44, 정답: 19, 맞힌 사람: 19, 정답 비율: 48.718%

### 분류

그래프 이론, 자료 구조, 그래프 탐색, 데이크스트라, 분리 집합, 우선순위 큐

### 문제 설명

<p>A long time ago the construction of swimming pools was done thus: first, a rectangular area of length m meters and width n meters was designated. This area was then divided to 1*1 meter sized squares, thus obtaining m*n cells. Then either a perfectly cut granite cube with side length equal to 1, or a tower of these perfect cubes was placed in each cell.</p>

<p>The cubes were so perfectly made that it was sufficient for two cubes to have their egdes next to each other so that this place would be hermetically sealed (water would not flow through).</p>

<p>When water was flowing, such a &ldquo;set of cubes&rdquo; could only hold a limited amount of water.</p>

<p>Your task is to write a program, which would determine the maximum possible volume of water in cubic meters that can be gathered in this pool.&nbsp;</p>

### 입력

<p>The first line of the standard input contains two positive integers m and n, which are the lengths of sides of the rectangular area in meters (0&lt;m, n&le;100).</p>

<p>The next of the m lines in the file contain each n natural numbers.</p>

<p>The j-th number in the i+1-st line of the file shows the height of the cube tower located in the i-th row of the j-th column (or number of cubes positioned there). It is given that there is at least one cube in each cell and that the height of the tower does not exceed 10000 in any of the cells.&nbsp;</p>

### 출력

<p>The only line of the standard output must contain one positive integer &ndash; the maximum possible volume of water in cubic meters that can be stored in the given swimming pool.&nbsp;</p>

### 힌트

<p>A view from the top of an empty pool and of a filled pool given in the pictures below.&nbsp;</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7161/1.png" style="height:200px; width:575px" /></p>