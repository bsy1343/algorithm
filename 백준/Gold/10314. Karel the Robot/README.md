# [Gold III] Karel the Robot - 10314

[문제 링크](https://www.acmicpc.net/problem/10314)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 70, 정답: 23, 맞힌 사람: 14, 정답 비율: 29.787%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Karel wants to register his robot Karel for a robot contest. The aim of the contest is to escape from a maze. The maze is a square grid W units wide and H units high where every unit square is either a wall or free terrain. One of the squares with free terrain is designated as an exit.</p>

<p>The design of the robot was inspired by the ancient (it is even much older than CTU Open) educational programming language called Karel. The robot understands three commands: Step, Right, and Left. When executing the Step command, the robot moves to the neighboring square in the forward direction if possible. If the square one unit ahead is a wall or it lies outside the maze, the robot does not move. The Right command turns the robot 90<sup>◦</sup> clockwise and the Left command turns it 90◦ counterclockwise. The robot has a memory for a program consisting of up to 10 commands. After the robot executes the last command, it continues executing the program from the beginning.</p>

<p>The robot is initially positioned at some free square. We do not know its position but we know it is facing up (towards the neighboring square one row above). Karel wants to write a universal program that will make the robot escape from any such initial position. That means, the robot will eventually reach the exit during the program execution.</p>

<hr />
<p>This sounds like a nice contest problem, doesn&rsquo;t it? We want to give you an idea what it is like to organize a programming contest. Therefore, your task is to write a validator for the problem described above. (You may read more about validators in the validate problem.)</p>

### 입력

<p>The input contains several test cases. The first line of each input contains two space-separated integers: H and W satisfying 1 &le; H, W &le; 100. Each of the following H lines contains exactly W characters describing the maze. The character &ldquo;X&rdquo; means a wall, &ldquo;.&rdquo; is free terrain, and &ldquo;E&rdquo; is free terrain with the exit.</p>

<p>The next line contains a single integer L, 1 &le; L &le; 10, the length of the program. The last line of the test case contains L characters describing the commands of the program. The character &ldquo;S&rdquo; stands for Step, &ldquo;L&rdquo; for Left, and &ldquo;R&rdquo; for Right.</p>

### 출력

<p>Print a single line for each test case. The line must contain &ldquo;OK&rdquo; if the robot escapes for every initial position using the given program. Otherwise, the line contains the number of initial positions (including the exit), from which the robot escapes successfully</p>