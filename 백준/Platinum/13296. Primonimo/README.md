# [Platinum I] Primonimo - 13296

[문제 링크](https://www.acmicpc.net/problem/13296)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 27, 맞힌 사람: 21, 정답 비율: 43.750%

### 분류

수학, 정수론, 선형대수학, 가우스 소거법

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13296.%E2%80%85Primonimo/988f475d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13296.%E2%80%85Primonimo/988f475d.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13296/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-30%20%EC%98%A4%ED%9B%84%207.00.48.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:198px; width:270px" /></p>

<p>Primonimo is a game played on an n &times; m board filled with numbers taken from the range 1 . . . p for some prime number p. At each move, a player selects a square and adds 1 to the numbers in all squares in the same row and column as the selected square. If a square already shows the number p, it wraps around to 1.</p>

<p>The game is won if all squares show p. Given an initial board, find a sequence of moves that wins the game!</p>

### 입력

<p>The input consists of a single test case. The first line contains three numbers n m p denoting the number of rows n (1 &le; n &le; 20), the number of columns m (1 &le; m &le; 20), and a prime number p (2 &le; p &le; 97). Each of the next n lines consists of m numbers in the range 1 . . . p.</p>

### 출력

<p>If a winning sequence of at most p &middot; m &middot; n moves exists, output an integer k &le; p &middot; m &middot; n denoting the number of moves in the sequence. Then output k moves as a sequence of integers that numbers the board in row-major order, starting with 1. If there are multiple such sequences, you may output any one of them. If no winning sequence exists, output -1.</p>