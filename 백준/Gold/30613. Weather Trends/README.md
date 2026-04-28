# [Gold II] Weather Trends - 30613

[문제 링크](https://www.acmicpc.net/problem/30613)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 21, 맞힌 사람: 17, 정답 비율: 68.000%

### 분류

자료 구조, 세그먼트 트리, 집합과 맵, 트리를 사용한 집합과 맵, 우선순위 큐, 덱, 슬라이딩 윈도우, 덱을 이용한 구간 최댓값 트릭

### 문제 설명

<p>George is an aspiring meteorologist who is passionate about analyzing temperature data. He is tasked with finding the largest temperature increase that occurs within specific time frames. Your task is to help George develop an efficient algorithm to calculate such temperature increases for any time interval.</p>

<p>Given a sequence of daily temperature measurements over a period of n days, George is interested in finding the greatest temperature increase that occurs within a window of m days. In other words, he wants to identify the maximum temperature difference between two days, where the second day occurs no more than m days after the first one.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30613.%E2%80%85Weather%E2%80%85Trends/4e7382ab.png" data-original-src="https://upload.acmicpc.net/2f8e0229-bec1-4484-ac18-de11e86e9491/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 664px; height: 344px;" /></p>

### 입력

<p>The first line of input contains a single integer n, representing the number of available temperature measurements. The second line contains a single integer m, indicating the maximum time interval in days. The third line contains n temperature values, separated by spaces.</p>

### 출력

<p>Output a single real number, representing the maximum temperature increase that occurs within the specified m-day interval.</p>

<p>Your task is to implement an efficient algorithm that can solve this problem for George. Additionally, ensure that your output has an absolute or relative error of at most 10<sup>-6</sup>.</p>