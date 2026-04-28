# [Gold II] The Banzhaf Buzz-Of - 4031

[문제 링크](https://www.acmicpc.net/problem/4031)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>A young researcher named George Lurdan has just been promoted to the board of trustees for Amalgamated Artichokes. Each member of the board has a specified number of votes (or weights) assigned to him or her which can be used when voting on various issues that come before the board. Needless to say, the higher your weight, the more power you have on the board, but exactly how much power you have is a difficult question. It depends not only on the distribution of the weights, but also on what percentage of the votes are needed to pass any resolution (known as the quota). For example, the current board has 5 members whose weights are 20, 11, 10, 8 and 1, where George has the 1. Whenever a simple majority of votes are needed (i.e., when the quota is 26) George has very little power. But when the vote has to be unanimous (quota = 50), George has just as much power as anyone else. George would like to know how much power he has depending on what the quota is; he figures that if his power is zero, then there&rsquo;s no point in going to the meetings&mdash;he can buzz off and spend more time on artichoke research.</p>

<p>After doing some reading, George discovered the Banzhaf Power Index (BPI). The BPI measures how often each board member is a critical voter in a winning coalition. A winning coalition is a group of board members whose total weights are greater than or equal to the quota (i.e., they can pass a resolution). A critical voter in a winning coalition is any member whose departure results in a non-winning coalition. For example, if the quota is 26, then one possible winning coalition would consist of 20, 10 and 1 (George). Here, each of the first two members of the coalition are critical (since if they leave the resulting coalition has only 11 or 21 votes), while George is not critical. In the winning coalition 20, 11, 10, 8, 1, no one is critical when the quota is 26, but everyone is when the quota is 50. The BPI for any member is just the total number of winning coalitions in which that member is critical (NOTE: in reality, the BPI is actually double this figure, but that&rsquo;s not important for us here). For example, when the quota is 26, the BPIs for the members turn out to be 12, 4, 4, 4 and 0, i.e., the board member with weight 20 is a critical voter in 12 different winning coalitions, the board member with weight 11 is a critical voter in 4 different winning coalitions, etc. As expected, George has no power in this case. If the quota is raised to 42, then the BPIs are 3, 3, 3, 1 and 1. In this case George has just as much power as the member with 8 votes!</p>

<p>Since the number of members on the board can vary from 1 to 60 , and board members&rsquo; weights can change over time, George would like a general program to determine his BPI power.</p>

### 입력

<p>Input for each test case will consist of two lines: the first line will contain two integers n, q, where n indicates the number of distinct weight values (1 &le; n &le; 60) and q is the quota. The second line will contain n pairs of positive integers w<sub>1</sub> m<sub>1</sub> w<sub>2</sub> m<sub>2</sub> &middot; &middot; &middot; w<sub>n</sub> m<sub>n</sub> where w<sub>i</sub> is a weight value and m<sub>i</sub> is the number of board members with that weight. The total number of votes V = w<sub>1</sub>m<sub>1</sub> +w<sub>2</sub>m<sub>2</sub> +&middot; &middot; &middot;+w<sub>n</sub>m<sub>n</sub> will be in the range 1 &le; V &le; 60. The quota will satisfy the condition V/2 &lt; q &le; V , and w<sub>i</sub> &ne; w<sub>j</sub> when i &ne; j. A line containing &ldquo;0 0&rdquo; will signal the end of input.</p>

### 출력

<p>For each test case, output a single line of the form:</p>

<pre>
Case n: b<sub>1</sub> b<sub>2</sub> . . . b<sub>n</sub></pre>

<p>where b<sub>i</sub> is the Banzhaf Power Index for any member with weight w<sub>i</sub>. Separate the BPIs with a single blank.</p>