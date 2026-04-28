# [Gold I] Highway Decommission - 16528

[문제 링크](https://www.acmicpc.net/problem/16528)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 205, 정답: 83, 맞힌 사람: 67, 정답 비율: 39.181%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 역추적

### 문제 설명

<p>Nlogonia&rsquo;s government is eager to cut down public debt. One of the measures about to take place is the decommission of some highways as most of them incur a high maintenance cost. Each highway connects two different cities and can be traveled in both directions. Using the existing highways it is possible to reach any city from any other city.</p>

<p>Government promises that the impact of the decommission will be minimal in the lives of Nlogonians. In particular they guarantee that after the decommission, for each city the minimum distance needed to travel from that city to the capital of the country will remain the same as it is now, when all the highways can be used.</p>

<p>The Department of Roads of Nlogonia believes that interns are not there just to get coffees or run errands but should do meaningful work instead and that&rsquo;s why you are assigned the following task. Given the length and maintenance cost of each highway, you must decide which highways will be kept active and which will be decommissioned. As you might guess, the sum of maintenance costs for the remaining highways must be minimum.</p>

### 입력

<p>The first line contains two integers N (2 &le; N &le; 10<sup>4</sup>) and M (1 &le; M &le; 10<sup>5</sup>), indicating respectively the number of cities and the number of highways. Cities are identified by distinct integers from 1 to N, where city 1 is the capital of Nlogonia. Each of the following M lines describes a highway with four integers A, B, L and C (1 &le; A, B &le; N, A &ne; B and 1 &le; L, C &le; 10<sup>9</sup>), indicating that there is a highway between cities A and B that has length L and maintenance cost C. Using the existing highways it is possible to reach any city from any other city.</p>

### 출력

<p>Output a single line with an integer indicating the minimum possible sum of maintenance costs for a set of highways to be kept active. This set of highways must ensure that for each city the minimum distance needed to travel from that city to the capital of Nlogonia remains the same using only those highways.</p>