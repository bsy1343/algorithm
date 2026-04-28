# [Bronze I] Knockout Racing - 10598

[문제 링크](https://www.acmicpc.net/problem/10598)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 163, 정답: 126, 맞힌 사람: 109, 정답 비율: 81.343%

### 분류

수학, 구현

### 문제 설명

<p>The races became more popular than ever at Pandora planet. But these races are quite unusual. There are n cars participating in a race on the long straight track. Each car moves with a speed of 1 meter per second. Track has coordinates in meters.</p>

<p>The car number i moves between two points on the track with coordinates a<sub>i</sub> and b<sub>i</sub> starting at the second 0 in the point a<sub>i</sub>. The car moves from a<sub>i</sub> to b<sub>i</sub>, then from b<sub>i</sub> to a<sub>i</sub>, then from a<sub>i</sub> to b<sub>i</sub> again, and so on.</p>

<p>Handsome Mike wants to knock some cars out of the race using dynamite. Thus he has m questions. The question number j is: what is the number of cars in the coordinates between x<sub>j</sub> and y<sub>j</sub> inclusive after t<sub>j</sub> seconds from the start?</p>

<p>Your task is to answer Mike&rsquo;s questions.</p>

### 입력

<p>The first line of the input file contains two integers n and m (1 &le; n, m &le; 1000) &mdash; the number of cars in the race and the number of questions.</p>

<p>Each of the following n lines contains a description of the car: two integers a<sub>i</sub> and b<sub>i</sub> (0 &le; a<sub>i</sub>, b<sub>i</sub> &le; 10<sup>9</sup>, a<sub>i</sub> &ne; b<sub>i</sub>) &mdash; the coordinates of the two points between which the car i moves.</p>

<p>Each of the following m lines contains a description of the question: three integers x<sub>j</sub> , y<sub>j</sub> , and t<sub>j</sub> (0 &le; x<sub>j</sub> &le; y<sub>j</sub> &le; 10<sup>9</sup>, 0 &le; t<sub>j</sub> &le; 10<sup>9</sup>) &mdash; the coordinate range and the time for the question j.</p>

### 출력

<p>Write m lines to the output file. Each line must contain one integer &mdash; the answer to the corresponding question in order they are given in the input file.</p>