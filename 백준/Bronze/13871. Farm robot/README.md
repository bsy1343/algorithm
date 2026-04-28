# [Bronze III] Farm robot - 13871

[문제 링크](https://www.acmicpc.net/problem/13871)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 564, 정답: 406, 맞힌 사람: 367, 정답 비율: 72.962%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>To discourage birds such as crows and sparrows from feeding on his crops a farmer needed to put some scarecrows in his corn field. His nephew really likes robots, and suggested that he should use a robot scarecrow instead: &ldquo;A single robot scarecrow can better protect the whole corn field and will last way more than ten traditional ones!&rdquo;, he said.</p>

<p>Since the farmer thinks his nephew is a smart boy, he took his advice and bought a robot scarecrow. The robot moves along a pathway that surrounds the corn field. In the pathway there are N unmanned charging stations, numbered sequentially in clockwise order starting from 1. The figure below shows an example with eight charging stations.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13871.%E2%80%85Farm%E2%80%85robot/32c15d86.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/13871.%E2%80%85Farm%E2%80%85robot/32c15d86.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13871/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-11-19%20%EC%98%A4%EC%A0%84%203.55.17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:123px; width:220px" /></p>

<p>The robot begins every day at station number 1, and is issued a sequence of commands that are to be performed in order during the day. These commands are generated based on advanced machine learning algorithms that work on data collected by sensors spread through the corn field, ensuring an optimal coverage of the crop. Each command results in the robot moving to another charging station next to the one it is currently at, either in clockwise or counter-clockwise direction.</p>

<p>Despite the promises of optimal coverage by the robot, at the end of a certain day the farmer found part of his crop devastated. To figure out what might have happened the farmer wants to know how many times the robot was at the charging station closest to the devastated area. Given the number of the station closest to the devastated area and the sequence of commands for a single day, can you help the farmer find this number?</p>

### 입력

<p>The first line contains three integers N, C and S representing respectively the number of posts (2 &le; N &le; 100), the number of commands (1 &le; C &le; 1000) and the charging station closest to the devastated area (1 &le; S &le; N). The second line contains C integers X<sub>1</sub>, X<sub>2</sub>, . . . , X<sub>C</sub> , representing the sequence of commands received by the robot scarecrow. For i = 1, 2, . . . , C, if X<sub>i</sub> is 1 then the i-th command means &ldquo;move to the next charging station in clockwise order&rdquo;, whereas if X<sub>i</sub> is &minus;1 then the i-th command means &ldquo;move to the next charging station in counter-clockwise order&rdquo;. The robot always starts at station number 1.</p>

### 출력

<p>Output a line with an integer representing the number of times the robot was at station number S during the day.</p>