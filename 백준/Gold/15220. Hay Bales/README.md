# [Gold III] Hay Bales - 15220

[문제 링크](https://www.acmicpc.net/problem/15220)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 12, 맞힌 사람: 11, 정답 비율: 42.308%

### 분류

구현, 그리디 알고리즘, 격자 그래프

### 문제 설명

<p>Peter has lined up hay bales. Some hay bales contain parasites and he wants to move the infected hay bales to the back of the sequence, to minimize the chance that the parasites spread. To sort the haybales, he repeatedly takes out any three consecutive hay bales and puts them back in sorted order. Your task is to calculate the minimum number of operations Peter has to execute to sort the sequence.</p>

### 입력

<p>The input contains a single string s (3 &le; |s| &le; 500), the sequence of hay bales. Each character of s is either &lsquo;C&rsquo; (for a clean hay bale) or &lsquo;P&rsquo; (for an infected one).</p>

### 출력

<p>The output must contain one integer, the minimum number of steps Peter has to execute.</p>