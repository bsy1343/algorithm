# [Gold I] Fragmentation - 30576

[문제 링크](https://www.acmicpc.net/problem/30576)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 54, 정답: 16, 맞힌 사람: 13, 정답 비율: 26.000%

### 분류

수학, 자료 구조, 정수론, 이분 탐색, 소수 판정, 런타임 전의 전처리, 에라토스테네스의 체, 소인수분해

### 문제 설명

<p>Not so long ago, a rare type of meteorite, called mesosiderite, fell on the premises of Tomorrow Programming School and was immediately collected. The school was given the honour of organizing the cutting of the meteorite into smaller pieces, which will be exported to laboratories around the world. Swiss Precision Cutting Agency (SPCA) was hired to do the cutting job.</p>

<p>SPCA operates various cutting machines. Each machine can cut the meteorite or a piece of the meteorite into a number of smaller pieces, each of which weighs exactly the same. The number of resulting smaller pieces is the characteristic of that particular machine and cannot be changed. SPCA is quite sure that each of their machines can process any number of meteorite pieces in one day. A piece of meteorite produced by a machine cut cannot be cut again by the same machine in the same day, because of possible cross-contamination and ensuing loss of precision.</p>

<p>Each day, there is exactly one cutting machine available. The order of available machines in successive days is fixed. SPCA created a list of days in the near future and assigned to each day the characteristic of the machine available that day. SPCA calls this list a cutting schedule. The cutting process will take one or more days to complete, before a satisfactory number of meteorite pieces is obtained.</p>

<p>There are a few additional rules governing the cutting and exporting process.</p>

<ul>
	<li>All laboratories demand that they all receive the same total weight of meteorite pieces.</li>
	<li>No meteorite piece can be shared among laboratories.</li>
	<li>Each piece of the meteorite must go to some laboratory, there should be no leftovers.</li>
	<li>At the end of each day in the cutting process, the weights of all meteorite pieces must be the same, to simplify cutting management.</li>
	<li>The whole cutting process has to be completed in a period of successive days, which should not be interrupted by any day without cutting.</li>
</ul>

<p>The school has been given the cutting schedule and it is up to them to choose when to perform the actual cutting. A cutting period can be any sequence of consecutive days in the cutting schedule. Clearly, some cutting periods are favourable and some are not. A cutting period is favourable if a cutting process that starts in the first day of the cutting period would produce meteorite pieces, which satisfy the laboratories&rsquo; demands at the end of the last day of the cutting period.</p>

<p>The school needs a program that can decide for a cutting period whether it is favourable or not.</p>

### 입력

<p>The first input line contains integer N (1 &le; N &le; 10<sup>5</sup>), the number of days in the cutting schedule. The next line contains the cutting schedule in the form of integer sequence a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>N</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>). The value ai represents the characteristic of the machine available on i-th day in the cutting schedule. The next line contains integer Q, (1 &le; Q &le; 10<sup>5</sup>), the number of following queries. Each of the next Q lines represents one query and it contains three integers s<sub>i</sub>, t<sub>i</sub>, k (1 &le; s<sub>i</sub> &le; t<sub>i</sub> &le; N, 1 &le; k &le; 10<sup>6</sup>), the first day of the cutting period, the last day of the cutting period, and the number of laboratories involved.</p>

### 출력

<p>For each input query output, on a separate line, Yes if the cutting period specified by the query is favourable, otherwise output No.</p>