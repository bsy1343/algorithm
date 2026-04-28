# [Platinum III] Really Nerdy Game - 25811

[문제 링크](https://www.acmicpc.net/problem/25811)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

수학, 모듈로 곱셈 역원, 정수론, 확률론

### 문제 설명

<p>Ali is playing a board game by himself. The board&rsquo;s track consists of N locations (cells, spots) laid out in a circle, i.e., the board cell N is followed by the board cell 1. At every step in the game, Ali rolls a die with k sides and moves his piece forward (clockwise) as many cells (spots) as it is indicated by the die. The die&rsquo;s sides have the value 1, 2, 3, ..., k (each occurring exactly once), and each side is equally likely to come up.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/25811.%E2%80%85Really%E2%80%85Nerdy%E2%80%85Game/bf69ad2e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/25811.%E2%80%85Really%E2%80%85Nerdy%E2%80%85Game/bf69ad2e.png" data-original-src="https://upload.acmicpc.net/6f3bbfbb-330f-4f80-b914-6124a38482e4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 225px; height: 223px; float: right;" />Ali starts his piece at location 1, and when Ali moves his piece past location N, Ali&rsquo;s piece continues its movement to locations 1, 2, etc. (again, the board is circular).</p>

<p>There are several spots on the board that are instant win cells, and there are several spots on the board that are instant loss cells. Reaching either one of these spots ends the game immediately. Any spot that is not an instant win or an instant loss allows the game to continue.</p>

<p>Ali wants to know the probability that he will end up winning. Since Ali is very precise, Ali wants to know the fraction of winning as p/q. Since p and q can be quite large, compute the answer as p(q<sup>-1</sup>) mod 10007 instead, where q<sup>-1</sup> denotes the multiplicative inverse of q modulo 10,007. (Math Refresher on Multiplicative Inverse is on Note section.)</p>

<p>Given the layout of the board and the die used, determine the probability of winning.</p>

### 입력

<p>The first input line contains four integers: n (1 &le; n &le; 50), indicating the number of spots on the board, d (1 &le; d &le; 120), indicating the number of sides on the die, w (0 &le; w &lt; n), indicating the number of winning spots on the board, and l (0 &le; l &lt; n &ndash; w), indicating the number of losing spots on the board.</p>

<p>Each of the next w input lines contains an integer (between 2 and n, inclusive) indicating a winning location. Each of the next l input lines contains an integer (between 2 and n, inclusive) indicating a losing location.</p>

<p>Assume that all the winning locations are distinct, all the losing locations are distinct, no location will be both a winning and losing spot, and location 1 will not be winning or losing.</p>

### 출력

<p>Print the integral probability of winning p/q as p(q<sup>-1</sup>) mod 10007, where q<sup>-1</sup> denotes the multiplicative inverse of q modulo 10,007.</p>

### 힌트

<p>The answer to the first case is 4/7.</p>

<p>Math Refresher (Definition of Multiplicative Inverse): Another name for Reciprocal. What you multiply by a number to get 1. Example: 8 &times; (1/8) = 1 In other words: when we multiply a number by its &ldquo;Multiplicative Inverse&rdquo;, we get 1. But not when the number is 0 because 1/0 is undefined!</p>