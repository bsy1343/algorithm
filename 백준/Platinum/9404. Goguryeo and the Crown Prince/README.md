# [Platinum IV] Goguryeo and the Crown Prince - 9404

[문제 링크](https://www.acmicpc.net/problem/9404)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 32, 정답: 6, 맞힌 사람: 6, 정답 비율: 50.000%

### 분류

수학, 그래프 이론, 문자열, 그래프 탐색, 게임 이론, 선형대수학, KMP, 가우스 소거법

### 문제 설명

<p>The king Dongmyeong of Goguryeo, also known by his birth name Jumong, was the founding monarch of Goguryeo. Jumong had a son named Yuri from his first wife queen Yesoya, and two sons, Biryu and Onjo, from his second wife queen So Seo-no. They were happily living together, until it was the time to determine the true heir of Jumong. The candidates for the crown prince position are Yuri and Biryu.&nbsp;</p>

<p>In order to prevent a civil war, Jumong designed a game similar to Lotto and announced that the winner of the game would become the crown prince. In the beginning of the game, Jumong specifies an integer n, then each player chooses a binary string (a string of 0&rsquo;s and 1&rsquo;s) of length n. The selected strings must be different; if they are equal, the string selection step is repeated again.</p>

<p>Having received two different strings of the same length, Jumong starts tossing a fair coin (a coin with equal probabilities for heads and tails) for several times. Treating heads as 0&rsquo;s and tails as 1&rsquo;s, the sequence of coin flipping produces a binary string growing on the right. The player whose string appears earlier in the growing binary string, wins the game and becomes the crown prince.</p>

<p>Given the binary strings chosen by Yuri and Biryu, you have to calculate the winning probability of Yuri.</p>

### 입력

<p>The input contains several test cases. Each test case is a line containing two space-separated binary strings chosen by Yuri and Biryu, respectively. The strings are different, but have the same length which does not exceed 30. The last line contains &ldquo;0 0&rdquo; which should not be processed.</p>

### 출력

<p>Write the result of the i<sup>th</sup> test case, on the i<sup>th</sup> line of the output. You should only write one real number rounded to exactly 3 digits after the decimal point, which indicates the winning probability of Yuri.</p>