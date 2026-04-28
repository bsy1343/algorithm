# [Silver I] Expansion Order - 5148

[문제 링크](https://www.acmicpc.net/problem/5148)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 11, 맞힌 사람: 10, 정답 비율: 45.455%

### 분류

그리디 알고리즘

### 문제 설명

<p>Even having selected (in the previous problem) the set of routes to add to the system, another important question is in which order to build the expansions. For instance, it is not very useful to build a Gold Line from Pomona to Monrovia if there is no connection yet from Monrovia to Pasadena and thus the main network<sup>2</sup>.</p>

<p>You are to determine a feasible order for building various expansions. You will be given a starting point, which represents all of the current network, and all suggested expansions. You should either output an order such that each new line connects to the existing network at the time it is built, or state (correctly) that such an order does not exist.</p>

<p><sup>2</sup>See &ldquo;Bridge to Nowhere&rdquo; in the San Gabriel Mountains.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two integers n,m &ge; 1. n &le; 500 is the total number of stations in the network, with station 1 representing all of the current network. m &le; 50 is the number of proposed new routes.</p>

<p>This is followed by m lines, each describing one new route i. The description consists of the set S<sub>i</sub> &sube; {1,... ,n} of all stations the new route would connect.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output, one route per line, the routes in the order in which they should be built. If there are multiple feasible orders, choose one that comes first in the following sorting: to compare orders o,o&prime;, look at the first position where they differ. The order that has the smaller number in that position should come first. If no order exists, output &ldquo;Impossible&rdquo; instead of an ordering.</p>