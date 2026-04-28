# [Platinum II] Coin Slider - 15524

[문제 링크](https://www.acmicpc.net/problem/15524)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 51, 맞힌 사람: 45, 정답 비율: 45.000%

### 분류

다이나믹 프로그래밍, 기하학, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>You are playing a coin puzzle. The rule of this puzzle is as follows:</p>

<p>There are <em>N</em> coins on a table. The <em>i</em>-th coin is a circle with <em>r<sub>i</sub></em> radius, and its center is initially placed at (<em>sx<sub>i</sub></em>, <em>sy<sub>i</sub></em>). Each coin also has a target position: you should move the <em>i</em>-th coin so that its center is at (<em>tx<sub>i</sub></em>, <em>ty<sub>i</sub></em>). You can move coins one by one and can move each coin at most once. When you move a coin, it must move from its initial position to its target position along the straight line. In addition, coins cannot collide with each other, including in the middle of moves.</p>

<p>The score of the puzzle is the number of the coins you move from their initial position to their target position. Your task is to write a program that determines the maximum score for a given puzzle instance.</p>

### 입력

<p>The input consists of a single test case formatted as follows.</p>

<pre>
N
r<sub>1</sub> sx<sub>1</sub> sy<sub>1</sub> tx<sub>1</sub> ty<sub>1</sub>
.
.
.
r<sub>N</sub> sx<sub>N</sub> sy<sub>N</sub> tx<sub>N</sub> ty<sub>N</sub></pre>

<p>The first line contains an integer <em>N</em> (1 &le; <em>N</em> &le; 16), which is the number of coins used in the puzzle. The <em>i</em>-th line of the following <em>N</em> lines consists of five integers: <em>r<sub>i</sub></em>, <em>sx<sub>i</sub></em>, <em>sy<sub>i</sub></em>, <em>tx<sub>i</sub></em>, and <em>ty<sub>i</sub></em> (1 &le; <em>r<sub>i</sub></em> &le; 1,000, -1,000 &le; <em>sx<sub>i</sub></em>, <em>sy<sub>i</sub></em>, <em>tx<sub>i</sub></em>, <em>ty<sub>i</sub></em> &le; 1,000, (<em>sx<sub>i</sub></em>, <em>sy<sub>i</sub></em>) &ne; (<em>tx<sub>i</sub></em>, <em>ty<sub>i</sub></em>)). They describe the information of the <em>i</em>-th coin: <em>r<sub>i</sub></em> is the radius of the <em>i</em>-th coin, (<em>sx<sub>i</sub></em>, <em>sy<sub>i</sub></em>) is the initial position of the <em>i</em>-th coin, and (<em>tx<sub>i</sub></em>, <em>ty<sub>i</sub></em>) is the target position of the <em>i</em>-th coin.</p>

<p>You can assume that the coins do not contact or are not overlapped with each other at the initial positions. You can also assume that the maximum score does not change even if the radius of each coin changes by 10<sup>-5</sup>.</p>

### 출력

<p>Print the maximum score of the given puzzle instance in a line.</p>

### 힌트

<p>In the first example, the third coin cannot move because it is disturbed by the other two coins.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15524/1.png" style="height:260px; width:275px" /></p>

<p style="text-align:center">Example 1. Initial Positions</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15524/2.png" style="height:258px; width:278px" /></p>

<p style="text-align:center">Example 1. After Movements</p>