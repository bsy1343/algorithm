# [Gold I] Charles in Charge - 13465

[문제 링크](https://www.acmicpc.net/problem/13465)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 80, 맞힌 사람: 76, 정답 비율: 59.843%

### 분류

그래프 이론, 이분 탐색, 최단 경로, 데이크스트라, 매개 변수 탐색

### 문제 설명

<p>Every day, Charles drives from his home to work and back.&nbsp;He uses the highways of the country that run from one city&nbsp;to another. Charles has decided that he wants to help the&nbsp;environment by buying an electrical car. Electrical cars,&nbsp;however, are not very common in his country yet. They can&nbsp;only be charged inside a city; there are no charging stations&nbsp;along the highways in between the cities. Moreover, all&nbsp;electrical cars are identical except for one thing: the size of&nbsp;the battery. As batteries are very expensive, Charles would&nbsp;like to buy a car with battery that is as small as possible.</p>

<p>However, this greatly increases the time it takes for him to get home, much to the distaste&nbsp;of his wife, Charlotte. This has spawned an argument, and after much discussion they have&nbsp;decided to compromise: Charlotte is fine with Charles taking a longer route, as long as it&nbsp;its length is at most X% longer than the length of shortest route that Charles could have&nbsp;taken to get home from work by using a regular car. Charles has agreed with this, and he&nbsp;now wants to find a route that minimizes the size of the car battery that he needs, i.e. the&nbsp;route that minimizes the maximum distance that Charles has to drive on a highway without passing through a city.</p>

<p>The amount of time Charles spends to charge his car can be neglected.</p>

### 입력

<p>The input starts with integers 2 &le; N &le; 10 000, 1 &le; M &le; 100 000 and 0 &le; X &le; 10 000:&nbsp;the number of cities, the number of highways connecting the cities and the aforementioned&nbsp;percentage X. City 1 is the place where Charles lives and city N is where he works.</p>

<p>Then follow M lines with on each line three integers: 1 &le; C<sub>1</sub> &le; N, 1 &le; C<sub>2</sub> &le; N, 1 &le; T &le; 10<sup>9</sup>. This means that there is a highway of length T connecting cities C<sub>1</sub> and C<sub>2</sub> (Charles can&nbsp;traverse the highway in both directions) without passing through any other cities. You may&nbsp;assume that there exists a path from city 1 to city N.</p>

### 출력

<p>The output is a single integer: the smallest maximum distance that Charles has to travel on&nbsp;a highway without passing through a city, such that the route he takes is at most X% longer&nbsp;than the shortest route.</p>