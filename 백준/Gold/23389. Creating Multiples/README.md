# [Gold IV] Creating Multiples - 23389

[문제 링크](https://www.acmicpc.net/problem/23389)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 18, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

수학, 정수론

### 문제 설명

<p>Malba is a very smart kid who loves to perform calculations. He has won several competitions, including the prestigious Tahan competition, in which he got the first prize, representing his country, Logonia.</p>

<p>He created a puzzle, in which he considers a number N, written in a certain base B, and represented by L digits. The objective of the game is to reduce at most one of the digits so that the new number, M, be a multiple of the number B + 1. But there is a catch: among the possible solutions you must choose one that renders M the smallest possible value.</p>

<p>For example, suppose that B = 10 and N = 23456. There are two ways in which M may be obtained: either we reduce the digit 4 to 0 or we reduce the digit 6 to 2. Thus, 4 must be changed to 0, hence M = 23056. Sometimes there is no solution, as is the case if B = 10 and N = 102. In this case, if we change the digit 1 to 9 we get a multiple of 11, but we are not allowed to increase the value of a digit!</p>

<p>Observe that it may be necessary to reduce the first digit to 0. For example, this is the case if B = 10 and N = 322.</p>

<p>Can you tell which digit should be reduced and what is its new value?</p>

### 입력

<p>The first line contains two integers B and L (2 &le; B &le; 10<sup>4</sup>, 1 &le; L &le; 2 &times; 10<sup>5</sup>), representing the base and the number of digits of the number N, respectively.</p>

<p>The second line contains L integers D<sub>1</sub>, D<sub>2</sub>, . . . , D<sub>L</sub> (0 &le; D<sub>i</sub> &lt; B for i = 1, 2, . . . , L), representing the digits of the number N. The first digit, D<sub>1</sub>, is the most significant and the last, D<sub>L</sub>, is the least significant.</p>

### 출력

<p>Output a line containing two integers, separated by one space. The first integer is the index of the digit to be changed (recall that the index of the first digit, D<sub>1</sub>, is 1 and the index of the last digit, D<sub>L</sub>, is L). The second integer is the new value of the digit. If there is no solution to the problem, output <code>-1 -1</code>. If N is already a multiple of B + 1 then output <code>0 0</code>.</p>