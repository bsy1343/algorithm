# [Gold II] 피자판매 - 2632

[문제 링크](https://www.acmicpc.net/problem/2632)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 9307, 정답: 3647, 맞힌 사람: 2336, 정답 비율: 35.801%

### 분류

이분 탐색, 누적 합

### 문제 설명

<p>고객이 두 종류의 피자 A와 B를 취급하는 피자가게에서 피자를 주문하고자 한다. &lt;그림 1&gt;과 같이 각 종류의 피자는 다양한 크기의 여러 개의 피자조각으로 나누어져 있다. 각 조각에 쓰여진 숫자는 피자조각의 크기를 나타낸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2632.%E2%80%85%ED%94%BC%EC%9E%90%ED%8C%90%EB%A7%A4/b0543019.png" data-original-src="https://upload.acmicpc.net/716aac2f-1375-4484-bf48-023e0fd3d665/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 253px; height: 149px;" /></p>

<p style="text-align: center;">&lt;그림 1&gt;</p>

<p>고객이 원하는 피자의 크기를 이야기하면, 피자가게에서는 한 종류의 피자를 2 조각 이상 판매할 때는 반드시 연속된 조각들을 잘라서 판매한다. 이때 판매한 피자조각의 크기 합이 주문한 크기가 되어야 한다. 판매한 피자조각은 모두 A종류이거나, 모두 B종류이거나, 또는 A와 B 종류가 혼합될 수 있다. 예를 들어서, &lt;그림 1&gt; 과 같이 잘라진 피자가 있을 때, 손님이 전체 크기가 7 인 피자를 주문하면, 피자 가게에서는 &lt;그림2&gt;와 같이 5 가지 방법으로 피자를 판매할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/2632.%E2%80%85%ED%94%BC%EC%9E%90%ED%8C%90%EB%A7%A4/c8cce2a4.png" data-original-src="https://upload.acmicpc.net/11e274ec-7970-42ad-9ffa-6d926b261f19/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 259px; height: 472px;" /></p>

<p style="text-align: center;">&lt;그림 2&gt;</p>

<p>피자가게에서 손님이 원하는 크기의 피자를 판매하는 모든 방법의 가지 수를 계산하는 프로그램을 작성하시오</p>

### 입력

<p>첫 번째 줄에는 손님이 구매하고자 하는 피자크기를 나타내는 2,000,000 이하의 자연수가 주어진다. 두 번째 줄에는 A, B 피자의 피자조각의 개수를 나타내 는 정수 m, n 이 차례로 주어진다 (3 &le; m, n &le; 1000). 세 번째 줄부터 차례로 m 개의 줄에는 피자 A의 미리 잘라진 피자조각의 크기를 나타내는 정수가 주어진다. 그 다음 n 개의 줄에는 차례로 피자B의 미리 잘라진 피자조각의 크기를 나타내는 정수가 주어진다. 각 종류의 피자조각의 크기는 시계방향으로 차례로 주어지며, 각 피자 조각의 크기는 1000 이하의 자연수이다.</p>

### 출력

<p>첫째 줄에는 피자를 판매하는 방법의 가지 수를 나타내는 정수를 출력한다. 피자를 판매하는 방법이 없는 경우에는 숫자 0을 출력한다.</p>