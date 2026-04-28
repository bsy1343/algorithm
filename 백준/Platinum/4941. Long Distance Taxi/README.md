# [Platinum V] Long Distance Taxi - 4941

[문제 링크](https://www.acmicpc.net/problem/4941)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 104, 정답: 16, 맞힌 사람: 11, 정답 비율: 26.829%

### 분류

자료 구조, 데이크스트라, 그래프 이론, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 최단 경로, 집합과 맵

### 문제 설명

<p>A taxi driver, Nakamura, was so delighted because he got a passenger who wanted to go to a city thousands of kilometers away. However, he had a problem. As you may know, most taxis in Japan run on liquefied petroleum gas (LPG) because it is cheaper than gasoline. There are more than 50,000 gas stations in the country, but less than one percent of them sell LPG. Although the LPG tank of his car was full, the tank capacity is limited and his car runs 10 kilometer per liter, so he may not be able to get to the destination without filling the tank on the way. He knew all the locations of LPG stations.</p>

<p>Your task is to write a program that finds the best way from the current location to the destination without running out of gas.</p>

### 입력

<p>The input consists of several datasets, and each dataset is in the following format.</p>

<pre>
N M cap
src dest
c<sub>1,1</sub> c<sub>1,2</sub> d<sub>1</sub>
c<sub>2,1</sub> c<sub>2,2</sub> d<sub>2</sub>
.
.
.
c<sub>N,1</sub> c<sub>N,2</sub> d<sub>N</sub>
s<sub>1</sub>
s<sub>2</sub>
.
.
.
s<sub>M</sub></pre>

<p>The first line of a dataset contains three integers (N, M, cap), where N is the number of roads (1 &le; N &le; 3000), M is the number of LPG stations (1 &le; M &le; 300), and cap is the tank capacity (1 &le; cap &le; 200) in liter. The next line contains the name of the current city (src) and the name of the destination city (dest). The destination city is always different from the current city. The following N lines describe roads that connect cities. The road i (1 &le; i &le; N) connects two different cities c<sub>i,1</sub> and c<sub>i,2</sub> with an integer distance d<sub>i</sub> (0 &lt; d<sub>i</sub> &le; 2000) in kilometer, and he can go from either city to the other. You can assume that no two different roads connect the same pair of cities. The columns are separated by a single space. The next M lines (s<sub>1</sub>, s<sub>2</sub>, . . . , s<sub>M</sub>) indicate the names of the cities with LPG station. You can assume that a city with LPG station has at least one road.</p>

<p>The name of a city has no more than 15 characters. Only English alphabet (&lsquo;A&rsquo; to &lsquo;Z&rsquo; and &lsquo;a&rsquo; to &lsquo;z&rsquo;, case sensitive) is allowed for the name.</p>

<p>A line with three zeros terminates the input.</p>

### 출력

<p>For each dataset, output a line containing the length (in kilometer) of the shortest possible journey from the current city to the destination city. If Nakamura cannot reach the destination, output &ldquo;-1&rdquo; (without quotation marks). You must not output any other characters.</p>

<p>The actual tank capacity is usually a little bit larger than that on the specification sheet, so you can assume that he can reach a city even when the remaining amount of the gas becomes exactly zero. In addition, you can always fill the tank at the destination so you do not have to worry about the return trip.</p>