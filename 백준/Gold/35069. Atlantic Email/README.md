# [Gold V] Atlantic Email - 35069

[문제 링크](https://www.acmicpc.net/problem/35069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 10, 정답: 6, 맞힌 사람: 6, 정답 비율: 60.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>The year is 1984. Your boss, Professor Werner Zorn, has been pushing for establishing connections to international networks. His newest project is for Karlsruhe University\footnote{Former university in Karlsruhe that later merged to become Karlsruhe Institute of Technology.} to receive the first email from the US Computer Science Network (CSNet).</p>

<p>The email will be sent by Laura Breeden (Massachusetts Institute of Technology) to the Karlsruhe University computers. For simplicity, the email only consists of $n$ lowercase letters. It should be encoded so it can be sent across $5$ transatlantic binary channels.</p>

<p>You want the communication to be done efficiently, so you require that across each channel, no more than $n+10$ bits are sent. The channels are working flawlessly and losslessly, so for each of the $5$ channels, the bits will arrive intact in Karlsruhe.</p>

<p>Everything was almost ready, when you noticed that the wires coming into the computer in Karlsruhe are a mess, and so you do not know which of the $5$ channels is which. Thus, as the receiver, you will receive the binary strings of the $5$ channels in arbitrary order. Instead of untangling the mess, you think it is a better idea to just fix it in software. Design a communication protocol that can transfer the email correctly and efficiently.</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with the action that your program needs to perform: either the string "<code>send</code>" or "<code>receive</code>", which denotes whether you are at the sending or receiving end.</li>
<li>If the action is "<code>send</code>":
<ul>
<li>One line with one integer $n$ ($1\leq n \leq 10,000$), the length of the email.</li>
<li>One line with a string $s$ of length $n$, the email to send. The email only consists of English lowercase letters (<code>a-z</code>).</li>
</ul>
</li>
<li>If the action is "<code>receive</code>":
<ul>
<li>Five lines, each with a string $b$ ($1 \leq |b| \leq n+10$), only consisting of digits $0$ and $1$, the five binary strings you used to encode the email, in an arbitrary order.</li>
</ul>
</li>
</ul>

<p>Note that when receiving, you have to infer $n$ from the received binary strings, as this is not known to you up front.</p>

<p>This is a multi-pass problem. Your program will be invoked multiple times, possibly more than twice. It is guaranteed that the first pass is a "<code>send</code>" action, and that each subsequent pass is a "<code>receive</code>" action.</p>

<p>For testing purposes, the number and input of subsequent passes will depend on the output of your submission.</p>

<p>A testing tool is provided to help you develop your solution.</p>

### 출력

<p>If the action is "<code>send</code>", output $5$ bit strings $b_1, \dots, b_5$ ($1 \leq |b_i| \leq n+10$ for each $i$), only consisting of digits $0$ and $1$, the bit strings to send.</p>

<p>If the action is "<code>receive</code>", output the original email $s$, a string only consisting of English lowercase letters (<code>a-z</code>).</p>