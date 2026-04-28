# [Platinum III] Tile Cut - 4445

[문제 링크](https://www.acmicpc.net/problem/4445)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 87, 정답: 33, 맞힌 사람: 27, 정답 비율: 36.486%

### 분류

그래프 이론, 최대 유량, 격자 그래프

### 문제 설명

<p>When Frodo, Sam, Merry, and Pippin are at the Green Dragon Inn drinking ale, they like to play a little game with parchment and pen to decide who buys the next round. The game works as follows:</p>

<p>Given an m &times;n rectangular tile with each square marked with one of the incantations W, I, and N, find the maximal number of triominoes that can be cut from this tile such that the triomino has W and N on the ends and I in the middle (that is, it spells WIN in some order). Of course the only possible triominoes are the one with three squares in a straight line and the two ell-shaped ones. The Hobbit that is able to find the maximum number wins and chooses who buys the next round. Your job is to find the maximal number.</p>

<p>Side note: Sam and Pippin tend to buy the most rounds of ale when they play this game, so they are lobbying to change the game to Rock, Parchment, Sword (RPS)!</p>

### 입력

<p>Each input file will contain multiple test cases. Each test case consists of an m &times; n rectangular grid (where 1 &le; m, n &le; 30) containing only the letters W, I, and N. Test cases will be separated by a blank line. Input will be terminated by end-of-file.</p>

### 출력

<p>For each input test case, print a line containing a single integer indicating the maximum total number of tiles that can be formed.</p>