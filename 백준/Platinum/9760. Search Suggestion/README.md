# [Platinum III] Search Suggestion - 9760

[문제 링크](https://www.acmicpc.net/problem/9760)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 8, 맞힌 사람: 6, 정답 비율: 10.345%

### 분류

자료 구조, 정렬, 세그먼트 트리, 머지 소트 트리

### 문제 설명

<p>A hotel booking website would like to add search suggestion feature on their website. This suggestion will be used to help customers searching for hotels in a particular city. Typically, users would type a prefix of a city name and the search would suggest the three most popular city names that match with that prefix. Since this website needs to process millions of search queries per day, a limit has been placed to reduce the server workload. The search suggestion feature will be activated only if the search query matches no greater than one thousand city names. Your assignment is to create the search suggestion feature for this booking website.</p>

### 입력

<p>The first part of the input is city data. The first line is the number of cities (N where 1 &le; N &le; 500,000) following by pairs of data consisting of city name and its popularity score (S where 1 &le; S &le; 100), which is separated by a comma (&ldquo;,&rdquo;). The city data is sorted in ascending order by city name. The second part of the input is query data. Similarly, the first line is the number of queries (Q where 1 &le; Q &le; 300,000) following by a list of queries which is a string.</p>

### 출력

<p>For each query, output the query and its corresponding search suggestions. The query could result in 3 types of result, which are:</p>

<ol>
	<li>If the city names that match with the query are less than or equal to one thousand the result will show suggested city names (maximum 3 city names) with its popularity score (separated by a comma).</li>
	<li>If the city names that match with the query are greater than one thousand, the result will show only the total number of city that match with that query (plain number without any text or decimal mark).</li>
	<li>If there is no city name that matches with the query, the result will show a text &ldquo;N/A&rdquo;.</li>
</ol>

<p>In case that the popularity score of cities that match with the query are equal, the result must shows in the ascending order of city name.</p>

### 힌트

<p>Please note that the system is case-insensitive.</p>