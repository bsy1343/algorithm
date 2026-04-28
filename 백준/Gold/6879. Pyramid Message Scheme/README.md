# [Gold V] Pyramid Message Scheme - 6879

[문제 링크](https://www.acmicpc.net/problem/6879)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 14, 맞힌 사람: 9, 정답 비율: 75.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Spamway Inc. maintains a network of zombie computers to solicit and collect orders for its various fine products. Each zombie computer is responsible for zero or more subordinate zombies that it coordinates in these activities.</p>

<p>Spamway uses a simple communication strategy among its zombies for transmitting solicitations and receiving orders. Each solicitation originates at Spamway&#39;s head zombie, which then communicates it to each of its subordinates in turn, waiting to collect orders from one subordinate before proceeding to the next. Each subordinate employs the same strategy - it sends to and receives from each of its subordinates in turn.</p>

<p>For example, suppose that Home has two subordinate zombies named Alfred and Betty; Alfred&#39;s subordinates are named Cindy and Dennis; Betty has no subordinates. This organization is pictured below.</p>

<pre>
            Cindy
           /
     Alfred
    /      \
Home        Dennis
    \
     Betty
</pre>

<p>Home first sends to Alfred; Alfred then sends to Cindy; Cindy responds to Alfred; Alfred sends to Dennis; Dennis responds to Alfred; Alfred responds to Home; Home sends to Betty; Betty responds to Home.</p>

<p>Each message takes $10$ seconds to be delivered. So the example given above would be completed in $80$ seconds. You have been retained by Spamway, who will pay you handsomely (in Spam Bucks which may be redeemed for any of their valuable products) to help them reduce the time necessary to solicit and collect orders. In particular, Spamway is considering a new strategy in which each zombie sends out messages to each of its subordinates and waits for their responses only after all messages have been sent.</p>

<p>Spamway&#39;s network administrator has captured a chronological list of the name of the recipient of each message involved in a particular solicitation. For the example above, using the slow strategy, this list would be: Alfred, Cindy, Alfred, Dennis, Alfred, Home, Betty, Home. (Note that $8$ messages at $10$ seconds per message is $80$ seconds.)</p>

<p>Using the new and improved strategy, Home sends to Alfred and Betty simultaneously, Alfred sends to Cindy and Dennis at the same time as Betty is responding, Cindy and Dennis respond simultaneously to Alfred and finally Alfred responds to Home. Using the new strategy, Spamway needs only $40$ seconds to accomplish the communication that takes $80$ seconds using the old strategy. Thus, Spamway can send twice as many solicitations and make twice as much money.</p>

### 입력

<p>As input, you are given lists of names describing the order that messages are received using the old Spamway strategy. The input contains the integer $L$, followed by $L$ message lists. Each list begins with an integer, $n$, identifying the number of message recipients in the list, followed by $n$ lines, each containing the name of a message recipient.</p>

### 출력

<p>For each list you are to print out a single integer indicating the amount of time in seconds that Spamway saves.</p>