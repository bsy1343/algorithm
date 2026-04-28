# [Platinum III] Cleaning Robot - 22924

[문제 링크](https://www.acmicpc.net/problem/22924)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 2048 MB (추가 메모리 없음)

### 통계

제출: 98, 정답: 44, 맞힌 사람: 40, 정답 비율: 48.780%

### 분류

그래프 이론, 그래프 탐색, 누적 합, 너비 우선 탐색, 매개 변수 탐색, 차분 배열 트릭

### 문제 설명

<p>A company wishes to purchase a square-shaped cleaning robot to clean a rectangularly shaped room. Some parts of the room are obstructed.&nbsp;</p>

<p>There are different robots of different sizes. Each robot can move horizontally and vertically in the room if no part of the robot intersects an obstruction. They are incapable of changing orientation, so movements are always axis-aligned. Larger robots will get the job done faster, but are more likely to be hindered by obstructions. The robot must always remain fully in the room with no portion extending past the edges of the rectangle.</p>

<p>What is the largest robot the company can buy that will be able to clean all the squares of the room not occupied by obstructions?</p>

### 입력

<p>The first line of input contains three integers $n$, $m$ ($3 \le n, m$ and $n \cdot m \le 5\cdot 10^6$) and \hbox{$k$ ($0 \le k &lt; n \cdot m$, $k &lt; 10^6$)}, where $n$ and $m$ are the dimensions of the room in inches, and $k$ is the number of obstructions.</p>

<p>Each of the next $k$ lines contains two integers $i$ and $j$ ($1 \le i \le n, 1 \le j \le m$). This specifies that the one-inch square at $(i,j)$ is obstructed. All obstructed squares are distinct.</p>

### 출력

<p>Output a single integer, which is the maximum length of one side of the largest square-shaped robot that could clean the entire room, or $-1$ if no such robot could clean the entire room.</p>