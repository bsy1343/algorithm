# [Gold III] Mud Flow - 30268

[문제 링크](https://www.acmicpc.net/problem/30268)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

구현, 그래프 이론, 정렬, 시뮬레이션, 방향 비순환 그래프, 위상 정렬, 격자 그래프

### 문제 설명

<p>One of the big problems with large amounts of rain (such as from a hurricane) in a hilly area like Los Angeles is mud slides. The rain loosens soil and debris, which then flows down. Further down, the combination of rain there and the water coming down will loosen even more soil, and soon, you have a full-blown mud slide coming down, sometimes burying houses and roads and killing those unfortunate enough to be in its path. Here, given an initial configuration of soil, as well as the amount of rain coming down everywhere, you are to calculate the maximum amount of soil that will end up in any spot.</p>

<p>We will view the area as a rectangular grid. For each cell, you will be given its height, how much soil starts there, how much rain comes down, and what is the required threshold of water to dislodge the soil that starts there. (The soil/rain do not contribute to the height.) When water gets to a square, it will run downhill to an adjacent (horizontal or vertical) square that is strictly lower. If there are multiple lower adjacent squares, the water will split evenly between them. If there are no adjacent lower squares, the water stays on the square. If the water getting to a square (strictly) exceeds the dislodging threshold, then all the soil from that square will start flowing down; notice that water counts for all the squares it flows over. The soil, too, will split evenly between all adjacent strictly lower squares once it starts flowing. Once the soil starts moving (after being dislodged), it will keep moving until it cannot go further down, even if the water on some of its squares is not enough to dislodge new soil. Notice that soil does not help dislodge other soil &mdash; only water does so.</p>

<p>We assume that the area is surrounded by high mountains, so no water or mud will ever cross outside the area. You are to compute the maximum amount of soil that ends up in any one square of the map in the end. Note that you should use <code>double</code> (not <code>float</code>) for all of your computations. (In Python, that&rsquo;s the default; in Java and C/C++, you need to choose the right type.) If you use <code>float</code>, your outputs will probably be a little different from ours, and thus wrong.<sup>1</sup></p>

<hr />
<p><sup>1</sup>As a general note, in all programming contests, and really all of your programming, there&rsquo;s no reason not to use <code>double</code>; the bit of memory you save is not worth it. Many programmers consider <code>float</code> an &ldquo;f-word&rdquo;.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains two integers 1 &le; n, m &le; 300, the size of the region. Then, there will be four blocks, each comprising n lines of m floating point numbers. In each block, the entry in row y, position x, will be for the square (x, y) of the map.</p>

<p>The first block gives the heights 0.0 &le; h<sub>y,x</sub> &le; 100.0 of the squares. The second block gives the amount of soil 0.0 &le; s<sub>y,x</sub> &le; 100.0 initially on the squares. The third block gives the amount of rain 0.0 &le; r<sub>y,x</sub> &le; 100.0 that hits the squares. The fourth block gives the thresholds 0.0 &le; t<sub>y,x</sub> &le; 100.0 for the amount of water that will dislodge the soil at the squares.</p>

<p>All out inputs will be such that comparisons between floating point numbers will be either equal, or greater/smaller by at least 0.0001, so rounding should not be an issue.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the maximum amount of soil ending up on any one square of the map.</p>

<p>Each data set should be followed by a blank line.</p>