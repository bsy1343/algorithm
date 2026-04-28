# [Platinum II] Jenga Boom - 13998

[문제 링크](https://www.acmicpc.net/problem/13998)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 45, 맞힌 사람: 28, 정답 비율: 32.941%

### 분류

브루트포스 알고리즘, 물리학, 누적 합

### 문제 설명

<p>Jane is a game designer and she designs the next version of Jenga Boom, where the blocks have dimensions of 1&times;w &times;wn instead of the ordinary 1&times;2&times;6. As usual, the initial tower is created at the game start. It consists of the blocks in levels of n blocks placed next to each other along their long sides and at a right angle to the previous level. Players remove blocks from the tower in turns, until the tower collapses.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13998.%E2%80%85Jenga%E2%80%85Boom/b0785661.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13998.%E2%80%85Jenga%E2%80%85Boom/b0785661.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13998/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-22%20%EC%98%A4%ED%9B%84%208.10.49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:143px; width:221px" /><br />
Initial tower</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13998.%E2%80%85Jenga%E2%80%85Boom/5090c513.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13998.%E2%80%85Jenga%E2%80%85Boom/5090c513.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13998/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-12-22%20%EC%98%A4%ED%9B%84%208.11.00.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:145px; width:221px" /><br />
The tower before collapse</p>

<p>Jane wants to build a game simulator that helps her to decide the best n and w. The simulator shall compute the moment when the tower collapses if blocks are removed in the specified order. Tower collapses if there is a cross-section between levels such that the center of the mass of the levels above it does not belong to or is at the edge of the convex hull of the previous level projection.</p>

### 입력

<p>The first line contains two integers n and w that define the dimensions of the block as described in the problem statement (1 &le; n, w &le; 10 000). The second line also contains two integers: h &mdash; the number of levels in the tower and m &mdash; the number of removed blocks (1 &le; h, m &le; 5 000).</p>

<p>The next m lines contain coordinates of the removed blocks with two integers each: l<sub>i</sub> &mdash; the level of the block, counting from the bottom and k<sub>i</sub> &mdash; the position of the block, counting from the edge nearest to the players (1 &le; l<sub>i</sub> &le; h; 1 &le; k<sub>i</sub> &le; n). Blocks are removed one by one and no block is removed twice.</p>

### 출력

<p>In the first line output &ldquo;yes&rdquo; if the tower collapses, and &ldquo;no&rdquo; otherwise. In the former case, output the number of the block (starting from 1), that was removed just before the collapse, in the next line.</p>