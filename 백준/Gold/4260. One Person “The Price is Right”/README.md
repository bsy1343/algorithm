# [Gold II] One Person “The Price is Right” - 4260

[문제 링크](https://www.acmicpc.net/problem/4260)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 16, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>In the game show &ldquo;The Price is Right&rdquo;, a number of players (typically 4) compete to get on stage by guessing the price of an item. The winner is the person whose guess is the closest one not exceeding the actual price. Because of the popularity of the one-person game show &ldquo;Who Wants to be a Millionaire&rdquo;, the American Contest Management (ACM) would like to introduce a one-person version of the &ldquo;The Price is Right&rdquo;. In this version, each contestant is allowed G (1 &le; G &le; 30) guesses and L (0 &le; L &le; 30) lifelines. The contestant makes a number of guesses for the actual price. After each guess, the contestant is told whether it is correct, too low, or too high. If the guess is correct, the contestant wins. Otherwise, he uses up a guess. Additionally, if his guess is too high, a lifeline is also lost. The contestant loses when all his guesses are used up or if his guess is too high and he has no lifelines left. All prices are positive integers.</p>

<p>It turns out that for a particular pair of values for G and L, it is possible to obtain a guessing strategy such that if the price is between 1 and N (inclusive) for some N, then the player can guarantee a win. The ACM does not want every contestant to win, so it must ensure that the actual price exceeds N. At the same time, it does not want the game to be too difficult or there will not be enough winners to attract audience. Thus, it wishes to adjust the values of G and L depending on the actual price. To help them decide the correct values of G and L, the ACM has asked you to solve the following problem. Given G and L, what is the largest value of N such that there is a strategy to win as long as the price is between 1 and N (inclusive)?</p>

### 입력

<p>The input consists of a number of cases. Each case is specified by one line containing two integers G and L, separated by one space. The end of input is specified by a line in which G = L = 0.</p>

### 출력

<p>For each case, print a line of the form:</p>

<pre>
Case c: N</pre>

<p>where c is the case number (starting from 1) and N is the number computed.</p>