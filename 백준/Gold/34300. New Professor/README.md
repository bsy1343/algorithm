# [Gold V] New Professor - 34300

[문제 링크](https://www.acmicpc.net/problem/34300)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 33, 맞힌 사람: 28, 정답 비율: 87.500%

### 분류

그리디 알고리즘, 우선순위 큐, 자료 구조

### 문제 설명

<p>After successfully defending their PhD, Blake got a job as a professor at CS@Mines. Because this is their first semester teaching, they want to look as sharp as possible. Luckily, they have a large wardrobe full of shirts in $C$ different colors.</p>

<p>Blake decides to wear a different color of shirt each day of the work week (Monday through Friday). Additionally, Blake hates doing laundry, so they only wear a shirt once before throwing it away. (Blake is OK with wearing the same color of shirt on Friday of one week and Monday of the next week.)</p>

<p><strong>Given the number of shirts of each of the $C$ colors, how many days can Blake go before breaking the rule of wearing $5$ different colors of shirts in a single week?</strong></p>

<p>Note that a work week is $5$ days (Monday, Tuesday, Wednesday, Thursday, Friday) and it is ok to wear the same color on Friday of a week and Monday of next consecutive week.</p>

### 입력

<p>The first line of input is a single integer $1 \leq C \leq 500$ representing the number of colors.</p>

<p>Each of the next $C$ lines contain an integer $1 \leq S_i \leq 500$ representing the number of shirts that Blake has of the $i^{\text{th}}$ unique color.</p>

### 출력

<p>Your output should be a single line, containing a single integer, the number of days that Blake can wear a different shirt before repeating themself.</p>