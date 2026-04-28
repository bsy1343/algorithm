# [Platinum III] Tracking Robots - 9406

[문제 링크](https://www.acmicpc.net/problem/9406)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

(분류 없음)

### 문제 설명

<p>Several robots are moving around in an area, sending their locations to a server. Receiving a stream of locations sent by the robots, the server needs to find out the number of robots present in the area.</p>

<p>Assume that the area is a closed polygon, partitioned into some non-overlapping regions labeled 1, &hellip; , N. All robots are initially located in region 1. They all start moving around in the scene. When a robot enters a new region, it sends the region&rsquo;s label to the server. Note that each robot can enter and leave any region multiple times.</p>

<p>The server receives one long stream of region labels, without knowing the identity of the sender robots. Knowing the stream and the area&rsquo;s map, it needs your help to figure out the number of robots present in the area.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/9406/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%206.35.13.png" style="height:62px; width:92px" /></p>

<p>Your task is to find out the minimum and the maximum number of robots that may have created such a stream, assuming that each robot has at least once sent a region label to the server.</p>

### 입력

<p>There are multiple test cases in the input. The first line of each test case starts with N (1 &le; N &le; 100), the number of regions, followed by M (1 &le; M &le; 200), the length of the server&rsquo;s stream. Each of the next N lines describes one region; the i<sup>th</sup> line describes the region i. It starts with c<sub>i</sub>, which is the number of regions adjacent to region i. c<sub>i</sub> integers follow, indicating the labels of those regions. The last line is the server&rsquo;s stream which contains M region numbers, in the same order they were received by the server. The input terminates with a line containing &ldquo;0 0&rdquo;.</p>

<p>&nbsp;</p>

### 출력

<p>For each test case write a single line containing the minimum and maximum possible number of robots present in the area.</p>