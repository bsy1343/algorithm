# [Gold I] Mirror Maze - 34296

[문제 링크](https://www.acmicpc.net/problem/34296)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

그리디 알고리즘, 많은 조건 분기, 수학, 정수론, 해 구성하기, 확장 유클리드 호제법

### 문제 설명

<p>George's birthday is coming up, and his friends are excitedly planning his birthday party. They have already bought his presents and are now planning out the location for the party. After some deliberation, they have decided to host George's party in a mirror maze. Each section of the mirror maze consists of two parallel walls facing each other on which mirrors are placed. This creates the effect of seeing infinite reflections of oneself if you look at one of the walls.</p>

<p>George's friends did some research on how to build mirror mazes, and they discovered that a section of a mirror maze is fun only if the $k$-th reflection of the viewer appears $d$ meters away when the viewer looks at one of the mirrors. George's friends feel confident that they can now build the mirror maze, but they need help figuring out where to put the mirrors so that George will have the most fun. They are planning on building $n$ sections of the maze, and they know when George enters a section of the maze he will be looking to the left. For each section of the maze, they will build a mirror $x$ meters to the left of where George will be and $y$ meters to the right. Because of construction constraints, the distances $x$ and $y$ must be integers between $1$ and $10^9$. Help George's friends figure out where to place the mirrors for each section such that the $k$-th reflection is $d$ meters away or determine it is impossible to place the mirrors to construct a fun section.</p>

### 입력

<p>The first line of input is $n$ ($1 \leq n \leq 10^5$), the number of sections in the maze.</p>

<p>Each of the next $n$ lines will consist of two numbers $k$ and $d$ ($1 \leq k,d \leq 10^9$), where $d$ is the distance in meters where the $k$-th reflection should appear.</p>

### 출력

<p>Output $n$ lines, one for each section of the maze. For each section, output two numbers, $x$ and $y$, the left and right distances of the mirrors, or "<code>impossible</code>" (without quotes) if no combination of left and right distances will result in the $k$-th reflection appearing $d$ meters away.</p>

<p>There may be more than $1$ pair of $x$ and $y$ that satisfy the constraints, you may print any such pair as long as $1 \leq x,y \leq 10^9$. It can be shown that if it is possible to place mirrors to create a fun section then there is a pair $x$ and $y$ such that $1 \leq x,y \leq 10^9$ which creates a fun section.</p>