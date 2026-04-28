# [Gold IV] Maze - 4038

[문제 링크](https://www.acmicpc.net/problem/4038)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 6, 맞힌 사람: 3, 정답 비율: 15.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>We are all familiar with conventional mazes laid out on a 2-D grid. A 3-D maze can be constructed as follows: Consider a hollowed out cube aligned along the x, y and z axes with one corner at (0,0,0) and the opposite corner at (n &minus; 1,n &minus; 1,n &minus; 1). On each face of the cube is a 2-D maze made by removing a subset of 1 &times; 1 &times; 1 cubes from the face (no edge cubes are removed). The object of the maze is to move a marker located inside the cube from an initial location of (1,1,1) to the final destination of (n &minus; 2,n &minus; 2,n &minus; 2). However, attached to this marker are 6 rods, each protruding through one face of the cube. The movement of these rods is constrained by the 2-D mazes on the faces. The picture below gives an example of a 7 &times; 7 &times; 7 maze. Note that this maze is not physically realizable since some faces (e.g., the front face containing the letter &ldquo;A&rdquo;) have cubes that are disconnected from the edges of the face. Such mazes are allowed in this problem.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4038.%E2%80%85Maze/c54df323.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4038.%E2%80%85Maze/c54df323.png" data-original-src="https://www.acmicpc.net/upload/images2/maze(1).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:265px; width:326px" /></p>

<p>The black regions indicate open spaces where the rods can move. The figure to the right specifies the possible directions that the rods can move (Forward, Back, Left, Right, Up, Down) and also defines the labels for the six sides of the cube. In the maze above, the rods are shown in their initial position centered at (1,1,1). From here they can not move Forward, Backward, Right, Left or Down, but they can move Up (assuming there are open spaces for the two back rods to move to).</p>

<p>To specify a cube, a description of each face must be given. For this problem, the order and orientations of each face are given in the diagram below.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/4038.%E2%80%85Maze/7cb57e83.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/4038.%E2%80%85Maze/7cb57e83.png" data-original-src="https://www.acmicpc.net/upload/images2/maze2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:93px; width:510px" /></p>

<p>The first square represents the Forward face oriented so that the shared edge with the Up face is on top and the shared edge with the Right face is on the right, the second square represents the Right face oriented with the shared edge with the Up face on top and the shared edge with the Back face on the right, and so on. Your job is to solve such mazes in the minimum number of moves.</p>

### 입력

<p>Each test case will start with a single line containing the value of n, where n lies between 4 and 30, inclusive. Next will come descriptions of each face in the order and orientation shown above. The description of each face will consist of n lines each containing one string of length n. The characters in the string will be either a blank or &lsquo;X&rsquo;, indicating either an empty or full square, respectively. The last test case will be followed by a line containing 0.</p>

### 출력

<p>Output will consist of one line for each test case. Each line will contain a description of a minimum-move solution that moves the marker from cell (1,1,1) to cell (n &minus; 2,n &minus; 2,n &minus; 2). Moves are either F, B, L, R, U or D. In case of a tie, choose the sequence of moves which is lexicographically first, where we consider F &lt; B &lt; L &lt; R &lt; U &lt; D. All mazes will have solutions.</p>