# [Platinum I] Energy Collection - 7649

[문제 링크](https://www.acmicpc.net/problem/7649)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 11, 정답: 2, 맞힌 사람: 2, 정답 비율: 33.333%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 스위핑

### 문제 설명

<p>You have been given a square grid with a number of non-overlapping energy cells on it. These energy cells are quite peculiar; they are all squares, and despite their differences in sizes, they all produce the exact same amount of energy. From this grid, you wish to collect as much energy as possible, using a special collector. This collector is also square, and must be placed onto the grid on top of the energy cells. The collector can be resized to whatever size you want, as long as it remains grid-aligned (i.e., the size must be integral). The collector will collect all of the energy from any energy cell it overlaps (that is, the intersection of the collector with the energy cell has positive area), but only if the energy cell is at least as large as the collector. Energy cells that are smaller than the collector cannot be collected at all, regardless of location. Find a location and size for the collector so as to maximize the amount of energy collected.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/7649.%E2%80%85Energy%E2%80%85Collection/12c4d9a2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/7649.%E2%80%85Energy%E2%80%85Collection/12c4d9a2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7649/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:201px; width:197px" /></p>

### 입력

<p>The input consists of several test cases. The first line of each test case consists of a single integer N (1 &le; N &le; 1,000) denoting the number of energy cells. This is followed by N lines with 4 space-separated integers each describing the energy cell, x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, and y<sub>2</sub>, where (x<sub>1</sub>, y<sub>1</sub>) is the lower left corner of the cell and (x<sub>2</sub>, y<sub>2</sub>) is the upper right corner of the cell (&minus;10<sup>6</sup> &le; x<sub>1</sub> &lt; x<sub>2</sub> &le; 10<sup>6</sup> , &minus;10<sup>6</sup> &le; y<sub>1</sub> &lt; y<sub>2</sub> &le; 10<sup>6</sup> , x<sub>2</sub> &minus; x<sub>1</sub> = y<sub>2</sub> &minus; y<sub>1</sub>). Input is followed by a single line with N = 0, which should not be processed.</p>

### 출력

<p>For each test case, print out a single line with 4 space-separated integers describing the location of the collector, x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, and y<sub>2</sub>, where (x<sub>1</sub>, y<sub>1</sub>) is the lower left corner of the collector and (x<sub>2</sub>, y<sub>2</sub>) is the upper right corner of the collector. Any collector that collects the maximum possible amount of energy will be judged correct.</p>