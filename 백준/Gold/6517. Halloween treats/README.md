# [Gold I] Halloween treats - 6517

[문제 링크](https://www.acmicpc.net/problem/6517)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 63, 정답: 16, 맞힌 사람: 13, 정답 비율: 40.625%

### 분류

수학, 정수론, 누적 합, 비둘기집 원리

### 문제 설명

<p>Every year there is the same problem at Halloween: Each neighbour is only willing to give a certain total number of sweets on that day, no matter how many children call on him, so it may happen that a child will get nothing if it is too late. To avoid conflicts, the children have decided they will put all sweets together and then divide them evenly among themselves. From last year&#39;s experience of Halloween they know how many sweets they get from each neighbour. Since they care more about justice than about the number of sweets they get, they want to select a subset of the neighbours to visit, so that in sharing every child receives the same number of sweets. They will not be satisfied if they have any sweets left which cannot be divided.</p>

<p>Your job is to help the children and present a solution.</p>

### 입력

<p>The input contains several test cases.</p>

<p>The first line of each test case contains two integers c and n (<em>1 &le; c &le; n &le; 100000</em>), the number of children and the number of neighbours, respectively. The next line contains n space separated integers a<sub>1</sub> , ... , a<sub>n</sub> (<em>1 &le; a<sub>i</sub> &le; 100000 </em>), where a<sub>i</sub> represents the number of sweets the children get if they visit neighbour i.</p>

<p>The last test case is followed by two zeros.</p>

### 출력

<p>For each test case output one line with the indices of the neighbours the children should select (here, index i corresponds to neighbour i who gives a total number of a<sub>i</sub> sweets). If there is no solution where each child gets at least one sweet, print &quot;no sweets&quot; instead. Note that if there are several solutions where each child gets at least one sweet, you may print any of them.</p>