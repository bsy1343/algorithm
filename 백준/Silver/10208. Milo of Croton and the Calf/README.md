# [Silver IV] Milo of Croton and the Calf - 10208

[문제 링크](https://www.acmicpc.net/problem/10208)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 33, 정답: 20, 맞힌 사람: 13, 정답 비율: 50.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Milo of Croton was a six-time Olympic champion in wrestling famed for his strength. He supposedly saved Pythagoras&rsquo;s life by holding up the ceiling of a collapsing building until Pythagoras was safe. He in part acquired his strength by a training regimen of carrying a calf around the village once a day for a long time, until it was a full-grown bull.4</p>

<p>In this problem, we will evaluate Milo&rsquo;s training regimen a little more carefully. When you carry a young bull around the village, there are two effects: you&rsquo;ll be sore for the next few days (and able to lift less weight), and you&rsquo;ll build up more muscle for the future, allowing you to lift more weight in the future. For each day (equivalently, weight of the calf), you will be given two numbers: a permanent strength increase, which will kick in 3 days after the exercise, and a soreness penalty, which will be in effect the next 2 days after the exercise. Both permanent strength increase and soreness penalties are cumulative, i.e., if Milo exercises for two days in a row, for the next day after that, he will be sore from both, and the second day after, he will be just sore from the second exercise (while gaining the strength from the first).</p>

<p>You will be told how much the calf weighed the first day, how much Milo could lift on the first day, how many days Milo wants to exercise, and what the exercise effects are for carrying the calf at the different weights. When Milo&rsquo;s ability to lift equals the weight of the calf, he will be successful in lifting it, but not when it is strictly less. Milo exercises every day, and the calf gains one pound every day. Your goal is to determine if Milo can successfully finish his exercise regimen, and if not, on what day he first fails.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains three integers w, c, d, separated by a space. 0 &le; w &le; 1000 is the weight that Milo can lift on day 1. 0 &le; c &le; 1000 is the weight of the calf on day 1. 1 &le; d &le; 100 is the number of days that Milo is planning to exercise.</p>

<p>This is followed by d lines. Each line i = 1, . . . , d describes the effect of carrying the calf around the village when it weighs c + i &minus; 1, i.e., on day i. It consists of two integers g<sub>i</sub>, s<sub>i</sub>. 0 &le; g<sub>i</sub> &le; 1000 is the permanent strength gain from carrying the calf, which kicks in at day i + 3. 0 &le; s<sub>i</sub> &le; 100 is the soreness penalty from carrying the calf, which hurts him on days i + 1 and i + 2.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number.</p>

<p>If Milo can finish his entire regimen, then output &ldquo;Completed successfully.&rdquo; Otherwise, output the first day on which Milo cannot carry the calf any more.</p>

<p>Each data set should be followed by a blank line.</p>