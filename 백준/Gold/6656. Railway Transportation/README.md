# [Gold II] Railway Transportation - 6656

[문제 링크](https://www.acmicpc.net/problem/6656)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 23, 정답: 7, 맞힌 사람: 5, 정답 비율: 62.500%

### 분류

이분 탐색, 해 구성하기, 자료 구조, 그리디 알고리즘, 매개 변수 탐색, 큐, 정렬

### 문제 설명

<p>ACM has created a new series of huge billboards. Now, they have to be transported using a train. Unfortunately, the carriages of the train get somehow mixed, but ACM wants the billboards to be delivered in an appropriate order.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6656/1.png" style="height:88px; width:398px" /></p>

<p>In a small example, we have 5 carriages approaching a railroad station with 3 parallel tracks. Each carriage may enter any track, but once it is there, it cannot go back anymore. At the other end, the tracks are merged back to a single railroad and cannot go back, again. We want the carriages to leave their tracks in the correct order.</p>

<p>Possible solution is illustrated in the second figure. We may send carriage 4 to the first track, then the carriage number 2 to the second one, number 5 to the first, number 3 to the second, and finally, number 1 to the third track, which may immediately leave it to its correct position. The other carriages will follow as needed.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6656/2.png" style="height:87px; width:401px" /></p>

<p>Your task is to write a program that sends carriages to correct tracks and merges them at the other end. You may assume that the tracks are long enough to hold any number of carriages.</p>

### 입력

<p>The input consists of several scenarios, each of them described on two lines. End of the input is signalized by two zeros.</p>

<p>The first line of each scenario contains two positive integers N and M, separated with a space, N &le; 200000, M &le; 200000. N is the number of carriages, M is the number of tracks.</p>

<p>The second line will contain N non-negative integers representing carriages and their intended order on the other end of the station. Some carriages may have identical numbers, in such a case, their mutual order is not significant.</p>

### 출력

<p>For each scenario, output two lines. The first line will contain N numbers, each of them between 1 and M inclusive. Each number corresponds to one carriage (in the order they were given in the input) and determines a track the carriage is to be moved to. The second line also contains N numbers, they specify from what tracks and in which order are the carriages sent to the other end of the station.</p>

<p>If carriages are manipulated according to your answer, they must leave the station in a nondescending order. When there are more solutions, you may print any of them. If there is no solution, print only one line containing the words &ldquo;Transportation failed&rdquo;.</p>