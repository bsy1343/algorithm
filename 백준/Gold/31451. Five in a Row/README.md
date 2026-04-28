# [Gold II] Five in a Row - 31451

[문제 링크](https://www.acmicpc.net/problem/31451)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 8, 맞힌 사람: 7, 정답 비율: 25.000%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Five in a Row, also called Gomoku, is a board game played with Go pieces (black and white stones). The winner is the first player to form an unbroken line of five stones of their color horizontally, vertically, or diagonally.</p>

<p>During leisure time at the Olympics, athletes and coaches also enjoy playing this game for recreation. Nevertheless, today they are playing a more advanced version in a $K$-dimensional board instead of a traditional $2$-dimensional board. Stones A, B, C, D, E are considered as <em>five in a row</em> if, for every integer $i$ such that $1 \le i \le K$, we have:</p>

<p style="text-align: center;">$A[i] - B[i] = B[i] - C[i] = C[i] - D[i] = D[i] - E[i] =$ one of $\{-1, 0, 1\}$.</p>

<p>Here, $A[i]$ is the coordinate of the stone $A$ on the $i$<sup>th</sup> dimension.</p>

<p>Due to the complexity of the board, they sometimes get overwhelmed. Therefore you are asked to write a referee program that takes all the moves made by one player in chronological order and calculates after placing which stone we see five in a row for the first time.</p>

### 입력

<p>The first line contains two space-separated integers $K$ and $N$: $K$ is the number of dimensions of the board, and $N$ is the number of stones. This line is followed by $N$ lines, which describe the $N$ stones placed by one player in chronological order. The $i$<sup>th</sup> such line contains $K$ space-separated integers $x_1, x_2, \dots , x_K$, which are the $K$ coordinates of the $i$<sup>th</sup> stone.</p>

### 출력

<p>The output should contain a single line. This line must contain the smallest positive integer $i$ for which we see five in a row after placing the $i$<sup>th</sup> stone; or <code>NOT ALIGNED</code> if such an integer $i$ does not exist.</p>

### 제한

<ul>
	<li>$1 \le K \le 15$</li>
	<li>$5 \le N \le 2\, 000$</li>
	<li>the $N$ stones have been placed in distinct positions on the board</li>
	<li>each coordinate $x_i$ is an integer such that $-10\, 000 \le x_i \le 10\, 000$</li>
</ul>