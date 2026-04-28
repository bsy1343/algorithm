# [Gold V] A flea on a chessboard - 4318

[문제 링크](https://www.acmicpc.net/problem/4318)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 169, 정답: 55, 맞힌 사람: 39, 정답 비율: 38.614%

### 분류

수학, 구현, 정수론, 시뮬레이션, 비둘기집 원리

### 문제 설명

<p>An infinite chessboard is obtained by extending a finite chessboard to the right and up infinitely. Each square of the chessboard is either black or white with the side of&nbsp;<em>S</em>&nbsp;milimiters, 0&nbsp;&lt;&nbsp;<em>S</em>&nbsp;&lt;=&nbsp;1000. The leftmost bottom square of the chessboard is black. A flea is positioned on the chessboard at the point (<em>x</em>,&nbsp;<em>y</em>) (given in milimeters) and makes jumps by jumping&nbsp;<em>dx</em>&nbsp;milimeters to the right and&nbsp;<em>dy</em>&nbsp;milimiters up, 0&nbsp;&lt;&nbsp;<em>dx</em>,&nbsp;<em>dy</em>, that is, a flea at position (<em>x</em>,&nbsp;<em>y</em>) after one jump lands at position (<em>x+dx</em>,&nbsp;<em>y+dy</em>).</p>

<p>Given the starting position of the flea on the board your task is to find out after how many jumps the flea will reach a white square. If the flea lands on a boundary between two squares then it does not count as landing on the white square. Note that it is possible that the flea never reaches a white square.</p>

### 입력

<p>Each test case consists of one line of input containing five non-negative numbers separated by white space and giving integers&nbsp;<em>S</em>,&nbsp;<em>x</em>,&nbsp;<em>y</em>,&nbsp;<em>dx</em>, and&nbsp;<em>dy</em>. An input line containing five zeroes follows the last test case.</p>

### 출력

<p>For test case print one line of output in the format shown in the sample.</p>