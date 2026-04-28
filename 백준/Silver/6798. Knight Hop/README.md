# [Silver III] Knight Hop - 6798

[문제 링크](https://www.acmicpc.net/problem/6798)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 373, 정답: 218, 맞힌 사람: 196, 정답 비율: 62.620%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Below is an 8 &times; 8 chessboard on which we will designate square locations using the ordered pairs as indicated. For example, notice that piece A is at position (2, 2) and piece B is at position (4, 3).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6798.%E2%80%85Knight%E2%80%85Hop/38eed67b.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/6798.%E2%80%85Knight%E2%80%85Hop/38eed67b.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%202.17.58.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:275px; width:359px" /></p>

<p>A knight is a special game piece that can leap over other pieces, moving in the &ldquo;L&rdquo; pattern. Specifically, in the diagram below, K represents the knight&rsquo;s starting position and the numbers 1 through 8 represent possible places the knight may move to.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6798.%E2%80%85Knight%E2%80%85Hop/a4c2bc6c.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/6798.%E2%80%85Knight%E2%80%85Hop/a4c2bc6c.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/6798/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-03-24%20%EC%98%A4%ED%9B%84%202.18.32.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:280px; width:359px" /></p>

<p>Your program will read the starting location of the knight and output the smallest number of jumps or moves needed to arrive at a location specified in the second input.</p>

### 입력

<p>Your program will read four integers, where each integer is in the range 1...8. The first two integers represent the starting position of the knight. The second two integers represent the final position of the knight.</p>

### 출력

<p>Your program should output the minimum (non-negative integer) number of moves required to move the knight from the starting position to the final position. Note that the knight is not allowed to move off the board during the sequence of moves.</p>