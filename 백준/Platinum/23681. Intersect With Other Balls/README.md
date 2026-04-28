# [Platinum I] Intersect With Other Balls - 23681

[문제 링크](https://www.acmicpc.net/problem/23681)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 13, 맞힌 사람: 12, 정답 비율: 48.000%

### 분류

수학, 기하학, 게임 이론, 피타고라스 정리

### 문제 설명

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/23681.%E2%80%85Intersect%E2%80%85With%E2%80%85Other%E2%80%85Balls/1c3d93b1.png" data-original-src="https://upload.acmicpc.net/7c848952-2e01-4a53-a501-d662b02eb743/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p><em>And now for something completely different - an English statement.</em></p>

<p>Two players are taking turns throwing balls (circles of radius $r$) into a rubbish bin (a rectangle of height $h$ and of width $3 \cdot r$). </p>

<p>When the player throws a ball, he initially places the ball strictly inside the bin in such way, that it touches the upper boundary of the bin and does not intersect with other balls. It may touch other balls though (not like it matters with integer inputs). Then the ball moves strictly down until it touches the bottom of the bin or another ball. After that it stops and doesn&#39;t move for the rest of game.</p>

<p>The player who can not make a turn (i.e. there is not enough space to initially place the ball) loses.</p>

<p>Who will win, assuming perfect play?</p>

### 입력

<p>The only line contains two integers $r$ and $h$ ($1 \leq r, h \leq 10^8, 2 \cdot r &lt; h$), the radius of the balls (also one third of the width of the bin) and the height of the bin respectively.</p>

### 출력

<p>Print 1 if the player who goes first wins and 2 otherwise.</p>