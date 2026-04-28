# [Gold III] Like a Bridge over Troubled Freeways - 30262

[문제 링크](https://www.acmicpc.net/problem/30262)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 8, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>One of the legacies of P-22&rsquo;s story is that California is building more wildlife crossings over/under freeways. While P-22 survived his long journey (thanks in part to your solution to the previous problem), many other mountain lions do not. The idea is that animals will learn to use these crossings instead of running across the freeway, reducing deaths among them (and risk to humans from traffic accidents). In fact, the first wildlife crossing to be directly inspired by P-22, the Wallis Annenberg Crossing, was begun in April 2022.</p>

<p>Here, your goal is to figure out where to build multiple wildlife crossings to make the life of animals as easy as possible. The budget of Caltrans and CDFW tells you how many wildlife crossings can be built. You should choose their location to minimize the average distance animals will walk to their respective closest crossings. For each animal i, you will be given the (x<sub>i</sub>, y<sub>i</sub>) coordinate where it lives. The freeway is modeled as the infinite x-axis, i.e., going from (&minus;&infin;, 0) to (+&infin;, 0). You can choose c locations on the freeway for your crossings. When an animal needs to cross the freeway, it will first go in a straight line to the freeway, then walk along the freeway to the closest crossing you have built.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of the data set contains two integers c, n, with 1 &le; c &le; 40 the number of crossings you can build, and 1 &le; n &le; 100 the number of animals.</p>

<p>This is followed by n lines, each giving the location x<sub>i</sub>, y<sub>i</sub> of an animal as a floating point number (between &minus;1000000.0 and 1000000.0).</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the minimum average distance of all animals to their respective closest crossings that you can achieve by building c crossings.</p>

<p>Each data set should be followed by a blank line.</p>