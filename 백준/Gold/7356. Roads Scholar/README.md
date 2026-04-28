# [Gold III] Roads Scholar - 7356

[문제 링크](https://www.acmicpc.net/problem/7356)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 2, 맞힌 사람: 2, 정답 비율: 11.111%

### 분류

플로이드–워셜, 그래프 이론, 최단 경로

### 문제 설명

<p>The Hines Sign company has been contracted to supply roadside signs for the state highway system. The head of the company has put his son Myles Hines in charge of one particular class of signs, those which indicate the number of miles to various towns. Myles is given a layout of the highway system and a set of locations where the signs should go; he is in charge of determining the mileage to nearby cities. To select which cities should be listed on any sign, he uses the following strategy: City X is put on the sign if the sign is on a road such that the shortest path from the intersection immediately preceeding the sign to X uses the road. You may assume that there is only one shortest path between each pair of intersections.</p>

### 입력

<p><strong>The input begins with a single positive integer on a line by itself indicating the number of the cases following, each of them as described below. This line is followed by a blank line, and there is also a blank line between two consecutive inputs.</strong></p>

<p>Input consists of a single problem instance consisting of a description of the highway system, followed by a set of sign locations. The highway system is defined as a set of intersections (some of which are also city locations) and a set of roads connecting the intersections. The first line of a problem instance contains three positive integers n m k: n specifies the number of intersections (numbered 0, 1, 2,..., n - 1), m indicates the number of roads between connections, and k indicates the number of intersections which are also cities. Following this are m lines of the form i<sub>1</sub> i<sub>2</sub> d, which specifies a two-way road between intersections i<sub>1</sub> and i<sub>2</sub> of distance d. The next k lines are of the form i name, which specifies that intersection i is a city called name. After this is a line with a single positive integer s indicating the number of signs to place on the highway. The remaining s lines are of the form i<sub>1</sub> i<sub>2</sub> d, indicating that a sign is to be placed on the road going from i<sub>1</sub> to i<sub>2</sub> a distance d from i<sub>1</sub> (d will always be non-zero and less than the distance from i<sub>1</sub> to i<sub>2</sub>). For all problem instances, the length of name will be &le; 18 characters, and 5 &le; n &le; 30. All distances will be non-zero and to the nearest hundredth mile.</p>

### 출력

<p><strong>For each test case, the output must follow the description below. The outputs of two consecutive cases will be separated by a blank line.</strong></p>

<p>Each sign should be output as follows:</p>

<p><br />
name<sub>1</sub> d<sub>1</sub></p>

<p>name<sub>2</sub> d<sub>2</sub></p>

<p>...</p>

<p><br />
where each name<sub>i</sub> should be left justified in a field of width 20, and each distance d<sub>i</sub> is rounded to the nearest mile. (Round .50 up. For example, 7.50 should be rounded to 8.) Each name-distance pair should be sorted by the rounded distance; pairs with the same rounded distance should be printed in alphabetical order. Signs should be output in the order in which they were listed in the input, and you should separate each sign output with a blank line. You may assume that every sign will have at least one city listed on it.</p>