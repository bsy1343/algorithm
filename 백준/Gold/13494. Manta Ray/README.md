# [Gold IV] Manta Ray - 13494

[문제 링크](https://www.acmicpc.net/problem/13494)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

브루트포스 알고리즘, 기하학, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>Manta rays are the largest rays, with a wingspan of over 20ft. They are completely harmless (not even having a sting),&nbsp;very graceful, and occasionally even a bit curious. Like many of the largest marine animals (e.g., whale sharks, basking&nbsp;sharks, blue whales), they are filter feeders, meaning that they swim around with their mouth open, and their gills catch&nbsp;lots and lots of tiny plankton from the water, filtering it out from the water like a sieve would.</p>

<p>In this problem, you are to calculate how much plankton a manta managed to eat. You will be given the width of the&nbsp;manta ray&rsquo;s mouth, the direction in which it is swimming and how far, and the locations of all the plankton pieces.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets&nbsp;of the following form:</p>

<p>The first line of a data set contains six numbers n, x, y, w, &alpha;, t. n is an integer, while all others are doubles. 0 &le; n &le; 10000&nbsp;is the number of plankton pieces in the water. (x, y) is the initial location of the manta ray, or to be more precise: of the&nbsp;middle of the manta ray&rsquo;s mouth. w is the width of the manta ray&rsquo;s mouth. 0 &le; &alpha; &lt; 2&pi; is the direction/angle in which&nbsp;the manta ray is swimming, measured counterclockwise from the positive x-direction. The number 0 &le; t &le; 1000 is the&nbsp;distance which the manta ray swims.</p>

<p>This is followed by n lines, one for each piece of plankton. Each such line consists of two doubles x<sub>i</sub>, y<sub>i</sub>, the coordinates&nbsp;where this piece of plankton is located. In our inputs, we will not put any plankton exactly on the border of the manta&rsquo;s&nbsp;mouth.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the number of&nbsp;pieces of plankton which the manta ray eats during this swim.</p>

<p>Each data set should be followed by a blank line.</p>