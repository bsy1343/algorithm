# [Platinum II] The festival must go on - 10884

[문제 링크](https://www.acmicpc.net/problem/10884)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 201, 정답: 69, 맞힌 사람: 49, 정답 비율: 32.237%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 트리, 이분 탐색, 트리에서의 다이나믹 프로그래밍, 매개 변수 탐색

### 문제 설명

<p>Cube World is a small world ruled by Jeehak Yoon, a well-known computer scientist who loves trees. In this world, there are N cities connected by N &minus;1 bidirectional roads, and for any two distinct cities, there always exists a path between them. The cities are numbered by integers from 1 to N, and the roads are numbered by integers from 1 to N &minus; 1.</p>

<p>Jeehak is planning to hold a festival in celebration of his absolute first place in IOI 2015. He decided to choose M out of N &minus; 1 roads and hold various events on each chosen road, such as car parades, sports events and so on. But Suchan, an official from the Ministry of Transportation, disagreed with his plan. He argued that the traffic could be paralyzed because it was totally impossible to move to other cities without roads in Cube World. Jeehak thought he was right and decided to choose M roads which minimizes the maximum length of all possible simple paths that only pass the chosen roads.</p>

<p>Given the information of roads in Cube World and the number of roads to be chosen, write a program which determines which roads should be chosen and prints the maximum length of all possible simple paths which only pass the chosen roads.</p>

### 입력

<p>The first line of input contains an integer T (1 &le; T &le; 100), the number of test cases.</p>

<p>Each test case starts with a line containing two space-separated integers N and M (1 &le; N &le; 2,000, 1 &le; M &le; N &minus; 1), where N is the number of cities in Cube World and M is the number of roads which should be chosen. Next N &minus; 1 lines describe the roads. The i-th (1 &le; i &le; N &minus; 1) line of them contains three space-separated integers a<sub>i</sub>, b<sub>i</sub> and l<sub>i</sub> (1 &le; a<sub>i</sub>, b<sub>i</sub> &le; N, a<sub>i</sub> &ne; b<sub>i</sub>, 1 &le; l<sub>i</sub> &le; 10<sup>6</sup>), denoting that the i-th road connects city a<sub>i</sub> and city b<sub>i</sub>, and its length is l<sub>i</sub>.</p>

<p>It is guaranteed that the total number of cities in the whole input doesn&rsquo;t exceed 2,000.</p>

### 출력

<p>For each test case, print exactly one line containing the maximum length of all possible simple paths which only pass the chosen roads.</p>

### 힌트

<p>A simple path in Cube World is a path without repeating vertices. More formally, a simple path in Cube world is a sequence of distinct cities c<sub>1</sub>, c<sub>2</sub>, &middot;&middot;&middot; , c<sub>l</sub>, such that for any i (1 &le; i &le; l &minus; 1), a road connecting city c<sub>i</sub> and city c<sub>i+1</sub> exists.</p>