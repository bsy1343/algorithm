# [Gold I] Temple Maze - 20724

[문제 링크](https://www.acmicpc.net/problem/20724)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>After a lifetime of careful research and dangerous expeditions into ancient ruins, Carla has finally found it--the long lost Temple of the Sun God! She lowers herself down into the underground temple, stepping off of her rope ladder to discover that she is now in the middle of a massive, square maze. Not to worry though, Carla has been studying this temple for years and made sure to bring a detailed, grid-based map of the maze. Based on her surroundings, she determines exactly where she must be standing in the maze, denoted by <code>@</code> on the map. From here, she wants to find a treasure called the <em>Glittering Sun Stone</em>, denoted <code>$</code> on the map. But of course, the Temple of the Sun God is littered with blocking walls, denoted <code>#</code>, that divide the maze into sections. The maze also has numerous gates, each marked with an ancient rune. Carla knows that there are special levers scattered about the maze that can be used to lower all gates marked with a particular rune. On her map, levers are represented by lowercase letters and gates are represented by uppercase letters. Each lever lowers all gates that have the same letter as the lever; for example, the <code>a</code> lever lowers all <code>A</code> gates.</p>

<p>Carla must hurry to find the Sun Stone. She is already being hunted by a band of thieves who would rather sell the stone off at auction than give it to a museum! Help Carla figure out the fastest path to the <em>Glittering Sun Stone</em> from her current location!</p>

<p>Carla can only travel from one maze cell to a neighboring cell immediately above, below, or to the left or right of her current location. She may walk through empty spaces, levers, and gates that have already been lowered. Carla cannot leave the boundaries of the maze (the entire maze is surrounded by solid rock). When Carla walks through a lever cell, she automatically pulls it. Note that there may be multiple gates and levers of the same letter. Pulling any one lever labeled with a letter lowers all gates of the corresponding letter.</p>

### 입력

<p>The first line contains a single integer $n$ ($3 \leq n \leq 2 \cdot 10^2$), the width and height, in grid cells, of the underground maze. The next $n$ lines each contain $n$ characters, with each character representing one cell in the maze, as described above. Empty cells in the maze are denoted by a <code>.</code> character. There will be at most $10$ unique runes marking levers and gates in the maze, so only the characters <code>a</code> through <code>j</code> and <code>A</code> through <code>J</code> are used to represent levers and gates in the input. The grid will consist only of valid characters, and will contain exactly one <code>$</code> and one <code>@</code>.</p>

### 출력

<p>Print the minimum number of steps (grid cell transitions) that Carla needs to take in order to reach the <em>Glittering Sun Stone</em>. If no path to the Sun Stone is possible, print <code>IMPOSSIBLE</code> instead.</p>