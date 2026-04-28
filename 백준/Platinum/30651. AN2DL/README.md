# [Platinum III] AN2DL - 30651

[문제 링크](https://www.acmicpc.net/problem/30651)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 48, 정답: 29, 맞힌 사람: 26, 정답 비율: 59.091%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>While wandering around Building 21, you came across a wall completely covered with numbers, arranged in a table of n rows and m columns. Soon you noticed that there was a frame leaning against the wall large enough to frame r rows and s columns of the table on the wall. And next to the frame you found a pencil and a piece of paper containing an empty table.</p>

<p>You are sad that the table on the piece of paper is empty, so you decided to play around with the frame to fill it.</p>

<p>You leaned the frame against the wall so that the number in the i-th row and j-th column is in the upper left corner, and the borders of the frame are parallel to the edges of the wall. Considering the numbers inside the frame, and since you like large numbers, you have decided to write the largest among them in the i-th row and j-th column of the table on the piece of paper.</p>

<p>You repeated the process for every possible position of the frame on the wall (such that the frame is entirely on the wall, and that there are exactly r &times; s numbers inside it), making sure that the edges of the frame are parallel to the edges of the wall.</p>

<p>When you were done, the table on the piece of paper was even more beautiful than the one on the wall. What numbers are in the table on the piece of paper?</p>

### 입력

<p>The first line contains two integers n and m (1 &le; n, m &le; 4 000), the number of rows and columns of the table on the wall.</p>

<p>Each of the following n lines contain m integers a<sub>i,j</sub> (|a<sub>i,j</sub>| &le; 10 000), where a<sub>i,j</sub> is the number in the i-th row and j-th column of the table on the wall.</p>

<p>The last line contains two integers r and s (1 &le; r &le; n, 1 &le; s &le; m), the size of the frame.</p>

### 출력

<p>Output the numbers written in the table on the piece of paper.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>The frame is big enough to fit the entire table on the wall. The largest number inside the frame is 4, so that is the only number written on the table on the piece of paper.</p>

<p>Clarification of the second example:</p>

<p>All possible frame positions are shown in the picture below. The largest number for each of the positions is written in red.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30651.%E2%80%85AN2DL/8745e8c2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/30651.%E2%80%85AN2DL/8745e8c2.png" data-original-src="https://upload.acmicpc.net/73688e87-2c08-44db-a86c-933d32fc9cd0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 486px; height: 265px;" /></p>