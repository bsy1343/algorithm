# [Platinum IV] Human Error - 19624

[문제 링크](https://www.acmicpc.net/problem/19624)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 7, 정답: 6, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

수학, 구현, 다이나믹 프로그래밍, 그리디 알고리즘, 비트마스킹, 게임 이론, 확률론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Justin and Donald are playing their favourite game: hop chess. You probably haven&rsquo;t heard of it, but the rules are pretty simple.</p>

<p>The board is a rectangular grid, with each square of the board initially having exactly one player&rsquo;s piece on it. Justin&rsquo;s pieces are denoted as J, with Donald&rsquo;s being D. Each player has at least one piece on the grid initially.</p>

<p>The game begins with Justin playing first. On a turn, a player may move one of his pieces to capture (and thus remove from the board) a neighbouring piece (not necessarily the opponent&rsquo;s). A piece X is said to be neighbouring Y if it is either up, down, left, or right of Y . If such a move cannot be made, then the active player loses.</p>

<p>In an ideal world, both Justin and Donald are perfect logicians, and capable of discerning an optimal strategy for any board. Then perhaps we might be interested in who of the two would win. But that wouldn&rsquo;t be very realistic. Indeed, when playing, Justin and Donald can both come up with a relatively good solution; exactly how good it tends to be is determined by their error factors, J and D respectively.</p>

<p>Formally, the active player with error factor A first chooses a proposal set: either the set of all possible moves if there are A or less possible moves or some subset of size A from the set of possible moves if he has more than A possible moves. Then, from this proposal set, the player selects a move randomly with equal probability.</p>

<p>Both players, when given the choice of choosing their proposal set, chooses the most optimal such set (one which produces the highest probability of winning), knowing that the other player always chooses their proposal set optimally as well.</p>

<p>The natural question is then: exactly what is the probability that Justin wins a game of hop chess, given the initial board, J, and D?</p>

### 입력

<p>Input will begin with two space-separated positive integers R, C (R &middot; C &le; 13). On the next R lines will be strings of C characters drawn from the set {J, D}, describing the initial board state. Finally, there will be two space-separated integers, J, D (1 &le; J, D &le; 13)</p>

### 출력

<p>Output a single floating point number rounded to 3 decimal places: the probability that Justin wins.</p>