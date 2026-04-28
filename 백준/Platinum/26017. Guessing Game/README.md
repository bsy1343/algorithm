# [Platinum II] Guessing Game - 26017

[문제 링크](https://www.acmicpc.net/problem/26017)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 25, 맞힌 사람: 23, 정답 비율: 52.273%

### 분류

그래프 이론, 강한 연결 요소, 2-sat

### 문제 설명

<p>Every year, the top gardeners of the cities Greenville and Tomatown compete against each other in the <em>Grand Gardening Competition</em>. The competition consists of some number of examinations which take place over the course of one week from Monday to Sunday. In each examination, one gardener from Greenville and one gardener from Tomatown present their products to a neutral jury. A few days in advance, both gardeners officially announce how many products of each type of vegetable, fruit or berry they plan to present. During the examination, the jury then evaluates the size, weight, diversity, beauty and taste of the presented products. After careful consideration, the jury finally declares one of the two competing gardeners to be the winner of the examination.</p>

<p>Alan  and his friends are all enthusiastic gardeners, but since they do not live in Greenville or Tomatown, they can not submit their own vegetables to the competition. However, they have started their own private contest, where they try to predict the results of the single examinations. In this contest, each participant is allowed to pick one examination from each of the seven competition days and predict its winner. If this prediction turns out to be correct, the participant is awarded one point. To keep their guessing game interesting, Alan and his friends agreed that a prediction for an examination can not be handed in after the competing gardeners have announced which products they are going to present.</p>

<p>By using his connections to the gardening scenes of Greenville and Tomatown, Alan  has consistently managed to score more points than all of his friends in the previous years. However, when he woke up this year on Monday, the first day of the competition, Alan  realized that he had completely forgotten to submit his predictions! Of course, he immediately sprinted towards his computer and tried to submit his bets. Unfortunately, all gardeners which were scheduled to present their products between Monday and Friday had already announced their selections, so Alan  could only submit his predictions for two examinations on Saturday and Sunday. He then hastily grabbed the competition schedule and started to compare the announced examinations to the predictions made by him and his friends.</p>

<p>Help Alan to determine whether there still remains a tiny chance that he can once more win the Gardening Competition Prediction Contest.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with a single integer $n$ ($1 \leq n \leq 5 \cdot 10^4$), the number of Alan&#39;s friends.</li>
	<li>One line with seven positive integers $d_1, \ldots, d_7$ ($d_1 + \dots + d_7 \leq 10^5$), indicating that exactly $d_i$ examinations will take place on the $i$th competition day.</li>
	<li>$n$ lines, each describing the predictions of one of Alan&#39;s friends. Each line consists of seven integers $b_{1}, \ldots, b_{7}$ ($1 \leq |b_i| \leq d_i$). If $b_{i}$ is positive, the $|b_{i}|$-th examination on day $i$ is predicted to be won by the gardener from Greenville. If it is negative, the gardener from Tomatown is predicted to win the examination.</li>
	<li>One line with two non-zero integers $b_{6}, b_{7}$ ($1 \leq |b_i| \leq d_i$), encoding Alan&#39;s predictions for Saturday and Sunday in the same manner as the predictions of his friends.</li>
</ul>

### 출력

<p>If it is possible for Alan  to score more points than any of his friends, output <code>possible</code> . Otherwise, output <code>impossible</code>.</p>