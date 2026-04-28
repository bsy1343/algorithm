# [Gold I] Maximum Damage - 7002

[문제 링크](https://www.acmicpc.net/problem/7002)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 누적 합, 많은 조건 분기, 스위핑

### 문제 설명

<p>The orcs and the elves have been fighting for a long time, and the war between them has come to a critical juncture. The elves have detected all the locations for the orc camps, and marked them on a map of the battle ground. To simplify their calculations, elves have laid out a coordinate grid over the battleground, and they treat each unit square as a point (with integer coordinates). So the location of each orc camp is given by a pair of integers, denoting the x- and y-coordinates. The elves would like to build a limited number of Elf stations to attack those camps. Each of the stations is capable of inflicting 1 unit of damage to each of the orc camps within a distance R (from the station). Thus the total damage that a single Elf station can inflict is given by the number of orc camps within distance R from it.</p>

<p>However, &ldquo;distance&rdquo; between two points on the battle ground is not the standard straight-line distance between them. This is because the horse trails that the elves would use to launch the attacks are laid horizontally and vertically, in a grid-like manner. So, given two locations P<sub>1</sub> and P<sub>2</sub> on the battle ground , the distance between them is:</p>

<p style="text-align: center;">D(P<sub>1</sub>, P<sub>2</sub>) = |P<sub>1</sub>.x - P<sub>2</sub>.x| + |P<sub>1</sub>.y - P<sub>2</sub>.y|</p>

<p>where P<sub>1</sub>.x and P<sub>1</sub>.y denote the x- and y-coordinates of P1. Given the above discretization assumption, all the coordinates are positive integers.</p>

<p>The elves have also noticed that parts of the battle ground are too rugged to build an Elf station on &ndash; they call such locations &ldquo;obstacles&rdquo;. With all the information in hand, the elves would like to identify the ideal locations to build a given number T of Elf stations, so as to inflict the maximum possible damage on the orc camps.</p>

<p>The battle ground is described by a rectangular map where each location is annotated using one of three: &rsquo;*&rsquo;, &rsquo;O&rsquo; and &rsquo;X&rsquo;. An asterisk &rsquo;*&rsquo; represents a blank space (a location at which an Elf station can be built), a letter &rsquo;O&rsquo; represents an orc camp and a letter &rsquo;X&rsquo; means an obstacle (a location that none of the Elf stations can be built on). A legal battleground map is shown below.</p>

<pre>
**O**
*OXO*
*****
**O**</pre>

### 입력

<p>The first line in the test data file contains the number of test cases (&lt; 15). Each of the test cases is continued one after another.</p>

<p>For each test case, the first line contains 4 integers: N, M, T, R. The first two, N and M, indicate the size of the battleground along the y and x axes, respectively. T represents the number of Elf stations that can be placed on the map. R represents the maximum attack distance for each Elf station.</p>

<p>Following N lines, each of which contains a string of M characters, represents the map of the battleground.</p>

### 출력

<p>For each test case, you are to output one line containing only one integer, representing the maximum harm that can be inflicted upon the orc camps.</p>

### 제한

<ul>
	<li>1 &le; N,M &le; 1000</li>
	<li>1 &le; T &le; 10<sup>6</sup></li>
	<li>1 &le; R &le; 10<sup>8</sup></li>
</ul>