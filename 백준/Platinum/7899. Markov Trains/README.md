# [Platinum IV] Markov Trains - 7899

[문제 링크](https://www.acmicpc.net/problem/7899)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 3, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 확률론

### 문제 설명

<p>Business is not going well for the Dutch Railway Company NS. Due to technical problems, they are forced to cancel many train services without advance notice. This is, of course, extremely frustrating for students who travel from home to school by train.</p>

<p>The worst thing about the whole situation is the randomness of the cancellations. Nobody knows in advance whether a train service will be cancelled; a cancellation is not announced until the official departure time. Since there is usually more than one possible route from home to school, people are often left with an &rsquo;if I had known this in advance I would have taken the other route&rsquo; sort of feeling.</p>

<p>Recently, the statistics department of the NS found a revolutionary solution to this problem. They noticed that some train services are cancelled more often than others. In order to help the passengers, they decided to publish this information. The new timetables will state not just the time of departure and arrival of each service, but also its probability of cancellation.</p>

<p>The travel-planner software from the NS, which normally finds the fastest route between stations, must be updated to find the route which gives the best chance of arriving in time. This helps passengers to avoid trains that are likely to cause problems, instead taking a slightly longer, but more reliable route to school.</p>

<p>Given the new timetables, a departure station and time, a destination station and a desired arrival time, find the route which gives the best chance of arriving at the destination in time.</p>

<p>A route in this case is simply an ordered list of stations visited by the passenger, starting with the departure station and ending with the destination. The passenger will stick to the route, each time taking the first possible train to the next station. If a train is cancelled, he will just wait for the next train to that station.</p>

<p>The chance of arriving in time is taken to be the probability that the passenger, when following the route as described above, arrives at the destination station before or at the desired arrival time. When calculating this probability, we assume that train services are cancelled independently of each other and according to the probabilities stated in the timetable.</p>

### 입력

<p>The first line of the input contains a single positive integer indicating the number of runs. For each run, the input is as follows:</p>

<ul>
	<li>A line with a single positive integer n, the number of trains in the timetable (n &le; 100).</li>
	<li>n lines describing the timetable. Each line describes one train, stating its departure station x, the time of departure t<sub>x</sub>, its destination station y (x &ne; y), the time of arrival t<sub>y</sub> (t<sub>x</sub> &lt; t<sub>y</sub>) and its probability of cancellation p. Stations are identified by capital letters in the range &rsquo;A&rsquo; ...&rsquo;L&rsquo;. Times are in the format hh:mm with 00 &le; hh &lt; 24 and 00 &le; mm &lt; 60. The probability p is a decimal real number with 0.0 &le; p &lt; 1.0. Input elements are separated by spaces.</li>
	<li>A line with a departure station a, earliest departure time t<sub>a</sub>, destination station b (a &ne; b) and desired arrival time t<sub>b</sub> (t<sub>a</sub> &lt; t<sub>b</sub>). Station identifiers and times are like those in the timetable.</li>
</ul>

### 출력

<p>The output consists of two lines for each run. The first line of each run contains the best possible route for the passenger as a list of station identifiers separated by spaces. The second line contains the probability that the passenger, when following the given route, arrives on time. The probability must be formatted as a decimal real number with exactly one digit before the decimal point, and exactly 4 digits after. The usual rules for rounding apply: round up if the next digit would be &ge; 5, otherwise round down.</p>

### 힌트

<ul>
	<li>When changing trains at an intermediate station, the earliest possible departure time is one minute after the time of arrival.</li>
	<li>All times are on the same day; the journey does not cross midnight.</li>
	<li>It never happens that two or more trains depart from the same station at the same time to the same destination station.</li>
	<li>The input is such that there is a unique route with maximum probability.</li>
	<li>The passenger will stick to his route, always taking the first available train to the next station. If a train is cancelled he will wait for the next train to that station. He will never try to be smart by taking faster trains or different routes.</li>
</ul>