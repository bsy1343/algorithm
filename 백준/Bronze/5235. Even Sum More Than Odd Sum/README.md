# [Bronze III] Even Sum More Than Odd Sum - 5235

[문제 링크](https://www.acmicpc.net/problem/5235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1350, 정답: 946, 맞힌 사람: 893, 정답 비율: 72.366%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>When new programs arrive in the grid world, they start by playing the simplest of games in the Disc Arena against other novice programs. One of those games is played in front of a large board as follows: a sequence of numbers appears on the board, and the players have to decide whether the sum of even numbers in the sequence is larger than the sum of odd numbers in the sequence, or if they are equal. The first player to provide the correct answer wins the game, and the losers are deleted.</p>

<p>For example, given the sequence:</p>

<p style="text-align: center;">5 7 2 1 10 13 6 12</p>

<p>the sum of even numbers is 2 + 10 + 6 + 12 = 30, whereas the sum of odd numbers is 5 + 7 + 1 + 13 = 26. Hence the correct answer here is &ldquo;EVEN&rdquo;.</p>

<p>You are to help Sam (our protagonist) win this game so he can survive, and look for his father.</p>

### 입력

<p>The first line in the test data file contains the number of test cases (&le; 50). After that, each line contains one test case. The test case begins with the number of elements in the sequence, k (&lt; 100), and then we have k numbers which specify the sequence. Assume all numbers are &ge; 0, and &lt; 2<sup>20</sup>.</p>

### 출력

<p>For each test case, you are to output &ldquo;EVEN&rdquo; (if the sum of even numbers in the sequence is larger than the sum of odd numbers), &ldquo;ODD&rdquo; (if the reverse is true), or &ldquo;TIE&rdquo; (if the two sums are identical).</p>