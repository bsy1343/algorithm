# [Platinum III] Circle of Debt - 5056

[문제 링크](https://www.acmicpc.net/problem/5056)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 12, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>The three friends Alice, Bob, and Cynthia always seem to get in situations where there are debts to be cleared among themselves. Of course, this is the &ldquo;price&rdquo; of hanging out a lot: it only takes a few resturant visits, movies, and drink rounds to get an unsettled balance. So when they meet as usual every Friday afternoon they begin their evening by clearing last week&rsquo;s debts. To satisfy their mathematically inclined minds they prefer clearing their debts using as little money transaction as possible, i.e. by exchanging as few bank notes and coins as necessary. To their surprise, this can sometimes by harder than it sounds. Suppose that Alice owes Bob 10 crowns and this is the three friends&rsquo; only uncleared debt, and Alice has a 50 crown note but nothing smaller, Bob has three 10 crown coins and ten 1 crown coins, and Cynthia has three 20 crown notes. The best way to clear the debt is for Alice to give her 50 crown note to Cynthia, Cynthia to give two 20 crown notes to Alice and one to Bob, and Bob to give one 10 crown coin to Cynthia, involving a total of only five notes/coins changing owners. Compare this to the straightforward solution of Alice giving her 50 crown note to Bob and getting Bob&rsquo;s three 10 crown notes and all his 1 crown coins for a total of fourteen notes/coins being exchanged!</p>

### 입력

<p>On the first line of input is a single positive integer, 1 &le; t &le; 50, specifying the number of test cases to follow. Each test case begins with three integers ab, bc, ca &le; 1000 on a line of itself. ab is the amount Alice owes Bob (negative if it is Bob who owes Alice money), bc the amount Bob owes Cynthia (negative if it is Cynthia who is in debt to Bob), and ca the amount Cynthia owes Alice (negative if it is Alice who owes Cynthia).</p>

<p>Next follow three lines each with six non-negative integers a<sub>100</sub>, a<sub>50</sub>, a<sub>20</sub>, a<sub>10</sub>, a<sub>5</sub>, a<sub>1</sub>, b<sub>100</sub>, . . . , b<sub>1</sub>, and c<sub>100</sub>, . . . c<sub>1</sub>, respectively, where a<sub>100</sub> is the number of 100 crown notes Alice got, a<sub>50</sub> is the number of her 50 crown notes, and so on. Likewise, b<sub>100</sub>, . . . , b<sub>1</sub> is the amount of notes/coins of different value Bob got, and c<sub>100</sub>, . . . , c<sub>1</sub> describes Cynthia&rsquo;s money. Each of them has at most 30 coins (i.e. a<sub>10</sub> + a<sub>5</sub> + a<sub>1</sub>, b<sub>10</sub> + b<sub>5</sub> + b<sub>1</sub>, and c<sub>10</sub> + c<sub>5</sub> + c<sub>1</sub> are all less than or equal to 30) and the total amount of all their money together (Alice&rsquo;s plus Bob&rsquo;s plus Cynthia&rsquo;s) is always less than 1000 crowns.</p>

### 출력

<p>For each test case there should be one line of output containing the minimum number of bank notes and coins needed to settle the balance. If it is not possible at all, output the string &ldquo;impossible&rdquo;.</p>