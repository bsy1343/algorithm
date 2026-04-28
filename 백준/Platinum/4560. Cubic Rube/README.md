# [Platinum II] Cubic Rube - 4560

[문제 링크](https://www.acmicpc.net/problem/4560)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 2, 맞힌 사람: 2, 정답 비율: 40.000%

### 분류

브루트포스 알고리즘, 구현

### 문제 설명

<p>Working in a Rubik&#39;s Cube factory has always been your dream job, but you&#39;re a clumsy rube. Now you&#39;re trying to invent a new variation, a 5x5x5 Rubik&#39;s Cube! You just walked into the research lab with a working prototype and accidentally dropped it, breaking it into 2 pieces. You have one piece in your left hand and are trying to find the other. Unfortunately, the floor is littered with parts from previous attempts, making it difficult to find the missing piece. Luckily, you know how to program...</p>

<p>Given two solids composed of unit cubes, determine if they can be fit together to form a solid 5x5x5 cube.</p>

### 입력

<p>The first line contains a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets. The following lines contain the data sets.</p>

<p>Each data set will show side-by-side top-down views of each of the solids as a 5x5 array of numbers 0-9. Each number represents the height of the solid at that point (the number of unit cubes stacked at that point). If the height is 0, there is no solid present at that point. This is similar to providing a topographical map of each solid, and it is valid to assume that there are no gaps &quot;under&quot; any part of a solid that cannot be seen.</p>

<p>Note that each solid will be connected (i.e., a single piece) and may require translations (not just rotations) to join with a compatible solid.</p>

### 출력

<p>For each data set, print, &quot;Yes&quot; if a solid 5x5x5 cube can be formed by fitting together the two halves, and print, &quot;No&quot; if a cube cannot be formed. Each word should appear on its own line.</p>