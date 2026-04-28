# [Platinum II] Desert Travel - 25782

[문제 링크](https://www.acmicpc.net/problem/25782)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 23, 맞힌 사람: 15, 정답 비율: 50.000%

### 분류

자료 구조, 그래프 이론, 기하학, 트리, 분리 집합, 최소 스패닝 트리, 최소 공통 조상, 피타고라스 정리

### 문제 설명

<p>You are stuck in a desert. The desert can be thought of as a Cartesian grid. There are many oases in the desert of which you know the xy-coordinates. You are going to be making a series of trips between pairs of oases, i.e., each trip has a starting oasis and an ending oasis. For any trip, you can stop in other oases along the way (as many as you&rsquo;d like).</p>

<p>You obviously need water to travel in the desert. It turns out that every 1 unit traveled in the desert requires 1 unit of water. You need to determine what canteen size to use for each trip. You&rsquo;d like to use the smallest canteen size for each trip (no one wants to carry more than what is needed).</p>

<p>You can fill up the canteen used in a trip at each oasis along the way to hold you until the next oasis. Thus, the maximum Euclidean distance between pairs of consecutive oases along your path for the trip determines the canteen size you need. For example, if you traveled from (0, 0) to (2, 4) to (4, 5), then your maximum distance would be approximately 4.472, the distance between (0,0) and (2,4), because this is longer than the distance between (2,4) and (4,5). This distance determines the canteen size needed for the trip.</p>

<p>Given the number of oases in the desert and several trips (each trip with a starting oasis and an ending oasis), determine the maximum Euclidean distance between pairs of consecutive oases along the path for each trip.</p>

### 입력

<p>The first input line contains an integer, O (1 &le; O &le; 5,000), representing the number of oases. Each of the following O input lines contains two integers, the i th of which contains x<sub>i</sub> and y<sub>i</sub> (-10<sup>6</sup> &le; x<sub>i</sub> &le; 10<sup>6</sup> and -10<sup>6</sup> &le; y<sub>i</sub> &le; 10<sup>6</sup>), representing the x and y coordinate of the i th oasis. (Assume the oases are numbered 1, 2, 3, &hellip;, O.)</p>

<p>The next input line contains an integer, Q (1 &le; Q &le; 500,000), representing the number of trips. Each of the following Q input lines contains two integers, the ith of which contains s<sub>i</sub> and e<sub>i</sub> (1 &le; s<sub>i</sub> &le; O and 1 &le; e<sub>i</sub> &le; O), representing the starting and ending oasis numbers for the i th trip.</p>

### 출력

<p>For each trip, print on a single line by itself a single number: the maximum Euclidean distance between pairs of consecutive oases along the path for that trip. Answers within 10<sup>-6</sup> absolute or relative of the expected answers will be considered correct.</p>