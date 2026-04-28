# [Platinum II] Forests in Danger - 17534

[문제 링크](https://www.acmicpc.net/problem/17534)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 35, 정답: 13, 맞힌 사람: 12, 정답 비율: 44.444%

### 분류

이분 탐색, 자료 구조, 세그먼트 트리

### 문제 설명

<p>Due to the advanced deforestation in the last decades, the rivers of Nlogonia registered a significant reduction in their flow rate. As Nlogonia is a developed nation that bases its decisions on technical data, the nation&rsquo;s leader has commissioned a series of studies to understand what steps should be taken to ensure water for future generations.</p>

<p>The technical report prepared by the scientists involved in the project was categorical: a percentage of the country&rsquo;s territory must have its vegetation conserved. More than that, the areas near the rivers must be the most preserved.</p>

<p>New environmental legislation will come into force, in which areas up to a distance from the river banks will be part of the preservation area. The ideal value of this distance is still unknown, but the technical report has already determined the percentage of the nation&rsquo;s territory that needs to be preserved.</p>

<p>Given your technical capabilities, you have been sought to help determine the distance around the rivers that must be preserved in order to achieve the required percentage of conserved area.</p>

<p>The rivers of Nlogonia can be represented in the plane as straight segments parallel to the axes. Given a distance r, the area of the territory to be preserved is determined as follows: For each river, the surrounding preserved area corresponds to the smallest rectangle containing the segment representing the river, leaving a minimum distance of r units between any point in the segment and any point outside the rectangle. The territory of Nlogonia is defined as a rectangle with sides parallel to the axes, so that every river is parallel to some border of the territory.</p>

<p>Given an integer P between 1 and 100, you must determine the smallest integer value for r that guarantees the preservation of P % of Nlogonia territory.</p>

<p>The figure below illustrates the first example of the input. The territory of Nlogonia is represented by the dashed region, and the preserved area is represented by the gray region:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/17534.%E2%80%85Forests%E2%80%85in%E2%80%85Danger/222737ab.png" data-original-src="https://upload.acmicpc.net/9a0b30a9-9f72-433f-9af2-7b1754b250bc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 268px; height: 277px;" /></p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 10<sup>4</sup>) indicating the number of line segments representing the rivers of Nlogonia. Each of the following N lines contains 4 integers: x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, and y<sub>2</sub>, where (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) are the ends of a straight line representing a river. Since the rivers of Nlogonia are parallel to the borders, it is guaranteed that x<sub>1</sub> = x<sub>2</sub> or y<sub>1</sub> = y<sub>2</sub>.</p>

<p>The next line contains an integer P (1 &le; P &le; 100) indicating the minimum percentage of territory that must be preserved. The last line contains 4 integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2</sub>, y<sub>2</sub>, where (x<sub>1</sub>, y<sub>1</sub>) is the lower&nbsp;left corner and (x<sub>2</sub>, y<sub>2</sub>) is the upper right corner of the rectangle, which represents the territory of Nlogonia, with sides parallel to the coordinated axes.</p>

<p>Each coordinate described in the input is an integer between 0 and 10<sup>5</sup>. You can assume that all rivers are fully contained in Nlogonia territory.</p>

### 출력

<p>Your program must output a single line, containing an integer number r, representing the minimum integer value that can be set for r to guarantee the preservation of P % of Nlogonia territory.</p>