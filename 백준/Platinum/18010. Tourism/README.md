# [Platinum III] Tourism - 18010

[문제 링크](https://www.acmicpc.net/problem/18010)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 12, 맞힌 사람: 10, 정답 비율: 38.462%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 트리

### 문제 설명

<p>Da Vinci has a wide range of interests including botany. He once planned to travel around Florence to study plant domestication and ecosystem. There were n cities in Florence and city i had w<sub>i</sub> species of plants, while each of m bidirectional roads connected a pair of cities. It was possible to travel between every pair of cities via these paths.</p>

<p>Da Vinci started from city s and he could travel to one of the adjacent cities through one bidirectional road. However, if he traveled to some city v through road u &rarr; v, he would not immediately return to city u using the same road. (It was boring to travel back and forth on the same road!) Da Vinci wanted to see as many species of plants as possible &ndash; in other words, he hoped to maximize &sum;<sub>City i is visited</sub>&nbsp;w<sub>i</sub>. He could repeatedly visit a city, but the number of species in that city would only count once. What is the maximum number of plant species he could see during the tour, assuming that he did not care about which city to end the trip?</p>

### 입력

<p>The first line is the number 1 &le; K &le; 20 of input data sets, followed by K data sets, each of the following form:</p>

<p>The first line are two integers 1 &le; n, m &le; 1000 separated by space. The second line has n integers 0 &le; w<sub>i</sub> &le; 10<sup>6</sup>. Each of the following m lines contains two integers 1 &le; x<sub>i</sub>, y<sub>i</sub> &le; n, describing the j-th road connecting city x<sub>j</sub> and y<sub>j</sub>. The next line has a single integer s(1 &le; s &le; n) &ndash; the city da Vinci started with.</p>

<p>It is possible to travel between any pairs of cities using these roads, no two roads connect the same pair of cities, and no road connects a city to itself.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum number of plant species da Vinci could see.</p>

<p>Each data set should be followed by a blank line.</p>