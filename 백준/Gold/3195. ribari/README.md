# [Gold III] ribari - 3195

[문제 링크](https://www.acmicpc.net/problem/3195)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 42, 맞힌 사람: 26, 정답 비율: 68.421%

### 분류

그리디 알고리즘, 이분 탐색, 누적 합, 매개 변수 탐색

### 문제 설명

<p>In one small country, most of the citizens are fishermen, and all the towns in that country are situated on the straight line road along the straight line seaside.&nbsp;</p>

<p>Fishermen in the towns caught great amounts of fish, but they don&#39;t like the fish like they used to, so they decided to adopt poor and hungry children from the neighboring country.&nbsp;</p>

<p>One long straight road runs along the seaside connecting all towns. Hence, each town (except the first and the last) is directly connected to both neighboring towns. One child in one year eats one tone of fish. Amount of caught fish in some town can be eaten in that town or can be transported to other towns. During transportation there is a loss of food of one tone for one kilometer travelled because of taxes along the road.&nbsp;</p>

<p>We want that each town adopts the equal number of poor kids. Write a program that will determine the maximal number of kids that can be adopted in each town with the condition that all of them can be fed with the fish caught and cleverly transported.&nbsp;</p>

### 입력

<p>First line of input contains an integer N, 1 &le; N &le; 100,000, the number of towns.&nbsp;</p>

<p>Each of the following N lines contains two integers A and B, 1 &le; A &le; 1,000,000,000, 0 &le; B &le; 1,000,000,000, they denote the position of the town and the annual production of fish respectively. Towns will be sorted ascendingly according to the position on the road.&nbsp;</p>

<p>Note: there will always be a positive solution for the given test data.&nbsp;</p>

### 출력

<p>First and only line of output should contain the number of kids from the problem statement.&nbsp;</p>