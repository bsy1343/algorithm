# [Platinum I] Inspection - 3547

[문제 링크](https://www.acmicpc.net/problem/3547)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 78, 정답: 15, 맞힌 사람: 14, 정답 비율: 20.290%

### 분류

이분 매칭, 최대 유량, 최소 비용 최대 유량, 그래프 이론

### 문제 설명

<p>You are in charge of a team that inspects a new ski resort. A ski resort is situated on several mountains and consists of a number of slopes. Slopes are connected with each other, forking and joining. A map of the ski resort is represented as an acyclic directed graph. Nodes of the graph represent different points in ski resort and edges of the graph represent slopes between the points, with the direction of edges going downwards.</p>

<p style="text-align: center;"><img alt="" src="/upload/images3/inspec.png" style="height:215px; width:293px" /></p>

<p>Your team has to inspect each slope of the ski resort. Ski lifts on this resort are not open yet, but you have a helicopter. In one flight the helicopter can drop one person into any point of the resort. From the drop off point the person can ski down the slopes, inspecting each slope as they ski. It is fine to inspect the same slope multiple times, but you have to minimize the usage of the helicopter. So, you have to figure out how to inspect all the slopes with the fewest number of helicopter flights.</p>

### 입력

<p>The first line of the input file contains a single integer number n (2 &le; n &le; 100) &mdash; the number of points in the ski resort. The following n lines of the input file describe each point of the ski resort numbered from 1 to n. Each line starts with a single integer number m<sub>i</sub> (0 &le; m<sub>i</sub> &lt; n for i from 1 to n) and is followed by m<sub>i</sub> integer numbers a<sub>ij</sub> separated by spaces. All a<sub>ij</sub> are distinct for each i and each a<sub>ij</sub> (1 &le; a<sub>ij</sub> &le; n, a<sub>ij</sub> &ne; i) represents a slope going downwards from point i to point a<sub>ij</sub> . Each point in the resort has at least one slope connected to it.</p>

### 출력

<p>On the first line of the output file write a single integer number k &mdash; the minimal number of helicopter flights that are needed to inspect all slopes. Then write k lines that describe inspection routes for each helicopter flight. Each route shall start with single integer number from 1 to n &mdash; the number of the drop off point for the helicopter flight, followed by the numbers of points that will be visited during inspection in the corresponding order as the slopes are inspected going downwards. Numbers on a line shall be separated by spaces. You can write routes in any order.</p>