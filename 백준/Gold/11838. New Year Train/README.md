# [Gold II] New Year Train - 11838

[문제 링크](https://www.acmicpc.net/problem/11838)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 81, 정답: 10, 맞힌 사람: 6, 정답 비율: 33.333%

### 분류

자료 구조, 그리디 알고리즘, 이분 탐색, 집합과 맵, 해 구성하기, 트리를 사용한 집합과 맵

### 문제 설명

<p>On the New Year Eve a government of one country decided to send a train with gifts to each town of the country. For each of N towns exactly one wagon with gifts was sent. The route was organized in such way that at each place the last wagon would be detached, then in the next place the other last one and so on. Just before the departure it turned out that the loading workers did not pay attention to numeration of the wagons and loaded the gifts into the wagons in random order. It was impossible to detach a wagon from the middle of the train and there was no time to rearrange gifts.</p>

<p>Luckily, there was a depot with parallel tracks. At the entrance of the depot each wagon could be directed to any of the tracks, and wagons could leave the depot from the other side in the right sequences: 1, 2, 3, 4, and so on.</p>

<p>For example, if at the entrance of the depot with three parallel tracks there were six wagons standing in order: 2, 5, 1, 4, 6, 3, then wagons 2, 5, 6 could be directed to the first track; wagons 1, 4 to the second track, wagon 3 to the third track could be directed respectively. In this case wagons could leave the depot in the right order.</p>

<p>Fortunately, there were enough tracks in the depot to rearrange the train.</p>

### 입력

<p>The first line of input file contains two integers N and M - the number of wagons in the train and the number of tracks in the depot respectively (1 &le; N &le; 800 000, 1 &le; M &le; 100 000, M &le; N). The second line contains N integers  sequence of wagons before the entrance to the depot.</p>

<p>It&#39;s guaranteed that solution always exists.</p>

### 출력

<p>On the first line output file must contain N integers - which track should be chosen for each wagon from input data. On the second line of output file write the number of tracks in order the wagons should leave the depot in the sequence 1, 2, 3, and so on.</p>