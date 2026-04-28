# [Silver II] High Card Wins - 11968

[문제 링크](https://www.acmicpc.net/problem/11968)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 922, 정답: 480, 맞힌 사람: 405, 정답 비율: 52.803%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Bessie the cow is a huge fan of card games, which is quite surprising, given her lack of opposable thumbs. Unfortunately, none of the other cows in the herd are good opponents. They are so bad, in fact, that they always play in a completely predictable fashion! Nonetheless, it can still be a challenge for Bessie to figure out how to win.</p>

<p>Bessie and her friend Elsie are currently playing a simple card game where they take a deck of \(2N\) cards, conveniently numbered \(1 \ldots 2N\), and divide them into \(N\) cards for Bessie and \(N\) cards for Elsie. The two then play \(N\) rounds, where in each round Bessie and Elsie both play a single card, and the player with the highest card earns a point.</p>

<p>Given that Bessie can predict the order in which Elsie will play her cards, please determine the maximum number of points Bessie can win.</p>

### 입력

<p>The first line of input contains the value of N (\(1 \leq N \leq 50,000\)).</p>

<p>The next N lines contain the cards that Elsie will play in each of the successive rounds of the game. Note that it is easy to determine Bessie&#39;s cards from this information.</p>

### 출력

<p>Output a single line giving the maximum number of points Bessie can score.</p>

### 힌트

<p>Here, Bessie must have cards 2, 3, and 5 in her hand, and she can use these to win at most 2 points by saving the 5 until the end to beat Elsie&#39;s 4.</p>