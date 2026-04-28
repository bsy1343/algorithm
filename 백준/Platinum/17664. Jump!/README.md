# [Platinum IV] Jump! - 17664

[문제 링크](https://www.acmicpc.net/problem/17664)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 5, 맞힌 사람: 5, 정답 비율: 20.833%

### 분류

수학, 브루트포스 알고리즘, 많은 조건 분기, 미적분학, 물리학

### 문제 설명

<p>Now that you are well fed, it is time to take a graduation picture with your good friends. For some reason, about half of all graduation pictures seem to involve many students simultaneously jumping in the air, while holding up their caps. Being engineers, you get obsessive about this: you want the picture to be such that the held-up caps are as close as possible to being at exactly the same height. In order to achieve this, you will program the camera to time its shot perfectly. So when exactly does the camera need to take the shot? Did we say &ldquo;program&rdquo; the camera? We meant it!</p>

<p>For each of the people in the picture, you will be given two numbers: (1) the distance di (in meters) from the feet to the raised cap (which stays the same throughout the jump, i.e., your friends and you all extend your hands by a constant amount above your feet/heads), and (2) the speed v<sub>i</sub> (in meters/second) with which the person initially jumps. Recall from middle school physics that due to the Earth&rsquo;s gravity, someone who jumps up with speed v will be at height vt&minus;(1/2)gt2 at time t, where g = 9.81m/s<sup>2</sup> is Earth&rsquo;s gravity constant.<sup>5</sup> To be more precise, it is this height until you hit the ground again, which we assume happens exactly when the height is 0 &mdash; afterwards, you stay at height 0. Your goal is to find a time t at which the height difference between the highest hand/cap and the lowest hand/cap at that time is minimized.</p>

<p><sup>5</sup>It is not exactly that, but you should use this approximation.</p>

### 입력

<p>The first line contains a number 1 &le; K &le; 100, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of a data set contains a single integer 1 &le; n &le; 100, the number of friends you are taking a picture with. This is followed by n lines, each containing two doubles 0.0 &le; d<sub>i</sub>, v<sub>i</sub> &le; 10.0.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the time at which the distance between the highest and lowest caps is minimized, rounded to two decimals. If there are multiple such times, output the earliest one.</p>

<p>Each data set should be followed by a blank line.</p>