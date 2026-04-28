# [Gold V] Broken Audio Signal - 10679

[문제 링크](https://www.acmicpc.net/problem/10679)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 41, 맞힌 사람: 34, 정답 비율: 55.738%

### 분류

많은 조건 분기

### 문제 설명

<p>Nathan O. Davis is a student at the department of integrated systems.</p>

<p>Today&#39;s agenda in the class is audio signal processing. Nathan was given a lot of homework out. One of the homework was to write a program to process an audio signal. He copied the given audio signal to his USB memory and brought it back to his home.</p>

<p>When he started his homework, he unfortunately dropped the USB memory to the floor. He checked the contents of the USB memory and found that the audio signal data got broken.</p>

<p>There are several characteristics in the audio signal that he copied.</p>

<ul>
	<li>
	<p>The audio signal is a sequence of \(N\) samples.</p>
	</li>
	<li>
	<p>Each sample in the audio signal is numbered from \(1\) to \(N\) and represented as an integer value.</p>
	</li>
	<li>
	<p>Each value of the odd-numbered sample(s) is strictly smaller than the value(s) of its neighboring sample(s).</p>
	</li>
	<li>
	<p>Each value of the even-numbered sample(s) is strictly larger than the value(s) of its neighboring sample(s).</p>
	</li>
</ul>

<p>He got into a panic and asked you for a help. You tried to recover the audio signal from his USB memory but some samples of the audio signal are broken and could not be recovered. Fortunately, you found from the metadata that all the broken samples have the same integer value.</p>

<p>Your task is to write a program, which takes the broken audio signal extracted from his USB memory as its input, to detect whether the audio signal can be recovered uniquely.</p>

### 입력

<p>The input consists of multiple datasets. The form of each dataset is described below.</p>

<pre>
N
a<sub>1</sub> a<sub>2</sub> ... a<sub>N</sub></pre>

<p>The first line of each dataset consists of an integer, \(N (2 \le N \le 1{,}000)\). \N\) denotes the number of samples in the given audio signal. The second line of each dataset consists of \(N\) values separated by spaces. The \(i\)-th value, \(a_{i}\), is either a character <code>x</code> or an integer between \(-10^9\) and \(10^9\), inclusive. It represents the \(i\)-th sample of the broken audio signal. If \(a_{i}\) is a character <code>x</code> , it denotes that \(i\)-th sample in the audio signal is broken. Otherwise it denotes the value of the \(i\)-th sample.</p>

<p>The end of input is indicated by a single \(0\). This is not included in the datasets.</p>

<p>You may assume that the number of the datasets does not exceed \(100\).</p>

### 출력

<p>For each dataset, output the value of the broken samples in one line if the original audio signal can be recovered uniquely. If there are multiple possible values, output <code>ambiguous</code>. If there are no possible values, output <code>none</code>.</p>