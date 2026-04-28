# [Platinum III] Chain & Co. - 9542

[문제 링크](https://www.acmicpc.net/problem/9542)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 10, 정답 비율: 52.632%

### 분류

브루트포스 알고리즘, 기하학, 3차원 기하학

### 문제 설명

<p>Chain &amp; Co. specializes in producing infinitely strong chains. Because of their high quality products, they are quickly gaining market share. This leads to new challenges, some of which they could have never imagined before. Like, for example, automatic verification of link endurance with a computer program, which you are supposed to write.</p>

<p>The company produces links of equal size. Each link is an infinitely thin square frame in three dimensions (made of four infinitely thin segments).</p>

<p>During tests all links are axis-aligned<sup>1</sup> and placed so that no two frames touch. To make a proper strength test, two sets of links A and B are forged so that every link of A is inseparable from every link of B (being inseparable means that they cannot be moved apart without breaking one of them).</p>

<p>You stumble upon some links (axis-aligned, pairwise disjoint). Are they in proper testing position? In other words, can they be divided into two non-empty sets A and B with the desired property?</p>

<p><sup>1</sup>Axis-aligned means that all segments are parallel to either X, Y, or Z axis.</p>

### 입력

<p>The first line of input contains the number of test cases T. The descriptions of the test cases follow:</p>

<p>The description of each test case starts with an empty line. The next line contains an integer n, 1 &le; n &le; 10<sup>6</sup> &ndash; the number of links in the chain. Each of the next n lines contains 6 space separated integers x<sub>i</sub>, y<sub>i</sub>, z<sub>i</sub>, x<sub>i</sub>&#39;, y<sub>i</sub>&#39;, z<sub>i</sub>&#39;, all between -10<sup>9</sup> and 10<sup>9</sup> &ndash; the coordinates of two opposite corners of the i-th link.</p>

### 출력

<p>For each test case, print a single line containing the word YES if the set is in proper testing position, or NO otherwise.</p>