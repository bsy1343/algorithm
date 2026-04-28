# [Platinum V] 홍준이의 친위대 - 3948

[문제 링크](https://www.acmicpc.net/problem/3948)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 758, 정답: 508, 맞힌 사람: 411, 정답 비율: 67.599%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>홍준 왕국의 국왕 홍준이는 자신을 호위하는 N명의 친위대 병사가 있다. 병사들의 키는 모두 다르다. 홍준이는 그들을 일렬로 세울 때, 키 순서대로 세우는 것보다 맨 끝 두 병사를 제외한 나머지 병사들의 양 옆 두&nbsp;병사의&nbsp;키가 자신 보다 크거나 모두 자신보다 작을 때 보기 좋다고 생각한다. 예를 들어, 홍준이에게 7명의 친위대 병사가 있고, 그 들의 키가 160, 162, 164, 166, 168, 170, 그리고 172cm 라고 하자. 아래와 같이 병사가 일렬로 서있으면 홍준이는 보기 좋다고 생각한다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3948.%E2%80%85%ED%99%8D%EC%A4%80%EC%9D%B4%EC%9D%98%E2%80%85%EC%B9%9C%EC%9C%84%EB%8C%80/95614950.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3948.%E2%80%85%ED%99%8D%EC%A4%80%EC%9D%B4%EC%9D%98%E2%80%85%EC%B9%9C%EC%9C%84%EB%8C%80/95614950.png" data-original-src="https://www.acmicpc.net/upload/images/kud1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:123px; width:358px" /></p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/3948.%E2%80%85%ED%99%8D%EC%A4%80%EC%9D%B4%EC%9D%98%E2%80%85%EC%B9%9C%EC%9C%84%EB%8C%80/3258c471.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/3948.%E2%80%85%ED%99%8D%EC%A4%80%EC%9D%B4%EC%9D%98%E2%80%85%EC%B9%9C%EC%9C%84%EB%8C%80/3258c471.png" data-original-src="https://www.acmicpc.net/upload/images/kud2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:139px; width:366px" /></p>

<p>만약 홍준이가 매일 같은 병사&nbsp;배치를 본다면 매우 지루해할 것이다. 때문에 매일 병사들의 배치를 새롭게 하고 싶다. 즉,&nbsp;병사 N명이 있을 때 서로 다른 배치가 몇 가지 있는지 알고 싶어한다.</p>

<p>예를 들어, 병사가 4명이 있고 편의상 그들의 키를 1, 2, 3, 4라고 나타내자. 그러면 아래와 같이 10가지 배치가 가능하다.</p>

<p>1324, 2143, 3142, 2314, 3412, 4231, 4132, 2413, 3241, 1423</p>

<p>병사의 수 N이 주어졌을 때, 가능한 배치의 수를 구하는 프로그램을 작성하자.</p>

### 입력

<p>첫 줄에 테스트케이스 수 T가 주어진다. (1&nbsp;&le; T&nbsp;&le; 1,000)</p>

<p>각 테스트케이스마다 병사의 수를 나타내는 자연수 N이 주어진다. (1&nbsp;&le; N&nbsp;&le; 20)</p>

### 출력

<p>각 테스트케이스 마다 가능한 배치의 수를 줄로 구분하여 출력한다.</p>