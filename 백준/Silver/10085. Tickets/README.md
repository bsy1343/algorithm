# [Silver III] Tickets - 10085

[문제 링크](https://www.acmicpc.net/problem/10085)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 42, 정답: 35, 맞힌 사람: 24, 정답 비율: 80.000%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>As we all know well, the World Cup is currently ongoing. In a few days, the Second Stage of a cup will begin. But the organizers forgot to print the tickets. In order to print the tickets, only one machine is used, and tickets are printed one by one. Using the standard method, the tickets are enumerated from 1 to N, and printed in order. However, since there is not enough time for that, the IT department proposed another solution: print the tickets in an order such that numbers on tickets represent the Gray code, because in that case changing the state of the printer from one ticket to the next one requires only one bit to be changed, and therefore the process of printing the tickets can be hugely improved.</p>

<p>The Gray code is a binary system where consecutive values differ in only one bit. For example, 1001 and 1011 differ in only 1 bit, but 1101 and 1011 differ in 2 bits and hence can&rsquo;t be consecutive in gray code. One way to construct a gray code from all numbers containing exactly \(n\) bits is the following method:</p>

<ol>
	<li>If \(n = 1\), then the gray code is \(\left[ 0, 1\right]\)</li>
	<li>Else let L1 be the gray code of numbers containing exactly \(n &minus; 1\) bits, \(L_1 = \left[ s_1, s_2, \dots, s_{2^{n-1}}\right]\), and let \(L_2\) be the reversed \(L_1\), that is \(L_2 = \text{reverse}(L_1) = \left[ s_{2^{n-1}}, s_{2^{n-1}-1}, \dots, s_2, s_1 \right]\).<br />
	Now let \(L&#39;_1\) be constructed from \(L_1\) by prefixing each element of \(L_1\) with 0, and \(L&#39;_2\) beconstructed from \(L_2\) by prefixing each element of \(L_2\) with 1.<br />
	\(L&#39;_1 = \left[ 0s_1, 0s_2, \dots, 0s_{2^{n-1}}\right]\)<br />
	\(L&#39;_2 = \left[ 1s_{2^{n-1}}, 1s_{2^{n-1}-1}, \dots, 1s_2, 1s_1 \right]\)<br />
	Finally, the gray code of all numbers consisting of \(n\) bits, \(L\), is constructed by appending \(L&#39;_2\) to \(L&#39;_1\), that is \(L = L&#39;_1 + L&#39;_2 = \left[ 0s_1, 0s_2, \dots, 0s_{2^{n-1}}, 1s_{2^{n-1}}, 1s_{2^{n-1}-1}, \dots, 1s_2, 1s_1 \right]\)</li>
</ol>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/10085.%E2%80%85Tickets/2badfd78.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/10085.%E2%80%85Tickets/2badfd78.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/10085/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:240px; width:300px" /></p>

<p style="text-align:center">Figure 1 source: <a href="https://en.wikipedia.org/wiki/Gray_code">https://en.wikipedia.org/wiki/Gray_code</a></p>

<p>This indeed speeds up the process of printing the tickets by a large factor, but in order to use this method we need a safety method as well. This is needed, because the printer used is not perfect and can sometimes print with a flaw (e.g. can wrongly print some bits in input). However, the printer works correctly in 99% of cases, and therefore only a small number of tickets won&rsquo;t be printed correctly and those tickets will need to be printed again. For this, we need your help.</p>

<p>Given an number \(n\), the number of bits in numbers, and a number \(K\) that represents the index in the gray code constructed using above method, print the \(K\)th string in this gray code sequence.</p>

### 입력

<p>First and only line of the input contains two integers \(n\) and \(K\), representing the number of bits in numbers and index in gray code sequence, respectively.</p>

### 출력

<p>First and only line of the output should contain a string of \(n\) bits, representing the \(K\)th string in gray code constructed using method described in the problem statement.</p>

### 제한

<ul>
	<li>1 &le; \(n\) &le; 62</li>
	<li>1 &le; \(K\) &le; 2<sup>\(n\)</sup></li>
</ul>

### 힌트

<p>Gray code of numbers consisting of 3 bits constructed using the method described in problem statement is: [000, 001, 011, 010, 110, 111, 101, 100], and the 5th in this sequence is 110. Note that the sequence is indexed from 1.</p>