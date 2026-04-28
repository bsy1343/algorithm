# [Platinum III] 피자 - 1142

[문제 링크](https://www.acmicpc.net/problem/1142)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 294, 정답: 62, 맞힌 사람: 56, 정답 비율: 27.861%

### 분류

기하학

### 문제 설명

<p>민식이는 동그란 피자(원)를 한 번 잘라서 두 개의 크기가 같은 조각으로 자르려고 한다. 피자는 여러 개의 토핑을 포함하고 있고, 이것은 원 위의 한 점으로 표현한다.</p>

<p>컷이 아름답다고 하는 것은 잘랐을 때, 두 피자가 거울에 비춘것 처럼 대칭일 때이다.</p>

<p>아래 그림은 피자의 한 예이다. 검정 점은 토핑이고, 아래 조각의 아름다운 컷의 개수는 1개이다.</p>

<p style="text-align: center;"><img alt="" height="291" src="%EB%B0%B1%EC%A4%80/Platinum/1142.%E2%80%85%ED%94%BC%EC%9E%90/4877b1cb.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1142.%E2%80%85%ED%94%BC%EC%9E%90/4877b1cb.jpg" data-original-src="https://www.acmicpc.net/upload/201003/p1.JPG" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="291" /></p>

<p>아래 피자는 아름다운 컷이 총 4개 있다.</p>

<p style="text-align: center;"><img alt="" height="291" src="%EB%B0%B1%EC%A4%80/Platinum/1142.%E2%80%85%ED%94%BC%EC%9E%90/ff25ca9f.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/1142.%E2%80%85%ED%94%BC%EC%9E%90/ff25ca9f.jpg" data-original-src="https://www.acmicpc.net/upload/201003/p2.JPG" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="291" /></p>

<p>피자가 주어지고, 토핑의 위치가 주어졌을 때, 아름다운 컷의 개수를 출력하는 프로그램을 작성하시오. 피자의 크기는 무한히 크기 때문에, 모든 토핑을 포함할 수 있다. 그리고, 피자의 중심이 좌표가 (0, 0)이다.</p>

### 입력

<p>첫째 줄에 토핑의 개수 N이 주어진다. N은 50보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 토핑의 위치가 주어진다. 좌표는 절댓값이 500보다 작거나 같은 정수이다. 그리고 토핑의 위치는 중복되지 않는다.</p>

### 출력

<p>첫째 줄에 문제의 정답을 출력한다. 만약 아름다운 컷의 개수가 무한대일 경우에는 -1을 출력한다.</p>