# [Platinum II] Replication - 20644

[문제 링크](https://www.acmicpc.net/problem/20644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 111, 정답: 62, 맞힌 사람: 45, 정답 비율: 58.442%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>The ill-fated result of watching too many &quot;do it yourself&quot; engineering videos on the web, Farmer John has accidentally released a self-replicating robot on his farm!</p>

<p>The farm can be represented by an $N\times N$ grid ($3\le N\le 1000$) where each grid cell is either empty or filled with rock, and all border squares are filled with rock. Some non-rock cells are designated as possible starting locations for the robot.</p>

<p>Farmer John initially places the robot at one of the possible starting positions. In every hour that follows, all copies of the robot move in one coordinated mass in the same direction, either north, south, east, or west. After every $D$ hours ($1 \leq D \leq 10^9$), every copy of the robot replicates --- a robot at cell $(x,y)$ that replicates creates new copies in cells $(x+1,y)$, $(x-1,y)$, $(x,y+1)$, and $(x,y-1)$; the original robot remains at $(x,y)$. Over time, multiple robots might come to occupy the same cell.</p>

<p>If moving or replicating would cause any of the robots to move into a rock, then all robots shut down immediately. Note that this implies that the robots must eventually shut down, due to the border of the farm being rock.</p>

<p>Help the cows figure out the number of empty squares that could potentially at some point in time hold a robot.</p>

### 입력

<p>The first line contains two space-separated integers $N$ and $D$. The next $N$ lines of input each contain $N$ characters. Each character is one of &#39;.&#39;, &#39;S&#39;, or &#39;#&#39;. &#39;.&#39; and &#39;S&#39; both represent empty cells, with &#39;S&#39; denoting a possible starting position for the robot. &#39;#&#39; denotes a rock.</p>

<p>All characters in the first and last row and first and last column are &#39;#&#39;.</p>

### 출력

<p>An integer counting the number of cells that could at some point in time hold a robot.</p>