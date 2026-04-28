# [Gold III] Suspicious Samples - 13922

[문제 링크](https://www.acmicpc.net/problem/13922)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 8, 맞힌 사람: 7, 정답 비율: 36.842%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵, 우선순위 큐, 슬라이딩 윈도우

### 문제 설명

<p>Fatima is a researcher. She currently studies water circulation in her country river basins. She collects data samples from various meteorological stations that measure diverse climate-related values. Fatima then searches for interesting patterns in those samples. She uses a program which reads incoming samples&rsquo; data in real time and outputs those samples which are interesting or suspicious in some way. The decision whether a sample is &ldquo;interesting&rdquo; or &ldquo;suspicious&rdquo; is based on a fixed set of conditions, such as &ldquo;the value is greater than the average of the last two hours&rdquo; or &ldquo;the value is lower than anything else in the last five minutes&rdquo; which are easy to program into a computer.</p>

<p>Today, Fatima is in doubt about her yesterday&rsquo;s results and she came to see you, an experienced programmer. She thinks that her program did not evaluate the data correctly and she asks you to help her verify its results. In particular, she brings the complete sequence of samples and describes the set of conditions to you. Your program has to read the samples and produce the output according to the conditions. Fatima will then compare the output of your program to the output of her program and decide what has to be done next.</p>

### 입력

<p>There are more test cases. The first line of each test case contains one integer N (1 &le; N &le; 10<sup>5</sup> ), giving the number of samples. Then there are N lines, each describing one sample. The line contains two integers T<sub>i</sub> and V<sub>i</sub> (1 &le; T<sub>i</sub> &le; 10<sup>9</sup> , 1 &le; V<sub>i</sub> &le; 10<sup>4</sup> ), meaning that the sample value V<sub>i</sub> was acquired in time T<sub>i</sub> . The times are given in seconds elapsed since some fixed moment in the past and they form a strictly increasing sequence (&forall;i, k 1 &le; i &lt; k &le; N : T<sub>i</sub> &lt; T<sub>k</sub>).</p>

<p>The next line of the input contains one integer C (1 &le; C &le; 10), the number of conditions to evaluate. Each of the following C lines specifies one condition C<sub>j</sub> . The line contains three tokens separated with a space:</p>

<ul>
	<li>A relation operator R<sub>j</sub> , which is either &ldquo;gt&rdquo; (greater than) or &ldquo;lt&rdquo; (less than).</li>
	<li>An aggregate function F<sub>j</sub> , one of the &ldquo;min&rdquo; (minimum), &ldquo;max&rdquo; (maximum), or &ldquo;avg&rdquo; (average).</li>
	<li>An integer number L<sub>j</sub> specifying the length of the time interval to be concerned, in seconds.</li>
</ul>

<p>In general, a condition applied to a sample value V<sub>i</sub> checks how V<sub>i</sub> is related to some aggregate feature of the samples which were acquired before V<sub>i</sub> . The function F<sub>j</sub> specifies exactly that feature.</p>

<p>To be more specific, let S<sub>ij </sub>be the set of all samples which were acquired before V<sub>i</sub> but no more than L<sub>j </sub>seconds earlier. The sample value V<sub>i</sub> satisfies the condition C<sub>j </sub>if and only if the relation V<sub>i</sub>R<sub>j</sub>F<sub>j</sub> (S<sub>ij</sub> ) holds. For example, the sample value 800 in conjunction with &ldquo;lt min 300&rdquo; can be read as &ldquo;is 800 less than the minimum sample value acquired in the previous 5 minutes before this 800 was obtained?&rdquo;. Note that sample V<sub>i</sub> is not an element of S<sub>ij</sub></p>

### 출력

<p>For each condition, print one integer: the number of samples whose values satisfy that particular condition. If there are no samples in the time interval specified by the condition, the condition is never considered satisfied.</p>