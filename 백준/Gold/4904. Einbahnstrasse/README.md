# [Gold III] Einbahnstrasse - 4904

[문제 링크](https://www.acmicpc.net/problem/4904)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

자료 구조, 그래프 이론, 문자열, 집합과 맵, 최단 경로, 해시를 사용한 집합과 맵, 데이크스트라, 파싱, 플로이드–워셜

### 문제 설명

<p>Einbahnstra&szlig;e (German for a one-way street) is a street on which vehicles should only move in one direction. One reason for having one-way streets is to facilitate a smoother flow of traffic through crowded areas. This is useful in city centers, especially old cities like Cairo and Damascus. Careful planning guarantees that you can get to any location starting from any point. Nevertheless, drivers must carefully plan their route in order to avoid prolonging their trip due to one-way streets. Experienced drivers know that there are multiple paths to travel between any two locations. Not only that, there might be multiple roads between the same two locations. Knowing the shortest way between any two locations is a must! This is even more important when driving vehicles that are hard to maneuver (garbage trucks, towing trucks, etc.)</p>

<p>You just started a new job at a car-towing company. The company has a number of towing trucks parked at the company&rsquo;s garage. A tow-truck lifts the front or back wheels of a broken car in order to pull it straight back to the company&rsquo;s garage. You receive calls from various parts of the city about broken cars that need to be towed. The cars have to be towed in the same order as you receive the calls. Your job is to advise the tow-truck drivers regarding the shortest way in order to collect all broken cars back in to the company&rsquo;s garage. At the end of the day, you have to report to the management the total distance traveled by the trucks.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of each test case specifies three numbers (N, C, and R) separated by one or more spaces. The city has N locations with distinct names, including the company&rsquo;s garage. C is the number of broken cars. R is the number of roads in the city. Note that 0 &lt; N &lt; 100, 0 &le; C &lt; 1000, and R &lt; 10000. The second line is made of C + 1 words, the first being the location of the company&rsquo;s garage, and the rest being the locations of the broken cars. A location is a word made of 10 letters or less. Letter case is significant. After the second line, there will be exactly R lines, each describing a road. A road is described using one of these three formats:</p>

<p>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;A --v-&gt; B<br />
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;A &lt;-v-- B<br />
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;A &lt;-v-&gt; B</p>

<p>A and B are names of two different locations, while v is a positive integer (not exceeding 1000) denoting the length of the road. The first format specifies a one-way street from location A to B, the second specifies a one-way street from B to A, while the last specifies a two-way street between them. A, &rdquo;the arrow&rdquo;, and B are separated by one or more spaces. The end of the test cases is specified with a line having three zeros (for N, C, and R.)</p>

### 출력

<p>For each test case, print the total distance traveled using the following format:</p>

<p>k.␣V</p>

<p>Where k is test case number (starting at 1,) ␣ is a space, and V is the result.</p>

### 힌트

<p><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4904/1.png" style="height:259px; width:444px" /></p>