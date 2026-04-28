# [Gold I] Talk jail - 28341

[문제 링크](https://www.acmicpc.net/problem/28341)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 24, 정답: 10, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 트리, 집합과 맵, 해 구성하기, 많은 조건 분기, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<blockquote>
<p>How have you been?</p>

<p>I want to play a game.</p>

<p>This game will be played on a smartphone, on which you spend most of your time.</p>

<p>On the &rsquo;Talk.&rsquo;</p>

<p>Are you happy because you got unlimited 3G?</p>

<p>Tonight, we shall see how far you go in order not to turn your phone off.</p>

<p>Will you get a push or turn it off?</p>

<p>Your choice.</p>

<p>&mdash; Jigsaw</p>
</blockquote>

<p>Jigsaw invited $N$ people to the &ldquo;Talk jail&rdquo; room. Here is a brief description of how Talk room works. Everyone can send messages, and all messages are delivered to everyone in the room, including the sender. However, a new message arrived on someone&rsquo;s smartphone is not displayed immediately if the chat room window is not open. Instead, it is kept in the <strong>unread</strong> status. As soon as one <strong>opens</strong> the Talk jail room window, the status of all messages that have been arrived so far changes to the <strong>read</strong> status. Also, while the chat room window is open, newly arrived messages will be displayed and marked as read immediately. One can close the chat room window, but the messages will still arrive. One can send a message only when he/she has the chat room window open.</p>

<p>Moreover, when one opens the chat room window, one can see $3$ pieces of information on each message: the sent time, the sender, and the number of people who have not read the message yet.</p>

<p>This simple chatting service can actually serve as a jail as follows. When a lot of people send messages in the Talk jail room, everyone&rsquo;s phone will keep beeping continuously, which makes it impossible for him/her to manage ordinary life. Even if someone tries to leave the room, Jigsaw invites him/her back immediately: so it is impossible to leave the room. As a result, people will complain in the room which yields more messages and more beeps&hellip;</p>

<p>Jigsaw will never send any message to the room but will keep inviting leavers back to the room. Being so frustrated, people eventually choose one or the other: (A) just suck it up and live with it or (B) ignore the smartphone entirely and live free.</p>

<p>Jigsaw just opened the chat room window and checked out the $M$ messages that have been sent ever since the room was created. Based on this, he can infer that certain people have not read certain messages with certainty. That is, for each message, he may be able to infer whether someone has read the message or not (sometimes, such inference may not be possible). He calls those who have not read the message for sure, &ldquo;the wretched addict.&rdquo;</p>

<p>For each message, your job is to figure out how many people Jigsaw can identify as &ldquo;the wretched addicts&rdquo; because you can infer that they have not read the message.</p>

### 입력

<p>The input consists of $T$ test cases. The first line of the input contains $T$.</p>

<p>Each test case starts with two integers $N$ ($1 &le; N &le; 60\,000$) and $M$ ($1 &le; M &le; 60\,000$), separated by a whitespace. The following $M$ lines contain three integers each: $t_i$, $p_i$, and $c_i$ where $t_i$ ($0 &le; t_i &lt; 2^{31}$) denotes the sent time, $p_i$ ($1 &le; p_i &le; N$) denotes the sender, and $c_i$ ($0 &le; c_i &lt; N$) denotes the number of people who have not read the message $i$. No two messages have the same value of $t_i$. The input is consistent and valid.</p>

### 출력

<p>For each test case, you must output &ldquo;<code>#</code>Test case number&rdquo; in the first line. You must output the number of people who are certain that have not read the $i$-th message yet in a separate line.</p>

### 힌트

<p>Here comes the explanation of the first test case.</p>

<p>Everybody read the first message (from the input data). Hence, the answer is $0$.</p>

<p>There is one person who has not read the second message yet. Person $2$ must have read the message (as he sent it). Either Person $1$ or $3$ could have read the message, and Jigsaw cannot identify exactly who has not read it. The answer is $0$.</p>

<p>The third message is again read by Person $2$. However, both Person $1$ and Person $3$ have not read it yet, and thus Jigsaw can be certain that those two have not read. The answer is $2$.</p>