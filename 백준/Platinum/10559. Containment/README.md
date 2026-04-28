# [Platinum II] Containment - 10559

[문제 링크](https://www.acmicpc.net/problem/10559)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 256 MB

### 통계

제출: 60, 정답: 20, 맞힌 사람: 18, 정답 비율: 72.000%

### 분류

최대 유량, 최대 유량 최소 컷 정리, 그래프 이론

### 문제 설명

<p style="text-align:center"><img alt="" src="/upload/images2/contain.png" style="height:128px; width:172px" /></p>

<p>A three-dimensional grid of atomic energy cells aboard the starship PacificNorthwestPassage is reporting failures on several of its cells. The ship&rsquo;s engineer must set up enclosures that will contain all cells reported to be failing in order to avoid a meltdown. It is imperative that the enclosures be finished in the shortest amount of time, even if that requires some healthy cells to be enclosed along with the defective ones. The enclosures are formed by panels which can only be inserted between cells (so each individual panel must be axis-aligned), and each panel separates exactly two cells and requires one minute to set up. For full containment, each enclosure must form a closed polytope. Given the coordinates of each defective cell, report how long it will take to finish containing the problem.</p>

### 입력

<p>The input will start with a single line containing the number N giving the number of test cases, 1 &le; N &le; 100. Each test case will start with a single line giving the number F, 1 &le; F &le; 100, the number of failing cells. Following this will be F lines each with three integers xi, yi, zi, all between 0 and 9, inclusive, giving the locations of the failing cells. For each test case, each triple (xi, yi, zi) will be unique.</p>

### 출력

<p>For each test case, print on a single line the minimum number of minutes required to fully contain the problem.</p>