# [Silver II] Motorway Stops - 35251

[문제 링크](https://www.acmicpc.net/problem/35251)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 14, 맞힌 사람: 13, 정답 비율: 100.000%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>For your next summer holidays, you are planning an exciting road trip covering the full length of the famous M6 motorway.</p>

<p>You have your route planned out to balance travel time between stops, but time is a little short so you will have to strike one of the stops from your itinerary and continue straight past it to the next one.</p>

<p>To make the longest drive between stops as short as possible, which stop should you eliminate from your itinerary?</p>

### 입력

<ul>
<li>The first line of input contains the number of stops, $n$ ($3 \le n \le 200,000$).</li>
<li>The second line of input contains $n$ integers in strictly-increasing order, $s_1 \ldots s_n$ ($0 \le s \le 10^9$) giving the cumulative distances of stops on your original route.</li>
</ul>

<p>The first stop and last stop denote your start and end point respectively and cannot be skipped.</p>

### 출력

<p>Output the smallest integer distance between stops you can have, if you remove exactly one stop from the itinerary and it is not the first or last.</p>