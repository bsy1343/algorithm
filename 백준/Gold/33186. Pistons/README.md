# [Gold III] Pistons - 33186

[문제 링크](https://www.acmicpc.net/problem/33186)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 11, 맞힌 사람: 11, 정답 비율: 100.000%

### 분류

구현, 시뮬레이션, 차분 배열 트릭

### 문제 설명

<p>Maryam, a famous mathematician, recently has bought an old vintage car. This car uses a combustion engine to generate the power needed to move the car. Inside the engine, there are $n$ cylinders of length $m$ and inside each cylinder, there is a piston constantly moving up and down. All pistons move independently and at the same speed. At any given time, the position of a piston inside a cylinder can be shown with an integer from $0$ to $m$, which also describes the area of the cylinder occupied by the piston. A piston instantly changes its direction when it reaches the top (position $m$) or bottom (position $0$) of its cylinder.</p>

<p>Maryam managed to determine the position and direction of all the pistons at a specific time. Now she is curious about the maximum total area occupied by all the pistons. Help Maryam find out this value.</p>

### 입력

<p>The first line of input contains two integers $n$ and $m$ ($1 \le n \le 10^5$, $1 \le m \le 10^6$), describing the number of pistons and the length of cylinders, respectively. Each of the next $n$ lines describe the position and direction of a single piston. The $(i + 1)$th line of the input contains an integer $p_i$ ($0 \le p_i \le m$), and a character $d_i$ ($d_i \in \{$<code>U</code>, <code>D</code>$\}$), the initial position of the $i$<sup>th</sup> piston and its direction (Up or Down), respectively.</p>

### 출력

<p>Print a single integer, the maximum total area occupied by all the pistons.</p>