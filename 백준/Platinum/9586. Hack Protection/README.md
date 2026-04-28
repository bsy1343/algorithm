# [Platinum I] Hack Protection - 9586

[문제 링크](https://www.acmicpc.net/problem/9586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 84, 정답: 28, 맞힌 사람: 23, 정답 비율: 57.500%

### 분류

이분 탐색, 자료 구조, 해시를 사용한 집합과 맵, 누적 합, 집합과 맵

### 문제 설명

<p>Pavel is sending to his friend Egor some array of non-negative integers. He wants to be sure, that nobody hacks the array before his friend gets it. To solve this problem Pavel need to compute some kind of a checksum or a digest for his array. Pavel has an innovative mind, so he invents the following algorithm to compute the digest for his array: count the number of subarrays in which the bitwise xor of the numbers in the subarray is equal to the bitwise and of the same numbers.</p>

<p>For example, consider an array of four binary numbers &ldquo;01&rdquo;, &ldquo;10&rdquo;, &ldquo;11&rdquo;, and &ldquo;11&rdquo;. The table below to the left lists the results of the bitwise xor of numbers for each subarray of this array, and the table below to the right list the results of the bitwise and of numbers for each subarray of this array. The rows of the table correspond to the starting elements of the subarray from the 1st element of the array to the 4th one, while columns correspond to the ending elements of the subarray. Matching values are highlighted with gray background.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/9586.%E2%80%85Hack%E2%80%85Protection/a259a416.png" data-original-src="https://www.acmicpc.net/upload/images2/hp.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:283px" /></p>

<p>Your task is to help Pavel compute this kind of a digest of the given array.</p>

### 입력

<p>The first line contains one integer n (1 &le; n &le; 100 000). The second line contains n non-negative integers a<sub>i</sub> (0 &le; a<sub>i</sub> &le; 2<sup>31</sup>-1) that are written in decimal notation.</p>

### 출력

<p>On the first line of the output print Pavel&rsquo;s digest of the given array.</p>

### 힌트

<p>The above sample input corresponds to the example from the problem statement.</p>