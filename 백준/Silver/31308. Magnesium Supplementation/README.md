# [Silver III] Magnesium Supplementation - 31308

[문제 링크](https://www.acmicpc.net/problem/31308)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 98, 정답: 58, 맞힌 사람: 47, 정답 비율: 57.317%

### 분류

수학, 브루트포스 알고리즘, 정수론

### 문제 설명

<p>At a recent doctor&#39;s appointment, Brandon has been marked as being deficient in magnesium. His doctor has advised him to take exactly some number of picograms of magnesium a day. His doctor can prescribe pills that have any integer number of picograms of magnesium from one up to a maximum. Brandon doesn&#39;t like taking pills though, so he refuses any prescription that requires him to take too many pills in a day.</p>

<p>Your task is to find all prescriptions that Brandon could be given. Note that all pills prescribed to Brandon must have the same dosage.</p>

### 입력

<p>The single line of input contains three integers $n$, $k$ and $p$ ($1 \le n,k,p \le 10^{11}$), where $n$ is the number of picograms per day that Brandon must take, $k$ is the maximum amount in picograms of magnesium in any of the pills, and $p$ is the maximum number of pills per day that Brandon is willing to take.</p>

### 출력

<p>On the first line, output a single integer, which is the number of prescriptions that Brandon could be given.</p>

<p>On each subsequent line, output a single integer, which is the number of picograms per pill in the prescription. Output the prescriptions in increasing order.</p>