# [Silver III] Mock Competition Marketing - 20029

[문제 링크](https://www.acmicpc.net/problem/20029)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 329, 정답: 122, 맞힌 사람: 87, 정답 비율: 36.709%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>MOLOCO is a company that matches advertisers with potential users using their high-performance ad platform.</p>

<p>Whenever the application has available space for ads, the app requests the <em>AdExchange</em>&nbsp;platform to determine which ad to show. Then, the <em>AdExchange</em>&nbsp;holds an auction, in which bidders like MOLOCO bid for the opportunity to show their advertisement.</p>

<p>RUN wants to advertise its 2020 ICPC Mock Competition. They have asked MOLOCO for the advertisement. RUN has a total of $K$ dollars and wants to display the ad for internal apps used by KAISTians. The ads in those apps are in one of six types, and the bidding price depends only on the type of ad. The first bidder to bid on the ad gets to show their ad.</p>

<p><em>AdExchange</em>&nbsp;has already determined the costs of the six ad types and the $N$ auctions it will run today. In the $i$-th auction, <em>AdExchange</em>&nbsp;will run an auction for an ad of type $c_i$.&nbsp;<em>AdExchange</em>&nbsp;never runs two auctions at the same time, more specifically auction $i+1$ cannot start until after auction $i$ ends.</p>

<p>MOLOCO will bid during auctions using the following strategy - before the auctions begin, RUN selects a set of ad types. During the $i$-th auction, if the ad type for that auction is in RUN&#39;s set, and RUN has enough money to bid on an ad of that type, MOLOCO will submit a bid.&nbsp;Otherwise, they will ignore it.</p>

<p>MOLOCO is very fast at bidding, so it will always be the first bidder if it bids on the ad. Determine the maximum number of ads they can bid on if RUN selects the set of ad types optimally.</p>

### 입력

<p>The first line contains two space-separated integers $N$, $K$. ($1 \le N \le 100\,000, 0 \le K \le 10^9$)</p>

<p>The next line contains 6 integers $b_1, b_2, \ldots, b_6$. $b_i$ indicates the cost for ad type $i$. ($1 \le b_i \le 10^9$)</p>

<p>The next line contains $N$ integers $c_1, c_2, \ldots, c_N$. $c_i$ indicates the ad type of the $i$-th auction. ($1 \le c_i \le 6$)</p>

### 출력

<p>Print the maximum number of ads they can bid on.</p>