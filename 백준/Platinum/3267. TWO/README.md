# [Platinum IV] TWO - 3267

[문제 링크](https://www.acmicpc.net/problem/3267)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 47, 맞힌 사람: 42, 정답 비율: 64.615%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 그래프 이론, 트리

### 문제 설명

<p>The city consists of intersections and streets that connect them.</p>

<p>Heavy snow covered the city so the mayor Milan gave to the winter-service a list of streets that have to be cleaned of snow. These streets are chosen such that the number of streets is as small as possible but still every two intersections to be connected i.e. between every two intersections there will be exactly one path. The winter service consists of two snow plovers and two drivers, Mirko and Slavko, and their starting position is on one of the intersections.</p>

<p>The snow plover burns one liter of fuel per meter (even if it is driving through a street that has already been cleared of snow) and it has to clean all streets from the list in such order so the total fuel spent is minimal. When all the streets are cleared of snow, the snow plovers are parked on the last intersection they visited. Mirko and Slavko don&rsquo;t have to finish their plowing on the same intersection.</p>

<p>Write a program that calculates the total amount of fuel that the snow plovers will spend.</p>

### 입력

<p>The first line of the input file contains two integers: N and S, 1 &le; N &le; 100000, 1 &le; S &le; N. N is the total number of intersections; S is ordinal number of the snow plovers starting intersection. Intersections are marked with numbers 1..N.</p>

<p>Each of the next N-1 lines contains three integers: A, B and C, meaning that intersections A and B are directly connected by a street and that street&rsquo;s length is C meters, 1 &le; C &le; 1000.&nbsp;</p>

### 출력

<p>Write to the output file the minimal amount of fuel needed to clean all streets.</p>