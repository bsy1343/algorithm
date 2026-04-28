# [Platinum V] Internet problem (Easy) - 27644

[문제 링크](https://www.acmicpc.net/problem/27644)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬, 강한 연결 요소

### 문제 설명

<p>Lisa and Sarah have exposed a massive conspiracy and now they&rsquo;re on the run from the corrupt government. Being together makes it too risky that they could both be captured, so they have to communicate through the Internet. But the normal Internet isn&rsquo;t safe enough, so they send each other secret messages through the dark web.</p>

<p>On the dark web, every message can take a long and convoluted path through many servers until it reaches its destination, and it might even go through one server multiple times. This makes messages much harder to trace.</p>

<p>But Lisa is still worried. What if the government has already hacked one of the servers of the dark web? If the hacked server is in a good central location, it could intercept all of her messages to Sarah, regardless of what path they take.</p>

<p>Help Lisa solve her Internet problem!</p>

<p>The dark web consists of <em>n</em> servers, numbered from 1 to <em>n</em>. The servers are connected by <em>m</em> network links. Links are directed &ndash; if one server can transmit a message to another, the opposite doesn&rsquo;t have to be true. Lisa is connected to server 1 and Sarah is connected to server <em>n</em>. Whenever Lisa wants to send a message to Sarah, she chooses a route for the message: a sequence of consecutive network links that goes from server 1 to server <em>n</em>. The route may go through each server multiple times.</p>

<p>The government wants to intercept Lisa&rsquo;s messages to Sarah. They can hack one server so it records all messages that go through it. They want to see every message from Lisa to Sarah <strong>exactly once</strong>. (&ldquo;At least once&rdquo; is needed so they learn all about their plans, and &ldquo;at most once&rdquo; is needed so their hard drives don&rsquo;t fill up with duplicates.)</p>

<p>Find all the servers which satisfy that condition.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>The first line of each test case contains the integers <em>n</em> and <em>m</em>. Each of the next <em>m</em> lines contains two integers <em>a</em>, <em>b</em> (1 &le; <em>a</em>, <em>b</em> &le; <em>n</em>) meaning that server <em>a</em> can transmit messages directly to server <em>b</em>. (It may be the case that <em>a</em> = <em>b</em>.) Each distinct ordered pair <em>a</em>, <em>b</em> will be given at most once.</p>

### 출력

<p>For each test case, output two lines. On the first line, print the number of servers that could be hacked by the government. On the second line, print a space-separated list of numbers of those servers, in the order in which messages from Lisa to Sarah go through them.</p>

<p>Note that for some test cases there may be no path from Lisa to Sarah. If that is the case, output an empty set of servers.</p>

### 제한

<ul>
	<li>2 &le; <em>n</em> &le; 1 000</li>
	<li>0 &le; <em>m</em> &le; 3 000</li>
</ul>

### 힌트

<p>First test case: All messages must take the same path, so the government could hack any server on the path.</p>

<p>Second test case: The government doesn&rsquo;t want to get any duplicates, so they can&rsquo;t hack either server. Lisa and Sarah are safe.</p>

<p>Third test case: Lisa can&rsquo;t send any messages anyway, so there is nothing to hack.</p>

<p>Fourth test case: The government can&rsquo;t hack both 2 and 3 at once. If they hack only 2, or only 3, they won&rsquo;t see all messages.</p>