# [Gold I] Exposing corruption - 11545

[문제 링크](https://www.acmicpc.net/problem/11545)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 56, 정답: 31, 맞힌 사람: 25, 정답 비율: 55.556%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 배낭 문제, 이분 그래프

### 문제 설명

<p>The Central Committee in Nlogonia is formed by many congress members. As the political system is dichotomic, each congress member belongs to one of two parties: the Deadly Serious Party and the Party! Party! Party. Historical tradition calls them DSP and PPP, respectively.</p>

<p>Edward is an investigative journalist. He discovered that congress members are corrupt and will switch parties if offered a given amount of Nlogmoney to do so. Each congress member has his or her own specific price, but they all have a price. As usual in politics, there exist rivalries between some pairs of congress members. Rivals would never accept to be in the same party.</p>

<p>Edward has a budget and wants to use it to make some congress members switch parties, thus gathering indisputable evidence for his investigation. In doing so, he has to respect rivalries: after everyone who was offered money switches, rivals must be left belonging to different parties.</p>

<p>Edward wants to cause maximum impact. Can you help him find out the maximum number of congress members that can belong to DSP if he uses at most all of his budget towards that goal? Similarly, what is the maximum number of congress members that can belong to PPP under the same constraints?</p>

### 입력

<p>The first line contains four integers D, P, R and B, representing respectively the number of congress members that initially belong to DSP (1 &le; D &le; 100), the number of congress members that initially belong to PPP (1 &le; P &le; 100), the number of rivalries among congress members (1 &le; R &le; 2000), and the budget of the journalist expressed in Nlogmoney (1 &le; B &le; 10<sup>4</sup>). Members of DSP are identified with distinct integers from 1 to D, while members of PPP are identified with distinct integers from 1 to P. The second line contains D integers S<sub>1</sub>, S<sub>2</sub>, . . . , S<sub>D</sub>, indicating that member i of DSP will switch parties if offered S<sub>i</sub> Nlogmoney (1 &le; S<sub>i</sub> &le; 100 for i = 1, 2, . . . , D). The third line contains P integers T<sub>1</sub>, T<sub>2</sub>, . . . , T<sub>P</sub> , indicating that member j of PPP will switch parties if offered T<sub>j</sub> Nlogmoney (1 &le; T<sub>j</sub> &le; 100 for j = 1, 2, . . . , P). Each of the next R lines describes a rivalry with two integers X and Y, representing that member X of DSP and member Y of PPP are rivals (1 &le; X &le; D and 1 &le; Y &le; P).</p>

### 출력

<p>Output a line with two integers representing the maximum number of congress members that can belong to DSP using the given budget and, similarly, the maximum number of congress members that can belong to PPP using the given budget.</p>