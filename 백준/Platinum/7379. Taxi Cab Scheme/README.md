# [Platinum III] Taxi Cab Scheme - 7379

[문제 링크](https://www.acmicpc.net/problem/7379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 47, 정답: 17, 맞힌 사람: 14, 정답 비율: 38.889%

### 분류

이분 매칭

### 문제 설명

<p>Running a taxi station is not all that simple. Apart from the obvious demand for a centralised coordination of the cabs in order to pick up the customers calling to get a cab as soon as possible, there is also a need to schedule all the taxi rides which have been booked in advance. Given a list of all booked taxi rides for the next day, you want to minimise the number of cabs needed to carry out all of the rides.</p>

<p>For the sake of simplicity, we model a city as a rectangular grid. An address in the city is denoted by two integers: the street and avenue number. The time needed to get from the address a, b to c, d by taxi is |a &minus; c| + |b &minus; d| minutes. A cab may carry out a booked ride if it is its first ride of the day, or if it can get to the source address of the new ride from its latest, at least one minute before the new ride&lsquo;s scheduled departure. Note that some rides may end after midnight.</p>

### 입력

<p>On the first line of the input is a single positive integer N, telling the number of test scenarios to follow. Each scenario begins with a line containing an integer M, 0 &lt; M &lt; 500, being the number of booked taxi rides. The following M lines contain the rides. Each ride is described by a departure time on the format hh : mm (ranging from 00:00 to 23:59), two integers a b that are the coordinates of the source address and two integers c d that are the coordinates of the destination address. All coordinates are at least 0 and strictly smaller than 200. The booked rides in each scenario are sorted in order of increasing departure time.</p>

### 출력

<p>For each scenario, output one line containing the minimum number of cabs required to carry out all the booked taxi rides.</p>