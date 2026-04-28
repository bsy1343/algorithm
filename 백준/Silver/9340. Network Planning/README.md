# [Silver II] Network Planning - 9340

[문제 링크](https://www.acmicpc.net/problem/9340)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 79, 정답: 34, 맞힌 사람: 29, 정답 비율: 40.278%

### 분류

구현, 그래프 이론, 그리디 알고리즘, 정렬

### 문제 설명

<p>In petroleum retail industry, the locations of service stations are very important to the profit of their company. To maximize the profit, the company uses the concept of &ldquo;Network Planning&rdquo; to choose where to build new service stations.</p>

<p>You are a consultant of this company. This company gives you the data which consists of the number of cities and how are they connected, number of liters of fuel demand, list of cities that already had a service station, and a total number of new service stations to be constructed in their plan this year.</p>

<p>Of course, the result that they need from you is &ldquo;which cities should they construct new service stations to maximize their profit&rdquo;. Sounds simple, isn&rsquo;t it?&nbsp;</p>

<p>Here is a list of what you might need to know.&nbsp;</p>

<ul>
	<li>There will be N cities in this country. Each city can own only one service station.</li>
	<li>Assuming each service station is able to supply unlimited fuel demand.</li>
	<li>Each service station will supply 70% of fuel demand (in liters) within its city, plus 10% of each neighboring city&rsquo;s demand regardless of a fact that whether neighboring cities have their own service station or not.</li>
	<li>For example, if City A, City B, and City C are all connected; City A and City B has their own service stations, then City A will supply 70% fuel demand of itself plus 10% from City B and 10% from City C. So does City B.</li>
	<li>Due to geographical constraints, each city will have no more than three neighboring cities.</li>
	<li>Last, but not least, their total revenue is a direct variation of total fuel demand that they can supply</li>
</ul>

### 입력

<p>First line of input is a number of test cases T &le; 10.&nbsp;</p>

<p>Each test case start with the number of cities N (1 &le; N &le; 100000).&nbsp;</p>

<p>Following N lines has an Integer D<sub>i</sub>&nbsp;(0 &le; D<sub>i</sub>&nbsp;&le; 1000) the fuel demand in each city.&nbsp;</p>

<p>Next line contains an integer E number of edges.&nbsp;</p>

<p>Following E lines has 2 integers C<sub>1</sub>&nbsp;and C<sub>2</sub>, describe bi-directionally neighboring cities. There will not be any duplicated edges in the input (i.e. if there is an edge for (C<sub>1</sub>, C<sub>2</sub>), there will not be an edge for (C<sub>2</sub>, C<sub>1</sub>) in the same input set). Also note that all cities will be numbering from 1 to N.&nbsp;</p>

<p>Next line contains an integer S (0 &le; S &lt; N) the number of existing service stations&nbsp;</p>

<p>Following S lines has an integer C the city which already owned service station&nbsp;</p>

<p>Last line contains an integer M (1 &le; M &le; N&ndash;S) an exact number of new service stations they must construct this year.&nbsp;</p>

### 출력

<p>For each test case, display two lines of output.&nbsp;</p>

<p>First line display a positive integer (using general rounding rules) the maximum total fuel demand they can supply including from both existing service stations and new service stations at the optimal cities.&nbsp;</p>

<p>Second line display a list of the optimal cities that they must construct new service stations, given space-separated and in increasing order. The cities with existing service stations are not counted into this list. If there is more than one possible solution, output the one that is first in lexicographical order.&nbsp;</p>

### 힌트

<p>First Example&nbsp;</p>

<p>In this illustration, you will see that if they construct a new service station in City 3 only, it will maximize the total supply to 360 liters.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9340.%E2%80%85Network%C2%A0Planning/04e3c131.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9340.%E2%80%85Network%C2%A0Planning/04e3c131.png" data-original-src="https://www.acmicpc.net/upload/images/network1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:168px; width:477px" /></p>

<p>The second example</p>

<p>In this example, there are two best solutions. Constructing new stations in city 1, city 2 and city 5 will give the same profit as constructing new stations in city 1, city 3 and city 5. We must answer 1 2 5 because it appear first in lexicographical order. The total supply will be 268.2 for the city 1, 182.6 for the city 2 and 290 for the city 5. The city 4 which we already have a service station supplies 150 liters. The total supply is 268.2 + 182.6 + 290 + 150 = 890.8. This is rounded to 891.&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/9340.%E2%80%85Network%C2%A0Planning/6c79747a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/9340.%E2%80%85Network%C2%A0Planning/6c79747a.png" data-original-src="https://www.acmicpc.net/upload/images/network2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:173px; width:711px" /></p>

<p>&nbsp;</p>