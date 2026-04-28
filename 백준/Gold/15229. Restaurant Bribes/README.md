# [Gold I] Restaurant Bribes - 15229

[문제 링크](https://www.acmicpc.net/problem/15229)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

수학, 그래프 이론

### 문제 설명

<p>Several participants in programming competitions end up founding startup companies. Two of them created Eeet, a social restaurant rating system. Each member of Eeet can rate a restaurant with an integer score from 0 to 10 or not give a score at all. The score that a person sees is the average of ratings from the friends who gave one. In particular, a person giving a score of 0 will in general decrease the rating that their friends see, whereas not giving a score at all will not affect it. If none of the friends of a user has given a rating to a restaurant, then the restaurant does not show up to that user.</p>

<p>Two other past contestants have opened a restaurant, The Smelly Fish, but they are bewildered as to why nobody is dining at their establishment. Through experimentation they found out that each person is willing to come once to the restaurant (for some inexplicable reason no customer ever returns) and spend 100y SEK, where y is the rating they see on Eeet. Everybody pays by card, and money transactions are not rounded.</p>

<p>However, they did not get any ratings yet, and all the fresh produce they bought risks going past its prime. Hence they selected some people to bribe so that they will leave them a rating in Eeet. For each person, we know that they will give The Smelly Fish a rating according to the function [&radic;x/a], where a is a constant depending on the person, and x is the amount of the bribe in SEK. Note that a person bribed with 0 SEK will leave a rating of 0 (instead of not giving a rating at all), that the maximum rating is 10, and that a person that received a bribe knows about the scheme and will not go to the restaurant.</p>

<p>Your task is to maximize the profit the restaurant makes, i.e., the income from customers minus the money spent on bribes.</p>

### 입력

<p>The first line contains three integers n, m, and k, (1 &le; m &le; 105 , 0 &le; n &le; 105 , 0 &le; k &le; n), the number of people in Eeet, the number of friendship relations, and the number of people we are going to bribe.</p>

<p>Each of the next m lines contains two integers, a and b (1 &le; a, b &le; n), the ids of a pair of friends. No unordered pair {a, b} appears more than once.</p>

<p>Each of the next k lines contains two integers i (1 &le; i &le; n), the id of a person we are going to bribe, and the parameter a<sub>i</sub> (1 &le; a<sub>i</sub> &le; 1 000). No id appears more than once.</p>

### 출력

<p>Output one line with the maximum profit the restaurant can make. Answers with an absolute or relative precision up to 10<sup>&minus;6</sup> will be accepted.</p>