# [Platinum III] Rabbit Party - 22510

[문제 링크](https://www.acmicpc.net/problem/22510)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 5, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

백트래킹

### 문제 설명

<p>A rabbit Taro decided to hold a party and invite some friends as guests. He has&nbsp;<var><i>n</i></var>&nbsp;rabbit friends, and&nbsp;<var><i>m</i></var>&nbsp;pairs of rabbits are also friends with each other. Friendliness of each pair is expressed with a positive integer. If two rabbits are not friends, their friendliness is assumed to be 0.</p>

<p>When a rabbit is invited to the party, his satisfaction score is defined as the minimal friendliness with any other guests. The satisfaction of the party itself is defined as the sum of satisfaction score for all the guests.</p>

<p>To maximize satisfaction scores for the party, who should Taro invite? Write a program to calculate the maximal possible satisfaction score for the party.</p>

### 입력

<p>The first line of the input contains two integers,&nbsp;<var><i>n</i></var>&nbsp;and&nbsp;<var><i>m</i></var>&nbsp;(<var>1&le;<i>n</i>&le;100</var>,&nbsp;<var>0&le;<i>m</i>&le;100</var>). The rabbits are numbered from&nbsp;<var>1</var>&nbsp;to&nbsp;<var><i>n</i></var>.</p>

<p>Each of the following&nbsp;<var><i>m</i></var>&nbsp;lines has three integers,&nbsp;<var><i>u</i></var>,&nbsp;<var><i>v</i></var>&nbsp;and&nbsp;<var><i>f</i></var>.&nbsp;<var><i>u</i></var>&nbsp;and&nbsp;<var><i>v</i></var>&nbsp;(<var>1&le;<i>u</i>,<i>v</i>&le;<i>n</i></var>,&nbsp;<var><i>u</i>&ne;<i>v</i></var>,&nbsp;<var>1&le;<i>f</i>&le;1,000,000</var>) stands for the rabbits&#39; number, and&nbsp;<var><i>f</i></var>&nbsp;stands for their friendliness.</p>

<p>You may assume that the friendliness of a pair of rabbits will be given at most once.</p>

### 출력

<p>Output the maximal possible satisfaction score of the party in a line.</p>