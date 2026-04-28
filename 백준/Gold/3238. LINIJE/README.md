# [Gold III] LINIJE - 3238

[문제 링크](https://www.acmicpc.net/problem/3238)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 6, 맞힌 사람: 5, 정답 비율: 31.250%

### 분류

그리디 알고리즘, 트리

### 문제 설명

<p>The tram network in my town is made of tram stations and lines that connect them.</p>

<p>One tram line consists of a sequence of distinct stations and there is always a direct line between two consecutive stations on a line. Every two stations are connected with a line in a unique way. Also, there is always a way to get from one train station to another by using the city tram.</p>

<p>In an effort to help their citizens our dilligent town officials have decided to paint every tram with a colour (marked by numbers from 1 to B) so all the trams on the same line have the same colour, but all the trams that pass through the same station must be differently coloured.</p>

<p>Since our town&#39;s budget is very small, we need to use as little of different colours as possible.</p>

<p>Please, please help us! We need a program that will determine some way to paint our trams, so that the number different colours is minimal.&nbsp;</p>

### 입력

<p>In the first line of the input are two integers, N and M separated by a single space, 1 &le; N &le; 1000, 1 &le; M &le; 20000, the number of stations and the number of tram lines.</p>

<p>The next M lines describe the tram lines.</p>

<p>Each description begins with an integer R, the number of the tram stations through which the line passes (including the start and stop stations, which are mutually different). All the numbers in the descriptions are separated by a single space.</p>

<p>Note: the size of the input file will always be smaller than 2 MB.&nbsp;</p>

### 출력

<p>In the first line of the output file you have to write the minimal number of the colours used to that will be used paint our town.</p>

<p>In the second line you have to write M numbers, separated by a single space. These numbers should present one of the possible ways to paint the trams, each number for one station, the first number is the colour of the first station etc.</p>