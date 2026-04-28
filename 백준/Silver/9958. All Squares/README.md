# [Silver I] All Squares - 9958

[문제 링크](https://www.acmicpc.net/problem/9958)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 30, 정답: 20, 맞힌 사람: 13, 정답 비율: 72.222%

### 분류

기하학

### 문제 설명

<p>Geometrically, any square has a unique, well-defined centre point. On a grid this is only true if the sides of the square span an odd number of points. Since any odd number can be written in the form 2k+1, we can characterise any such square by specifying k, i.e. we can say that a square whose sides are of length 2k+1 has size k. Now define a pattern of squares as follows.</p>

<ol>
	<li>The largest square is of size k (i.e. sides are of length 2k+1) and is centred in a grid of size 1024 (i.e. the grid sides are of length 2049).</li>
	<li>The smallest permissible square is of size 1 and the largest is of size 512, thus 1 &le; k &le; 512.</li>
	<li>All squares of size k &gt; 1 have a square of size k / 2 centred on each of their 4 corners. (Integer division, thus 9 / 2 = 4).</li>
	<li>The top left corner of the grid has coordinates (0,0).</li>
</ol>

<p>Hence, given a value of k, we can draw a unique pattern of squares according to the above rules, e.g., if k is 15, then the following pattern would be produced.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/9958/1.png" style="height:393px; width:391px" /></p>

<p>Obviously, any point in the grid will be surrounded by zero or more squares. (If the point is on the border of a square, it is considered to be surrounded by that square).</p>

<p>Write a program that will read in a value of k and the coordinates of a point, and will determine how many squares surround the point.</p>

### 입력

<p>Input will consist of a series of lines containing 3 integers (k and the coordinates of the point) terminated by a line consisting of three zeroes (0 0 0).</p>

### 출력

<p>Output will consist of a series of lines, one for each line of the input. Each line will consist of the number of squares surrounding the specified point.</p>