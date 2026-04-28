# [Bronze I] Locust Locus - 23276

[문제 링크](https://www.acmicpc.net/problem/23276)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 207, 정답: 167, 맞힌 사람: 155, 정답 비율: 83.333%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>There are two different species of <a href="https://en.wikipedia.org/wiki/Periodical_cicadas">periodical cicadas</a>&nbsp;that only appear from hibernation every $13$ and $17$ years, respectively. Your old grandpa tells you that he saw them simultaneously back in &#39;92. &nbsp;You start pondering how many years you have to wait until you see them again. &nbsp;You collect information about other pairs of periodical cicadas and when they were last observed to find out when the next simultaneous appearance is.</p>

<p>Given several different pairs of cicadas and their last simultaneous appearance, find the next year that one of the pairs reappears.</p>

### 입력

<p>The first line of input contains a single integer $k$ ($1 \le k \le 99$), the number of pairs of periodical cicadas. &nbsp;Then follow $k$ lines, each containing three integers $y$, $c_1$ and $c_2$ ($1800 \le y \le 2021$, $1 \le c_1, c_2 \le 99$), the year this pair was last observed and cycle lengths for the first and second species, respectively. You may assume that none of the $k$ pairs reappears earlier than $2022$.</p>

### 출력

<p>Output the first year a pair reappears.</p>