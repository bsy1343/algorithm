# [Gold I] Reconnaissance - 10247

[문제 링크](https://www.acmicpc.net/problem/10247)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 104, 정답: 41, 맞힌 사람: 27, 정답 비율: 48.214%

### 분류

삼분 탐색

### 문제 설명

<p>You have located a major supply line that the enemy has been using. With satellite imaging, you&rsquo;ve been able to determine the current location and velocity of every vehicle along the supply line, which is for all practical purposes an infinitely long straight line. Furthermore, you know that each vehicle moves at constant velocity, and that they can pass by each other without incident along this supply line. What you need to do now is deploy an air drone with special sensors that can give you readings of the contents of the vehicles. The sensor is capable of reading everything in its range instantaneously, but power limitations allow it to do so only once. In order to minimize the required range, you want to deploy it when the vehicles are as close to each other as possible. Given knowledge of the current location and velocity of all the vehicles, what is the closest that the vehicles will get to each other?</p>

### 입력

<p>There will be several test cases in the input. Each test case will begin with a line with a single integer n (1&le;n&le;100,000) representing the number of vehicles. Each of the next n lines will have two integers, x and v (-100,000&le;x,v&le;100,000), indicating the position (x, in meters) and velocity (v, in meters/hour) of that vehicle. The sign of velocity indicates direction. The input will end with a line with a single 0.</p>

### 출력

<p>For each test case, output a single number equal to the minimum distance that will cover all of the vehicles at some time, in meters, given to exactly two decimal places, rounded. Output each number on its own line, with no spaces. Do not print any blank lines between outputs.</p>