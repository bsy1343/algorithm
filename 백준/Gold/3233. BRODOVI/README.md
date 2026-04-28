# [Gold I] BRODOVI - 3233

[문제 링크](https://www.acmicpc.net/problem/3233)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 23, 맞힌 사람: 19, 정답 비율: 57.576%

### 분류

다이나믹 프로그래밍, 누적 합, 스위핑

### 문제 설명

<p>During his childhood, Mirko liked to play &ldquo;Sea battle&rdquo; a lot, but once he got bored of it and invented a new game imaginatively called &ldquo;Ships catch fish on a river&rdquo;.</p>

<p>The game board consists of N fields lined up in a row and numbered 1 to N in ascending order from left to right. These fields represent a river on which M ships are to be placed. For each field the amount of fish swimming in that part of the river is known. Every ship has a specific length, i.e. it occupies the specific number of consecutive fields. A ship must somewhere drop an anchor but is allowed to do that in a certain field only. That means that one of the fields a ship will occupy is predetermined.</p>

<p>There can be only one ship or a part of only one ship on a single field of the board. We define the total amount of fish caught as the sum of amounts of fish swimming in all fields occupied by ships.</p>

<p>Goal of the game is to place all ships on the river in a way that the total amount of fish caught is maximal.</p>

<p>While playing an instance of this game, Mirko is in doubt whether the way he placed ships is optimal. Therefore he asked you to help him calculate the maximum possible amount of fish caught.&nbsp;</p>

### 입력

<p>First line of the input file contains an integer N, the number of fields on board, 1 &le; N &le; 100000.</p>

<p>In the next line there are N integers, separated by whitespaces, which represent the amounts of fish swimming in appropriate field, given in kilograms. These numbers will not be less than 1 nor greater than 100.</p>

<p>The next line contains an integer M, number of the ships, 1 &le; M &le; N.</p>

<p>Each of the following M lines consists of two integers B and D separated by a whitespace. That means that the appropriate ship should drop the anchor in a field numbered with B and that its length is D.</p>

<p>Note: input data will always be such that the solution will exist&nbsp;</p>

### 출력

<p>The only line of the output file should contain the maximum possible total amount of fish caught.&nbsp;</p>