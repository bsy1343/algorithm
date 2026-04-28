# [Gold IV] Jam Factory - 10200

[문제 링크](https://www.acmicpc.net/problem/10200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 69, 정답: 15, 맞힌 사람: 11, 정답 비율: 18.644%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Gru is making jam in his underground laboratory in an attempt to start a new legitimate career. Minions crush fruit in a number of giant vats. To make jam, these vats must be connected together by large pipes. After the failure of his last batch of jam, Gru wants to try making something new by combining two types of fruit.</p>

<p>You are given the costs of connecting pairs of vats with pipes. Your goal is to find the least expensive way to connect together two vats v<sub>1</sub>, v<sub>2</sub> with the vat v<sub>d</sub> leading to the bottling machine. Fruit from both vats v<sub>1</sub>, v<sub>2</sub> must be able to reach vat v<sub>d</sub>. They may share part of the piping, though it is not required. In some cases it may not be possible to connect both vats to the vat leading to the bottling machine.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/45741a84-9651-4c0b-9bd4-f6dfb37d0790/-/preview/" style="width: 543px; height: 166px;" /></p>

<p>The figure above shows two examples, each example contains 5 vats and 5 possible pipes for connecting the vats. Vats 1 and 2 need to be connected to vat 5, which leads to the bottling machine. In the example on the left, the cost of each pipe is 1, so the minimal cost of connecting vats 1 and 2 to vat 5 is 3, achieved by building pipes from 1 to 4, 2 to 4, and from 4 to 5 (as shown by the solid lines).</p>

<p>In the example on the right, the cost of a pipe between vats 1 and 4 has been increased to 4. Now the minimal cost of connecting vats 1 and 2 to vat 5 is 4, achieved by building pipes from 1 to 3, 3 to 5, 2 to 4, and 4 to 5 (as shown by the solid lines).</p>

<p>The parameters of this problem may be quite large. There may be several hundred vats with several thousand possible pipes. Exhaustively checking all possible connections between vats will not work within the time allowed.</p>

### 입력

<p>Input consists of multiple test cases. Each test case begins with a single line consisting of five numbers: the number of vats v, the number of possible pipes connecting vats p, the numbers of the two vats to be connected (v<sub>1</sub> and v<sub>2</sub>), and the number of the vat connected to the bottling machine v<sub>d</sub>.</p>

<p>There are then p additional lines consisting of three numbers: the two vats (v<sub>x</sub> and v<sub>y</sub>), and the cost of connecting them with piping. Following the last test case is a line containing only 0.</p>

### 출력

<p>For each test case, print the lowest cost on as single line in the following format: Cost of connecting v<sub>1</sub> and v<sub>2</sub> to v<sub>d</sub> is c</p>

<p>If either vat cannot be connected to the vat leading to the bottling machine, print out the following line: Cannot connect v<sub>1</sub> and v<sub>2</sub> to v<sub>d</sub></p>