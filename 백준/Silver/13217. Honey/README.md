# [Silver III] Honey - 13217

[문제 링크](https://www.acmicpc.net/problem/13217)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 277, 정답: 95, 맞힌 사람: 77, 정답 비율: 33.772%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Fluffy is a squirrel who likes honey very much. He lives on a tall and big tree and always collects honey from the N​number of beehives on the tree.</p>

<p>One day, he notices that all the bees have gone out to work. Since it is now safe for him to collect the honey, he decides to do so. The only way for him to collect the honey is by using his M ml honey pot. On each trip, he can go to any one of the beehives and collect as much honey as he can using his honey pot. As Fluffy is a lazy squirrel, he decides not to collect honey more than K​times.</p>

<p>Assume that Fluffy can determine the amount of honey m​i ml in the beehives accurately by just looking at them. Help Fluffy to calculate the maximum possible amount of honey that he can collect.</p>

### 입력

<p>Line 1: Three positive integers: N​, M​and K​. (N​&le; 200,000,&nbsp;K​&le; 2,000,000,000,&nbsp;M​&le; 500,000)</p>

<p>Line 2 to (N + 1): Positive integers m<sub>i</sub>, one on each line. (m<sub>i</sub> ​&le; 500,000)</p>

### 출력

<p>A single integer stating the maximum possible amount of honey Fluffy can collect.</p>

### 힌트

<p>Sample 1</p>

<p>Take 10 ml from the 1st hive, then 7 ml from the second, 9 ml from the 4 th and finally 7 ml from the last one. This is the maximum possible, totaling 10+7+9+7 = 33.</p>

<p>Sample 2</p>

<p>Take 10 ml from the 1st hive, then 10 ml from the 2 nd hive and another 9 ml from the 2 nd hive, totaling 10+10+9 = 29</p>