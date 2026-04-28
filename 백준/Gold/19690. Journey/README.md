# [Gold IV] Journey - 19690

[문제 링크](https://www.acmicpc.net/problem/19690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 100.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Kuno Kunibertson is moving house from Amman to Bras&iacute;lia. His new employer pays the trip and allows him to make as many stop-overs as he wants; the only two conditions are: (1) the i-th stop-over city of the trip should be nearer to Bras&iacute;lia than the (i &minus; 1)-th stop-over city and (2) the trip should not take more than m nights. Furthermore, as Bras&iacute;lia is a transport hub, there is a direct flight from each city to Bras&iacute;lia. Kuno Kunibertson has to supply the following information to the trip evaluation:</p>

<ol>
	<li>Three integers n, m, h where n is the number of cities which might be visited on the trip, m is an upper bound on the number of nights the trip can take and h is the number of follow-on flights per stop-over city (for the ease of notation, the cities are numbers 0, 1, . . . , n &minus; 1 where 0 is Amman and n &minus; 1 is Bras&iacute;lia)</li>
	<li>For each stop-over city, a list of exactly h possible follow-on flights and each such flight together is specified by the next city together with a minimum number of nights for a hotel stay at the next city Only those flights which go nearer to Bras&iacute;lia are relevant, the others should be ignored by the program.</li>
</ol>

<p>The trip evaluation agency will then plan out a suitable trip for him with some artificial intelligence program, which optimises the trips according to a data base of tourist attractions. However, in order not to overload its computers, the trip evaluation agency has the following requirement:</p>

<ul>
	<li>(&lowast;) The number of itineraries which use up k nights (k &lt; m) should not be more than 500000000 (that is, 5 &times; 10<sup>8</sup>).</li>
</ul>

<p>Note that for counting, two itineraries are considered to be different, if one of the following conditions applies:</p>

<ul>
	<li>one itinerary contains the stopover in city i and the other one does not;</li>
	<li>the departure day from city i is different in both itineraries;</li>
	<li>both itineraries go from city i to city j, but using different flights (this can be the case if Kuno Kunibertson lists two or more flights from city i to city j in his data).</li>
</ul>

<p>For example, if the itinerary is Amman - Cairo - Dakar - Bras&iacute;lia, then an itinerary which departs from Cairo on day 2 differs from another itinerary which departs from Cairo on day 3. Furthermore, if there are two flights from Dakar to Bras&iacute;lia (even if they depart and arrive on the same days), the itineraries are different since they use these different flights.</p>

<p>As there is a penalty when the condition (&lowast;) is violated, Kuno Kunibertson asks his friend Herbert Hercules to write for him a computer program which computes the number of itineraries which use up to k days.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first row of the input consists of three integers n, m and h, where n is the number of cities, m is the strict upper bound of the number of nights used and h is the number of follow-on flights per city. We assume city 0 is Amman and city n &minus; 1 is Bras&iacute;lia. We also assume city i is closer to Bras&iacute;lia than city j if i &gt; j.</p>

<p>Then, the input contains n &minus; 1 rows, where the ith row, i = 0, 1, . . . , n &minus; 2, consists of h pairs of integers (j, k), which means that Kuno Kunibertson can fly from city i to city j and stays at least k nights. If there are several flights to the same city, they are considered different. All 2h integers are listed in one row separated by spaces.</p>

### 출력

<p>Your program must output to standard output only. The output is a list of m integers between 0 and 500000001 which are, respectively, the number of itineraries from Amman to Bras&iacute;lia taking 0, 1, . . ., m &minus; 1 nights, respectively. If the number of itineraries is 500000001 or more, the output should be 500000001.</p>

### 제한

<ul>
	<li>&iacute;n &le; 10000</li>
	<li>m &le; 400</li>
	<li>h &le; 100</li>
</ul>

<p>At most one stop-over means that all outgoing flights from a stop-over location go directly to Bras&iacute;lia. No minimum stay means that the stay in each stop-over can be any number (including 0) and that Kuno Kunibert can report to work on arrival in Bras&iacute;lia.</p>