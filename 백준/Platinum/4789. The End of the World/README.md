# [Platinum IV] The End of the World - 4789

[문제 링크](https://www.acmicpc.net/problem/4789)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 수학, 재귀

### 문제 설명

<p>Legend says that there is a group of monks who are solving a large Towers of Hanoi puzzle. The Towers of Hanoi is a well-known puzzle, consisting of three pegs, with a stack of disks, each a different size. At the start, all of the disks are stacked on one of the pegs, and ordered from largest (on the bottom) to smallest (on the top). The object is to move this stack of disks to another peg, subject to two rules: 1) you can only move one disk at a time, and 2) you cannot move a disk onto a peg if that peg already has a smaller disk on it.</p>

<p>The monks believe that when they finish, the world will end. Suppose you know how far they&rsquo;ve gotten. Assuming that the monks are pursuing the most efficient solution, how much time does the world have left?</p>

### 입력

<p>There will be several test cases in the input. Each test case will consist of a string of length 1 to 63, on a single line. This string will contain only (capital) As, Bs and Cs. The length of the string indicates the number of disks, and each character indicates the position of one disk. The first character tells the position of the smallest disk, the second character tells the position of the second smallest disk, and so on, until the last character, which tells the position of the largest disk. The character will be A, B or C, indicating which peg the disk is currently on. You may assume that the monks&rsquo; overall goal is to move the disks from peg A to peg B, and that the input represents a legitimate position in the optimal solution. The input will end with a line with a single capital X.</p>

### 출력

<p>For each test case, print a single number on its own line indicating the number of moves remaining until the given Towers of Hanoi problem is solved. Output no extra spaces, and do not separate answers with blank lines. All possible inputs yield answers which will fit in a signed 64-bit integer.</p>