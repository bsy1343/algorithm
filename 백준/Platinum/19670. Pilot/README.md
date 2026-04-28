# [Platinum V] Pilot - 19670

[문제 링크](https://www.acmicpc.net/problem/19670)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 164, 정답: 73, 맞힌 사람: 59, 정답 비율: 43.066%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>Rar the Cat has finally fulfilled his childhood dream of becoming a pilot, and wants to take his friend, Dinosaur, on a few scenic flights. Rar lives on a linear world, which can be described as a series of N integers, with the ith integer H<sub>i</sub> indicating the height of the ith mountain from the leftmost edge of his world.</p>

<p>For example, the world described with N = 6, H = {1, 3, 2, 4, 1, 2} will look like this:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19670.%E2%80%85Pilot/3fa2bcea.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19670.%E2%80%85Pilot/3fa2bcea.png" data-original-src="https://upload.acmicpc.net/8ecc34fe-1c52-4f14-8599-527e76e52656/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 270px; height: 233px;" /></p>

<p>Rar has a total of Q planes that he wishes to show off, with the ith plane having a maximum cruising altitude of Y<sub>i</sub> metres. Each flight starts from the sth mountain and ends on the eth mountain. We may assume that s &le; e, i.e. <strong>Rar will always fly toward the right</strong>. As each of his planes have a maximum cruising altitude, he is unable to fly across, take off from, or land on a mountain where its height is greater than its cruising altitude, i.e. Rar is only able to fly over the ith mountain using the jth plane if H<sub>i</sub> &le; Y<sub>j</sub>.</p>

<p>For the ith plane, please help Rar determine the total number of different flights he can possibly take, i.e. the total number of ways Rar can choose s and e such that s &le; e, and there are no mountains between s and e inclusive of height greater than Y<sub>i</sub>.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line of input will contain two integers, N and Q.</p>

<p>The second line of input will contain N integers, H<sub>1</sub>, . . . , H<sub>N</sub>.</p>

<p>The third line of input will contain Q integers, Y<sub>1</sub>, . . . , Y<sub>Q</sub>.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain Q lines with one integer each, with the number on the ith line indicating the total number of different flights Rar can take with his ith plane.</p>

### 제한

<ul>
	<li>1 &le; N, Q, H<sub>i</sub>, Y<sub>i</sub> &le; 10<sup>6</sup></li>
</ul>