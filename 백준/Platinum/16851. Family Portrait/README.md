# [Platinum V] Family Portrait - 16851

[문제 링크](https://www.acmicpc.net/problem/16851)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 2, 맞힌 사람: 2, 정답 비율: 18.182%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Earlier, we talked about crazy family gatherings. One of the craziest moments is usually when you try to take a family portrait. How are you getting the 2-year old to look at the camera? And why is there always at least one person who has to sneeze the exact moment you try to take a picture? Not to mention the difficulty in deciding who should stand where! Here, you will write a program to help place people in a picture. We are only considering pictures in which everyone stands in one line. The photographer has already decided on the order in which the women will stand, and on the order in which the men will stand. But the question is how to interleave the genders. There are two goals: spread out the genders evenly, and keep height differences between neighboring people small. Obviously, these two goals might be in conflict, so you have some computing to do.</p>

<p>You will be given for each of the w women the height h<sub>i</sub>, in the order they are supposed to stand, and similarly for the m men. Sometimes, there will be more men, sometimes more women. Let&rsquo;s say that w &ge; m for this example. Then, the men define m + 1 intervals, and on average, there should be w/(m+1) women in each of these intervals. (Similarly with genders reversed if m &ge; w.) Of course, w/(m+1) might not be an integer, in which case you can choose which of the m + 1 intervals contain &lceil;w/(m+1)&rceil; women, and which contain &lfloor;w/(m+1)&rfloor;; this is entirely up to you.</p>

<p>Subject to this equi-spacing constraint, you should minimize the &ldquo;height deviation&rdquo;, measured as follows. Suppose that the person standing in position j (from left to right) is p<sub>j</sub>, and thus has height h<sub>p<sub>j</sub></sub>. Then, the total height deviation is &Sigma;(h<sub>p<sub>j+1</sub></sub> &minus; h<sub>p<sub>j</sub></sub>)<sup>2</sup>.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line of the data set contain two integers 1 &le; w, m &le; 500. This is followed by one line with w integers between 0 and 1000, the heights of the w women, in the order they are supposed to stand. Next is a line with m integers between 0 and 1000, the heights of the m men, in the order they are supposed to stand.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then output the minimum total height deviation you can achieve subject to the equi-spacing constraint.</p>

<p>Each data set should be followed by a blank line.</p>