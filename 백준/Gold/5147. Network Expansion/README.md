# [Gold II] Network Expansion - 5147

[문제 링크](https://www.acmicpc.net/problem/5147)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색, 비트마스킹, 최단 경로

### 문제 설명

<p>Los Angeles is currently trying to expand its public transportation system, in particular the rail lines. Among the projects being discussed are the Blue Line currently being built near Exposition Blvd., an extension of the Gold Line all the way to Pomona, the &ldquo;Subway to the Sea&rdquo; through the West LA area to Santa Monica, and direct connections to the airport, among others. Among many questions, one very important one about this project is where all the money will come from. In fact, lack of funds tends to force difficult choices between many possibly worthwhile expansions. Here, we are going to try to make those decisions optimally.</p>

<p>You will be given the current system, and up to 10 proposed expansion routes. Your goal is to choose a subset of those routes fitting your budget that reduces the total travel time as much as possible. For simplicity, we assume that each stop on a subway line takes one minute, and that changing lines is instantaneous. The system will be connected (i.e., with enough time, one can get from any point to any other), even without the expansions. Also, any line can be used in both directions.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form: The first line of each data set contains four integer numbers n,m,p,B. 2 &le; n &le; 50 is the number of stations in the system, 1 &le; m &le; 50 is the number of current routes, 1 &le; p &le; 10 is the number of proposed expansion lines, and B is the total budget.</p>

<p>This is followed by m lines, each describing one current route with ni &ge; 2 integers, giving the stations the route visits in order. The next p lines each describe one proposed expansion route j, in the form of first one integer p<sub>j</sub> for the price of the route, followed by n&prime;<sub>j</sub> &ge; 2 integers giving the stations on this proposed route in order.</p>

<p>Finally, there are n lines, each giving n integers: the jth integer in line i is the number of passengers wanting to go from station i to station j</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the maximum by which you can reduce the sum of travel times of all passengers with a selection of new routes that falls within your budget.</p>