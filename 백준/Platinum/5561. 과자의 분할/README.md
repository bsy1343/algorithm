# [Platinum IV] 과자의 분할 - 5561

[문제 링크](https://www.acmicpc.net/problem/5561)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 498, 정답: 208, 맞힌 사람: 152, 정답 비율: 47.059%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>길이가 N인 막대 모양 과자가 있다. 성관이와 도토리는 이 과자를 여러 조각으로 잘라 각자 합이 N/2가 되도록 나눠먹으려 한다. 이 과자는 무엇인지 모를 재료로 만들어졌기 때문에 각 지점마다 자를 때 필요한 힘이 다르다. 알고리즘 캠프를 하느라 너무 지친 성관이는 과자를 자르기 위해 많은 힘을 쓰고 싶지 않다. 과자의 각 위치를 절단하는데 얼마의 힘이 필요한지를 알 때, 두 사람이 과자를 나누기 위해 필요한 최소 힘의 합을 구해주자.</p>

<p>&nbsp;예를 들어 길이 6인 과자가 있고, 각 지점을 자르는 데 필요한 힘이 왼쪽부터 {1, 8, 12, 6, 2}라면 이때 필요한 최소 힘은 다음과 같이 잘랐을 때의 합인 7이 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5561.%E2%80%85%EA%B3%BC%EC%9E%90%EC%9D%98%E2%80%85%EB%B6%84%ED%95%A0/933983bd.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5561.%E2%80%85%EA%B3%BC%EC%9E%90%EC%9D%98%E2%80%85%EB%B6%84%ED%95%A0/933983bd.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5561/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:203px; width:336px" /></p>

### 입력

<p>첫 줄에 과자의 길이 N(2 &le; N &le; 10,000)이 주어진다. 이때 N은 짝수이다. 두 번째 줄부터 N번째 줄까지 맨 왼쪽에서부터 각 지점을 자르는 데 필요한 힘 P(0 &le; P &le; 10,000)가 주어진다.</p>

### 출력

<p>한 줄에 필요한 최소 힘의 합을 출력하라.</p>