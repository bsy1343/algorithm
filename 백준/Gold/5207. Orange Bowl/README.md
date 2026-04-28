# [Gold IV] Orange Bowl - 5207

[문제 링크](https://www.acmicpc.net/problem/5207)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 77, 정답: 50, 맞힌 사람: 42, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>It&rsquo;s late in the Orange Bowl Football game, and USC is trailing by 4 points, needing desperately to score another touchdown.<sup>3</sup> So coach Pete Carroll consults his newest weapon: a play strategy evaluator written at the USC programming contest.</p>

<p>While football is a somewhat more complicated game, we can simplify it as follows: USC is currently n yards away from the end zone (1 &le; n &le; 100). The coach needs to decide on a sequence of plays to get the ball to the end zone as safely as possible. For each play, the coach can choose among m different plays (1 &le; m &le; 1000). Each play is characterized by two numbers: its yard gain g, and its success probability p. Here g is an integer between 1 and 100, and p is a real number between 0 and 1. This means that the play succeeds with probability p, and if it does, it moves USC g yards closer to the end zone. If it fails, the ball is turned over, and USC loses the game.</p>

<p>The goal is to select a sequence of plays (which can have repetitions), such that the total yard gain is at least n, and the total success probability is maximized. We assume that the plays all succeed independently, i.e., the success probability of a sequence is the product of the individual probabilities.</p>

<p><sup>3</sup>Yeah, right! Like USC is going to be trailing in football games any time soon.</p>

### 입력

<p>The first line contains a number K &ge; 1, which is the number of input data sets in the file. This is followed by K data sets of the following form:</p>

<p>The first line of each data set contains the numbers n and m. This is followed by m lines, each containing the two numbers g<sub>i</sub> and p<sub>i</sub> for one play i.</p>

### 출력

<p>For each data set, first output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output on one line the overall success probability of the sequence of plays most likely to get USC to the end zone, rounded to two decimals. (You do not need to output the actual sequence.)</p>