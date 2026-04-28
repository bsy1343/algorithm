# [Gold I] Bad Order - 16262

[문제 링크](https://www.acmicpc.net/problem/16262)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

해 구성하기, 순열 사이클 분할

### 문제 설명

<p>Little Dima has a nice pattern at the floor of his room, it consists of n dots arranged in a row. Strange coincidence, but Dima also has n toy cubes that he likes to play, they have weights of 1,&thinsp;2,&thinsp;...,&thinsp;n grams, respectively. Dima has finished playing with his cubes and put them on a floor at the dots, one cube at each dot. Now he is going to reorder them in such way that their weight increased from left to right. However, he took a break before doing so, meanwhile bad boy Vadim entered the room.</p>

<p>Vadim knows that Dima will use the following way to rearrange the cubes. Each time he will look for the cube with the smallest weight that is at wrong dot yet, and swap it with the one that occupies its dot.</p>

<p>Vadim is very vicious, so he wants to force Dima to make the maximum number of swaps. He took some cubes out of the Dima&#39;s row and now he is planning to put them back. He wants to put them back in such way, that there still was exactly one cube at each dot, cubes that were not taken before stayed at their places, and Dima needed maximum possible number of swaps to sort the cubes using his method.</p>

<p>How should Vadim put the cubes back to the row?</p>

### 입력

<p>Input data contains several test cases. The first line of input contains the number of test cases t.</p>

<p>Each test is described in the following way.</p>

<p>The first line of the description contains an integer n &mdash; the number of cubes (1&thinsp;&le;&thinsp;n&thinsp;&le;&thinsp;10<sup>5</sup>). The following line contains n integers a<sub>i</sub> (0&thinsp;&le;&thinsp;a<sub>i</sub>&thinsp;&le;&thinsp;n)</p>

<p>If a<sub>i</sub> is equal to 0, that means that the cube from the i-th dot was taken away by Vadim, this dot is now empty. In the other case ai is the weight of the cube at the i-th dot.</p>

<p>It is guaranteed that all remaining cubes have different weights, Vadim must return exactly the cubes that are currently missing from the line.</p>

<p>The sum of n in all test cases of one input data doesn&#39;t exceed 10<sup>5</sup>.</p>

### 출력

<p>Output two lines for each test case.</p>

<p>The first line must contain the maximum number of swaps that Vadim can force Dima to make.</p>

<p>The second line must contain n integers &mdash; weights of cubes in order they will be arranged after Vadim puts cubes he has taken away back. Note, that cubes that were not taken away must remain at their current positions.</p>

<p>If there are several possible arrangements that force Dima to make maximum number of swaps, output any of them.</p>