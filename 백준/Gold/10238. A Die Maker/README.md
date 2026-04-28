# [Gold I] A Die Maker - 10238

[문제 링크](https://www.acmicpc.net/problem/10238)

### 성능 요약

시간 제한: 8 초, 메모리 제한: 256 MB

### 통계

제출: 2, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

브루트포스 알고리즘, 그리디 알고리즘

### 문제 설명

<p>The work of die makers starts early in the morning.</p>

<p>You are a die maker. You receive orders from customers, and make various kinds of dice every day. Today, you received an order of a cubic die with six numbers <i>t</i><sub>1</sub>, <i>t</i><sub>2</sub>, ..., <i>t</i><sub>6</sub> on whichever faces.</p>

<p>For making the ordered die, you use a tool of flat-board shape. You initially have a die with a zero on each face. If you rotate the die by 90 degrees on the tool towards one of northward, southward, eastward, and southward, the number on the face that newly touches the tool is increased by one. By rotating the die towards appropriate directions repeatedly, you may obtain the ordered die.</p>

<p>The final numbers on the faces of the die is determined by the sequence of directions towards which you rotate the die. We call the string that represents the sequence of directions an <i>operation sequence.</i> Formally, we define operation sequences as follows. An operation sequence consists of <i>n</i> characters, where <i>n</i> is the number of rotations made. If you rotate the die eastward in the <i>i</i>-th rotation, the <i>i</i>-th character of the operation sequence is <code>E</code>. Similarly, if you rotate it westward, it is <code>W</code>, if southward, it is <code>S</code>, otherwise, if northward, it is <code>N</code>. For example, the operation sequence <code>NWS</code> represents the sequence of three rotations, northward first, westward next, and finally southward.</p>

<p>Given six integers of the customer&#39;s order, compute an operation sequence that makes a die to order. If there are two or more possibilities, you should compute the earliest operation sequence in dictionary order.</p>

### 입력

<p>The input consists of multiple datasets. The number of datasets does not exceed 40. Each dataset has the following form.</p>

<blockquote>
<p><i>t</i><sub>1</sub> <i>t</i><sub>2</sub> <i>t</i><sub>3</sub> <i>t</i><sub>4</sub> <i>t</i><sub>5</sub> <i>t</i><sub>6</sub></p>

<p><i>p</i> <i>q</i></p>
</blockquote>

<p><i>t</i><sub>1</sub>, <i>t</i><sub>2</sub>, ..., <i>t</i><sub>6</sub> are integers that represent the order from the customer. Further, <i>p</i> and <i>q</i> are positive integers that specify the output range of the operation sequence (see the details below).</p>

<p>Each dataset satisfies 0 &le; <i>t</i><sub>1</sub> &le; <i>t</i><sub>2</sub> &le; ... &le; <i>t</i><sub>6</sub> &le; 5,000 and 1 &le; <i>p</i> &le; <i>q</i> &le; <i>t</i><sub>1</sub>+<i>t</i><sub>2</sub>+...+<i>t</i><sub>6</sub>. A line containing six zeros denotes the end of the input.</p>

### 출력

<p>For each dataset, print the subsequence, from the <i>p</i>-th position to the <i>q</i>-th position, inclusively, of the operation sequence that is the earliest in dictionary order. If it is impossible to make the ordered die, print <code>impossible</code>.</p>

<p>Here, dictionary order is recursively defined as follows. The empty string comes the first in dictionary order. For two nonempty strings <i>x</i> = <i>x</i><sub>1</sub> ... <i>x</i><sub><i>k</i></sub> and <i>y</i> = <i>y</i><sub>1</sub> ... <i>y</i><sub><i>l</i></sub>, the string <i>x</i> precedes the string <i>y</i> in dictionary order if</p>

<ul>
	<li><i>x</i><sub>1</sub> precedes <i>y</i><sub>1</sub> in alphabetical order (&#39;A&#39; to &#39;Z&#39;), or</li>
	<li><i>x</i><sub>1</sub> and <i>y</i><sub>1</sub> are the same character and <i>x</i><sub>2</sub> ... <i>x</i><sub><i>k</i></sub> precedes <i>y</i><sub>2</sub> ... <i>y</i><sub><i>l</i></sub> in dictionary order.</li>
</ul>