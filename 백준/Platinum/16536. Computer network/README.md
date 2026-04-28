# [Platinum III] Computer network - 16536

[문제 링크](https://www.acmicpc.net/problem/16536)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 10, 맞힌 사람: 10, 정답 비율: 27.027%

### 분류

그래프 이론, 강한 연결 요소

### 문제 설명

<p>A computer network comprises N computers, numbered from 0 to N-1. Each one, after receiving a message, passes it to some other computers. If a message from computer X can reach a computer Y, this does not necessarily mean that a message from computer Y reaches the computer X. The system administrators want to determine the minimum number of computers from which a message has to be sent in order to reach all the computers in the network.</p>

<p>For better transmission of messages, they believe that the network needs to be extended by adding new connections between some computers, so when sending a message from an arbitrary computer it will be distributed to all others. For this purpose, it is necessary to determine the minimum number of new connections to be added, so that each of the computers can be used as initial for distribution of messages.</p>

<p>Write a program cnet that finds the minimal number of computers from which a message needs to be sent in order to be distributed to all computers in the network and finds the minimum number of new connections that need to be added, in order to allow a message, sent from each of the computers, to reach every other computer in the network.</p>

### 입력

<p>The first line of the standard input contains two integers N and M, representing the number of computers and the number of connections between them. Each of the next M lines describe one available connection. The first number is the number of the computer sending the message, and the second number is the number of the computer receiving the message.</p>

### 출력

<p>On a single line of the standard output, the program outputs two integers - the minimum number of computers that are used as initial for distributing a message to the whole network and the minimum number of additional connections needed to extend the network in a way that a message sent from an arbitrary chosen computer, will reach all the others.</p>

### 제한

<ul>
	<li>1 &lt; N &le; 1 600</li>
	<li>0 &le; M &le; 120 000</li>
</ul>