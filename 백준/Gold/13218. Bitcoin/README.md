# [Gold I] Bitcoin - 13218

[문제 링크](https://www.acmicpc.net/problem/13218)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 86, 정답: 43, 맞힌 사람: 34, 정답 비율: 53.968%

### 분류

수학, 구현, 다이나믹 프로그래밍, 기하학, 값 / 좌표 압축, 볼록 껍질

### 문제 설명

<p>Bitcoin mining is a very power consuming task. One day, both Ali and Betty wish to start their own mining fields (one field for each of them) in central of Cheras. Hence, Ali and Betty went to Siva, the Mayor of Cheras, to request for locations.</p>

<p>Siva presents Ali and Betty a grid map with the possible locations to set up their mining fields. As Bitcoin mining requires a large amount of power, Siva wants both mining fields to be situated as far as possible from each other to prevent power spikes in the local neighbourhood. Specifically, Siva wants Ali and Betty to maximize the distance between their fields.</p>

<p>Your task is to find the furthest Euclidean (straight line) distance between two possible mining sites given the coordinates of all mining sites. You can assume that the coordinate of a mining site is strictly an integer.</p>

<p>As handling floating points can be tricky (and may cause small precision errors), you are only required to output the square​of the furthest Euclidean distance between the two possible sites for their mining fields.</p>

<p>The square of the Euclidean distance between two points (x<sub>1</sub>, y<sub>1</sub>) and (x<sub>2</sub>, y<sub>2</sub>) is defined as:</p>

<p style="text-align:center">(x<sub>1</sub> - x<sub>2</sub>)<sup>2</sup> + (y<sub>1</sub> - y<sub>2</sub>)<sup>2</sup></p>

### 입력

<p>Line 1: A single integer N​, the number of possible mining sites. (2 &le; N &le; 1,000,000)</p>

<p>Line 2: A single integer M​ (2 &le; M &le; 1,500), the maximum possible absolute value of the mining sites&rsquo; coordinates, i.e. -M &le; x &le; M and -M &le; y&le; M where x and y are the coordinates.</p>

<p>Line 3 to (N + 2): Two integers each, coordinates X​<sub>i</sub> ​​and Y<sub>i</sub>​, corresponding to the coordinates of the possible mining sites.</p>

### 출력



### 힌트

<p>Sample 1</p>

<p>The longest distance can be obtained from the only two points in the fields: (-1, 10) and (10, 1). Their square of the Euclidean distance is (-1-10)<sup>2</sup> + (10-1)<sup>2</sup> = 121 + 81 = 202.</p>

<p>Sample 2</p>

<p>The mining fields (1,10) and (10,10) are furthest apart. Their square Euclidean distance is (1-10)<sup>2</sup> + (10-10)<sup>2</sup> = 81 + 0 = 81.</p>