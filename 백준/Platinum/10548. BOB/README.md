# [Platinum III] BOB - 10548

[문제 링크](https://www.acmicpc.net/problem/10548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 72, 정답: 42, 맞힌 사람: 38, 정답 비율: 71.698%

### 분류

조합론, 자료 구조, 다이나믹 프로그래밍, 수학, 세그먼트 트리, 스택

### 문제 설명

<p>Little Bob is a famous builder. He bought land and wants to build a house. Unfortunately, the problem is the land&rsquo;s terrain, it has a variable elevation.</p>

<p>The land is shaped like a rectangle, N meters wide and M meters long. It can be divided into N&middot;M squares (see the image). Bob&rsquo;s house will be shaped like a rectangle that has sides parallel with the land&rsquo;s edges and its vertices coincide with the vertices of the squares. All the land covered by Bob&rsquo;s house must be of equal elevation to prevent it from collapsing.</p>

<p style="text-align: center;"><img alt="" src="/upload/images2/land.png" style="height:130px; width:78px" /></p>

<p style="text-align: center;">The land divided into squares.<br />
Two possible locations of house are marked with red and blue.</p>

<p>Calculate the number of ways Bob can build his house!</p>

### 입력

<p>The first line of input contains integers N and M (1 &le; N, M &le; 1 000).</p>

<p>Each of the following N lines contains M integers a<sub>ij</sub> (1 &le; a<sub>ij</sub> &le; 10<sup>9</sup>), respectively the height of each square of land.</p>

<p>Warning: Please use faster input methods beacuse the amount of input is very large. (For example, use scanf instead of cin in C++ or BufferedReader instead of Scanner in Java.)</p>

### 출력

<p>The first and only line of output must contain the required number from the task statement.</p>

### 힌트

<p>Clarification of the first example: Some of the possible house locations are rectangles with opposite vertices in (0,0)-(1,1), (0,0)-(0,2) (height 2) i (2,0)-(2,2), (1,2)-(2,2) (height 1). The first number in the brackets represents the row number and the second one the column number (0-indexed).</p>