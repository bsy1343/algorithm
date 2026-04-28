# [Platinum III] One-way Sidewalks - 21838

[문제 링크](https://www.acmicpc.net/problem/21838)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 79, 정답: 17, 맞힌 사람: 13, 정답 비율: 19.403%

### 분류

단절점과 단절선, 이중 연결 요소, 깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>A typical sidewalk in Waterloo is 1.5 metres wide. Two people walking in opposite directions cannot pass each other while maintaining 2 metres of physical separation. Many cities have designated one-way sidewalks to be used in only one direction. Usually, there is another sidewalk that makes it possible to walk in the opposite direction. Sometimes this is not possible because there is only a single route connecting a pair of places in the city. In these cases, some cities close part of the roadway to cars to allow for a wider walking area. Doing so is expensive and makes car drivers angry, so the city does this only in places where it is absolutely necessary.</p>

### 입력

<p>The first line of input contains two integers N, M, the number of places and the number of sidewalks in the city, with 0 &le; N, M &le; 200, 000. There is a path from every place to every other place. The next M lines each describe a sidewalk using two integers A, B, with 1 &le; A, B &le; N, which identify the two places connected by the sidewalk.</p>

### 출력

<p>Generate M lines of output, one for each sidewalk, in the same order as the sidewalks are listed in the input. Each line should contain the character &gt; if the sidewalk should be made one-way in the direction from place A to B, the character &lt; if it should be made one-way in the opposite direction, or = if the sidewalk must be widened to remain two-way. Your solution must minimize the number of sidewalks that need to be widened. If there are multiple solutions that minimize the number of sidewalks that need to be widened, you may output any one of those solutions.</p>