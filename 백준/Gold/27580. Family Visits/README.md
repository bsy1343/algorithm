# [Gold III] Family Visits - 27580

[문제 링크](https://www.acmicpc.net/problem/27580)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 34, 맞힌 사람: 31, 정답 비율: 45.588%

### 분류

자료 구조, 다이나믹 프로그래밍, 그리디 알고리즘, 우선순위 큐

### 문제 설명

<p>You are a college student living on your own. However, your doting family still likes to visit you, and they often stop by to check on your room at night before going to dinner. Your family will be worried if they find a mess in your room. Therefore you make an effort to ensure that they never see a mess in your room when visiting at night. You have some free time each afternoon that allows you to clean up, but the amount of free time varies each day due to prior commitments.</p>

<p>Luckily, your schedule is planned out well. You know exactly how big of a mess you will make each morning, how much mess you can clean each afternoon, and on which nights your family will stop by. Since you are lazy, you want to spend as few afternoons as possible cleaning such that your family will always see a room without any mess. You may assume that your room starts completely clean, and any mess that is not cleaned remains until it is cleaned.</p>

### 입력

<p>The first line of input contains two integers, $n$ and $d$ ($1 \leq d \leq n \leq 1\,000$), where $n$ is the number of days in your schedule and $d$ is the number of days your family will visit. </p>

<p>Each of the next $n$ lines contains two integers $m$ and $c$ ($0 \le m,c \le 1\,000$). For each day, in order, $m$ is the amount of mess you make in the morning, and $c$ is the amount you can clean in the afternoon.</p>

<p>Each of the next $d$ lines contains a single integer $v$ ($1 \le v \le n$). These are the days on which your family will visit, and they are listed in strictly increasing order.  </p>

### 출력

<p>Output the smallest number of afternoons you have to spend cleaning to ensure your family will never see a mess. If it is not possible, output $-1$.</p>