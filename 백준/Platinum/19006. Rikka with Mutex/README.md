# [Platinum IV] Rikka with Mutex - 19006

[문제 링크](https://www.acmicpc.net/problem/19006)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 2, 정답: 1, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Sometimes, technical terms implicate some life philosophy. Mutex is one of them. On your way to dream, you may be locked by some difficulties, and you need someone to stop their step, and help you get through them.</p>

<p>To help you learn about the life philosophy inside a mutex, Rikka came up with a simple problem. Maybe some of you know little about mutexes, so she uses another scene to replace it.</p>

<p>There is a system of $n$ gates in a row, placed from left to right. Several people stand on the left side of all the gates, and all of them want to go to the right side. There are two kinds of gates: black and white. The people share energy, which is represented by a non-negative integer $E$. Initially, $E = 0$.</p>

<p>If a person walks through a white gate, this person will gain one point of energy: the value $E$ will be increased by $1$. And if a person walks through a black gate, this person will lose one point of energy: the value $E$ will be decreased by $1$. Since $E$ must be a non-negative integer, if $E = 0$, no one can walk through a black gate until someone walks through a white gate. You can assume there won&#39;t be two people moving at the same time. No person can go from right to left.</p>

<p>We use &quot;<code>P</code>&quot; to represent a black gate, &quot;<code>V</code>&quot; to represent a white gate, and a string of letters &quot;<code>P</code>&quot; and &quot;<code>V</code>&quot; to represent the row of gates. Initially, all the people are at the beginning of the string, and ideally, all of them would want to go through the whole string. Unfortunately, sometimes it may be impossible. So, instead, all the people act selflessly, and their common goal is to send at least one person to the right side of all the gates.</p>

<p>Your task is to find out the minimum possible number of people this group needs to be able to achieve this goal.</p>

<p>For example, if the row is &quot;<code>VPP</code>&quot;, they need at least two people: the first person walks through the first white gate, gaining one energy point for the group, and then the second person is able to go through the whole string.</p>

### 입력

<p>The first line contains a single integer $t$ ($1 \leq t \leq 10^3$), the number of test cases.</p>

<p>Each test case is given on a single line. This line contains a string $s$ ($1 \leq |s| \leq 10^5$) consisting of letters &quot;<code>P</code>&quot; and &quot;<code>V</code>&quot; which describes the row of gates.</p>

<p>It is guaranteed that there are at most $30$ test cases with $|s| &gt; 1000$.</p>

### 출력

<p>For each test case, print a single integer on a separate line: the minimum number of people needed to achieve the common goal. If it is impossible to achieve the goal regardless of the number of people, print $-1$.</p>