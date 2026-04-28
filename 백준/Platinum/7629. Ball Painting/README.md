# [Platinum V] Ball Painting - 7629

[문제 링크](https://www.acmicpc.net/problem/7629)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 42, 맞힌 사람: 37, 정답 비율: 75.510%

### 분류

수학, 조합론

### 문제 설명

<p>There are 2N white balls on a table in two rows, making a nice 2-by-N rectangle. Jon has a big paint bucket full of black paint. (Don&rsquo;t ask why.) He wants to paint all the balls black, but he would like to have some math fun while doing it. (Again, don&rsquo;t ask why.) First, he computed the number of different ways to paint all the balls black. In no time, he figured out that the answer is (2N)! and thought it was too easy. So, he introduced some rules to make the problem more interesting.</p>

<ul>
	<li>The first ball that Jon paints can be any one of the 2N balls.</li>
	<li>After that, each subsequent ball he paints must be adjacent to some black ball (that was already painted). Two balls are assumed to be adjacent if they are next to each other horizontally, vertically, or diagonally.</li>
</ul>

<p>Jon was quite satisfied with the rules, so he started counting the number of ways to paint all the balls according to them. Can you write a program to find the answer faster than Jon?</p>

### 입력

<p>The input consists of multiple test cases. Each test case consists of a single line containing an integer N, where 1 &le; N &le; 1,000. The input terminates with a line with N = 0.</p>

### 출력

<p>For each test case, print out a single line that contains the number of possible ways that Jon can paint all the 2N balls according to his rules. The number can become very big, so print out the number modulo 1,000,000,007.</p>