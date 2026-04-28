# [Silver II] BESTP - 9835

[문제 링크](https://www.acmicpc.net/problem/9835)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 27, 맞힌 사람: 24, 정답 비율: 48.980%

### 분류

구현, 다이나믹 프로그래밍, 그리디 알고리즘, 문자열, 파싱

### 문제 설명

<p>A company rents out various machines each of which has varying performances over time, from unsatisfactory (where it produces large losses by destroying material) to outstanding (when it is very useful and produces large profit). In each time unit, a machine has one of the following seven performances.</p>

<ul>
	<li>&ldquo;o&rdquo;: Outstanding, makes a profit of SGD 100 in the time unit;</li>
	<li>&ldquo;e&rdquo;: Extraordinary, makes a profit of SGD 10 in the time unit;</li>
	<li>&ldquo;g&rdquo;: Good, makes a profit of SGD 1 in the time unit;</li>
	<li>&ldquo;a&rdquo;: Average, makes no profit and makes no loss;</li>
	<li>&ldquo;b&rdquo;: Bad, makes a loss of SGD 1 in the time unit;</li>
	<li>&ldquo;i&rdquo;: Insufficient, makes a loss of SGD 10 in the time unit;</li>
	<li>&ldquo;u&rdquo;: Unsatisfactory, makes a loss of SGD 100 in the time unit.</li>
</ul>

<p>The company supplies a potential customer with data about the performance of each machine over time. For example, the data &ldquo;aabbg&rdquo; for the first machine and &ldquo;ggg&rdquo; for the second machine would say that the first machine can run over 5 time units with two times average, two times bad and one times good performance while the second machine can run over three time units with good performance on each of them. The task is to identify the maximal profit achievable in any contiguous time interval.</p>

<p>In order to help customers with the decision whether to rent one of the machines for some time intervals, write a computer program which reads input as specified below and finds the largest possible profit which can be obtained by renting the machine for a contiguous time interval.</p>

<p>The output corresponding to an input of form &ldquo;aabbg&rdquo; should be 1 as only in the last time unit some profit can be made. The output corresponding to &ldquo;ggbgg&rdquo; should be 3 as it is profitable to absorb the loss in the middle and to rent the machine over the full runtime, leading to an overall profit of SGD 3. Consider a more complicated example &ldquo;ggbggbuoeg&rdquo;. The maximum profit is SGD 111, achieved during the interval &ldquo;oeg&rdquo;. If the machine never perform better or equal to average, a 0 should be returned for the performance.</p>

<p>In general, the task is to make sure that the output is the maximal possible value taken on a interval. In the case of the input &ldquo;ggue&rdquo;, the possible intervals correspond to &ldquo;g&rdquo; (1), &ldquo;gg&rdquo; (2), &ldquo;ggu&rdquo; (-98), &ldquo;ggue&rdquo; (-88), &ldquo;gu&rdquo; (-99), &ldquo;gue&rdquo; (-89), &ldquo;u&rdquo; (-100), &ldquo;ue&rdquo; (-90) and &ldquo;e&rdquo; (10). Among these, the number 10 is the largest value and should be returned. Recall that the return value is 0 if every interval is evaluated with a negative number.</p>

<p>Note that the input is given for several machines, the data of each of them separated by a comma and a period signaling the end of the data for the last machine. The algorithm must provide for each of these machines the best possible value.</p>

### 입력

<p>Your program must read from the standard input the following data. The data of various machines are separated by a comma and the data for the last machine is followed by a period; linebreaks and blanks can be ignored. The performance of the machine per time unit is indicated with the letters &ldquo;u&rdquo;, &ldquo;i&rdquo;, &ldquo;b&rdquo;, &ldquo;a&rdquo;, &ldquo;g&rdquo;, &ldquo;e&rdquo;, &ldquo;o&rdquo; as explained above.</p>

### 출력

<p>Your program must write to the standard output a sequence of numbers, one per each line where the first number refers to the best performance of the first machine in a corresponding interval, the second number refers to the second machine and so on. There are as many outputs as there are commas and periods in the input.</p>