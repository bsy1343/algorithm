# [Platinum III] Electronical Plate - 3396

[문제 링크](https://www.acmicpc.net/problem/3396)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

그래프 이론, 최대 유량, 역추적

### 문제 설명

<p>A square grid is carved on the top of a square plate. The place where two gridlines cross is called a node. There are n &times; n nodes in the grid.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/ecb7bc0f-2ca8-47ea-bee8-e7e13a8766d2/-/preview/" style="width: 528px; height: 178px;" /></p>

<p style="text-align: center;">Figure 2. The problem (center) and the solution (right)</p>

<p>Some nodes contain pins. The task is to connect those pins to the nodes on the boundary of the plate using electronic circuits. A circuit can be laid out only on the grid (e.g. it can&rsquo;t be laid out slantwise). Any two circuits can&rsquo;t have a common point, therefore any two circuits can&rsquo;t be laid out on the same gridline, nor on the same node. A circuit can&rsquo;t be laid out on the boundary grid (the circuit must be finished as soon as it reaches boundary) nor on a node, containing another pin.</p>

<p>An example of an electronic plate containing pins is given in figure 2, center. Black dots in the picture represent pins.</p>

<p>Problem. Write a program to connect as many pins as possible to the nodes on the boundary. The pins which are already on the boundary satisfy the requirements and there is no need to make any circuits for them.</p>

<p>If there exists more that one solution find any of them.</p>

### 입력

<p>The first line of this file contains an integer n(3 &le; n &le; 15).</p>

<p>Each of the following n lines consists of n digits separated by one space. The digits can be 1 or 0. One (1) means a pin, zero (0) means a node without a pin in the appropriate place of the grid.</p>

<p>The nodes are numbered from 1 to n &times; n first from left to right and then from the top to bottom (row-major order). The number of the node the pin is on is the identifier of the pin.</p>

### 출력

<p>Write k - the maximum number of pins connected to the boundary using electronic circuits - in the first line of the file. A circuit connecting an appropriate pin to the boundary should be described in each of the following k lines. First comes the identifier of the pin, then the sequence of letters, describing the directions of the circuit: E - to the East, W - to the West, N - to the North, S - to the South. One space should be left between the identifier and the sequence of letters, and no spaces should be left between the letters in the sequence.</p>