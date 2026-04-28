# [Platinum V] Bell Ringing - 11268

[문제 링크](https://www.acmicpc.net/problem/11268)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 46, 정답: 27, 맞힌 사람: 26, 정답 비율: 89.655%

### 분류

해 구성하기

### 문제 설명

<p>Method ringing is used to ring bells in churches, particularly in England. Suppose there are 6 bells that have 6 different pitches. We assign the number 1 to the bell highest in pitch, 2 to the second highest, and so on. When the 6 bells are rung in some order&mdash;each of them exactly once&mdash;it is called a row. For example, 1, 2, 3, 4, 5, 6 and 6, 3, 2, 4, 1, 5 are two different rows.</p>

<p>An ideal performance contains all possible rows, each played exactly once. Unfortunately, the laws of physics place a limitation on any two consecutive rows; when a bell is rung, it has considerable inertia and the ringer has only a limited ability to accelerate or retard its cycle. Therefore, the position of each bell can change by at most one between two consecutive rows.</p>

<p>In Figure B.1, you can see the pattern of a non-ideal performance, where bells only change position by at most one.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11268.%E2%80%85Bell%E2%80%85Ringing/0163b322.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11268/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:416px; width:284px" /></p>

<p style="text-align:center">Figure B.1: A non-ideal performance respecting the inertia of bells. The trajectory of bell number 1 is marked with a blue line and trajectory of bell number 2 marked with a brown line.</p>

<p>Given n, the number of bells, output an ideal performance. All possible rows must be present exactly once, and the first row should be 1, 2, . . . , n.</p>

### 입력

<p>The first and only line of input contains an integer n such that 1 &le; n &le; 8.</p>

### 출력

<p>Output an ideal sequence of rows, each on a separate line. The first line should contain the row 1, 2, . . . , n and each two consecutive lines should be at most 1 step away from each other. Each row should occur exactly once in the output.</p>