# [Gold I] Crane - 9543

[문제 링크](https://www.acmicpc.net/problem/9543)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 128 MB

### 통계

제출: 114, 정답: 69, 맞힌 사람: 61, 정답 비율: 63.542%

### 분류

해 구성하기

### 문제 설명

<p>There are n crates waiting to be loaded onto a ship. The crates are numbered 1, 2, ... , n, the numbers determining the order of loading. Unfortunately, someone messed up the transit and the crates are standing in a row in an arbitrary order. As there is only limited space in the dock area, you must sort the crates by swapping some of them.</p>

<p>You are given a crane that works in the following way: you select a connected interval of crates of even length. The crane then exchanges the first half of the interval with the second half. The order inside both halves remains unchanged. Determine the sequence of crane moves that reorders the crates properly.</p>

<p>The crane&rsquo;s software has a bug: the move counter is a 9-based (not 10-based, as you might think) integer with at most 6 digits. Therefore, the crane stops working (and has to be serviced) after 9<sup>6</sup> = 531441 moves. Your solution must fit within this limit.</p>

### 입력

<p>The first line of input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>Each test case starts with an integer n, 1 &le; n &le; 10 000, denoting the number of crates. In the next line a permutation of numbers {1, 2, ... , n} follows.</p>

### 출력

<p>For each test case print a single line containing m &ndash; the number of swaps &ndash; followed by m lines describing the swaps in the order in which they should be performed. A single swap is described by two numbers &ndash; the indices of the first and the last element in the interval to be exchanged. Do not follow the crane&rsquo;s strange software design &ndash; use standard decimal numeral system.</p>