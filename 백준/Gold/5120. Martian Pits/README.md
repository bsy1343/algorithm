# [Gold I] Martian Pits - 5120

[문제 링크](https://www.acmicpc.net/problem/5120)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 8, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>With all the work from the previous problem, it should be pretty easy to figure out how to get the rover from point A to point B along a straight line or two. Unfortunately, the Martian pranksters are back, and they figured that the engineers on Earth surely would like a little challenge. So they have dug a bunch of pits on the surface that the rover could fall into. Getting from point A to point B may now involve significant detours, or even be impossible.</p>

<p>You will be given a map with the initial and desired location of the rover, as well as the locations of all the pits that the Martians have dug. Using the rover control commands (see the previous problem), you are to get the rover to its destination as quickly as possible, i.e., in as few seconds as possible. Of course, you also need to make sure that the rover does not fall into any pits along the way. The command sequence that you send will contain exactly one command each second.</p>

<p>A map will be given by strings of 4 characters. The character &lsquo;.&rsquo; denotes empty space, &lsquo;P&rsquo; denotes a pit, &lsquo;R&rsquo; the starting location of the rover, and &lsquo;D&rsquo; the destination of the rover. The letters &lsquo;R&rsquo; and &lsquo;D&rsquo; will occur exactly once on the map. The rover will always start facing up on the map, and it does not matter which direction it faces at the destination (but it must be stopped there). The rover cannot leave the area of the map, since for all we know, the Martians have dug pits all around.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line contains two integers 1 &le; h,w &le; 50, the size of the map.</p>

<p>This is followed by h lines of w characters each, describing one row of the map, as explained above.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, on the next line, output the minimum number of seconds within which the rover can reach the destination. If it is impossible to reach the destination, output &ldquo;Impossible&rdquo; instead.</p>

<p>Each data set should be followed by a blank line.</p>