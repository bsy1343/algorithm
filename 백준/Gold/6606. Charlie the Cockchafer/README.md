# [Gold I] Charlie the Cockchafer - 6606

[문제 링크](https://www.acmicpc.net/problem/6606)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 14, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

구현, 그래프 이론, 기하학, 최단 경로, 데이크스트라, 3차원 기하학

### 문제 설명

<p>Charlie knows how to fly. Despite this, whenever Charlie wants to move from one point to another, it becomes a tedious task for him. The main trouble is that Charlie is a cockchafer. And it is a well-known fact that all cockchafers (do not confuse them with cockroaches) are clumsy and slow. Not only they need some time to fly along a straight line, they also spend more time making turns. Knowing their limitations, will you help Charlie to find the quickest route?</p>

### 입력

<p>The input consists of several instances. The first line of each instance contains integers N, S and T (1 &le; N &le; 1000, 1 &le; S, T &le; 1000), where N is the number of straight cockchafer flight trajectories (also known as &ldquo;cockridors&rdquo;), S is Charlie&rsquo;s speed in meters per second, and T is the speed of him turning in degrees per second. The second line contains six integers (0 &le; X<sub>f</sub> , Y<sub>f</sub> , Z<sub>f</sub> , X<sub>t</sub>, Y<sub>t</sub>, Z<sub>t</sub> &le; 10000) indicating the starting point (X<sub>f</sub> , Y<sub>f</sub> , Z<sub>f</sub> ) and the destination (X<sub>t</sub>, Y<sub>t</sub>, Z<sub>t</sub>).</p>

<p>Each of the following N lines contains six integers 0 &le; X<sub>1</sub>, Y<sub>1</sub>, Z<sub>1</sub>, X<sub>2</sub>, Y<sub>2</sub>, Z<sub>2</sub> &le; 10000 stating there is a line segment (cockridor) joining points (X<sub>1</sub>, Y<sub>1</sub>, Z<sub>1</sub>) with (X<sub>2</sub>, Y<sub>2</sub>, Z<sub>2</sub>). You are guaranteed that no internal point of the segment is an endpoint of another segment, and that both the initial and the final positions are endpoints of at least one of the segments. All coordinates are given in meters.</p>

### 출력

<p>For each input instance, print a single line containing one real number R, giving the shortest time Charlie needs to get from the initial to the final point. Charlie can only move along the whole straight segments, all of them can be used in both directions. The time for any such path is R = L/S + D/T seconds, where L is the sum of the lengths of all segments traversed (in meters) and D is the sum of the angles needed to turn between consecutive segments (in degrees). You can choose the initial and final direction that Charlie is facing, and assume that there always exists at least one path from the initial to the final point.</p>

<p>The answer will be accepted as correct if the difference between R and the answer computed by the judges is at most 0.001.</p>