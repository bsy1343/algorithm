# [Gold III] SEARCH - 3296

[문제 링크](https://www.acmicpc.net/problem/3296)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 87.500%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Young Ralph &lsquo;borrowed&rsquo; a car drove off to a town for a fun. What he did not know was that the car belonged to police and it had a device that was supposed to send information about car&rsquo;s motion.</p>

<p>The device is rather old and it sends only information about a direction of car&rsquo;s motion.</p>

<p>Write a program that will help police to find the car using a map of the town, its initial position and a sequence of directions the car drove. The program should determine all possible final positions of the car.</p>

<p>A map of the town is rectangular and characters are used to describe where a car can and where cannot drive. Dots (&lsquo;.&rsquo;) denote places of town where a car can drive, characters &lsquo;X&rsquo; denote places of town where a car cannot drive. The initial position of car Ralph drove is denoted with character &lsquo;*&rsquo;. A car can drive through the initial position.</p>

<p>A car can drive in four directions: to the north (up), to the south (down), to the west (left) and to the east (right).</p>

<p>A description of Ralph&rsquo;s movements with a car is given with a sequence of directions. In every given direction Ralph drove his car through one or more passable places of town.</p>

### 입력

<p>The first line of input file contains two natural numbers R and C, 1 &le; R &le; 50, 1 &le; C &le; 50, separated by a space character, numbers of rows and columns of town&rsquo;s map.</p>

<p>Each of next R lines contain a sequence of C characters (&lsquo;.&rsquo; (a dot), &lsquo;X&rsquo; &nbsp;&lsquo;*&rsquo;) describing corresponding part of the map.</p>

<p>The following, (R+2)th line contains a natural number N, 1 &le; N &le; 1000, length of a sequence of directions.</p>

<p>Each of the following N lines contains one of the following sequences of characters: NORTH, SOUTH, WEST and EAST, describing directions of car&rsquo;s movements.</p>

<p>No two consecutive directions are the same.</p>

### 출력

<p>Output file should contain the map of the town in R lines (as in input file), where character &lsquo;*&rsquo; should denote only possible final positions of the car.</p>