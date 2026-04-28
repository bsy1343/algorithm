# [Silver II] Digital Speedometer - 21170

[문제 링크](https://www.acmicpc.net/problem/21170)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 23, 맞힌 사람: 20, 정답 비율: 39.216%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>A digital speedometer shows a vehicle&#39;s speed as integer miles per hour. &nbsp;There are occasions when the sensed speed varies between two integer values, such as during cruise control. &nbsp;Using a single threshold to round between adjacent integers often makes the display toggle rapidly between the two integers, which is distracting to the driver.</p>

<p>Your team must implement a smoothing technique for the display using separate rising and falling thresholds ($t_r$ and $t_f$, $t_f &lt; t_r$, respectively). See Figure 1 for a graphical depiction of the Sample Input for use with the following rules.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/073f7ec7-e242-4403-a83e-b489edc6efb7/-/preview/" style="width: 550px; height: 315px;" /></p>

<p style="text-align: center;">Figure 1: Sensor reading from the Sample Input, with $t_f=0.25$ and $t_r=0.75$.</p>

<p>Each sensed speed, $s$, falls between two adjacent integers $i$ and $j$, $i \le s &lt; j$, where $j = i + 1$. &nbsp;When displaying the sensed speed $s$ as an integer:</p>

<ul>
	<li>When $s$ falls between $i$ and $i+t_f$, $s$ is displayed as $i$.</li>
	<li>When $s$ falls between $i+t_r$ and $j$, $s$ is displayed as $j$.</li>
	<li>When $s$ falls between $i+t_f$ and $i+t_r$, $s$ is displayed as $i$ if the most recent preceding value for $s$ outside of range $[i+t_f, i+t_r]$ is less than $i+t_r$, and $s$ is displayed as $j$ if the most recent preceding value for $s$ outside of range $[i+t_f, i+t_r]$ is greater than $i+t_r$.</li>
	<li>Any sensed speed, $0 &lt; s &lt; 1$, must display as $1$ because any non-zero speed, no matter how small, must display as non-zero to indicate that the vehicle is in motion.</li>
</ul>

### 입력

<p>The first line of input contains $t_f$, the falling threshold. The second line of input contains $t_r$, the rising threshold. The speed sensor reports $s$ in increments of $0.1$ mph. &nbsp;The thresholds are always set halfway between speed increments. All remaining lines until end-of-file are successive decimal speeds, $s$, in miles per hour, one speed per line. The third line of input, which is the first measured speed, will always be $0$. There are at most $1000$ observed speeds $s$ in input. $$0 &lt; t_f,t_r &lt; 1; \ \ \ \ t_f &lt; t_r; \ \ \ \ 0 \le s \le 120$$</p>

### 출력

<p>Output is the list of speeds, one speed per line, smoothed to integer values appropriate to $t_f$ and $t_r$.</p>

### 힌트

<table class="table table-bordered">
	<thead>
		<tr>
			<th>Input</th>
			<th>Output</th>
			<th>Explanation</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>0.25</code></td>
			<td>&nbsp;</td>
			<td>Value of $t_f$.</td>
		</tr>
		<tr>
			<td><code>0.75</code></td>
			<td>&nbsp;</td>
			<td>Value of $t_r$.</td>
		</tr>
		<tr>
			<td><code>0</code></td>
			<td><code>0</code></td>
			<td>Initial input.</td>
		</tr>
		<tr>
			<td><code>2.0</code></td>
			<td><code>2</code></td>
			<td>Input greater than $0$, below threshold of $2.25$.</td>
		</tr>
		<tr>
			<td><code>5.7</code></td>
			<td><code>5</code></td>
			<td>Input greater than $2.0$, in threshold range.</td>
		</tr>
		<tr>
			<td><code>5.8</code></td>
			<td><code>6</code></td>
			<td>Input greater than $2.0$, exceeds upper threshold of $5.75$.</td>
		</tr>
		<tr>
			<td><code>5.7</code></td>
			<td><code>6</code></td>
			<td>Input less than $5.8$, in threshold range.</td>
		</tr>
		<tr>
			<td><code>5.2</code></td>
			<td><code>5</code></td>
			<td>Input less than $5.8$, below threshold of $5.25$.</td>
		</tr>
		<tr>
			<td><code>5.7</code></td>
			<td><code>5</code></td>
			<td>Input greater than $5.2$, in threshold range.</td>
		</tr>
		<tr>
			<td><code>0.8</code></td>
			<td><code>1</code></td>
			<td>Input greater than $0$ and less than $1$.</td>
		</tr>
		<tr>
			<td><code>0.2</code></td>
			<td><code>1</code></td>
			<td>Input greater than $0$ and less than $1$.</td>
		</tr>
	</tbody>
</table>