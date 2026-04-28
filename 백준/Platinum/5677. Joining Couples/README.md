# [Platinum II] Joining Couples - 5677

[문제 링크](https://www.acmicpc.net/problem/5677)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 61, 정답: 21, 맞힌 사람: 18, 정답 비율: 32.143%

### 분류

많은 조건 분기, 그래프 이론, 최소 공통 조상, 위상 정렬, 트리, 방향 비순환 그래프

### 문제 설명

<p>Air traffic regulations in Nlogonia require that each city must register exactly one outbound flight to another city. Passengers can use this flight only in the direction registered, that is, there may be a flight registered from city X to city Y and no flight registered from city Y to city X. Thus, the number of registered flights is equal to the number of cities. This rule, as one can imagine, makes air travel somewhat complicated, but tradition and a strong ruling by the Queen makes any changes difficult. Besides, some companies even make a profit from the problems caused by the rule.</p>

<p>The Association for Couple Matching (ACM) is setting up a new service to help customers find their long lasting soulmates: the Internet Connecting Program for Couples (ICPC). The service consists of computing the minimum total number of flights a couple needs to take to meet one another (perhaps in a city where neither of them lives in). Assuming the couple&rsquo;s starting cities are A and B, the agency will try to find a city C such that C is reachable by air travel from both A and B, and the sum of the number of flights needed to go from A to C and the number of flights needed to go from B to C is minimized. Note that C may be equal to A or B or both.</p>

<p>You will be given the list of all available flights, and a list of queries consisting of pairs of cities where the members of a couple live. For each query, you must compute the minimum total number of flights that are needed for them to meet.</p>

### 입력

<p>Each test case is described using several lines. The first line contains an integer N representing the number of cities (2 &le; N &le; 10<sup>5</sup>). Cities are identified by different integers from 1 to N. The second line contains N integers F<sub>i</sub>, where F<sub>i</sub> indicates that the registered outbound flight from city i is to city F<sub>i</sub> (1 &le; F<sub>i</sub> &le; N, F<sub>i</sub> &ne; i for i = 1, 2, . . . , N). The third line contains an integer Q representing the number of queries (1 &le; Q &le; 10<sup>5</sup>). Each of the next Q lines describes a query with two integers A and B indicating the couple&rsquo;s starting cities (1 &le; A, B &le; N). Within each test case, if it is possible to travel by air from city X to city Y , the maximum number of flights needed to do so is 10<sup>4</sup>.</p>

### 출력

<p>For each test case output Q lines. In the i-th line write an integer with the answer to the i-th query. If the corresponding couple can meet by air travel, write the minimum total number of flights that the couple must take to meet one another; if it is impossible for the couple to meet by air travel, write the number &minus;1.</p>