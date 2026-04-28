# [Platinum IV] Candy - 6838

[문제 링크](https://www.acmicpc.net/problem/6838)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 73, 정답: 12, 맞힌 사람: 10, 정답 비율: 16.949%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>You and a friend have a big bag of candy. You want to keep slim and trim, and so you would like to equalize the candy which you are sharing with your friend in terms of calorie count. That is, your task is to divide the candies into two groups such that the number of calories in each group is as close together as possible.</p>

### 입력

<p>The first line of input contains the number of different kinds of candy you have in your bag of candy N (1 &le; N &le; 100). On the following N lines, there are pairs of numbers describing each type of candy. The candy description is of the form k<sub>i</sub> c<sub>i</sub> where k<sub>i</sub> is the number of that particular type of candy contained in the bag and c<sub>i</sub> is the calorie count for each piece of that type of candy. You may assume that 1 &le; k<sub>i</sub> &le; 500 and 1 &le; c<sub>i</sub> &le; 200.</p>

### 출력

<p>Your output is one integer which is the minimum difference of calories between friends</p>

### 힌트

<p>Your friend takes two of the 100-calorie candies, for a total of 200 calories. You keep the remaining candies, which have 126 calories.</p>