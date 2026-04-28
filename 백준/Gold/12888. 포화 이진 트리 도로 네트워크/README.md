# [Gold IV] 포화 이진 트리 도로 네트워크 - 12888

[문제 링크](https://www.acmicpc.net/problem/12888)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 896, 정답: 378, 맞힌 사람: 299, 정답 비율: 40.242%

### 분류

수학, 다이나믹 프로그래밍

### 문제 설명

<p>BOJ 나라는 도시와 두 도시를 연결하는 도로로 이루어져 있다. 이 나라의 도로 네트워크는 포화 이진 트리의 형태를 가진다.</p>

<p>수빈이는 BOJ 나라의 도로 네트워크 트리의 높이 H를 알고 있다. 트리의 높이를 안다면, 도시의 개수와 도로의 개수도 구할 수 있다. 트리의 높이가 H인 경우에 도시의 개수는 2<sup>(H+1)</sup>-1개 이고, 도로의 개수는 2<sup>(H+1)</sup>-2개가 된다.</p>

<p>아래 그림은 H = 2일 때, 그림이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/c531b528.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/c531b528.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12888/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:251px; width:371px" /></p>

<p>수빈이는 도로 네트워크에 차를 보내려고 한다. 모든 차는 시작 도시와 도착 도시가 있으며, 같은 도시를 두 번 이상 방문하지 않는다. 차의 시작 도시와 도착 도시가 같을 수도 있다.</p>

<p>모든 도시를 방문한 차의 개수가 모두 1개가 되기 위해서, 수빈이가 차를 최소 몇 대를 보내야 하는지 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 H이 주어진다. (0 &le; H &le; 60)</p>

### 출력

<p>모든 도시를 방문한 차의 개수가 모두 1개가 되기 위해서, 수빈이가 차를 최소 몇 대를 보내야 하는지 출력한다.</p>

<p>정답은 항상 64비트 정수로 나타낼 수 있다.</p>

### 힌트

<p>예제 1</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/bf2fbbd2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/bf2fbbd2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12888/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:155px; width:179px" /></p>

<p>예제 2</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/0ce633e2.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12888.%E2%80%85%ED%8F%AC%ED%99%94%E2%80%85%EC%9D%B4%EC%A7%84%E2%80%85%ED%8A%B8%EB%A6%AC%E2%80%85%EB%8F%84%EB%A1%9C%E2%80%85%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC/0ce633e2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/12888/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:251px; width:371px" /></p>