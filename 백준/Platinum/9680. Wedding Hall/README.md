# [Platinum I] Wedding Hall - 9680

[문제 링크](https://www.acmicpc.net/problem/9680)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 6, 맞힌 사람: 3, 정답 비율: 42.857%

### 분류

이분 탐색, 자료 구조, 느리게 갱신되는 세그먼트 트리, 매개 변수 탐색, 세그먼트 트리, 스위핑, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Kamran has recently bought a rectangular flat garden in an awesome part of the countryside. His business plan is to construct a Hall to host wedding ceremonies, since the countryside has recently attracted a lot of attention for being a fantastic area to host wedding ceremonies. As women and men sections must be separated based on the nation law, he thinks of designing the hall in three sections: men section, women section and common section (including rest rooms, dinner room and etc). As the common section must be easily &nbsp;accessible to all persons, it must be designated in the middle of the other two sections. Among several proposal designs, Kamran has selected the one depicted below where all three sections are squares of the same size, they are attached to each other like an L shape, their sides are parallel to the garden sides, and the visible sides of the common section from outside face the south and west of the garden. Now the main question is where the hall must be constructed. The garden is full of old trees and cutting the trees is forbidden&nbsp;due to high air pollution. He kindly asks you to help him to find the largest hall that he can construct.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9680.%E2%80%85Wedding%E2%80%85Hall/a955bee7.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/9680.%E2%80%85Wedding%E2%80%85Hall/a955bee7.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/9680/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-09-13%20%EC%98%A4%ED%9B%84%205.07.25.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:123px; width:130px" /></p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing a non-negative integers n(1 &le; n &le; 50000) and two positive integers a and b (all not exceeding 1,000,000) where n is the number of distinct trees in the garden and a and b specify the sides of the garden. Precisely, [0,a]x[0,b] denotes the rectangle modeling the garden. The next n lines, each contains 2 space-separated non-negative integers x<sub>i</sub> and y<sub>i</sub> (0 &lt; x<sub>i</sub> &lt; a, 0 &lt; y<sub>i</sub> &lt; b) denoting the x and y coordinates of a tree, respectively. You may assume that trees have distinct coordinates and the south side (i.e. [0,a]) and the west side (i.e. [0,b]) of the garden lie on the x-axis and the y-axis, respectively. The input terminates with a line containing &ldquo;0 0 0&rdquo; which should not be processed.</p>

### 출력

<p>For each test case, output the area of the largest hall that Kamran can construct in his garden. Note that the hall can touch the trees or the garden sides but it can&rsquo;t interiorly include them. The output must be rounded to &ldquo;exactly&rdquo; two digits after the decimal point.</p>