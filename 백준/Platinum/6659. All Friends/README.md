# [Platinum III] All Friends - 6659

[문제 링크](https://www.acmicpc.net/problem/6659)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 18, 정답: 7, 맞힌 사람: 5, 정답 비율: 35.714%

### 분류

깊이 우선 탐색, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Sociologists are interested in the phenomenon of &quot;friendship&quot;. To study this property, they analyze various groups of people. For each two persons in such a group they determine whether they are friends (it is assumed that this relation is symmetric). The sociologists are mostly interested in the sets of friends. The set&nbsp;<em>S</em>&nbsp;of people is the set of friends if every two persons in&nbsp;<em>S</em>&nbsp;are friends. However, studying the sets of friends turns out to be quite complicated, since there are too many such sets. Therefore, they concentrate just on the maximal sets of friends. A set of friends&nbsp;<em>S</em>&nbsp;is maximal if every person that does not belong to<em>S</em>&nbsp;is not a friend with someone in&nbsp;<em>S</em>.</p>

<p>Your task is to determine the number of maximal sets of friends in each group. In case this number exceeds 1&nbsp;000, you just need to report this -- such a group is too complicated to study.</p>

### 입력

<p>The input consists of several instances, separated by single empty lines.</p>

<p>The first line of each instance consists of two integers 1 &le;&nbsp;<em>n</em>&nbsp;&le;&nbsp;128 and&nbsp;<em>m</em>&nbsp;-- number of persons in the group and number of friendship relations. Each of&nbsp;<em>m</em>&nbsp;following lines consists of two integers&nbsp;<em>a</em><sub>i</sub>&nbsp;and&nbsp;<em>b</em><sub>i</sub>&nbsp;(1 &le;&nbsp;<em>a</em><sub>i</sub>,&nbsp;<em>b</em><sub>i</sub>&nbsp;&le;&nbsp;<em>n</em>). This means that persons&nbsp;<em>a</em><sub>i</sub>&nbsp;and&nbsp;<em>b</em><sub>i</sub>&nbsp;(<em>a</em><sub>i</sub>&nbsp;&ne;&nbsp;<em>b</em><sub>i</sub>) are friends. Each such relationship is described at most once.</p>

### 출력

<p>The output for each instance consists of a single line containing the number of maximal sets of friends in the described group, or string &quot;Too many maximal sets of friends.&quot; in case this number is greater than 1&nbsp;000.</p>