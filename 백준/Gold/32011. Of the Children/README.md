# [Gold I] Of the Children - 32011

[문제 링크](https://www.acmicpc.net/problem/32011)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 2, 맞힌 사람: 2, 정답 비율: 28.571%

### 분류

다이나믹 프로그래밍, 이분 탐색

### 문제 설명

<blockquote>
<p>This problem was withdrawn from the contest by a minute-1 clarification message sent to all teams.</p>

<p>The reason for the withdrawal was that, as of 24 hours before the contest, the authoring team had only a single sample solution, and we strongly prefer to move forward with a problem only after independent confirmation by two or more authors.</p>
</blockquote>

<p>A nation-wide charity, <em>Won&#39;t Someone Think of the Children</em>, is sending one of its celebrity spokespeople out on a coast-to-coast publicity tour. Like many charities, they are bit strapped for funding and need to plan carefully to make sure they can pay the celebrity&#39;s travel expenses to get from their office on the west coast to the final press event on the east coast.</p>

<p>Local offices of the charity have been taking pledges and collecting donations to pay for this celebrity to visit their cities as part of the tour. The national office has made no promises that the celebrity will visit any of these intermediate locations, but hopes that these locally collected funds can actually help fund the coast-to-coast trip. In fact, without the help of the local offices, they aren&#39;t sure they can afford to get their spokesperson to the final destination.</p>

<p>The trip will be paid for on an incremental basis. The celebrity can only travel from one city to another if he or she has enough money to pay for the transportation to that next city. Upon arrival at the city, he or she can collect any money held there and use it to help pay for the later legs of the journey. The celebrity can only visit a given city once, lest multiple visits be considered an abuse of their hospitality.</p>

<p>Given a list of cities that have invited the celebrity, the amount of money raised by each city, and the travel costs between various pairs of cities, what is the smallest amount of money that the home office needs to provide the celebrity at the beginning of the journey to make sure that he or she can make it all the way to the end without being unable to pay for any leg of the trip?</p>

### 입력

<p>Input will consist of one or more datasets. Each dataset begins with a line containing a single integer, $N$, $2 \leq N &lt; 24$, indicating the number of cities involved. A value of zero for $N$ signals the end of input.</p>

<p>Cities are identified by integers in the range $0\ldots N-1$, with city $0$ being the home office and starting point of the journey, and city $N-1$ being the final destination city for the journey.</p>

<p>The first line of the dataset is followed by $N-2$ lines, each containing an integer in the range $0\ldots 10\,000$ indicating the amount of money collected by the cities numbered $1 \ldots N-2$. (The amount of money at city $N-1$ is irrelevant and the amount of money to be provided at city $0$ is what you need to compute).</p>

<p>This is followed by at least $1$ and up to $N(N-1)/2$ lines, each containing three integers $i$, $j$, &amp; $c$. $i$ and $j$ are distinct integers in the range $0\ldots N-1$ identifying two cities and $c$ is the cost to travel from one of those cities to the other, $0 &lt; c &lt; 10\,000$. The cost is the same when traveling from $i$ to $j$ as it is when traveling from $j$ to $i$. The end of this list of potential travel expenses is indicated by a line containing negative values for $i$, $j$, and $c$.</p>

### 출력

<p>For each dataset print a single line of output.</p>

<p>If it is possible to reach city $N-1$ from city $0$, print the smallest amount of money that the celebrity needs to be given at city $0$ in order to guarantee reaching city $N-1$.</p>

<p>If it is not possible to reach city $N-1$ when starting from city $0$, print $-1$.</p>