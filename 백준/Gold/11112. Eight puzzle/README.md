# [Gold I] Eight puzzle - 11112

[문제 링크](https://www.acmicpc.net/problem/11112)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1002, 정답: 269, 맞힌 사람: 167, 정답 비율: 26.806%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11112/1.png" style="float:right; height:141px; width:106px" />You just got your sweet little brother Erling an entertaining puzzle. It is a 3 x 3 board with eight quadratic pieces, where you can slide a piece into the open slot. After rearranging the pieces randomly, the goal of the game is to get the board into the configuration</p>

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11112/2.png" style="height:72px; width:86px" /></p>

<p>by sliding pieces one by one.</p>

<p>After playing with a puzzle for a while, Erling claims that he can solve any instance in a minimal number of steps. Since you don&rsquo;t believe him, you write a program to solve the puzzles optimally.</p>

### 입력

<p>The first line of input gives 1 &le; n &le; 100, the number of test cases, followed by a blank line. Each test case is given by three lines giving the start configuration of the board, each consisting of three symbols, followed by a blank line. The cases all contain the symbols 1 . . . 8 and # exactly once, where the latter represents an open space.</p>

### 출력

<p>For each test case output the minimum number of moves to solve the puzzle, or impossible if it cannot be done.</p>