# [Platinum I] Particle - 11069

[문제 링크](https://www.acmicpc.net/problem/11069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 403, 정답: 64, 맞힌 사람: 32, 정답 비율: 11.940%

### 분류

중국인의 나머지 정리, 확장 유클리드 호제법, 수학, 정수론

### 문제 설명

<p>Sheldon is a physicist who studies high-energy particles movement and reactions. Sheldon developed a brilliant machine, named ICPC (Integrated Cool Particle Capturer) that can capture a single particle in a 2-dimensional rectangle R of size W &times; H in its hull. After a particle gets captured by ICPC, its movement is limited in the rectangle R while retaining its original speed. More specifically, any particle P captured by ICPC obeys the following rules:</p>

<ol style="list-style-type:lower-roman">
	<li>P always stays in the rectangle R without any speed reduction for all times.</li>
	<li>P moves straight until it hits any side of R.</li>
	<li>If P hits a side of R, then P perfectly reflects, as a light ray hits a flat mirror.</li>
	<li>If P reaches a corner of R, then P moves back in the direction opposite to the original direction</li>
</ol>

<p>Sheldon is doing his experiments with his machine ICPC. He captured a particle P in ICPC. When he has first observed the particle P, P was located at (x<sub>0</sub>,y<sub>0</sub>) in R, moving in direction vector (a,b). Note that the coordinate of a location in the rectangle R is represented by (x,y) with 0 &le; x &le; W and 0 &le; y &le; H. In the rectangle R, there are two special locations A and B whose coordinates are (x<sub>1</sub>,y<sub>1</sub>) and (x<sub>2</sub>,y<sub>2</sub>), respectively. Sheldon would like to know which of A and B is first reached by P, or if P does reach neither A nor B. You can help Sheldon by your programming skills.&nbsp;</p>

<p>Given all necessary values variables &nbsp;W, H, x<sub>0</sub>, y<sub>0</sub>, x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, a, b your program is to decide one of the three possibilities: P first reaches A before B, P first reaches B before A, or P can reach none of them. To make things simpler, assume that the particle P is very small as just a point. In addition, all the variables W, H, x<sub>0</sub>, y<sub>0</sub>, x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, a, b appeared above will be given as integers.</p>

### 입력

<p>Your program is to read from standard input. The input consists of T test cases. The number of test cases T is given in the first line of the input. Each test case consists of a single line with 10 integers separated by a single space that represent W, H, x<sub>0</sub>, y<sub>0</sub>, x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, a, b in order. Each of the 10 integers falls into the following range: 2 &le; W, H &le; 1,000,000, 0 &lt; x<sub>0</sub> &lt; W, 0 &lt; y<sub>0</sub> &lt; H, 0 &le; x<sub>1</sub>, x<sub>2</sub> &le; W, 0 &le; y<sub>1</sub>, y<sub>2</sub> &le; H, and -10,000 &le; a, b &le; 10,000. Also, note that (x<sub>0</sub>,y<sub>0</sub>) &ne; (x<sub>1</sub>,y<sub>1</sub>), (x<sub>0</sub>,y<sub>0</sub>) &ne; (x<sub>2</sub>,y<sub>2</sub>), (x<sub>1</sub>,y<sub>1</sub>) &ne; (x<sub>2</sub>,y<sub>2</sub>), and (a,b) &ne; (0,0).</p>

### 출력

<p>Your program is to write to standard output. Print exactly one line for each test case. The line should consist only of A if P reaches A before P reaches B, B if P reaches B before P reaches A, or O if P can reach none of A and B forever.</p>