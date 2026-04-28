# [Platinum II] Roller Coaster - 4720

[문제 링크](https://www.acmicpc.net/problem/4720)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 25, 정답: 14, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Bessie has gone on a trip, and shes riding a roller coaster! Bessie really likes riding the roller coaster, but unfortunately she often gets dizzy.</p>

<p>The roller coaster has a number of distinct sections that Bessie rides in order. At the beginning of the ride, Bessie&rsquo;s dizziness and fun levels are both at 0. For each section of the roller coaster, Bessie can either keep her eyes open or keep them closed (and must keep them that way for the whole section). If she keeps her eyes open for a section, her total fun increases by a Fun factor for that section, and her dizziness increases by a Dizziness factor for that section. However, if she keeps her eyes closed for the section, her total fun will not change, but her dizziness will decrease by a value thats constant for the entire roller coaster. (Note that her dizziness can never go below 0.)</p>

<p>If at any point, Bessie&rsquo;s dizziness is above a certain limit, Bessie will get sick. Write a program to find the maximum amount of fun Bessie can have without getting sick.</p>

### 입력

<p>There will be several test cases in the data file. Each test case will begin with a line with three integers:</p>

<p style="text-align: center;">N K L</p>

<p>where N (1 &le; N &le; 1, 000) is the number of sections in this particular the roller coaster; K (1 &le; K &le; 500) is the amount that Bessies dizziness level will go down if she keeps her eyes closed on any section of the ride; and L (1 &le; L &le; 300, 000) is the limit of dizziness that Bessie can tolerate &ndash; if her dizziness ever becomes larger than L, Bessie will get sick, and thats not fun!</p>

<p>Each of the next N lines will have two integers:</p>

<p style="text-align: center;">F D</p>

<p>where F (1 &le; F &le; 20) is the increase to Bessies total fun that shell get if she keeps her eyes open on that section, and D (1 &le; D &le; 500) is the increase to her dizziness level if she keeps her eyes open on that section. The sections will be listed in order.</p>

<p>The data file will end with a line with three 0s.</p>

### 출력

<p>For each test case, output line containing a single integer, representing the maximum amount of fun Bessie can have on that roller coaster without exceeding her dizziness limit.</p>