# [Gold III] Containers - 8100

[문제 링크](https://www.acmicpc.net/problem/8100)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>We are given n&nbsp;containers, where 1 &le; n &le; 4. At the beginning all of them are full of water. The liter capacity of the i-th container is a natural number o<sub>i</sub>&nbsp;satisfying inequalities&nbsp;1 &le; o<sub>i</sub> &le; 49.</p>

<p>Three kinds of moves can be made:</p>

<ul>
	<li>Pouring the whole content of one container into another. This move can be made unless there is too little room in the second container.</li>
	<li>Filling up one container with part of the water from another one.</li>
	<li>Pouring away the whole content of one container into a drain.</li>
</ul>

<p>Write a program that:</p>

<ul>
	<li>reads form the standard input the number of containers n, the capacity of each container and the requested final amount of water in each container,</li>
	<li>verifies, whether there exist a series of moves which leads to the requested final situation, and if there is one, the program computes the minimal number of moves leading to the requested situation,</li>
	<li>writes the result into the standard output. The result should be the minimal number of moves leading to the requested final situation, or one word&nbsp;<code>NIE</code>&nbsp;(&ldquo;no&rdquo; in Polish) if there is no such a sequence of moves.</li>
</ul>

### 입력

<p>In the first line of the standard input one positive integer n&nbsp;is written (n &le; 4), this is the number of containers. There are n&nbsp;positive integers written in the second line. These are the capacities of the containers (the i-th integer o<sub>i</sub>&nbsp;denotes the capacity if the i-th container,&nbsp;1 &le; o<sub>i</sub> &le; 49). In the third line of the input file there are written n&nbsp;numbers. These are the requested final volumes of water in the containers (the i-th integer w<sub>i</sub>&nbsp;denotes the requested final volume of water in the i-th container, 1 &le; w<sub>i</sub> &le; o<sub>i</sub>). All integers in the second and the third line are separated by single spaces.</p>

### 출력

<p>If it is not possible to result in requested final situation making only allowed moves, your program should write only one word&nbsp;<code>NIE</code>&nbsp;to the standard output, otherwise only one integer equal to the minimal number of moves which lead to the requested final situation should be written.</p>