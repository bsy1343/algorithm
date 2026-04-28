# [Silver IV] Caterpillar Walk - 25804

[문제 링크](https://www.acmicpc.net/problem/25804)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 30, 정답: 26, 맞힌 사람: 19, 정답 비율: 86.364%

### 분류

구현, 그리디 알고리즘, 정렬

### 문제 설명

<p>Consider a city where each building is a rectangle with its base on the positive x-axis, its two walls parallel to the positive y-axis, and its roof parallel to x-axis. The walls of two buildings can touch each other, i.e., the buildings can be right next to each other. The buildings do not, however, have any area in common, i.e., no two buildings intersect/overlap.</p>

<p>Lulu (our beloved caterpillar) lives at coordinates (0,0) and works at coordinates (100,0). Every morning, Lulu crawls from home to office. Without any buildings, this is a distance of 100 but, unfortunately, the buildings force Lulu to crawl up and down of the building walls and they add to the distance Lulu has to travel. Note that Lulu starts at home, ends at the office, and is always crawling on x-axis, side of a wall going up (parallel to y-axis), top of a building (parallel to x-axis), or side of a wall coming down (parallel to y-axis).</p>

<p>Given the description of all the buildings, compute the total distance travelled by Lulu.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 50), indicating the number of buildings. Each of the next n input lines describes a building. A building is described by three integers: s (1 &le; s &le; 98), indicating the lower-left corner of the building, w (1 &le; w &le; 98), indicating the width of the building, and h (1 &le; h &le; 100), indicating the height of the building. Assume s + w &le; 99, i.e., no building will end beyond (99,0).</p>

### 출력

<p>Print the total distance travelled by Lulu.</p>

### 힌트

<p>Picture illustrating the last Sample Input:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/4b6f2ca8-ea61-4af4-882b-055af3783b7b/-/preview/" style="width: 542px; height: 296px;" /></p>