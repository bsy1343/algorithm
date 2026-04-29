# [Platinum I] Duo Detection - 35207

[문제 링크](https://www.acmicpc.net/problem/35207)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 12, 맞힌 사람: 11, 정답 비율: 68.750%

### 분류

제곱근 분할법

### 문제 설명

<p>It is the 25th of April, 1825. English inventer William Fothergill Cooke and English scientist Charles Wheatstone are working on an early prototype of an electrical telegraph system.<sup>1</sup> This system consists of a transmitter and a receiver. The transmitter can send messages to the receiver, which we model as a sequence of positive integers. However, the prototype is far from flawless, so quite often, an integer that is transmitted is not actually received. Integers never get altered through the connection, though, so all received integers are guaranteed to have been transmitted.</p>

<p>To remedy this flaw, Cooke and Wheatstone came up with an error correction code. Together, they agreed on a fixed list of $n$ possible messages, and assigned each message a list of positive integers. To send a message from the list, they simply send the corresponding list of integers. Sometimes, some integers may get lost or arrive in a different order, but if enough integers remain, the hope is that there is still only one possible message.</p>

<p>You work as a postman, so you see the innovation of communication technology as a direct risk to your job security. You decide to mess with Cooke and Wheatstone to delay the development of their telegraph system. You have learned about their error correction code, and you have secretly obtained a copy of their message list with all the lists of integers. You have figured out a way to forcefully interrupt the transmission of an integer, so you decide to use this to ruin their system. To avoid suspicion, you decide that at least two integers should remain uninterrupted when a message is sent. Thus, your goal is to determine whether any message can be made ambiguous by interrupting all but two of its integers. Then, whenever such a message will be sent, you can make it ambiguous by interrupting the appropriate integers.</p>

<hr>
<p><sup>1</sup>One may point out that Cooke and Wheatstone actually did not release a telegraph design until 1837, but obviously, this just means you were successful in this solving this problem! :)</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($2\leq n\leq 50\,000$), the number of possible messages.</li>
<li>$n$ lines (one for each message), each with an integer $k$ ($2\leq k\leq 10^5$), the number of integers assigned to the message, followed by those $k$ integers $x$ ($1\leq x\leq 10^9$). It is guaranteed that the $k$ integers in a message are pairwise distinct.</li>
</ul>

<p>The total number of integers in all messages combined is at most $10^5$.</p>

### 출력

<p>If a pair of distinct integers exists that are assigned to multiple messages, output these two integers in any order, followed by the $1$-based indices of two of the messages they are assigned to. Otherwise, output "<code>impossible</code>".</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>