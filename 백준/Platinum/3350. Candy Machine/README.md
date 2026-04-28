# [Platinum I] Candy Machine - 3350

[문제 링크](https://www.acmicpc.net/problem/3350)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 182, 정답: 78, 맞힌 사람: 70, 정답 비율: 45.161%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>In a candy factory, there is a mysterious machine. It produces delicious candies, each a little bit different from the others. The machine has a line of output slots, numbered 1 to n, from which the candies fall out as soon as they are ready. No one really knows how the machine works, but before it starts a production session, it prints a list telling the factory owner, when and from which slot each candy will fall out.</p>

<p>Now, the factory owner can install automatic wagons that move below the output slots to catch the falling candies. Of course, none of the candies should drop on the floor and get spoilt. However, since running the wagons is expensive, the owner would like to install as few wagons as possible.</p>

<p>Write a program that computes the minimum number of wagons needed to catch all candies. Moreover, your program shall output which wagon should catch which candy. The wagons run at a speed of one slot width per second. Before the production process starts, each wagon can be moved to the slot where it should catch its first candy.</p>

### 입력

<p>The input is read from standard input, and describes one production session of the machine. The first line contains exactly one integer n, the number of candies produced in that session. Each of the following n lines contains a pair of integers s<sub>i</sub> and t<sub>i</sub>, output slot and time for candy i. Each pair (s<sub>i</sub>, t<sub>i</sub>) is unique.</p>

### 출력

<p>Output should be written to standard output. The first line of the output contains exactly one integer w, the minimum number of wagons needed to catch all candies. The wagons are numbered from 1 to w. The following n lines indicate which wagon will catch which candy. For that purpose, each of these lines contains three integers: output slot s<sub>j</sub> and output time t<sub>j</sub> for some candy j and a wagon number w(j), such that at time t<sub>j</sub> wagon w(j) will be at slot s<sub>j</sub> and therefore be able to catch candy j.</p>

<p>Since all candies shall be caught, each slot and time pair given in one input line must appear in exactly one output line (in any order). If there is more than one solution, output any one.</p>

### 제한

<ul>
	<li>1 &le; n &le; 100000</li>
	<li>0 &le; s<sub>i</sub>, t<sub>i</sub> &le; 1000000000</li>
</ul>