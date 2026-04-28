# [Gold IV] Maximum Sum - 3914

[문제 링크](https://www.acmicpc.net/problem/3914)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 64, 정답: 49, 맞힌 사람: 38, 정답 비율: 79.167%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Given is a sequence of n boxes. In each box, there are several balls. On each ball is written one whole number. We choose some (1, 2, ...,, or all) boxes and take one ball from each one of the chosen boxes, keeping the order of the boxes. Then we arrange all taken balls in a line, according to the order of the boxes. Sometimes, the numbers written on the taken balls may form a non-decreasing sequence. Write program maxsum, which computes what may be the largest sum of these numbers.</p>

### 입력

<p>The first line contains the value of n. It is followed by n lines, each corresponding to a box. Each of these lines begins with the quantity of balls in the box and then &ndash; the numbers written on the balls in this box.</p>

### 출력

<p>One integer equals to the maximum sum, as is described above.</p>

### 제한

<p>0 &lt; n &lt; 500. In each box, there are no more than 50 balls, but at least one. Any whole number, written on a ball, is in a range from 1 till 1000.</p>

### 힌트

<p>The sequence of taken balls is 2 + 2 + 3 + 5 + 5 + 8. From the 5th, 6th, 7th and 10th boxes, nothing is taken.</p>