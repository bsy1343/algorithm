# [Gold IV] Bee Garden - 3630

[문제 링크](https://www.acmicpc.net/problem/3630)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 6, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 기하학, 브루트포스 알고리즘, 트리

### 문제 설명

<p>George's father Ben is fond of bee breeding. He has got a bee garden near his country house and he likes to walk around the garden and gather honey from the hives.</p>

<p>Ben has $n$ hives, located at various points of his garden. Some of them are connected to each other or Ben's house by straight roads. Ben always walks along the roads, and he never moves from one road to another anywhere except at hives. Neither Ben's house nor any hive is located on a road.</p>

<p>The roads are organized in such a way, that Ben has exactly one way to get from his house to any hive.</p>

<p>Each week Ben makes a roundtrip. He starts from his house and walks by the roads in such a way that he visits each hive at least once. George once came to see his father and noticed that his father takes the shortest path that allows him to visit each hive and return to his house.</p>

<p>He thought that his father is getting older, so Ben must be getting really tired with all that walking. He decided to build another straight road that would help his father to visit all the hives faster. That road must connect two hives or a hive and Ben's house. Help George to build the road in such a way that his father needs to walk as short a path as possible to visit all the hives and return home.</p>

<p>Note that neither Ben's house nor any hive must be located on the new road.</p>

### 입력

<p>The first line of the input file contains $n$ --- the number of the hives ($1 \le n \le 200$).</p>

<p>Let us consider Ben's garden located on a Cartesian plane in such a way that his house occupied the point $(0, 0)$. The following $n$ lines contain two integer numbers each --- the coordinates of the hives. The coordinates do not exceed $10\,000$ by their absolute values, no two hives coincide, no hive is located at~$(0, 0)$. Let the hives be numbered from 1 to $n$.</p>

<p>The following $n$ lines describe roads --- each road is described by the numbers of hives it connects, Ben's house is denoted by 0.&nbsp;</p>

### 출력

<p>Output two numbers --- the numbers of the hives to be connected by the road. Output 0 instead of hive's number for Ben's house.</p>

<p>If there is no straight road that shortens Ben's roundtrip output "<code>-1</code>".</p>