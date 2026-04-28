# [Gold I] Even distribution - 10399

[문제 링크](https://www.acmicpc.net/problem/10399)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 43, 정답: 23, 맞힌 사람: 21, 정답 비율: 55.263%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Endre has lots of nieces and nephews. Once a year, he takes some of them on a trip to an archipelago where a boat company operates two-way services between some pairs of islands. Since Endre and the children can fly and return directly to or from any of the islands, any trip can be described as a nonempty sequence i<sub>1</sub>, i<sub>2</sub>, . . . , i<sub>n</sub> of islands, such that each pair of consecutive islands i<sub>j</sub> and i<sub>j+1</sub> have a boat service between them. The first and the last islands of a trip may or may not be the same island, and the islands may be visited more than once during the trip.</p>

<p>Each island in the archipelago produces a different peculiar variety of candy, and greets its visitors by giving each arriving group a fixed number of pieces of candy. Endre does not like candies himself, but the children eat them all almost instantly. To avoid fights, each time the group arrives to an island and receives candies, he evenly distributes them among the children.</p>

<p>You may wonder how Endre always manages to evenly distribute the candies they receive in each island. Well, the answer is actually very simple. Each year, the travel agency sends him the trip plan (the sequence i<sub>1</sub>, i<sub>2</sub>, . . . , i<sub>n</sub>) beforehand. Since he wants to travel with as many of his nieces and nephews as possible, he calculates the maximum number k of kids he can take on the trip without violating the rule about the even distribution of candy. Notice that each trip plan uniquely determines the number of kids to take.</p>

<p>This has been going on for years, and each time Endre ends up taking a different number of kids on the trip. He would like to know how many different numbers of kids he can take on a trip, that is, the number of integers k such that there is a trip plan for which he ends up taking k kids on the trip. Right now Endre is very busy preparing this year&rsquo;s trip. Can you help him with the answer?</p>

### 입력

<p>The first line contains two integers I and S (1 &le; I, S &le; 10<sup>4</sup>), representing respectively the number of islands and the number of boat services between them. Islands are identified with distinct integers from 1 to I. The second line contains I integers C<sub>1</sub>, C<sub>2</sub>, . . . , CI , where Ci indicates the number of pieces of candy the group receives when arriving at island i (1 &le; C<sub>i</sub> &le; 10<sup>5</sup> for i = 1, 2, . . . , I). Each of the next S lines describes a different boat service with two integers A and B (1 &le; A &lt; B &le; I), representing that it is possible to travel from island A to island B and from island B to island A. No two boat services allow to travel between the same pair of islands.</p>

### 출력

<p>Output a line with an integer representing the number of integers k such that there is a trip plan for which Endre ends up taking k kids on the trip.</p>