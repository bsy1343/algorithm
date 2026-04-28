# [Platinum III] Blindfold Nim - 8318

[문제 링크](https://www.acmicpc.net/problem/8318)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 27, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

애드 혹, 게임 이론, 그리디 알고리즘, 수학, 확률론

### 문제 설명

<p>Sprague and Grundy have been playing the game called&nbsp;<em>Nim</em>. They put n&nbsp;stacks of coins on the table and during the game they moved alternately. In each round a player would choose one stack and take any positive number of coins from it. The first player unable to make a valid move would lose.</p>

<p>Sprague and Grundy have quickly found the optimal strategy for this game and want to try something more interesting. They decided to play blindfold. This means all they know is that initially the number of coins in the i-th stack is picked randomly from the range [0, a<sub>i</sub>], and the chance to pick any integer from this range is equal; the sizes of the stacks are determined independently. A player loses the game if he tries to take more coins from a stack than available. In particular, if the player knows that all the stacks are certainly empty, he is nonetheless forced to move and loses. Sprague is the first one to move. What is the probability of him winning, if we assume that both players play optimally and during the game they see each others&#39; moves?</p>

### 입력

<p>In the first line of the standard input there is an integer n&nbsp;(1 &le; n &le; 1,000,000), denoting the number of stacks. The second line contains a sequence of n&nbsp;positive integers a<sub>i</sub>. The sum of these integers does not exceed 1,000,000.</p>

### 출력

<p>The first and only line of the standard output should consist of one real number - the probability that Sprague will win the game. The number printed can differ from the correct answer by no more than 10<sup>-8</sup>. No more than 20 digits after the decimal point should be given.</p>