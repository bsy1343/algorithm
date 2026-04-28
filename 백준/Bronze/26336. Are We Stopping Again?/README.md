# [Bronze III] Are We Stopping Again? - 26336

[문제 링크](https://www.acmicpc.net/problem/26336)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 283, 정답: 204, 맞힌 사람: 187, 정답 비율: 72.481%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Going on a road trip is an adventure for Dr. Orooji and his family. Obviously he has to stop to refuel the car, but he also stops whenever his kids want to eat. Dr. O needs to figure out the number of stops before going on the trip so he is mentally prepared.</p>

<p>Find the total number of stops for Dr. O&rsquo;s trip, given:</p>

<ol>
	<li>Total miles to be traveled.</li>
	<li>How often he stops for gas (in miles).</li>
	<li>How often he stops for food (in miles).</li>
</ol>

<p>Assume that the car&rsquo;s gas tank is full at the beginning of the trip and the kids are full as well. If the destination happens to be the time to refuel (or eat), do not count it as a stop. Also, if a particular mileage happens to be both refueling time and eating time, count it as one stop and not two stops.</p>

<p>Note that if a particular mileage happens to be refueling time only, kids won&rsquo;t eat at that stop. Similarly, if a particular mileage happens to be eating time only, the car is not refueled at that stop.</p>

### 입력

<p>The first input line contains a positive integer, t, indicating the number of trips to check. The trips are on the following t input lines, one trip per line. Each trip provides three integers (each between 1 and 1000, inclusive); these are the three values specified in order above.</p>

### 출력

<p>For each trip, output the three input values. Then, on the next output line, print the number of stops for the trip.</p>