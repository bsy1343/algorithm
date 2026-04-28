# [Gold IV] Bathroom Stalls (Small2) - 14793

[문제 링크](https://www.acmicpc.net/problem/14793)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 165, 정답: 125, 맞힌 사람: 106, 정답 비율: 78.519%

### 분류

자료 구조, 집합과 맵, 우선순위 큐, 트리를 사용한 집합과 맵

### 문제 설명

<p>A certain bathroom has&nbsp;<strong>N</strong>&nbsp;+ 2 stalls in a single row; the stalls on the left and right ends are permanently occupied by the bathroom guards. The other&nbsp;<strong>N</strong>&nbsp;stalls are for users.</p>

<p>Whenever someone enters the bathroom, they try to choose a stall that is as far from other people as possible. To avoid confusion, they follow deterministic rules: For each empty stall S, they compute two values L<sub>S</sub>&nbsp;and R<sub>S</sub>, each of which is the number of empty stalls between S and the closest occupied stall to the left or right, respectively. Then they consider the set of stalls with the farthest closest neighbor, that is, those S for which min(L<sub>S</sub>, R<sub>S</sub>) is maximal. If there is only one such stall, they choose it; otherwise, they choose the one among those where max(L<sub>S</sub>, R<sub>S</sub>) is maximal. If there are still multiple tied stalls, they choose the leftmost stall among those.</p>

<p><strong>K</strong>&nbsp;people are about to enter the bathroom; each one will choose their stall before the next arrives. Nobody will ever leave.</p>

<p>When the last person chooses their stall S, what will the values of max(L<sub>S</sub>, R<sub>S</sub>) and min(L<sub>S</sub>, R<sub>S</sub>) be?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow. Each line describes a test case with two integers&nbsp;<strong>N</strong>&nbsp;and&nbsp;<strong>K</strong>, as described above.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>K</strong>&nbsp;&le;&nbsp;<strong>N</strong>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>6</sup>.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y z</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1),&nbsp;<code>y</code>&nbsp;is max(L<sub>S</sub>, R<sub>S</sub>), and&nbsp;<code>z</code>&nbsp;is min(L<sub>S</sub>, R<sub>S</sub>) as calculated by the last person to enter the bathroom for their chosen stall S.</p>

### 힌트

<p>In Case #1, the first person occupies the leftmost of the middle two stalls, leaving the following configuration (<code>O</code>&nbsp;stands for an occupied stall and&nbsp;<code>.</code>&nbsp;for an empty one):&nbsp;<code>O.O..O</code>. Then, the second and last person occupies the stall immediately to the right, leaving 1 empty stall on one side and none on the other.</p>

<p>In Case #2, the first person occupies the middle stall, getting to&nbsp;<code>O..O..O</code>. Then, the second and last person occupies the leftmost stall.</p>

<p>In Case #3, the first person occupies the leftmost of the two middle stalls, leaving&nbsp;<code>O..O...O</code>. The second person then occupies the middle of the three consecutive empty stalls.</p>

<p>In Case #4, every stall is occupied at the end, no matter what the stall choices are.</p>

<p>In Case #5, the first and only person chooses the leftmost middle stall.</p>