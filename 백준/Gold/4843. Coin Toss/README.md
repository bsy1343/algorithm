# [Gold III] Coin Toss - 4843

[문제 링크](https://www.acmicpc.net/problem/4843)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 67, 정답: 24, 맞힌 사람: 21, 정답 비율: 42.000%

### 분류

수학, 구현, 기하학, 확률론

### 문제 설명

<p>In a popular carnival game, a coin is tossed onto a table with an area that is covered with square tiles in a grid. The prizes are determined by the number of tiles covered by the coin when it comes to rest: the more tiles it covers, the better the prize. In the following diagram, the results from five coin tosses are shown:</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4843.%E2%80%85Coin%E2%80%85Toss/294d54c2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4843/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:306px; width:313px" /></p>

<p>In this example:</p>

<ul>
	<li>coin 1 covers 1 tile</li>
	<li>coin 2 covers 2 tiles</li>
	<li>coin 3 covers 3 tiles</li>
	<li>coin 4 covers 4 tiles</li>
	<li>coin 5 covers 2 tiles</li>
</ul>

<p>Notice that it is acceptable for a coin to land on the boundary of the playing area (coin 5). In order for a coin to cover a tile, the coin must cover up a positive area of the tile. In other words, it is not enough to simply touch the boundary of the tile. The center of the coin may be at any point of the playing area with uniform probability. You may assume that (1) the coin always comes to a rest lying flat, and (2) the player is good enough to guarantee that the center of the coin will always come to rest on the playing area (or the boundary).</p>

<p>The probability of a coin covering a certain number of tiles depends on the tile and coin sizes, as well as the number of rows and columns of tiles in the playing area. In this problem, you will be required to write a program which computes the probabilities of a coin covering a certain number of tiles.</p>

### 입력

<p>The first line of input is an integer specifying the number of cases to follow. For each case, you will be given 4 integers m, n, t, and c on a single line, separated by spaces. The playing area consists of m rows and n columns of tiles, each having side length t. The diameter of the coin used is c. You may assume that 1 &lt;= m, n &lt;= 5000, and 1 &lt;= c &lt; t &lt;= 1000.</p>

### 출력

<p>For each case, print the case number on its own line. This is followed by the probability of a coin covering 1 tile, 2 tiles, 3 tiles, and 4 tiles each on its own line. The probability should be expressed as a percentage rounded to 4 decimal places. Use the format as specified in the sample output. You should use double&minus;precision floating&minus;point numbers to perform the calculations. &quot;Negative zeros&quot; should be printed without the negative sign.</p>

<p>Separate the output of consecutive cases by a blank line.</p>