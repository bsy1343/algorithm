# [Gold IV] XOR Gates - 8087

[문제 링크](https://www.acmicpc.net/problem/8087)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 22, 맞힌 사람: 17, 정답 비율: 77.273%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>A XOR gate has two inputs and one output. Its operation can be described by the following table</p>

<pre>
input 1   input 2    output
   0         0          0
   0         1          1
   1         0          1
   1         1          0
</pre>

<p>A system of XOR gates is called a XOR net if it has n&nbsp;inputs and one output and meets the following conditions:</p>

<ol>
	<li>Each input of the net is connected to at least one input of a gate.</li>
	<li>Each input of a gate in the net is connected to one input of the net or one output of another gate.</li>
	<li>The output of exactly one gate is connected to output of the net.</li>
	<li>Each output of a gate in the net is connected to at least one input of another gate, or to the output of the net.</li>
	<li>There exists a numbering of gates such that for every gate each of its inputs is connected to the input of the net or to the output of a gate with a smaller number.</li>
</ol>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8087/1.gif" style="height:207px; width:400px" /></p>

<p>The net of 6&nbsp;gates is shown in the figure. It has 5&nbsp;inputs and 1&nbsp;output and meets conditions 1&ndash;5 so it is a XOR net. Observe that the numbers given in the figure do not agree with the fifth condition but there exists an appropriate numbering.</p>

<p>Inputs of a net are numbered from 1&nbsp;to n. An input state of a XOR net can be described by an input word of the length n. Each letter of such a word is a binary digit 0&nbsp;or 1. We assume that i-th digit of the word is a state of the i-th input of the net. For every input state the net returns 0&nbsp;or 1&nbsp;on its output. Each input word is a binary code of a natural number so we can order input words with respect to their values. We will test XOR nets by sending words from a fixed range to its input and counting the number of digits 1 returned on the output of the net.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the description of a XOR net from the standard input; the descriptions consists of: the number of inputs n, the number of gates m, the number of the gate connected to the output of the net and descriptions of connections;</li>
	<li>reads from the same file two binary words of length n&nbsp;&mdash; lower and upper limit of the range in which we will test the net;</li>
	<li>computes for how many inputs from the given range the net returns 1 on its output;</li>
	<li>writes the result to the standard output.</li>
</ul>

<p>We assume that: 3 &le; n &le; 100, 3 &le; m &le; 3,000&nbsp;and that the gates of the given net are numbered from 1&nbsp;to m&nbsp;in an arbitrary order.</p>

### 입력

<p>In the first line of the standard input there are three integers separated by single spaces. They are respectively: the number of inputs n&nbsp;of the given net, the number of gates m&nbsp;and the number of the gate connected to the output of the net.</p>

<p>In the following m&nbsp;lines there are descriptions of the connections between gates of the net. In the i-th line, for 1 &le; i &le; m, there is a description of the connections of two inputs of the i-th gate. Such a description consists of two integers from the range [-n,m]&nbsp;separated by a single space. If an input of the gate is connected to the k-th input of the net then the description of this connection is the negative integer -k, if this input is connected to the output of the j-th gate then it is described by the positive number j.</p>

<p>In the following two lines there are two n-bit words a&nbsp;and b. They represent lower and upper limits of the range in which we test the net. We assume that in the given range there is at most 100,000&nbsp;words.</p>

### 출력

<p>In the standard output there should be written a single non-negative integer &mdash; the number of words from the range a &le; s &le; b&nbsp;(where &lt;&nbsp;is the relation consistent with the values of binary words), for which the XOR net returns 1 on its output.</p>