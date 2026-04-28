# [Gold I] Message - 5408

[문제 링크](https://www.acmicpc.net/problem/5408)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 5, 맞힌 사람: 5, 정답 비율: 12.500%

### 분류

구현, 수학

### 문제 설명

<p>When little Sascha grew up, she lost her bad habit of pronouncing words in ways that were most easy for her, but did not always match the correct pronunciation. However, she never lost the linguistic creativity she used to show as a little girl. When the Earth Allied Forces (EAF) discovered she also had brilliant mathematical insights and a knack for puzzles and secret messages, she was immediately offered the position of Head of the EAF Intelligence Department.</p>

<p>Sascha&#39;s current task is interpreting intercepted internal messages of the hostile Mars Federation. Although Martian messages always consist of just one word, her task turns out not to be easy, as two factors influence the content of the intercepted message:</p>

<p>Extraterrestrial environment conditions are so bad that errors can occur in intercepted messages, causing them to be quite obfuscated compared to the originally sent text. If such errors occur, the erroneous characters will be characters from the Martian alphabet, just as the original characters.<br />
Furthermore, linguistic characteristics play an important role. In Martian, there are relations between two subsequent characters: for a given character, some characters are more likely predecessors than others (note that something similar occurs in English: for example, a &#39;h&#39; in a word will more likely have been preceded by a &#39;t&#39; than by a &#39;q&#39;).</p>

<p>Fortunately, probabilities that a received character y actually was sent as an original Martian character x is known for all alphabet characters, as well as the probabilities that a certain character x<sub>i</sub> occurs in a clean Martian word if it was preceded by a Martian character x<sub>i&minus;1</sub>.</p>

<p>Given all these probabilities, Sascha wants to find the so-called maximum likelihood text for a received message, which is the most likely message the Martians originally sent. As senior programmer in the EAF Intelligence Department, you must write a program for her, achieving this goal for several intercepted messages in several local Martian dialects.</p>

<p>To give a simple example, consider a local Martian alphabet only consisting of the characters &#39;a&#39; and &#39;b&#39; and let the receiving error probabilities and character succession probabilities be as shown in Table 2. If the intercepted message just consists of an &#39;a&#39;, this can either originally have been an &#39;a&#39; or a &#39;b&#39;. With no previous characters available, only the error probabilities are considered: it then turns out that the maximum likelihood message is an &#39;a&#39; as well, with probability 0.9.</p>

<table class="table table-bordered">
	<thead>
		<tr>
			<th>&nbsp;</th>
			<th colspan="2">Received Character o<sub>i</sub></th>
			<th>&nbsp;</th>
			<th colspan="2">Current Character m<sub>i</sub></th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th>True Character m<sub>i</sub></th>
			<th>a</th>
			<th>b</th>
			<th>Previous Character m<sub>i-1</sub></th>
			<th>a</th>
			<th>b</th>
		</tr>
		<tr>
			<th>a</th>
			<td>0.9</td>
			<td>0.1</td>
			<th>a</th>
			<td>0.8</td>
			<td>0.05</td>
		</tr>
		<tr>
			<th>b</th>
			<td>0.1</td>
			<td>0.9</td>
			<th>b</th>
			<td>0.2</td>
			<td>0.95</td>
		</tr>
	</tbody>
</table>

<p>Table 2: Example Receiving Error Probabilities (left) and Character Succession Probabilities (right).</p>

<p>To extend the example, if the intercepted message was &#39;ab&#39;, we also need the character succession probabilities. The probability that the original message was &#39;aa&#39; is</p>

<blockquote>
<p>p(received &#39;a&#39; indeed was originally sent as &#39;a&#39;) &times; p(received &#39;b&#39; was originally sent as &#39;a&#39;) &times; p(character &#39;a&#39; succeeds previous &#39;a&#39;) = 0.9 &times; 0.1 &times; 0.8.</p>
</blockquote>

<p>Similarly, the probability that the original message was &#39;bb&#39;, &#39;ab&#39; or &#39;ba&#39; are 0.1 &times; 0.9 &times; 0.95, 0.9 &times; 0.9 &times; 0.05 and 0.1 &times; 0.1 &times; 0.2, respectively. Hence, the maximum likelihood message now is &#39;bb&#39;. In all cases asked for, there will always be a unique maximum likelihood message.</p>

### 입력

<ul>
	<li>The first line of input consists of the integer number n, the number of test cases;</li>
	<li>Then, for each test case:&nbsp;
	<ul>
		<li>An integer number a (0 &lt; a &lt; 30), which is the number of characters in the local Martian alphabet;&nbsp;</li>
		<li>A line containing the a unique characters c<sub>1</sub>,c<sub>2</sub>,...,c<sub>a</sub> of the local Martian alphabet, separated by single spaces. Whitespace characters will not occur in the alphabet;&nbsp;</li>
		<li>a lines, specifying receiving error probabilities for the a alphabet characters in the order in which they were presented. The ith line corresponds to the error probabilities for the original alphabet character c<sub>i</sub> and contains:&nbsp;
		<ul>
			<li>a floating point numbers e<sub>i1</sub>,e<sub>i2</sub>,...,e<sub>ia</sub>, separated by single spaces. Number e<sub>ij</sub> (0 &le; e<sub>ij</sub> &le; 1) indicates the probability that an observed character c<sub>j</sub> originally was sent as the character c<sub>i</sub> (hence &Sigma;<sup>a</sup><sub>i=1</sub>e<sub>ij</sub> = 1.00000000);&nbsp;</li>
		</ul>
		</li>
		<li>a lines, specifying character succession probabilities for the a alphabet characters in the order in which they were presented. The ith line corresponds to the character succession probabilities for cases where the original alphabet character c<sub>i</sub> was the immediate predecessor and contains:&nbsp;
		<ul>
			<li>a floating point numbers s<sub>i1</sub>,s<sub>i2</sub>,...,s<sub>ia</sub>, separated by single spaces. Number sij indicates the probability that a certain character c<sub>j</sub> has character c<sub>i</sub> as immediate predecessor (hence &Sigma;<sup>a</sup><sub>i=1</sub>s<sub>ij</sub> = 1.00000000);&nbsp;</li>
		</ul>
		</li>
		<li>An integer number w (0 &lt; w &lt; 50), indicating the number of intercepted messages in the local Martian alphabet specified;&nbsp;</li>
		<li>Then, for each intercepted message:&nbsp;</li>
		<li>A line containing the intercepted message. These messages are non-empty, case-sensitive and will not exceed 300 characters in length.&nbsp;</li>
	</ul>
	</li>
</ul>

<p>Given floating point numbers never have more than 10 decimal numbers following the separator</p>

### 출력

<p>For each message in each test case, the output will consist of a single line with a single string: the maximum likelihood original Martian message given the intercepted message.</p>