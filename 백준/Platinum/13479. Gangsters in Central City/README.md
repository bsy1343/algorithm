# [Platinum III] Gangsters in Central City - 13479

[문제 링크](https://www.acmicpc.net/problem/13479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 51, 정답: 29, 맞힌 사람: 25, 정답 비율: 62.500%

### 분류

자료 구조, 트리, 세그먼트 트리, 누적 합, 최소 공통 조상, 오일러 경로 테크닉

### 문제 설명

<p>For a long time, there were no problems with water in Central City. The sewage of the city has a form&nbsp;of a rooted tree: the central reservoir is situated at the root and the houses are at the leaves. The water&nbsp;flows from the central reservoir to the houses by the pipes that runs along the edges of the tree. Each&nbsp;house has an access to water.</p>

<p>Suddenly, gangsters captured some of the houses. As a mayor of the city you are very concerned, and you&nbsp;want to kick out the gangsters. So you want to stop the water flow to houses captured by the gangsters.&nbsp;To do that you could clog some pipes of the sewage system. If the path from the reservoir to a house&nbsp;contains at least one clogged pipe, the house does not have an access to water.</p>

<p>You are very afraid of the gangsters, so you decided to clog up the minimal number of pipes, that it&nbsp;could look like an accident. At the same time, you care about the citizens, so for the chosen number of&nbsp;clogged pipes, you want to minimize the number of houses without gangsters and access to water.</p>

<p>Unfortunately, the gangsters could appear and disappear from some houses. So, you are asking the&nbsp;scientists about the minimum required number of clogged pipes and the minimum required number of&nbsp;houses without gangsters and access to water after each change in the gangsters&rsquo; location.</p>

### 입력

<p>The first line of the input contains two integers n and q &mdash; the number of vertices in the&nbsp;tree which represents the sewage and the number of changes in the location of the gangsters&nbsp;(2 &le; n &le; 100 000; 1 &le; q &le; 100 000).</p>

<p>The second line contains the description of the sewage: a sequence of n &minus; 1 integers p<sub>2</sub>, p<sub>3</sub>, . . . , p<sub>n</sub>, where&nbsp;p<sub>i</sub>&nbsp;is the parent of the vertex i (1 &le; p<sub>i</sub> &lt; i). The central reservoir is located at the vertex 1.</p>

<p>The next q lines represent the changes in the location of the gangsters. Each change could be one of two&nbsp;different types: &ldquo;+ v&rdquo; &mdash; the gangsters capture the house at vertex v; &ldquo;- v&rdquo; &mdash; the gangsters leave the&nbsp;house at vertex v.</p>

<p>At the beginning all the houses are free of gangsters. All the changes form the correct sequence: the&nbsp;gangsters cannot capture the house if it is already captured and the gangsters could not leave the house&nbsp;if it is not captured.</p>

### 출력

<p>The output should contain 2q integers, two in each line: c<sub>i</sub> &mdash; the minimum number of clogged pipes and&nbsp;h<sub>i</sub> &mdash; the minimum number of houses without gangsters and have no access to water for the chosen c<sub>i</sub><br />
.</p>