# [Platinum III] MisLED - 4555

[문제 링크](https://www.acmicpc.net/problem/4555)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 10, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

애드 혹, 비트마스킹, 많은 조건 분기

### 문제 설명

<p>Rocky rolled over in his bed and looked at his LED alarm clock. He saw what was displayed and went back to sleep. Later, he woke up again and once again glanced at the alarm clock. Although he did not know if all the LED segments were working, he was able to determine with certainty the time. Could you?</p>

<p>Rocky&#39;s LED clock uses four 7-segment displays to show the time.</p>

<p>Each 7-segment display has seven bars on it, and displays different numbers by turning on different bars:</p>

<pre>
 _       _  _       _   _   _   _   _
| |   |  _| _| |_| |_  |_    | |_| |_|
|_|   | |_  _|   |  _| |_|   | |_|  _|
</pre>

<p>Using a bit to represent each segment, we can describe a display with seven bits. For example, if the segments are numbered as such:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4555.%E2%80%85MisLED/e120807e.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/4555.%E2%80%85MisLED/e120807e.png" data-original-src="https://upload.acmicpc.net/68c5f2ec-88f0-4f42-a215-5015bc1d6ce5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>Then the display:</p>

<pre style="text-align: center;">
|_
| 
</pre>

<p>can be represented with bits:</p>

<p style="text-align: center;">0000111</p>

<p>And the numbers therefore could be represented by:</p>

<table class="table table-bordered table-center-40">
	<tbody>
		<tr>
			<td><b>Number</b></td>
			<td><b>Bit 1</b></td>
			<td><b>Bit 2</b></td>
			<td><b>Bit 3</b></td>
			<td><b>Bit 4</b></td>
			<td><b>Bit 5</b></td>
			<td><b>Bit 6</b></td>
			<td><b>Bit 7</b></td>
		</tr>
		<tr>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
		</tr>
		<tr>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>2</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
		</tr>
		<tr>
			<td>3</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
		</tr>
		<tr>
			<td>4</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>5</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>6</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>7</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
			<td>0</td>
		</tr>
		<tr>
			<td>8</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
		</tr>
		<tr>
			<td>9</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>1</td>
			<td>0</td>
			<td>1</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>If a segment on the display is &quot;burnt out&quot;, however, it will not display even though it should. For example, if the number three were to be displayed, but the segment corresponding with bit 7 were burnt out, the display would instead be:</p>

<pre style="text-align: center;">
 _ 
  |
 _|
</pre>

### 입력

<p>The first line contains a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets.</p>

<p>Each data set is a single line containing eight 7-bit strings representing the LED displays observed. The first four strings will represent the first time displayed and the next four strings will represent the second time displayed. All of the strings will be separated by a single space. Note: It is not given in the input which segments are burnt out.</p>

### 출력

<p>For each data set, there will be exactly one line of output. This line will simply be the second time observed in the LED display, in the format HH:MM. The segments that are burnt out will be consistent between the first and second time displayed. There will only be one possible solution for each data set.</p>

<p>All times (for input and output) will be represented in standard (non-military) format, with no leading zeros (nine o&#39;clock is 9:00, not 09:00).</p>