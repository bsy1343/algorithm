# [Platinum III] Reverse Roads - 22508

[문제 링크](https://www.acmicpc.net/problem/22508)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 33, 정답: 28, 맞힌 사람: 23, 정답 비율: 85.185%

### 분류

그래프 이론, 최대 유량

### 문제 설명

<p>ICP city has an express company whose trucks run from the crossing&nbsp;<var><i>S</i></var>&nbsp;to the crossing&nbsp;<var><i>T</i></var>. The president of the company is feeling upset because all the roads in the city are one-way, and are severely congested. So, he planned to improve the maximum flow (edge disjoint paths) from the crossing&nbsp;<var><i>S</i></var>&nbsp;to the crossing&nbsp;<var><i>T</i></var>&nbsp;by reversing the traffic direction on some of the roads.</p>

<p>Your task is writing a program to calculate the maximized flow from&nbsp;<var><i>S</i></var>&nbsp;to&nbsp;<var><i>T</i></var>&nbsp;by reversing some roads, and the list of the reversed roads.</p>

### 입력

<p>The first line of a data set contains two integers&nbsp;<var><i>N</i></var>&nbsp;(<var>2&le;<i>N</i>&le;300</var>) and&nbsp;<var><i>M</i></var>&nbsp;(<var>0&le;<i>M</i>&le;min(1&thinsp;000,&nbsp;<i>N</i>(<i>N</i>&minus;1)&frasl;2)</var>).&nbsp;<var><i>N</i></var>&nbsp;is the number of crossings in the city and&nbsp;<var><i>M</i></var>&nbsp;is the number of roads.</p>

<p>The following&nbsp;<var><i>M</i></var>&nbsp;lines describe one-way roads in the city. The&nbsp;<var><i>i</i></var>-th line (<var>1</var>-based) contains two integers&nbsp;<var><i>X</i><sub><i>i</i></sub></var>&nbsp;and&nbsp;<var><i>Y</i><sub><i>i</i></sub></var>&nbsp;(<var>1&le;<i>X</i><sub><i>i</i></sub>,<i>Y</i><sub><i>i</i></sub>&le;<i>N</i></var>,&nbsp;<var><i>X</i><sub><i>i</i></sub>&ne;<i>Y</i><sub><i>i</i></sub></var>).&nbsp;<var><i>X</i><sub><i>i</i></sub></var>&nbsp;is the ID number (<var>1</var>-based) of the starting point of the&nbsp;<var><i>i</i></var>-th road and&nbsp;<var><i>Y</i><sub><i>i</i></sub></var>&nbsp;is that of the terminal point. The last line contains two integers&nbsp;<var><i>S</i></var>&nbsp;and&nbsp;<var><i>T</i></var>&nbsp;(<var>1&le;<i>S</i>,<i>T</i>&le;<i>N</i></var>,&nbsp;<var><i>S</i>&ne;<i>T</i></var>,&nbsp;<var>1</var>-based).</p>

<p>The capacity of each road is&nbsp;<var>1</var>. You can assume that&nbsp;<var><i>i</i>&ne;<i>j</i></var>&nbsp;implies either&nbsp;<var><i>X</i><sub><i>i</i></sub>&ne;<i>X</i><sub><i>j</i></sub></var>&nbsp;or&nbsp;<var><i>Y</i><sub><i>i</i></sub>&ne;<i>Y</i><sub><i>j</i></sub></var>, and either&nbsp;<var><i>X</i><sub><i>i</i></sub>&ne;<i>Y</i><sub><i>j</i></sub></var>&nbsp;or&nbsp;<var><i>X</i><sub><i>j</i></sub>&ne;<i>Y</i><sub><i>i</i></sub></var>.</p>

### 출력

<p>In the first line, print the maximized flow by reversing some roads. In the second line, print the number&nbsp;<var><i>R</i></var>&nbsp;of the reversed roads. In each of the following&nbsp;<var><i>R</i></var>&nbsp;lines, print the ID number (<var>1</var>-based) of a reversed road. You may not print the same ID number more than once.</p>

<p>If there are multiple answers which would give us the same flow capacity, you can print any of them.</p>