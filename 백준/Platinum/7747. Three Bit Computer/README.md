# [Platinum V] Three Bit Computer - 7747

[문제 링크](https://www.acmicpc.net/problem/7747)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 38, 정답: 8, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

다이나믹 프로그래밍, 애드 혹

### 문제 설명

<p>The scientists in the Kingdom of Byteland want to develop a new type of computer, namely the Three Bit Computer (TBC). They predict that the new machine will have the power to solve many hard and still unsolved problems. However, there are some technical difficulties that have to be resolved first. You have been asked to assist the scientists in solving one of them.</p>

<p>The scientists are now working on the initialization procedure for the computer memory. The current version of TBC has n bits of memory numbered from 1 to n. Each bit can have one of three values a, b, c or might be uninitialized. The following memory initialization operations are supported by the computer:&nbsp;</p>

<ul>
	<li>two consecutive uninitialized bits, i.e., the bits numbered i and i + 1 for 1 &le; i &lt; n, can be set to two different values,&nbsp;</li>
	<li>two consecutive bits, one unitialized and one initialized to value x, can be set to two different values not equal to x.&nbsp;</li>
</ul>

<p>For example, the following initialization procedure is possible for n = 4, uuuu -&gt; uuab -&gt; ucbb -&gt; babb, where u denotes an uninitialized bit of memory.&nbsp;</p>

<p>Write a program that:</p>

<ul>
	<li>reads the values to which the the memory has to be initialized,</li>
	<li>checks if the initialization is possible,</li>
	<li>writes the answer to the output file.</li>
</ul>

### 입력

<p>The input can contain several initialization patterns. The first line of the input file contains a single positive integer N, (1 &le; N &le; 10), the number of patterns. The description of the patterns follows. Description of a single pattern consists of two consecutive lines. The first one contains a positive integer ℓ<sub>i</sub>, (1 &le; ℓ<span style="color:rgb(37, 37, 37); font-family:sans-serif; font-size:14px"><sub>i</sub></span> &le; 100 000), the length of the i-th pattern (i.e., the size of computer&#39;s memory). The second line contains a sequence of length ℓ<sub>i</sub> consisting of letters a, b, c - the pattern itself.&nbsp;</p>

### 출력

<p>The output file should have N lines, one for each pattern. The i-th line should consist of a single word YES, if the initialization is possible, or NO otherwise.&nbsp;</p>

<p>&nbsp;</p>