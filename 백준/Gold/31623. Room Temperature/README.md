# [Gold II] Room Temperature - 31623

[문제 링크](https://www.acmicpc.net/problem/31623)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 255, 정답: 105, 맞힌 사람: 96, 정답 비율: 43.636%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>President K is taking on the role of adjusting the room temperature of the officers&rsquo; room. He wants to make the officers as comfortable as possible.</p>

<p>Now there are $N$ officers in the room. Each officer is numbered from $1$ to $N$, and the appropriate temperature for officers $i$ ($1 &le; i &le; N$) is $A_i$ degrees when (s)he is not wearing jackets. For each officer, the appropriate temperature drops by $T$ degrees every time (s)he wears a jacket. In other words, when the officer $i$ is wearing $k$ jackets, her/his appropriate temperature is $A_i &minus; kT$ degrees.</p>

<p>When the room temperature is $x$ degrees and the appropriate temperature of a certain officer is $y$ degrees, the <strong>discomfort index</strong> of the officer is expressed as $|x &minus; y|$. Note that $|t|$ represents the absolute value of $t$. Each officer wears the appropriate number of jackets of $0$ or more to minimize discomfort index, depending on the room temperature.</p>

<p>Here, president K decided to call the maximum discomfort index among all officers as <strong>room&rsquo;s unpleasantness</strong>, and set the room temperature so that the room&rsquo;s unpleasantness was minimized. Note that the room temperature must be an integer.</p>

<p>Write a program which, given information about the officers and the appropriate temperature, calculates the minimum room&rsquo;s unpleasantness.</p>

### 입력

<p>Read the following data from the standard input.</p>

<blockquote>
<p>$N$ $T$</p>

<p>$A_1$ $A_2$ $\cdots$ $A_N$</p>
</blockquote>

### 출력

<p>Write one line to the standard output. The output should contain the minimum room&rsquo;s unpleasantness.</p>

### 제한

<ul>
	<li>$2 &le; N &le; 500\, 000$.</li>
	<li>$1 &le; T &le; 10^9$.</li>
	<li>$1 &le; A_i &le; 10^9$ ($1 &le; i &le; N$).</li>
	<li>Given values are all integers.</li>
</ul>