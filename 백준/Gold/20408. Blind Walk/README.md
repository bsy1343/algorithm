# [Gold IV] Blind Walk - 20408

[문제 링크](https://www.acmicpc.net/problem/20408)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 92, 정답: 22, 맞힌 사람: 15, 정답 비율: 19.481%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>Your task is to write a program that controls a robot which blindly walks through a maze. The maze is n&times;m (1 &le; n, m &le; 30) rectangular grid that consists of square cells. Each cell is either empty or blocked. All cells on the border of the maze are blocked. The robot starts in an empty cell. It can move south, west, north, or east to an adjacent empty cell. The robot is blind and has only bump sensors, so when it attempts to move it can either succeed or bump into blocked cell and fail.</p>

<p>The robot has to visit all empty cells in the maze. All cells are guaranteed to be reachable.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/310300f0-fc9e-4d1d-98a7-7ac9a9cc26ce/-/preview/" style="width: 73px; height: 61px;" /></p>

<p>The picture shows sample maze where blocked cells are, filled and initial robot&rsquo;s location is designated with a circle.</p>

### 입력

<p>Each line of the standard input represents response on robot&rsquo;s action. It is either a string EMPTY if robot has successfully moved in the specified direction to an adjacent cell or a string BLOCKED if robot&rsquo;s movement has failed because the corresponding adjacent cell was blocked.</p>

### 출력

<p>Each line of the standard output represents robot&rsquo;s action. It is one of the following five strings: <code>SOUTH</code>, <code>WEST</code>, <code>NORTH</code>, <code>EAST</code>, or <code>DONE</code>. <code>DONE</code> must be printed when the robot has visited all empty cells. After printing <code>DONE</code> your program must exit. You must flush standard output after printing each action.</p>