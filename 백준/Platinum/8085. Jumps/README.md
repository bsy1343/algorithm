# [Platinum III] Jumps - 8085

[문제 링크](https://www.acmicpc.net/problem/8085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 11, 맞힌 사람: 10, 정답 비율: 62.500%

### 분류

수학, 그리디 알고리즘, 임의 정밀도 / 큰 수 연산, 불변량 찾기

### 문제 설명

<p>&ldquo;Jumps&rdquo; is a board game played on an infinite tape of squares. The board has neither left nor right limit. On the squares there is finitely many pieces (more than one piece on a square is allowed). We assume that the most left, non-empty square is numbered 0. Squares on the right are denoted by consecutive natural numbers 1, 2, 3, ..., squares on the left &mdash; by negative numbers: -1, -2, -3, .... The configuration of pieces on the board can be described in the following way: for every square occupied by at least one piece we give the number of the square and the number of pieces standing on this square.</p>

<p>There are two kinds of moves that can change the configuration: jump right and jump left. Jump right consists of removing two pieces from the board: one from a square p&nbsp;and the other from the square p+1, and placing one piece on the square p+2. Jump left consists of removing a piece from a square p+2&nbsp;and placing two pieces on the board: one on the square p+1&nbsp;and the other on the square p.</p>

<p>We say that a configuration is final if each pair of neighbouring squares contains at most one piece. For every configuration there is exactly one final configuration that can be reached after finite number of moves (jumps).</p>

<p>Write a program that:</p>

<ul>
	<li>reads a description of an initial configuration from the standard input,</li>
	<li>finds the final configuration that can be reached from the given initial configuration and writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one positive integer n, 1 &le; n &le; 10,000, which equals the number of non-empty squares of the given initial configuration.</p>

<p>In each of the following n&nbsp;lines there is a description of one non-empty square of the initial configuration. Such a description consists of two integers. First is the number of the square, second &mdash; the number of pieces standing on this square. The descriptions are given in increasing order with respect to numbers of squares. The biggest number of a square is not greater than 10,000&nbsp;and the number of pieces on a single square is not greater than 10<sup>8</sup>.</p>

### 출력

<p>In the first line of the standard output there should be written the final configuration that can be reached from the given initial configuration. More precisely the line should contain the numbers of non-empty squares (in increasing order) of the final configuration. The numbers should be separated by single spaces.</p>