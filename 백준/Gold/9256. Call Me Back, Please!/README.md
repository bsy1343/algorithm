# [Gold I] Call Me Back, Please! - 9256

[문제 링크](https://www.acmicpc.net/problem/9256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 40, 정답: 13, 맞힌 사람: 6, 정답 비율: 26.087%

### 분류

구현, 자료 구조, 그래프 이론, 문자열, 집합과 맵, 스위핑, 파싱, 차분 배열 트릭

### 문제 설명

<p>In the previous question, we were trying to find all the friends of a given person. In this question, we will have a closer look at how one could generate a network from raw meta-data about calls. This is the kind of stuff that is presumably going on inside the NSA with the data sets they obtain from phone companies and from logging calls themselves with (or without) warrants.</p>

<p>You will be given a list of phone calls, sorted non-decreasingly by the date/time at which they were initiated. Each entry will specify the date and time the call started, the duration in minutes, and the phone number that originated it and the one that received it. We will declare that two people (or phone numbers) A and B are connected if there is a 24-hour period during which they had calls each way. For instance, if on 01/15 at 6:00am, A called B for 20 minutes, and on 01/16 at 6:20am, B called A for 1 minute, then they are connected. If A had initiated both calls, that wouldn&rsquo;t be enough evidence. If B had called back A at 6:21am, again, that wouldn&rsquo;t be enough evidence.</p>

<p>Your task is to take the list of all phone calls, and output a list of all connections.</p>

### 입력

<p>The first line is the number K of input data sets, followed by the K data sets, each of the following form:</p>

<p>The first line contains an integer n, the total number of calls (with 0 &le; n &le; 100000). This is followed by n lines, each of the following form:</p>

<pre>
yyyy/mm/dd hh:mm T &lt;number1&gt; &lt;number2&gt;</pre>

<p>Here, yyyy/mm/dd is the date (there will be leading 0s if needed), and hh:mm is the time, where the hour is in the 0&ndash;23 format. T is the duration of the call (in minutes), an integer. Finally, &lt;number1&gt; and &lt;number2&gt; are the number initiating and receiving the call; both are simply 10-digit numbers without any other characters.</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. Then, output the connections for each number, in the following format. For each phone number, there will be one line, whose format is</p>

<pre>
&lt;number&gt;: &lt;conn1&gt; &lt;conn2&gt; &lt;conn3&gt; ...</pre>

<p>Here, &lt;number&gt; is the number itself, and after the colon, there will be a list of all the connections according to our definition. The lines must be sorted by increasing &lt;number&gt;, and within each line, all the connections must also be sorted by increasing phone numbers.</p>

<p>Each data set should be followed by a blank line.</p>