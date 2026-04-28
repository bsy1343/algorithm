# [Platinum III] Lighthouses - 18725

[문제 링크](https://www.acmicpc.net/problem/18725)

### 성능 요약

시간 제한: 15 초, 메모리 제한: 512 MB

### 통계

제출: 27, 정답: 12, 맞힌 사람: 12, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Lighthouse Island is an island whose shape is a convex polygon. On each vertex of the polygon there is a lighthouse, which provides a beautiful wide sea view. Some pairs of lighthouses are connected by straight tram lines. Some of these lines may intersect, but since there are no switches, a tram which enters a tram line can only exit it by driving to the other end.</p>

<p>Daredevil Vladik recently acquired a tram (through completely non-violent means, description of which is beyond the scope of this problem statement), brought it to the island, and he is planning a ride of his life. He wants to start next to one of the lighthouses, visit several lighthouses in some order by traveling along the tram lines, and then depart the island. Moreover, following Vladik&rsquo;s tracks, the FBI also came to the island. They are keen to meet Vladik &ndash; mostly to say hi, and talk about how operating a tram without a valid tram driving license is a completely sensible thing to do. Since Vladik would like to avoid meeting FBI for now, whenever he visits some point on the island, he shall never come to the same point again. In other words, Vladik&rsquo;s trip should form a polygonal chain without self-intersections.</p>

<p>Vladik wants the route of his trip to be as long as possible (in terms of total euclidean length), so he can brag to other Vladiks about his stunt. Help him &ndash; given the map of the island, find the longest possible trip he could take without visiting any point on the island twice.</p>

### 입력

<p>The first line of input contains the number of test cases z. The descriptions of the test cases follow.</p>

<p>The first line of every test case consists of an integer n (3 &le; n &le; 300) &ndash; the number of lighthouses. Then, n lines follow, each one containing two integers: x<sub>i</sub> and y<sub>i</sub> (&minus;10<sup>9</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>9</sup>) &ndash; the coordinates of the i-th lighthouse. The lighthouses are listed in the same order as they appear when moving along the borderline of the island counterclockwise. No three lighthouses lie on a common line. The next line contains an integer m (0 &le; m &le; n(n &minus; 1)/2) &ndash; the number of tram lines. Then, m lines follow, each one containing two integers: v<sub>i</sub> and u<sub>i</sub> (1 &le; v<sub>i</sub>&nbsp;&ne;&nbsp;u<sub>i</sub> &le; n) &ndash; the indices of lighthouses connected with a tram line. Every undirected pair of lighthouses is connected by at most one line.</p>

<p>The total number of lighthouses in all test cases does not exceed 3 000.</p>

### 출력

<p>For each test case output one number: the maximum length of Vladik&rsquo;s trip. Your answer will be considered correct if the absolute or relative error does not exceed 10<sup>&minus;6</sup>.</p>