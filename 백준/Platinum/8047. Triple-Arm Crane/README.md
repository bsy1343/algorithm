# [Platinum V] Triple-Arm Crane - 8047

[문제 링크](https://www.acmicpc.net/problem/8047)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 8, 정답 비율: 53.333%

### 분류

애드 혹, 그리디 알고리즘

### 문제 설명

<p>A triple-arm crane places containers on railway wagons. The wagons are numbered in order 1,2,&hellip;. On each wagon at most one container can be put. In one move the crane gets three containers from a storehouse and places them on wagons with numbers i, i+p and i+p+q, or on wagons with numbers i, i+q and i+p+q (for some constants p,q &ge; 1). The crane has to be programmed in such way, that it loads with containers the first n wagons of the train (the train has n+p+q wagons). The program consists of sequence of instructions. Each instruction describes one move of the crane. Such instruction forms a (x, y, z) triple, where 1 &le; x &lt; y &lt; z &le; n+p+q, and determines numbers of wagons, on which the crane has to place the containers. The program is correct if after its execution there is exactly one container on each of the first n wagons of the train.</p>

<p>
Write a program which:</p>

<ul>
	<li>reads a description of the crane (numbers p and q) and a number of wagons to be loaded (n) from the standard input,</li>
	<li>generates a correct program for the crane,</li>
	<li>writes it to the standard output.</li>
</ul>

### 입력

<p>The first and the only line of the standard input contains exactly three positive integers separated by single spaces. These are adequately numbers p and q describing parameters of the crane and number n, being the number of the first wagons of the train to be loaded. These numbers satisfy inequalities 1 &le; n &le; 300,000, 2 &le; p+q &le; 60,000.</p>

<p>&nbsp;</p>

### 출력

<p>The first line of the standard output should consist of exactly one integer m being the number of instructions in the program generated. Each of the next m lines should consist of exactly three integers x, y, z separated by single spaces, 1 &le; x &lt; y &lt; z &le; n+p+q, x &le; n, y belongs to x+p,x+q, z=x+p+q. These are the numbers of the wagons, on which the crane has to put containers in a consecutive move.</p>

<p>&nbsp;</p>