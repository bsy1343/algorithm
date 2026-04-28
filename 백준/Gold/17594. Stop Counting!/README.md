# [Gold III] Stop Counting! - 17594

[문제 링크](https://www.acmicpc.net/problem/17594)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 166, 정답: 86, 맞힌 사람: 67, 정답 비율: 56.780%

### 분류

수학, 애드 혹, 누적 합

### 문제 설명

<p>The Martingale casino is creating new games to lure in new gamblers who tire of the standard fare. Their latest invention is a fast-paced game of chance called Stop Counting!, where a single customer plays with a dealer who has a deck of cards. Each card has some integer value.</p>

<p>One by one, the dealer reveals the cards in the deck in order, and keeps track of the sum of the played cards and the number of cards shown. At some point before a card is dealt, the player can call &ldquo;Stop Counting!&rdquo; After this, the dealer continues displaying cards in order, but does not include them in the running sums. At some point after calling &ldquo;Stop Counting!&rdquo;, and just before another card is dealt, the player can also call &ldquo;Start Counting!&rdquo; and the dealer then includes subsequent cards in the totals. The player can only call &ldquo;Stop Counting!&rdquo; and &ldquo;Start Counting!&rdquo; at most once each, and they must call &ldquo;Stop Counting!&rdquo; before they can call &ldquo;Start Counting!&rdquo;. A card is &ldquo;counted&rdquo; if it is dealt before the player calls &ldquo;Stop Counting!&rdquo; or is dealt after the player calls &ldquo;Start Counting!&rdquo;</p>

<p>The payout of the game is then the average value of the counted cards. That is, it is the sum of the counted cards divided by the number of counted cards. If there are no counted cards, the payout is 0.</p>

<p>You have an &lsquo;in&rsquo; with the dealer, and you know the full deck in order ahead of time. What is the maximum payout you can achieve?</p>

### 입력

<p>The first line of the input contains a single integer 1 &le; <em>N</em> &le; 1 000 000, the number of cards in the deck.</p>

<p>The second line of input contains <em>N</em> space-separated integers, the values on the cards. The value of each card is in the range [&minus;10<sup>9</sup>, 10<sup>9</sup>]. The cards are dealt in the same order they are given in the input.</p>

### 출력

<p>Output the largest attainable payout. The answer is considered correct if the absolute error is less than 10<sup>&minus;6</sup>, or the relative error is less than 10<sup>&minus;9</sup>.</p>

### 힌트

<p>In the first sample, by calling &ldquo;Stop Counting!&rdquo; before the &minus;10 and &ldquo;Start Counting!&rdquo; before the final 10, we can achieve an average of 10.0 with the cards that are counted.</p>

<p>In the second sample, all values are negative, so the best strategy is to call &ldquo;Stop Counting!&rdquo; before the first card is dealt and call &ldquo;Start Counting!&rdquo; after the last card is dealt. Since no cards were counted, the average of the counted cards is 0.0.</p>