# [Gold II] Bridges - 3616

[문제 링크](https://www.acmicpc.net/problem/3616)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 28, 정답: 12, 맞힌 사람: 9, 정답 비율: 37.500%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>Once upon a time there was a country in a delta of a far-away river. The country had n islands and there was a town on each island. The towns were connected by roads. There was exactly one route from each town to each other one (possibly passing through some intermediate towns). Unfortunately, each road had to cross the river with a ford, since bridges were not known, so the travel was quite uncomfortable and could only be made by a horse.</p>

<p>When Bridge Building technology was discovered the king decided to build bridges instead of some fords to make roads easier to travel. Bridges would allow fords to be crossed even by carriages. The king liked the idea with bridges and ordered to build as many bridges as possible. Unfortunately, the country was quite poor, so only k bridges could be built.</p>

<p>The king asked you &mdash; his major advisor &mdash; to develop a bridge building plan. You have to choose k fords in such a way that the sum of travel times between all pairs of towns becomes as small as possible. You must assume that the ordinary roads would be traveled by horses, and roads enhanced with bridges would be traveled by carriages.</p>

### 입력

<p>The first line of the input file contains four integer numbers: n, k, s<sub>h</sub> and s<sub>c</sub> &mdash; the number of towns in the country, the number of bridges to build (1 &le; k &lt; n &le; 10 000), the speed of the horse and the speed of the carriage in meters per second (1 &le; s<sub>h</sub>, s<sub>c</sub> &le; 100 000).</p>

<p>Each of the following n &minus; 1 lines contains three integer numbers: b<sub>i</sub>, e<sub>i</sub> &mdash; the towns connected by the road, and li &mdash; the road length in meters (1 &le; l<sub>i</sub> &le; 10<sup>6</sup>). Towns are numbered from 1 to n, roads are numbered from 1 to n &minus; 1.</p>

### 출력

<p>Output k numbers &mdash; the numbers of roads where the bridges should be built. If there are several possible optimal bridge building plans, output any of them.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/e943c4ca-1d1b-4dea-9321-3f7aec443dab/-/preview/" style="width: 592px; height: 143px;" /></p>