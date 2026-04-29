# [Platinum II] Cafebazaar’s Applications - 33187

[문제 링크](https://www.acmicpc.net/problem/33187)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 20, 정답: 12, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

느리게 갱신되는 세그먼트 트리, 세그먼트 트리, 자료 구조

### 문제 설명

<p>It’s the end of the year, and Cafebazaar has released a list, containing the number of users of each of its $n$ applications. Now, each application is eager to showcase its success through an advertisement image, which highlights a continuous subset of the application list containing the application itself. Also, for the image to be credible, it should contain at least $k$ applications, including itself.</p>

<p>For each application in this list, we need to determine the minimum possible rank this application can achieve within any valid subset, according to the number of users. The rank of an application within a subset is defined by the number of applications in that subset that have more users than it, plus one.</p>

### 입력

<p>The first line of input consists of two integers $n$ and $k$ ($1 \le k \le n \le 10^5$), where $n$ represents the total number of applications and $k$ represents the minimum number of applications in an advertisement image. The following $n$ lines contain information about each application: the $i$<sup>th</sup> line contain $c_i$, representing the number of users for the $i$<sup>th</sup> application ($1 \le c_i \le 10^8$).</p>

### 출력

<p>In the only line of output print $n$ space-separated integers. The $i$<sup>th</sup> integer should be the minimum rank that $i$<sup>th</sup> application can achieve within an advertisement image.</p>