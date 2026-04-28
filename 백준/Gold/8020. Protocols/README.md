# [Gold II] Protocols - 8020

[문제 링크](https://www.acmicpc.net/problem/8020)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 7, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍

### 문제 설명

<p>Mr Halfnet works in a telecommunication company Bytetel as a designer of network protocols. At present he works on a protocol to send data from one computer to another by means of a new generation cable. One can send signals of k different voltage levels on such a cable, but the voltage may vary only every 1/n of a second (1/n) of a second during which the voltage must be constant is called an impulse). Data are sent in packets comprising m consecutive impulses (i.e. sending one packet takes m/n seconds).</p>

<p>For technical reasons, the voltage must not be constant within each packet, but has to change from time to time. Strictly speaking, one cannot send packets of data containing / consecutive impulses of the same voltage level.</p>

<p>If a protocol enables to send x different packets, we say that we can code log_2 x &nbsp;bits of information in one packet. Mr Halfnet ponders on how many bits of information maximally one is able to send in one second.</p>

<p>Assume the cable enables us to send signals of 2 different voltage levels (k=2), which we denote 0 and 1. If the voltage can vary 20 times per second (n=20), the packets comprise 4 impulses (m=4), and within each packet no 3 consecutive impulses may have the same voltage (l=3), then one cannot send packets: 0000, 0001, 1000, 1111, 1110, 0111. However, one can send packets: 0010, 0011, 0100, 0110, 0101, 1101, 1100, 1011, 1001 and 1010. As one can send 10 different kinds of packets, one can code log_2 10 bits of information in each packet. During a second one can send 20/4=5 packets, that is 5&sdot;log_2 10 ~ 16.6096 bits of information.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the numbers k, n, m and l describing the protocol,</li>
	<li>computes the maximal number of bits of information that may be sent during one second,</li>
	<li>writes to the standard output the computed number rounded down to the nearest integer.</li>
</ul>

### 입력

<p>In the first line of the standard input there are four integers, separated by single spaces:</p>

<ul>
	<li>the number of voltage levels k (2 &le; k &le; 10),</li>
	<li>the frequency of impulses n (1 &le; n &le; 1,000),</li>
	<li>the size of packet of data m (1 &le; m &le; 100),</li>
	<li>the number l of consecutive impulses in a packet, that there must be a change in voltage within (2 &le; l &le; m).</li>
</ul>

<p>Additionally, we assume that n/m is an integer less than or equal to 10.</p>

### 출력

<p>Your program should write, in the first and only line of the standard output, one integer: the maximal number of bits that may be sent during one second, rounded down to the nearest integer.</p>