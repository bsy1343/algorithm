# [Platinum III] Mountain Road - 3675

[문제 링크](https://www.acmicpc.net/problem/3675)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 14, 맞힌 사람: 13, 정답 비율: 26.531%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In the Franconian Switzerland, there is a narrow mountain road. With only a single lane, this is a bottleneck for two-way traffic. Your job is to schedule incoming cars at both ends so that the last car leaves the road as early as possible.</p>

<p>Each car is specified by three values: the direction in which it is going, the arrival time at the corresponding beginning of the road, and the driving time this car needs to get through, provided it is not slowed down by other cars in front. Cars cannot overtake each other on the mountain road, and reordering cars in the queues at the ends of the road is not allowed.</p>

<p>For safety reasons, two successive cars going in the same direction may not pass any point of the road within less than 10 seconds. This ensures that the second car will not crash into the first car if the latter brakes hard. However, if another car passes in the other direction in between, it will be clear that the road is empty, so in this case, this rule does not apply.</p>

### 입력

<p>The first line of the input consists of a single integer c (1 &le; c &le; 200), the number of test cases.</p>

<p>Then follow the test cases, each beginning with a single line consisting of an integer n (1 &le; n &le; 200), the number of cars you are to consider in this test case. The remainder of each test case consists of n lines, one line per car, starting with a single upper case letter (&ldquo;A&rdquo; or &ldquo;B&rdquo;), giving the direction in which the car is going. Then follow, on the same line, two integers t (0 &le; t &le; 100 000) and d (1 &le; d &le; 100 000), giving the arrival time at the beginning of the road and the minimum travel time, respectively, both in seconds.</p>

<p>Within a test case, the cars are given in order of increasing arrival time, and no two cars will arrive at the same time.</p>

### 출력

<p>For each test case, print a single line consisting of the point in time (in seconds) the last car leaves the road when the cars are scheduled optimally.</p>