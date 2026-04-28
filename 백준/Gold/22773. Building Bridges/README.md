# [Gold I] Building Bridges - 22773

[문제 링크](https://www.acmicpc.net/problem/22773)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 8, 맞힌 사람: 5, 정답 비율: 33.333%

### 분류

기하학, 그래프 이론, 선분 교차 판정, 최소 스패닝 트리

### 문제 설명

<p>Irene B. Moore is working as a mayor of the City Palau, which has a number of islands. Some bridges are built between islands, but not all islands are connected by those bridges. People therefore move between islands by ship if needed. However, because the number of seamen is decreasing in these days, people living there began to demand her to build more bridges so they can move among all islands without ship. Irene is willing to meet their demands.</p>

<p>Unfortunately, the city is not in so easy circumstances. Irene thus decided to build the least number of new bridges required to make people possible to move between every pair of islands by land. Moreover, she decided to shorten the total distance of new bridges, intending to minimize the construction cost.</p>

<p>In order to carry out her idea, Irene told Christopher, a person working under her, to make an estimate of the shortest total distance of bridges to be built. For estimation, he modeled the island area as follows. First, he considered the area to be a two-dimensional plane. Secondly, he regarded islands as circular. Lastly, he made an assumption that a bridge is a line segment connecting two islands in the shortest distance.</p>

<p>He knew that it is possible to compute the shortest total distance of new bridges based on his model, but he did not know how to do that. So he called you for help.</p>

<p>Your task is to write a program that computes the distance, given the data of the islands and the existing bridges. Note that a bridge crossing over an island or another bridge may not be built.</p>

### 입력

<p>Input consists of multiple data sets.</p>

<p>The first line of each data set contains a single positive integer n (2 &le; n &le; 50) that represents the number of islands in the City Palau. The following n lines describe the islands. The i-th line contains three real numbers x<sub>i</sub> (&minus;100 &le; x<sub>i</sub> &le; 100), y<sub>i</sub> (&minus;100 &le; y<sub>i</sub> &le; 100) and r<sub>i</sub> (1 &le; r<sub>i</sub> &le; 10), where (x<sub>i</sub>, y<sub>i</sub>) and r<sub>i</sub> denotes the center and radius of the i-th island respectively. After that, there is a line containing a single positive integer m that represents the number of existing bridges. The following m lines describe the bridges. Each line contains two integers s<sub>j</sub> and t<sub>j</sub>, indicating a bridge has already been built between the s<sub>j</sub>-th and the t<sub>j</sub>-th islands.</p>

<p>You may assume that no two islands are close within the distance of one. It is also guaranteed that no existing bridge crosses over an island or another existing bridge.</p>

<p>Input is terminated by a line containing a single zero. This line is not a part of data set.</p>

### 출력

<p>For each data set, print the shortest total distance in a line. Each number may be printed with an arbitrary number of decimal digits, but may not contain an error greater than 0.001.</p>

<p>There may be test cases that no new bridges are required to be built. In such cases, just print zero as the distance.</p>

<p>No extra space or blank line should appear.</p>