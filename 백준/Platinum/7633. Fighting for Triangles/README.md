# [Platinum III] Fighting for Triangles - 7633

[문제 링크](https://www.acmicpc.net/problem/7633)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 5, 맞힌 사람: 5, 정답 비율: 45.455%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Andy and Ralph are playing a two-player game on a triangular board that looks like the following:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7633.%E2%80%85Fighting%E2%80%85for%E2%80%85Triangles/a5449bfa.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7633.%E2%80%85Fighting%E2%80%85for%E2%80%85Triangles/a5449bfa.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7633/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:234px; width:262px" /></p>

<p>At each turn, a player must choose two adjacent vertices and draw a line segment that connects them. If the newly drawn edge results in a triangle on the board (only the smallest ones count), then the player claims the triangle and draws another edge. Otherwise, the turn ends and the other player plays. The objective of the game is to claim as many triangles as possible. For example, assume that it is Andy&rsquo;s turn, where the board has fives edges as shown in the picture below. If Andy draws edge 6, then he will claim the triangle formed by edge 4, 5, and 6, and continue playing.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7633.%E2%80%85Fighting%E2%80%85for%E2%80%85Triangles/ee76dc68.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7633.%E2%80%85Fighting%E2%80%85for%E2%80%85Triangles/ee76dc68.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7633/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:233px; width:266px" /></p>

<p>Given a board that already has some edges drawn on it, decide the winner of the game assuming that both Andy and Ralph play optimally. Andy always goes first. Note that if a triangle exists on the board before the first move, neither player claims it.</p>

### 입력

<p>The input consists of multiple test cases. Each test case begins with a line containing an integer N, 5 &le; N &le; 10, which indicates the number of edges that are already present on the board before the game begins. The next line contains N integers, indicating the indices of these edges. The input terminates with a line with N = 0.</p>

### 출력

<p>For each test case, print out a single line that contains the result of the game. If Andy wins, then print out &ldquo;Andy wins&rdquo;. If Ralph wins, then print out &ldquo;Ralph wins&rdquo;. If both players get the same number of triangles, then print out &ldquo;Draw&rdquo;. Quotation marks are used for clarity and should not be printed.</p>