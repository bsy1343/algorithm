# [Platinum II] Roller Coaster - 4098

[문제 링크](https://www.acmicpc.net/problem/4098)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 126, 정답: 30, 맞힌 사람: 16, 정답 비율: 21.333%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Bessie has gone on a trip, and she&rsquo;s riding a roller coaster! Bessie really likes riding the roller coaster, but unfortunately she often gets dizzy.</p>

<p>The roller coaster has a number of distinct sections that Bessie rides in order. At the beginning of the ride, Bessie&#39;s dizziness and fun levels are both at 0. For each section of the roller coaster, Bessie can either keep her eyes open or keep them closed (and must keep them that way for the whole section). If she keeps her eyes open for a section, her total fun increases by a Fun factor for that section, and her dizziness increases by a Dizziness factor for that section. However, if she keeps her eyes closed for the section, her total fun will not change, but her dizziness will decrease by a value that&rsquo;s constant for the entire roller coaster. (Note that her dizziness can never go below 0.)</p>

<p>If, at any point, Bessie&#39;s dizziness is above a certain limit, Bessie will get sick. Write a program to find the maximum amount of fun Bessie can have without getting sick.</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with three integers:</p>

<pre>
N K L</pre>

<p>Where N (1 &le; N &le; 1,000) is the number of sections in this particular roller coaster, K (1 &le; K &le; 500) is the amount that Bessie&rsquo;s dizziness level will go down if she keeps her eyes closed on any section of the ride, and L (1 &le; L &le; 300,000) is the limit of dizziness that Bessie can tolerate &ndash; if her dizziness ever becomes larger than L, Bessie will get sick, and that&rsquo;s not fun!</p>

<p>Each of the next N lines will describe a section of the roller coaster, and will have two integers:</p>

<pre>
F D</pre>

<p>Where F (1 &le; F &le; 20) is the increase to Bessie&rsquo;s total fun that she&rsquo;ll get if she keeps her eyes open on that section, and D (1 &le; D &le; 500) is the increase to her dizziness level if she keeps her eyes open on that section. The sections will be listed in order. The input will end with a line with three 0s.</p>

### 출력

<p>For each test case, output a single integer, representing the maximum amount of fun Bessie can have on that roller coaster without exceeding her dizziness limit. Print each integer on its own line with no spaces. Do not print any blank lines between answers.</p>