# [Gold II] Marathon Match - 22507

[문제 링크](https://www.acmicpc.net/problem/22507)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 9, 정답 비율: 69.231%

### 분류

수학, 다이나믹 프로그래밍, 브루트포스 알고리즘, 조합론, 확률론

### 문제 설명

<p><var><i>N</i></var>&nbsp;people run a marathon. There are&nbsp;<var><i>M</i></var>&nbsp;resting places on the way. For each resting place, the&nbsp;<var><i>i</i></var>-th runner takes a break with probability&nbsp;<var><i>P</i><sub><i>i</i></sub></var>&nbsp;percent. When the&nbsp;<var><i>i</i></var>-th runner takes a break, he gets rest for&nbsp;<var><i>T</i><sub><i>i</i></sub></var>&nbsp;time.</p>

<p>The&nbsp;<var><i>i</i></var>-th runner runs at constant speed&nbsp;<var><i>V</i><sub><i>i</i></sub></var>, and the distance of the marathon is&nbsp;<var><i>L</i></var>.</p>

<p>You are requested to compute the probability for each runner to win the first place. If a runner arrives at the goal with another person at the same time, they are not considered to win the first place.</p>

### 입력

<p>A dataset is given in the following format:</p>

<pre>
<var><i>N</i></var> <var><i>M</i></var> <var><i>L</i></var>
<var><i>P</i><sub>1</sub></var> <var><i>T</i><sub>1</sub></var> <var><i>V</i><sub>1</sub></var>
<var><i>P</i><sub>2</sub></var> <var><i>T</i><sub>2</sub></var> <var><i>V</i><sub>2</sub></var>
<var>&hellip;</var>
<var><i>P</i><sub><i>N</i></sub></var> <var><i>T</i><sub><i>N</i></sub></var> <var><i>V</i><sub><i>N</i></sub></var></pre>

<p>The first line of a dataset contains three integers&nbsp;<var><i>N</i></var>&nbsp;(<var>1&le;<i>N</i>&le;100</var>),&nbsp;<var><i>M</i></var>&nbsp;(<var>0&le;<i>M</i>&le;50</var>) and&nbsp;<var><i>L</i></var>&nbsp;(<var>1&le;<i>L</i>&le;100,000</var>).&nbsp;<var><i>N</i></var>&nbsp;is the number of runners.&nbsp;<var><i>M</i></var>&nbsp;is the number of resting places.&nbsp;<var><i>L</i></var>&nbsp;is the distance of the marathon.</p>

<p>Each of the following&nbsp;<var><i>N</i></var>&nbsp;lines contains three integers&nbsp;<var><i>P</i><sub><i>i</i></sub></var>&nbsp;(<var>0&le;<i>P</i><sub><i>i</i></sub>&le;100</var>),&nbsp;<var><i>T</i><sub><i>i</i></sub></var>&nbsp;(<var>0&le;<i>T</i><sub><i>i</i></sub>&le;100</var>) and&nbsp;<var><i>V</i><sub><i>i</i></sub></var>&nbsp;(<var>0&le;<i>V</i><sub><i>i</i></sub>&le;100</var>) describing the&nbsp;<var><i>i</i></var>-th runner.&nbsp;<var><i>P</i><sub><i>i</i></sub></var>&nbsp;is the probability to take a break.&nbsp;<var><i>T</i><sub><i>i</i></sub></var>&nbsp;is the time of resting.&nbsp;<var><i>V</i><sub><i>i</i></sub></var>&nbsp;is the speed.</p>

### 출력

<p>For each runner, you should answer the probability of winning. The&nbsp;<var><i>i</i></var>-th line in the output should be the probability that the&nbsp;<var><i>i</i></var>-th runner wins the marathon. Each number in the output should not contain an error greater than&nbsp;<var>10<sup>&minus;5</sup></var>.</p>