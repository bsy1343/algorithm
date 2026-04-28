# [Platinum II] Game of Nim Everywhere - 18694

[문제 링크](https://www.acmicpc.net/problem/18694)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 90, 정답: 41, 맞힌 사람: 29, 정답 비율: 39.189%

### 분류

다이나믹 프로그래밍, 게임 이론, 수학, 스프라그–그런디 정리

### 문제 설명

<p>Yes, this game comes again and again. Nim is a mathematical game of strategy in which two players take turns removing objects from distinct heaps. On each turn, a player must remove at least one object, and may remove any number of objects provided they all come from the same heap. The winner of the game is the player who removes the last object.</p>

<p>In this problem we will play with only 3 heaps, and the initial state also will be special, it will always be in the following format (N, 2 &times; N, 3 &times; N) where N is a positive integer. For example if N is 3, the 3 heaps will initially start with 3, 6 and 9 objects.</p>

<p>A winning state is a state of the heaps where there&rsquo;s always a strategy for the player who is about to play, to win the game regardless what the other player does.</p>

<p>In this problem you are given two integers L and R, and your task is to find how many different values for N (L &le; N &le; R) such that if we use N to get the initial state as described above, it will be a winning state for the first player.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T (1 &le; T &le; 10<sup>5</sup>) representing the number of test cases. Followed by T test cases.</p>

<p>Each test case will be just one line containing 2 integers separated by a space, L and R (1 &le; L &le; R &le; 2<sup>61</sup>), which are the range as described above.</p>

### 출력

<p>For each test case, print a single line with the number of different values of N which satisfy the condition described above.</p>

### 힌트

<p>In the first test case, the only value for N which gives a winning state is 3, the state will be (3, 6, 9).</p>