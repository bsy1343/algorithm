# [Gold I] Cloud computing - 23435

[문제 링크](https://www.acmicpc.net/problem/23435)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 356, 정답: 157, 맞힌 사람: 121, 정답 비율: 40.199%

### 분류

자료 구조, 세그먼트 트리, 해 구성하기, 분할 정복

### 문제 설명

<p>Cloud computations are gaining popularity as a powerful and versatile tool. However, they are seriously flawed: processing your data on a remote computer puts your information safety at risk.</p>

<p>Vanya works in an Organization which implemented cloud computing for calculating order statistics of arrays. An order statistic of an array for a specific $k$ is the value of the element, which is $k$th in the array, if the array is sorted.</p>

<p>However, the array which requires order statistics is extremely classified. The only thing known about it is that all its elements are different. With this in mind, Vanya came up with the following scheme: the array is stored on the Organization&#39;s server, and the cloud server performing the order statistics calculations can access the Organization&#39;s server to get the results of the comparison of two elements of the array. In this manner, the cloud server can define the position of the $k$th order statistic, and the classified array is never revealed to the cloud server. This produces another problem: the number of requests from the cloud server to the Organization&#39;s server should not be exceedingly large.</p>

<p>In particular, Vanya decided to limit the calculations of the second order statistics to no more than $N + 20$ requests, where $N$ is the size of the array. Help Vanya implement an algorithm of finding the second smallest element of the classified array, such that it complies to this limitation.</p>

### 입력



### 출력

