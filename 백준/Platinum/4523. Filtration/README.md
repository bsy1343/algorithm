# [Platinum V] Filtration - 4523

[문제 링크](https://www.acmicpc.net/problem/4523)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 2, 맞힌 사람: 2, 정답 비율: 66.667%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Digital Signal Processing is used for such clever effects as the &quot;echo&quot; often heard in music, or that annoying modulation done with the voices of certain singers. The field makes the use of Finite Impulse Response (FIR) filters to make these effects happen.</p>

<p>Consider an input stream of samples, represented as a series of integers between 0 and 255 inclusive. (This is, you should not be surprised to discover, the range of an 8-bit sample.) These samples come in a very specific sequence, one after the other, as the digital representation of a given waveform. A FIR mixer will take multiple streams and combine them into one, a FIR echo filter will take one input and provide a single output, and so on.</p>

<p>A FIR filter can be represented as an equation, with the input signals on one side and the output on the other. For example:</p>

<pre>
Y = X[0] + X[-5]</pre>

<p>represents an echo filter (more specifically, a post-echo filter); a given sample of Y is equal to the value of X at the same location in the input stream, plus the value of the sample that occurred five samples prior in X. Values that are not available (such as X[-5] for the first four samples of X) are set to 0.</p>

<p>In this problem, all FIR equations obey the following Backus-Naur Form (BNF) grammar:</p>

<pre>
EQUATION ::= STREAM __ &quot;=&quot; __ EXPR
STREAM   ::= A single upper-case letter representing a sample stream, such as A or X
EXPR     ::= VALUE | SAMPLE | EXPR __ OPER __ EXPR | &quot;(&quot; __ EXPR __ &quot;)&quot;
VALUE    ::= A floating-point number, such as 0.25, 5, or -1.5
SAMPLE   ::= STREAM &quot;[&quot; OFFSET &quot;]&quot;
OFFSET   ::= An integer representing the sample offset into the stream, such as 0, 1, or -5, between -100 and 100 inclusive.
OPER     ::= &quot;*&quot; | &quot;+&quot; | &quot;-&quot;
</pre>

<p>Operations are handled in the standard order of precedence (parentheses first, multiplication before addition and subtraction, otherwise left-to-right), and the resulting value is rounded down to the nearest integer between 0 and 255 only after all calculations (if any) are done by the FIR filter. The __ symbol in the above grammar specifies a series of one or more spaces. Note that whitespace in an equation is only allowed where explicitly specified by the above grammar.</p>

<p>For example, a simple low-pass filter could be expressed as:</p>

<pre>
Z = 0.5 * Y[0] + 0.25 * Y[-1] + 0.25 * Y[1]</pre>

<p>Each output value of Z is based on the matching value in Y, modified by the nearest values of Y. A simple mixer can be represented as follows:</p>

<pre>
D = C[0] + B[0]&nbsp;</pre>

<p>although the clipping problems that such a filter would have should be apparent.</p>

<p>Obviously, for complicated effects, a number of filters can be connected together. In this problem, this is represented by STREAM; any relevant stream will either be an input value (the source audio, for example) or the output of a single FIR filter. However, a stream may be used as an input by more than one other filter. This constitutes a filter network.</p>

<p>Given a series of definitions of FIR filters and starting inputs, your task is to provide all of the outputs of the various filters. No FIR filter will have more than 10 operators or more than ten pairs of parentheses, nor will its representation use more than 80 characters. There will be at least one input stream and at least one output stream per data set, and all streams referenced in a filter equation will be defined in the same data set. All input streams and output streams will have the same number of samples, and there will be no &quot;feedback loops&quot; described by a filter network; that is, no filter will have input dependent on its output.</p>

<p>Although they sure sound cool when Pete Townshend uses them.</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer D (1 &le; D &le; 100) indicating the number of data sets. Each data set consists of the following components:</p>

<ul>
	<li>A line containing a single integer N (2 &le; N &le; 26) indicating the number of streams in the data set;</li>
	<li>A line containing a single integer S (1 &le; S &le; 100) indicating the number of samples in every stream of the data set;</li>
	<li>A series of N lines, each representing one of the streams. There will be no duplicate stream names in a data set, and each stream is one of either:
	<ul>
		<li>an input stream, in which case its representation is of the form &quot;STREAM % sam1 sam2 sam3 &hellip; samS&quot;, where STREAM is a single capital letter, and sam1 is the first sample of the input stream, sam2 is the second sample, and so on. The individual samples and the % operator are all separated with whitespace.</li>
		<li>a FIR filter, in which case its representation is of the form &quot;STREAM = EXPR&quot;, as described above.</li>
	</ul>
	</li>
</ul>

### 출력

<p>For each data set in the input, output the heading &quot;DATA SET #k&quot; where k is 1 for the first data set, 2 for the second, and so on. Then print the output sample streams for every FIR filter in the data set, in alphabetical order, in the format &quot;STREAM % sam1 sam2 sam3 &hellip; samS&quot;.</p>