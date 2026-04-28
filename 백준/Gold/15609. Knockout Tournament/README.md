# [Gold I] Knockout Tournament - 15609

[문제 링크](https://www.acmicpc.net/problem/15609)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 45, 맞힌 사람: 41, 정답 비율: 56.164%

### 분류

조합론, 그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>Laura is organising a knockout tournament, in which her friend Dale takes part. Laura would like to maximise the probability of Dale winning the tournament by arranging the games in a favourable way. She does not know how to do it, so she asked you for help. Naturally, you refuse to cooperate with such a deplorable act&mdash;but then you realise that it is a very nice puzzle!</p>

<p>When the number of players is a power of two, the tournament setup can be described recursively as follows: the players are divided into two equal groups that each play their own knockout tournament, after which the winners of both tournaments play each other. Once a player loses, they are out of the tournament.</p>

<p>When the number of players is not a power of two, some of the last players in the starting line-up advance from the first round automatically so that in the second round the number of players left is a power of two, as shown in Figure K.1.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15609/1.png" style="width: 308px; height: 203px;" /></p>

<p style="text-align: center;">Figure K.1: A tournament tree with 5 players. Players C, D, and E advance from the first round automatically.</p>

<p>Every player has a rating indicating their strength. A player with rating a wins a game against a player with rating b with probability a/(a+b) (independently of any previous matches played).</p>

<p>Laura as the organiser can order the starting line-up of players in any way she likes. What is the maximum probability of Dale winning the tournament?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer n (2 &le; n &le; 4096), the total number of players.</li>
	<li>n lines, each with an integer r (1 &le; r &le; 10<sup>5</sup>), the rating of a player. The first rating given is Dale&rsquo;s rating.</li>
</ul>

### 출력

<p>Output the maximum probability with which Dale can win the tournament given a favourable setup. Your answer should have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>