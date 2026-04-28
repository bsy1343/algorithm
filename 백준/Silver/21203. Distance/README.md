# [Silver II] Distance - 21203

[문제 링크](https://www.acmicpc.net/problem/21203)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 130, 정답: 80, 맞힌 사람: 71, 정답 비율: 63.964%

### 분류

수학, 정렬, 누적 합

### 문제 설명

<p>The City of Manhattan is organized as a grid of streets and avenues, with streets running in the North-South direction and avenues running in the East-West direction. &nbsp;Streets are numbered from East to West starting from 1, and avenues are numbered from North to South starting from 1. &nbsp;Each intersection is labelled by the street and avenue number $(s, a)$. &nbsp;The distance between two intersections $(s_1, a_1)$ and $(s_2, a_2)$ is $|s_1-s_2| + |a_1-a_2|$.</p>

<p>Your company operates several food trucks at different intersections in Manhattan and you want to have them spread out so they do not compete with each other. &nbsp;To estimate how spread out they are, you have decided to compute the total distance between every distinct pair of your food trucks. &nbsp;A small total distance would mean that on average, a pair of food truck is too close together.</p>

<p>What is the total distance between every distinct pair of food trucks?</p>

### 입력

<p>The first line of input contains an integer $N$ ($2 \leq N \leq 200\,000$), which is the number of food trucks.</p>

<p>The next $n$ lines describe the food trucks&#39; locations. Each of these lines contains two integers $s$ ($1 \leq s \leq 1\,000\,000$), which is the street number of this food truck, and $a$ ($1 \leq a \leq 1\,000\,000$), which is the avenue number of this food truck.</p>

### 출력

<p>Display the total distance between every distinct pair of food trucks.</p>