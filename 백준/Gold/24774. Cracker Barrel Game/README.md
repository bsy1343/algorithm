# [Gold III] Cracker Barrel Game - 24774

[문제 링크](https://www.acmicpc.net/problem/24774)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 15, 정답: 13, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

백트래킹, 너비 우선 탐색, 브루트포스 알고리즘, 자료 구조, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 해시를 사용한 집합과 맵, 구현, 시뮬레이션, 집합과 맵

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/24774.%E2%80%85Cracker%E2%80%85Barrel%E2%80%85Game/e27868aa.png" data-original-src="https://upload.acmicpc.net/366e0ab7-b629-439b-894b-2e2bc81b2cbb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 260px; height: 174px; float: right;" />The popular Cracker Barrel country store chain offers its clientele a peg game to pass the time until their food arrives. The game is played on a 15-peg board. The rules are simple: each move jumps one peg over another peg into a free hole. The peg that&rsquo;s jumped over is removed. If only one peg remains, the player wins. Usually, the game is started with 14 pegs (and one hole). Pegs may have different colors: blue, red, yellow, white, though the color of a peg usually does not matter.</p>

<p>In this problem, you are giving a start position of between 1 and 14 pegs of different colors, as well as a target color. You should output whether it is possible to remove all but one peg from the board using the usual rules and end up with a peg that is of the target color.</p>

### 입력

<p>The input will contain multiple test cases. Each test contains a target peg on a single line, followed by the initial position of the board. A peg is represented as a pair of two uppercase letters, e.g. BB represents a peg of a certain color (say blue). The board is given using appropriate indentation of 4, 3, 2, and 1 spaces for the 1st, 2nd, 3rd, and 4th row.</p>

<p>The input will be terminated by a line containing the characters **.</p>

### 출력

<p>For each test case print <code>Possible</code> if there exists a sequence of valid moves such that all but one peg can be removed and you end up with a peg of the given target color. Otherwise, print <code>Impossible</code>.</p>