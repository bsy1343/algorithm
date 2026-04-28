# [Silver V] Time on task - 6752

[문제 링크](https://www.acmicpc.net/problem/6752)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 286, 정답: 199, 맞힌 사람: 169, 정답 비율: 70.417%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>You have been asked by a parental unit to do your chores.</p>

<p>Each chore takes a certain amount of time, but you may not have enough time to do all of your chores, since you can only complete one chore at a time. You can do the chores in any order that you wish.</p>

<p>What is the largest amount of chores you can complete in the given amount of time?</p>

### 입력

<p>The first line of input consists of an integer T (0 &le; T &le; 100000), which is the total number of minutes you have available to complete your chores.</p>

<p>The second line of input consists of an integer C (0 &le; C &le; 100), which is the total number of chores that you may choose from. The next C lines contain the (positive integer) number of minutes required to do each of these chores. You can assume that each chore will take at most 100000 minutes.</p>

### 출력

<p>The output will be the maximum number of chores that can be completed in time T</p>

### 힌트

<p>Chores must be completed in at most 6 minutes. There are 3 chores available. The first chore takes 3 minutes. The second chore takes 6 minutes. The third chore takes 3 minutes. The answer is 2 since only 2 of these chores can be completed in 6 minutes of time. Specifically, the first and last chore can be completed in the allowable time. It is not possible to complete all 3 chores in 6 minutes.</p>