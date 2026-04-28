# [Platinum III] SUMO - 9666

[문제 링크](https://www.acmicpc.net/problem/9666)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 125, 정답: 51, 맞힌 사람: 41, 정답 비율: 44.565%

### 분류

이분 그래프, 자료 구조, 분리 집합, 그래프 이론

### 문제 설명

<p>In a Japanese monastery, otherwise known for serious fasting and ascetic life, the Head of the sumo wrestling section has decided to organise training-competitions for his N fighters. He determined the exact sequence of M fights and its participants (two fighters face each other per fight).&nbsp;</p>

<p>Just moments before the competition, the Head realised he could easily stir things up a bit! He could divide his fighters into two teams so that only fighters of different teams face each other in each fight. Since the fighting schedule has already been made and it doesn&#39;t meet this condition, and we mustn&#39;t change it for whatever zen reason there is, the Head is left with only one option. That is to divide the fighters into two teams so that the fighters from the same team face each other in a fight as late as possible.&nbsp;</p>

<p>Help the Head! For a given fighting schedule, determine the ordinal number of the first fight where two fighters from the same team have to face each other, under the condition that we divide them in the best possible way, so that the required fight takes place as late as possible. In all test data, such fight will definitely occur.&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 100 000), the number of fighters. The fighters are marked with numbers from 1 to N.&nbsp;</p>

<p>The second line of input contains the integer M (1 &le; M &le; 300 000), the number of fights.&nbsp;</p>

<p>Each of the following M lines contains fights in the order which they must take place. Each line contains two different integers from the interval [1, N]: the labels of fighters who are going to face each other.&nbsp;</p>

### 출력

<p>The first and only line of output must contain the ordinal number (from 1 to M) of the required fight.</p>