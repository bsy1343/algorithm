# [Platinum V] Emergency Evacuation - 16741

[문제 링크](https://www.acmicpc.net/problem/16741)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 148, 정답: 111, 맞힌 사람: 106, 정답 비율: 79.104%

### 분류

그리디 알고리즘, 정렬, 격자 그래프

### 문제 설명

<p>The Japanese government plans to increase the number of inbound tourists to forty million in the year 2020, and sixty million in 2030. Not only increasing touristic appeal but also developing tourism infrastructure further is indispensable to accomplish such numbers.</p>

<p>One possible enhancement on transport is providing cars extremely long and/or wide, carrying many passengers at a time. Too large a car, however, may require too long to evacuate all passengers in an emergency. You are requested to help estimating the time required.</p>

<p>The car is assumed to have the following seat arrangement.</p>

<ul>
	<li>A center aisle goes straight through the car, directly connecting to the emergency exit door at the rear center of the car.</li>
	<li>The rows of the same number of passenger seats are on both sides of the aisle.</li>
</ul>

<p>A rough estimation requested is based on a simple step-wise model. All passengers are initially on a distinct seat, and they can make one of the following moves in each step.</p>

<ul>
	<li>Passengers on a seat can move to an adjacent seat toward the aisle. Passengers on a seat adjacent to the aisle can move sideways directly to the aisle.</li>
	<li>Passengers on the aisle can move backward by one row of seats. If the passenger is in front of the emergency exit, that is, by the rear-most seat rows, he/she can get off the car.</li>
</ul>

<p>The seat or the aisle position to move to must be empty; either no other passenger is there before the step, or the passenger there empties the seat by moving to another position in the same step. When two or more passengers satisfy the condition for the same position, only one of them can move, keeping the others wait in their original positions.</p>

<p>The leftmost figure of Figure C.1 depicts the seat arrangement of a small car given in Sample Input 1. The car have five rows of seats, two seats each on both sides of the aisle, totaling twenty. The initial positions of seven passengers on board are also shown.</p>

<p>The two other figures of Figure C.1 show possible positions of passengers after the first and the second steps. Passenger movements are indicated by fat arrows. Note that, two of the passengers in the front seat had to wait for a vacancy in the first step, and one in the second row had to wait in the next step.</p>

<p>Your task is to write a program that gives the smallest possible number of steps for all the passengers to get off the car, given the seat arrangement and passengers&rsquo; initial positions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16741.%E2%80%85Emergency%E2%80%85Evacuation/337f7ed1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16741.%E2%80%85Emergency%E2%80%85Evacuation/337f7ed1.png" data-original-src="https://upload.acmicpc.net/3f07d98a-ce02-49ac-a258-e6469a271251/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 604px; height: 232px;" /></p>

<p style="text-align: center;">Figure C.1. Simple Model</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
r s p
i<sub>1</sub> j<sub>1</sub>
.
.
.
i<sub>p</sub> j<sub>p</sub></pre>

<p>Here, r is the number of passenger seat rows, s is the number of seats on each side of the aisle, and p is the number of passengers. They are integers satisfying 1 &le; r &le; 500, 1 &le; s &le; 500, and 1 &le; p &le; 2rs.</p>

<p>The following p lines give initial seat positions of the passengers. The k-th line with i<sub>k</sub> and j<sub>k</sub>&nbsp;means that the k-th passenger&rsquo;s seat is in the i<sub>k</sub>-th seat row and it is the j<sub>k</sub>-th seat on that row. Here, rows and seats are counted from front to rear and left to right, both starting from one. They satisfy 1 &le; i<sub>k</sub> &le; r and 1 &le; j<sub>k</sub> &le; 2s. Passengers are on distinct seats, that is, i<sub>k</sub> &ne; i<sub>l</sub> or j<sub>k</sub> &ne; j<sub>l</sub> holds if k &ne; l.</p>

### 출력

<p>The output should be one line containing a single integer, the minimum number of steps required for all the passengers to get off the car.</p>