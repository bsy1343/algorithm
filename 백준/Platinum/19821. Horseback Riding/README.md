# [Platinum IV] Horseback Riding - 19821

[문제 링크](https://www.acmicpc.net/problem/19821)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 6, 맞힌 사람: 6, 정답 비율: 66.667%

### 분류

그래프 이론, 그래프 탐색, 해 구성하기, 너비 우선 탐색

### 문제 설명

<p>It is well known that chess is a sport. But Dima, who is into horseback riding, considers it boring, and not a sport at all. His friend Sasha has decided to show him how complex and interesting chess can be.</p>

<p>Sasha has placed $k$ knights on a $8 \times 8$ chessboard. These knights are on a promenade and want to return to their stables. Unfortunately, they don&#39;t remember the way home.</p>

<p>Let us say that the knights are in their stables if the following conditions are satisfied: some (specifically, $k \text{ div } 8$) lower rows are filled with knights, and the next row only contains knights in its leftmost cells (if $k \bmod 8 \ne 0$, then $k \bmod 8$ knights take leftmost positions in this row).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19821.%E2%80%85Horseback%E2%80%85Riding/df2fc5f1.png" data-original-src="https://upload.acmicpc.net/f88f6d0e-cfee-4186-9d8a-a83729c88ff8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 255px;" /></p>

<p style="text-align: center;">There are the desired cells for $k=11$ knights, one per knight.</p>

<p>This is a chess problem, so the knights move as they do in chess: exactly two cells in one direction, and then exactly one cell in another direction.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19821.%E2%80%85Horseback%E2%80%85Riding/00c943f3.png" data-original-src="https://upload.acmicpc.net/824faf4b-3d88-4a22-a0a0-6d2d6d2b3125/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 255px;" /></p>

<p style="text-align: center;">Possible moves of a knight</p>

<p>Knight make moves one by one, in any order. In a single moment at most one knight can be located in any cell.</p>

<p>Dima spent two days solving this problem, and now asks you to find the sequence of knights moves, so that no two knight ever occupied the same cell, and all the knight ended up in the stables. You don&#39;t have to minimize the number of moves, but you are limited to no more than 1500 moves in total.</p>

### 입력

<p>The first line of input contains an integer $k$ --- the number of knights at the chessboard ($1 \leq k \leq 64$). The following $k$ lines contains the positions of the knigths. Each position is formatted as <code>xy</code>, where <code>x</code> is the column letter, and <code>y</code> is the row digit.</p>

<p>Columns are numbered from &lt;&lt;<code>a</code>&gt;&gt; to &lt;&lt;<code>h</code>&gt;&gt; left-to-right, rows are numbered with digits from 1 to 8 bottom-to-top.</p>

### 출력

<p>The first line of output must contain the number of moves you need to get knights into the stables. &nbsp;Next, output these moves one per line, in the order they are made. Format your moves as <code>xy-zt</code>, whehe <code>x</code> and <code>z</code> are column letters, and <code>y</code> and <code>t</code> are row digits.</p>

<p>Remember that you don&#39;t have to minimize the number of moves, but you have to fit into the limit of $1500$.</p>