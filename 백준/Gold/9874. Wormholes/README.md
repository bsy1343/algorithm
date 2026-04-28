# [Gold II] Wormholes - 9874

[문제 링크](https://www.acmicpc.net/problem/9874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 531, 정답: 207, 맞힌 사람: 141, 정답 비율: 38.525%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 백트래킹

### 문제 설명

<p>Farmer John&apos;s hobby of conducting high-energy physics experiments on weekends has backfired, causing N wormholes (2 &lt;= N &lt;= 12, N even) to materialize on his farm, each located at a distinct point on the 2D map of his farm.</p><p>According to his calculations, Farmer John knows that his wormholes will form N/2 connected pairs.  For example, if wormholes A and B are connected as a pair, then any object entering wormhole A will exit wormhole B moving in the same direction, and any object entering wormhole B will similarly exit from wormhole A moving in the same direction.  This can have rather unpleasant consequences.  For example, suppose there are two paired wormholes A at (0,0) and B at (1,0), and that Bessie the cow starts from position (1/2,0) moving in the +x direction.  Bessie will enter wormhole B, exit from A, then enter B again, and so on, getting trapped in an infinite cycle!</p><p>Farmer John knows the exact location of each wormhole on his farm.  He knows that Bessie the cow always walks in the +x direction, although he does not remember where Bessie is currently located.  Please help Farmer John count the number of distinct pairings of the wormholes such that Bessie could possibly get trapped in an infinite cycle if she starts from an unlucky position.</p>

### 입력

<ul><li>Line 1: The number of wormholes, N.</li><li>Lines 2..1+N: Each line contains two space-separated integers describing the (x,y) coordinates of a single wormhole.  Each coordinate is in the range 0..1,000,000,000.</li></ul>

### 출력

<ul><li>Line 1: The number of distinct pairings of wormholes such that Bessie could conceivably get stuck in a cycle walking from some starting point in the +x direction.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 wormholes, forming the corners of a square.</p><h4>Output Details</h4><p>If we number the wormholes 1..4, then by pairing 1 with 2 and 3 with 4, Bessie can get stuck if she starts anywhere between (0,0) and (1,0) or between (0,1) and (1,1).  Similarly, with the same starting points, Bessie can get stuck in a cycle if the pairings are 1-3 and 2-4.  Only the pairings 1-4 and 2-3 allow Bessie to walk in the +x direction from any point in the 2D plane with no danger of cycling.</p>