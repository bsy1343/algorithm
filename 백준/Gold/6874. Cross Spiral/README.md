# [Gold V] Cross Spiral - 6874

[문제 링크](https://www.acmicpc.net/problem/6874)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 8, 맞힌 사람: 8, 정답 비율: 80.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>In an old house there is a room that is shaped like a cross. You can think of a cross as being an outlining rectangle with four smaller rectangles cut out of the corners. The floor of the room is completely covered with square tiles. Bridget is walking around the room, stepping from one tile to the next, spiraling towards the centre. Bridget always walks clockwise and stays as close to the edge of the room as possible without stepping on any tile twice. It is possible that she may be trapped and unable to move to an adjacent tile before reaching all the tiles in the room.</p>

<p>Assume that the upper left corner of the outlining rectangle is position (1, 1), that is column 1 and row 1. The walk always starts at column X and row 1, where X is the leftmost column of row 1 in the cross. The tile at position (X, 1) cannot be revisited during the walk, however the first step is counted when Bridget moves to an adjacent tile.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6874.%E2%80%85Cross%E2%80%85Spiral/92fdb29c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/6874.%E2%80%85Cross%E2%80%85Spiral/92fdb29c.png" data-original-src="https://upload.acmicpc.net/4ed715be-4bfe-451d-9481-f30dd318db32/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 294px; height: 243px; float: left;" />Write a program that calculates Bridget&rsquo;s final column and row position in the room after the walk. The program must accept input for the dimensions of the cross: i.e. the width and height of the outlining rectangle, the width and height of the &ldquo;cut out&rdquo; rectangles, and the number of steps the person will take. In the diagram, the inputs for the dimensions of the cross are: 10 8 3 2 In other words, the outlining rectangle is 10 units wide and 8 units high. The &ldquo;cut out&rdquo; rectangles are 3 units wide and 2 units high.</p>

<p>The maximum width and height of the outlining rectangle will be 20 x 20. The minimum width of the cross will be 1. The vertical and horizontal parts of the cross are not necessarily the same width.</p>

### 입력



### 출력

