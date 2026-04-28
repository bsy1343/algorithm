# [Platinum II] Reversible Compression - 24959

[문제 링크](https://www.acmicpc.net/problem/24959)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 81, 정답: 35, 맞힌 사람: 31, 정답 비율: 40.789%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 역추적

### 문제 설명

<p>Data compression is an essential technology in our information society. It is to encode a given string into a (preferably) more compact code string so that it can be stored and/or transferred efficiently.</p>

<p>You are asked to design a novel compression algorithm such that even a code string is reversed it can be decoded into the given string.</p>

<p>Currently, you are considering the following specification as a candidate.</p>

<ul>
	<li>A given string is a sequence of decimal digits, namely, <code>0</code>, <code>1</code>, <code>2</code>, <code>3</code>, <code>4</code>, <code>5</code>, <code>6</code>, <code>7</code>, <code>8</code>, and <code>9</code>.</li>
	<li>A code string is a sequence of code words, and a code word consists of two decimal digits <code>A</code> and <code>L</code>. So, a code string is a sequence of even number of decimal digits.</li>
	<li>A code string <code class="no-padding-right">A</code><sub>$1$</sub><code class="no-padding-right">L</code><sub>$1$</sub> &middot; &middot; &middot; <code class="no-padding-right">A</code><sub>$k$</sub><code class="no-padding-right">L</code><sub>$k$</sub> is decoded into a string by the following procedure. Here, for brevity, a decimal digit (<code class="no-padding-right">A</code><sub>$i$</sub> or <code class="no-padding-right">L</code><sub>$i$</sub>) is also treated as the single digit decimal integer it represents.
	<ol>
		<li>$i$ &larr; 1</li>
		<li>while ($i$ is not greater than $k$) {</li>
		<li>&nbsp; &nbsp; if (<code class="no-padding-right">A</code><sub>$i$</sub> is zero) { output <code>L</code><sub>$i$</sub> }</li>
		<li>&nbsp; &nbsp; else if (<code class="no-padding-right">L</code><sub>$i$</sub> is zero) { do nothing }</li>
		<li>&nbsp; &nbsp; else if (<code class="no-padding-right">A</code><sub>$i$</sub> is larger than the number of digits output so far) { raise an error }</li>
		<li>&nbsp; &nbsp; else {</li>
		<li>&nbsp; &nbsp; &nbsp; &nbsp; repeat <code class="no-padding-right">L</code><sub>$i$</sub> times {</li>
		<li>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; output the <code class="no-padding-right">A</code><sub>$i$</sub>-th of the already output digits counted backwards</li>
		<li>&nbsp; &nbsp; &nbsp; &nbsp; }</li>
		<li>&nbsp; &nbsp; }</li>
		<li>&nbsp; &nbsp; $i$ &larr; $i&nbsp;+ 1$</li>
		<li>}</li>
	</ol>
	</li>
</ul>

<p>For example, a code string <code>000125</code> is decoded into a string <code>0101010</code> as follows:</p>

<ol>
	<li>The first code word <code>00</code> outputs <code>0</code>.</li>
	<li>The second code word <code>01</code> outputs <code>1</code>.</li>
	<li>The first digit <code>2</code> of the last code word <code>25</code> means that the second digit in the already decoded digits, counted backwards, should be output. This should be repeated five times. For the first repetition, the decoded digits so far are <code>0</code> and <code>1</code>, and thus the second last digit is <code>0</code>, which is output. For the second repetition, digits decoded so far are <code>0</code>, <code>1</code>, and <code>0</code>, and the second last is <code>1</code>, which is output. Repeating this three more times outputs <code>0</code>, <code>1</code>, and <code>0</code>.</li>
</ol>

<p>A sequence of code words that raises no error is a valid code string. A valid code string is said to be <em>reversible</em> when its reverse is also valid and both the original and its reverse are decoded into the same string.</p>

<p>For example, the code string <code>000125</code> is not reversible, because its reverse, <code>521000</code>, raises an error and thus is not valid. The code string <code>0010</code> is not reversible though its reverse is valid. It is decoded into <code>0</code>, but its reverse <code>0100</code> is decoded into <code>10</code>. On the other hand, <code>0015599100</code> is reversible, because this and its reverse, <code>0019955100</code>, are both decoded into <code>00000000000000000</code>.</p>

<p>You want to evaluate the performance of this compression method when applied to a variety of cases. Your task is to write a program that, for an arbitrary given digit string, finds the shortest reversible code string that is decoded into the given string.</p>

### 입력

<p>The input consists of a single line containing a non-empty string $s$ of decimal digits. The length of $s$ does not exceed 500.</p>

### 출력

<p>Output the shortest reversible code string that is decoded into $s$. If there are multiple solutions with the same shortest length, output the earliest in the lexicographic order. Note that it is easily shown that a reversible code string always exists for any input string (e.g., see Sample Output 4).</p>