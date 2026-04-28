# [Platinum IV] Knockout - 16419

[문제 링크](https://www.acmicpc.net/problem/16419)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 36, 맞힌 사람: 28, 정답 비율: 46.667%

### 분류

비트마스킹, 조합론, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 구현, 수학, 확률론, 트리

### 문제 설명

<p>The solitaire game Knockout is played as follows. The digits from 1 to 9 are written down in ascending order. In each turn, you throw a pair of six-sided dice; you sum the dice, and cross out some set of digits, of your choice, that sum to the same total. If you cannot, the game ends and your score is the remaining digits, taken as a single number. Otherwise, you throw the dice again and continue.</p>

<p>This game can be played to either minimize or maximize your score. Given a position of the game (what digits remain) and a roll of the dice, determine which digits you should remove and what your expected score would be for both versions of the game, assuming you make the best moves possible for whichever version you&rsquo;re playing for the remainder of the game. The expected score is the sum of all possible scores weighted by their probabilities (presuming optimum play).</p>

### 입력

<p>Each input will consist of a single test case. Note that your program may be run multiple times on different inputs.</p>

<p>Each test case will consist of a single line containing a string of digits d (1 &le; |d| &le; 9) and two integers a and b (1 &le; a,b &le; 6), all separated by spaces. The string of digits d will contain a subset of the digits 1..9 in ascending order, with no digit appearing more than once. This is the current state of the game. The integers a and b represent your current throw of the dice.<span style="display: none;">&nbsp;</span></p>

### 출력

<p>Output two lines, each with two parts. First, output the digits that you eliminate with your throw of the dice, as a string of digits in ascending order. If you cannot eliminate any digits, output -1. Then, output the expected score as a real number rounded to five decimal places. Output a space between the parts.</p>

<p>The first line represents the best result when minimizing your score and the second line represents the best result when maximizing your score. Note that it is impossible for two different combinations of digits to yield the same expected score.</p>