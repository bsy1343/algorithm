# [Gold V] Avoiding an Arrrgument - 32010

[문제 링크](https://www.acmicpc.net/problem/32010)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 13, 정답 비율: 65.000%

### 분류

브루트포스 알고리즘, 그리디 알고리즘, 구현

### 문제 설명

<p>The pirate captain and his crew gazed happily upon the chest brimming with gemstones. Diamonds, rubies, sapphires, opals, and many other kinds of gems added to the sparkling collection.</p>

<p>&quot;We&#39;re rich, my lads!&quot; the captain said, &quot;Now, here&#39;s what we&#39;re going to do. Each of us will take two stones now, then we&#39;ll bury the rest because ... because that&#39;s what pirates do! Also, everyone must take two different kinds of gems. We don&#39;t know what the merchants in the next port will be buying, and I don&#39;t want to listen to any belly-aching from someone who only took rubies if our next port happens to have a flourishing ruby mine nearby&quot;</p>

<p>&quot;Who chooses first?&quot; asked the cabin boy, fearing that he already knew the answer.</p>

<p>&quot;I&#39;ll choose one first,&quot; said the captain, &quot;and then each man from there in order of rank, starting with the first mate down to the cabin boy&quot;. The lower-ranked crew members began to grumble. &quot;Then,&quot; continued the captain, &quot;the cabin boy immediately chooses his second gem, and we proceed in reversed order until we get to me, and I will be the last to choose my second stone.&quot;</p>

<p>The crew quickly agreed and, almost as quickly, began trying to figure how to claim the best stones under this arrangement.</p>

<p>Write a program to figure out what stone a crewman should pick first in order to maximize the total value they can be guaranteed to acquire no matter how the rest of the crew chooses.</p>

### 입력

<p>The input will consist of one or more data sets.</p>

<p>Each data set starts with a line containing 2 integers: $M$, the number of kinds of gemstone available, and $N$, the number of crewmen who select their first stone after you and select their second before you. Each data set will have $2 \leq M \leq 26$, $0 \leq N \leq 10$. A value of 0 for $M$ indicates the end of input.</p>

<p>The remainder of the dataset consists of $M$ lines, each describing one kind of available gem. The line begins with an uppercase alphabetic character indicating the type of gem (e.g., &#39;D&#39; might denote diamonds, &#39;Z&#39; might stand for zircons). No two kinds of gem will have the same code, but the codes may occur in any order. The alphabetic code is followed by $N+1$ integers, each demoting the value in doubloons of one of the $N+1$ most valuable remaining gems of that kind. These will be presented on the line in non-increasing order of value. Values will be in the range $0\ldots 10\,000$.</p>

### 출력

<p>For each dataset, print a single line containing the letter code for the type of gem that you should pick first to maximize the total value that you can be guaranteed to receive on both picks, no matter what choices the rest of the crew makes. If there is more than one type of gem tied for the maximum total value, print the one the comes earliest alphabetically.</p>