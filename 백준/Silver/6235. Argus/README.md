# [Silver I] Argus - 6235

[문제 링크](https://www.acmicpc.net/problem/6235)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 64, 정답: 43, 맞힌 사람: 39, 정답 비율: 66.102%

### 분류

구현, 자료 구조, 우선순위 큐

### 문제 설명

<p>A data stream is a real-time, continuous, ordered sequence of items. Some examples include sensor data, Internet traffic, financial tickers, on-line auctions, and transaction logs such as Web usage logs and telephone call records. Likewise, queries over streams run continuously over a period of time and incrementally return new results as new data arrives. For example, a temperature detection system of a factory warehouse may run queries like the following.&nbsp;</p>

<ul>
	<li>Query-1: &quot;Every five minutes, retrieve the maximum temperature over the past five minutes.&quot;&nbsp;</li>
	<li>Query-2: &quot;Return the average temperature measured on each floor over the past 10 minutes.&quot;</li>
</ul>

<p>We have developed a Data Stream Management System called Argus, which processes the queries over the data streams. Users can register queries to the Argus. Argus will keep the queries running over the changing data and return the results to the corresponding user with the desired frequency.&nbsp;</p>

<p>For the Argus, we use the following instruction to register a query:&nbsp;</p>

<ul>
	<li>Register Q_num Period</li>
</ul>

<p>Q_num (0 &lt; Q_num &lt;= 3000) is query ID-number, and Period (0 &lt; Period &lt;= 3000) is the interval between two consecutive returns of the result. After Period seconds of register, the result will be returned for the first time, and after that, the result will be returned every Period seconds.&nbsp;</p>

<p>Here we have several different queries registered in Argus at once. It is confirmed that all the queries have different Q_num. Your task is to tell the first K queries to return the results. If two or more queries are to return the results at the same time, they will return the results one by one in the ascending order of Q_num.&nbsp;</p>

### 입력

<p>The first part of the input are the register instructions to Argus, one instruction per line. You can assume the number of the instructions will not exceed 1000, and all these instructions are executed at the same time. This part is ended with a line of &quot;#&quot;.&nbsp;</p>

<p>The second part is your task. This part contains only one line, which is one positive integer K (&lt;= 10000).&nbsp;</p>

### 출력

<p>You should output the Q_num of the first K queries to return the results, one number per line.</p>

<p>&nbsp;</p>