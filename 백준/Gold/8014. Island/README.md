# [Gold IV] Island - 8014

[문제 링크](https://www.acmicpc.net/problem/8014)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 18, 맞힌 사람: 14, 정답 비율: 70.000%

### 분류

브루트포스 알고리즘, 누적 합, 두 포인터

### 문제 설명

<p>In Byteland there is a match planned between two antagonistic football teams: the Linuxers and the Microsofters. Because the fans of both teams are known to have a deep aversion to fans of the other team, they should watch the match only on TV and ought to be located in towns that are in the greatest possible distance to one another. Byteland is an island, and all its towns lie along the seashore. A two-way highway connecting all the towns runs along the coast. From each town one can reach any other town going clockwise or counterclockwise. The length of the shorter route is the distance between the two towns.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the island,</li>
	<li>computes the maximal distance the fans of one team may be separated from the fans of the other team,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there is one positive integer n, 2 &le; n &le; 50,000, denoting the number of towns on the island. In the following n lines there are the lengths of the highway sections between adjacent towns. Each of the lines contains one positive integer. In the line numbered i+1 there is the length of the highway section between the town number i and the town number i+1, while in the line numbered n+1 there is the length of the route between the towns n and 1. The whole length of the highway does not exceed 1,000,000,000.</p>

### 출력

<p>The first and only line of the standard output should contain one integer being the maximal distance the fans may be separated.</p>