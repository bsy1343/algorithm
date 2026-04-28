# [Silver II] Robots - 15399

[문제 링크](https://www.acmicpc.net/problem/15399)

### 성능 요약

시간 제한: 0.2 초, 메모리 제한: 128 MB

### 통계

제출: 105, 정답: 67, 맞힌 사람: 65, 정답 비율: 64.356%

### 분류

그리디 알고리즘, 정렬, 물리학

### 문제 설명

<p>You&rsquo;re the leading designer of a complex robot, that will explore human unreachable locations. Your job is to design a robot that will go as far as possible. To do this, you have n available energy sources. The i th source is capable of accelerating the robot by a rate of ai (m/s<sup>2</sup>) and can do this for a total of s<sub>i</sub> seconds. The robot is initially at rest (its initial velocity is zero). You have to decide the order in which to use the sources in order to maximize the total distance traveled by the robot. You will use one source until s<sub>i</sub> seconds have elapsed, then immediately switch to another unused source (the switch is instantaneous). Each source can be used only once.</p>

<p>Given the accelerations and durations of each source, write an efficient program to determine the optimal order of the sources, in order to maximize the total distance traveled. Your program must compute the difference between the traveled distance in the optimal case and in the default case (the order given by the input data).</p>

<p>Physics background: if the velocity is v before you start using a source whose acceleration is a then, after t seconds, the robot has traveled a total vt+1/2at<sup>2</sup> meters, and the final velocity will be v&#39; = v+at.</p>

### 입력

<p>The input file starts with the number n (1 &le; n &le; 10<sup>4</sup>) of sources. Starting from a different line follows the n space-separated acceleration and duration for each source (positive integer numbers).</p>

### 출력

<p>The output file contains the computed difference between the traveled distance in the optimal case and in the default case (the order given by the input data), with one decimal.</p>