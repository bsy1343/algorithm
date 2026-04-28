# [Platinum II] Card Collecting - 14479

[문제 링크](https://www.acmicpc.net/problem/14479)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 8, 맞힌 사람: 5, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍, 수학, 확률론

### 문제 설명

<p>Lately, a variety of free-to-play collectible card games have become popular. These card games usually have some collection of n cards that the player wants to collect. The player is first given a starter pack of s cards, which is guaranteed to not contain any duplicates (they are all unique). The player can then start acquiring new card(s) in two different ways:</p>

<ol>
	<li>Trade any set of d cards with a card of the player&rsquo;s choice. This can be done very quickly, and for this problem, we will assume that it takes no time.</li>
	<li>Play games for an hour, and win a pack of k cards with probability p<sub>i</sub>, where i is the number of distinct cards that the player currently holds. The pack consists of cards that are independently and uniformly at random from the entire collection of n cards (so it may or may not have duplicates).</li>
	<li>The advantage of having a larger collection, of course, is that a player has a higher chance of winning a pack, and hence earns random cards more quickly.</li>
</ol>

<p>Stingy Larry plays card games of this type all the time. Larry just got a copy of such a game (and is just about to open his starter pack of s cards), and wants to complete a full collection. Assuming that Larry manages his collection optimally, what is the shortest expected time to complete the collection that he can achieve?</p>

### 입력

<p>The first line of the input contains a single integer T (1 &le; T &le; 10), the number of test cases. The first line of each test case contains four integers n (1 &le; n &le; 100), the total number of cards in the collection, s (0 &le; s &le; n), the starting number of cards, k (1 &le; k &le; 10), the number of cards in a pack, and d (1 &le; d &le; 100), the number of cards that must be traded for a new card. The next line of the test case then contains n + 1 space-separated real numbers p<sub>0</sub>, p<sub>1</sub>, . . . , p<sub>n</sub> (0.01 &le; p<sub>i</sub> &le; 1), which represent the probabilities of Larry winning a pack after an hour of play. You may assume the p<sub>i</sub>&rsquo;s are nondecreasing.</p>

### 출력

<p>For each test case, output the shortest expected time for Larry to complete the collection in hours. An answer is considered correct if its absolute or relative error is at most 10<sup>&minus;7</sup>.</p>

### 힌트

<p>In the first test case, Larry will need to play an average of four hours to win the single card he needs to complete his collection.</p>