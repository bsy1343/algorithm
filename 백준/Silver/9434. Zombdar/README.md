# [Silver III] Zombdar - 9434

[문제 링크](https://www.acmicpc.net/problem/9434)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 22, 맞힌 사람: 22, 정답 비율: 81.481%

### 분류

문자열, 파싱

### 문제 설명

<p>You are reading data from a zombie sensor. The sensor scans the area to obtain the number of zombies in the immediate area. The zombie sensor normally writes log entries in the form of &quot;Zombies: &lt;integer&gt;;&quot; or &quot;No Zombies;&quot; to its buffer as it performs scans, but it may also write &quot;RUN;&quot; when the sensor is overloaded. These are the only values that will be written to the buffer.</p>

<p>The zombie sensor&#39;s serial port emits a line containing whatever data is in its buffer every second, regardless of whether the buffer contains a complete log entry, or even multiple entries.</p>

<p>A valid sequence of log entries may be:</p>

<pre>
Zombies: 5;
Zombies: 1;
No Zombies;
Zombies: 70;
RUN;
RUN;
RUN;</pre>

<p>But the sensor&#39;s serial port may emit:</p>

<pre>
Zom
bies:
&nbsp;5;Zombies: 1
;
No Zombies;
Zombies 70;
RUN;
RUN;RUN;Zo</pre>

<p>It is imperative to process the serial port data correctly if you are to survive.</p>

### 입력

<p>The first line of input contains the number of data sets, N (1 &lt;= N &lt;= 50). For each data set, the input contains the raw data emitted by the zombie sensor&#39;s serial port (see above for details) followed by a line containing only the string &quot;END OF CASE&quot;. Since data is emitted by the zombie sensor&#39;s serial port once per second, the first line of input is read after 1 second, the 2nd line after 2 seconds, and so on.</p>

### 출력

<p>For each complete log entry, you should output a line containing &quot;timestamp: log_entry&quot;, where timestamp is the number of seconds elapsed between the start of the data set and the time at which the entry was completely parsed.</p>