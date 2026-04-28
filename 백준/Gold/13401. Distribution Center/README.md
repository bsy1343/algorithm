# [Gold II] Distribution Center - 13401

[문제 링크](https://www.acmicpc.net/problem/13401)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 169, 정답: 80, 맞힌 사람: 75, 정답 비율: 52.448%

### 분류

정렬

### 문제 설명

<p>The factory of the Impractically Complicated Products Corporation has many manufacturing&nbsp;lines and the same number of corresponding storage rooms. The same number of conveyor lanes&nbsp;are laid out in parallel to transfer goods from manufacturing lines directly to the corresponding&nbsp;storage rooms. Now, they plan to install a number of robot arms here and there between pairs&nbsp;of adjacent conveyor lanes so that goods in one of the lanes can be picked up and released down&nbsp;on the other, and also in the opposite way. This should allow mixing up goods from different&nbsp;manufacturing lines to the storage rooms.</p>

<p>Depending on the positions of robot arms, the goods from each of the manufacturing lines can&nbsp;only be delivered to some of the storage rooms. Your task is to find the number of manufacturing&nbsp;lines from which goods can be transferred to each of the storage rooms, given the number of&nbsp;conveyor lanes and positions of robot arms.</p>

### 입력

<p>The input consists of a single test case, formatted as follows.</p>

<pre>
n m
x<sub>1</sub> y<sub>1</sub>
.
.
.
x<sub>m</sub> y<sub>m</sub></pre>

<p>An integer n (2 &le; n &le; 200000) in the first line is the number of conveyor lanes. The lanes are&nbsp;numbered from 1 to n, and two lanes with their numbers differing with 1 are adjacent. All of them&nbsp;start from the position x = 0 and end at x = 100000. The other integer m (1 &le; m &lt; 100000) is&nbsp;the number of robot arms.</p>

<p>The following m lines indicate the positions of the robot arms by two integers x<sub>i</sub> (0 &lt; x<sub>i </sub>&lt;&nbsp;100000) and y<sub>i</sub> (1 &le; y<sub>i</sub> &lt; n). Here, x<sub>i&nbsp;</sub>is the x-coordinate of the i-th robot arm, which can pick&nbsp;goods on either the lane y<sub>i</sub> or the lane y<sub>i</sub> + 1 at position x = x<sub>i</sub>&nbsp;, and then release them on the&nbsp;other at the same x-coordinate.</p>

<p>You can assume that positions of no two robot arms have the same x-coordinate, that is, x<sub>i</sub> &ne; x<sub>j</sub>&nbsp;for any i &ne; j.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13401/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-11%20%EC%98%A4%EC%A0%84%205.19.13.png" style="height:270px; width:560px" /></p>

<p>Figure C.1. Illustration of Sample Input 1</p>

### 출력

<p>Output n integers separated by a space in one line. The i-th integer is the number of the&nbsp;manufacturing lines from which the storage room connected to the conveyor lane i can accept&nbsp;goods.</p>