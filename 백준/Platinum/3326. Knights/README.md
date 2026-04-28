# [Platinum III] Knights - 3326

[문제 링크](https://www.acmicpc.net/problem/3326)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 43, 정답: 5, 맞힌 사람: 5, 정답 비율: 16.129%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Alice and Bob are playing a game. Initially K black Knights are placed on a N &times; N chessboard. Now the players take turns. On each turn, a player moves every knight that has at least one valid move left. The following four moves are valid, as long as they do not move the knight off the board:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3326.%E2%80%85Knights/5b121305.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3326.%E2%80%85Knights/5b121305.png" data-original-src="https://upload.acmicpc.net/041a2700-d7a8-4220-b6cf-678c9d9ae1aa/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 290px; height: 305px;" /></p>

<p>A knight with no valid moves left remains at its current position. The first player who is not able to move any of the knights loses the game. Note that during the game several knights are allowed to occupy the same square.</p>

<p>You are given the locations of the knights on the chessboard. Alice begins the game. Determine whether she can win the game, assuming that both players play optimally. If she can win, output a possible first move for each knight. In the beginning, there is at least one valid move for each knight, and no two knights are placed on the same square of the chessboard.</p>

### 입력

<p>The first line contains the two integers K (1 &le; K &le; 200 000) and N (1 &le; N &le; 1 000 000) separated by a single space. This line is followed by K lines describing the positions of the knights.</p>

<p>Line i + 1 contains two integers x<sub>i</sub> and y<sub>i</sub> (1 &le; x<sub>i</sub>, y<sub>i</sub> &le; N) separated by a single space, the coordinates of knight i.</p>

### 출력

<p>Output a single line containing the word <code>NO</code> if Alice cannot win the game. Otherwise, output K + 1 lines with <code>YES</code> on the first line and coordinates x&#39;<sub>i</sub> , y&#39;<sub>i</sub> on line i + 1, giving a destination that Alice may choose for knight i in the first turn in order to win the game.</p>