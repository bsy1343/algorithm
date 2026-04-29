# [Platinum III] 두부장수 장홍준 - 1657

[문제 링크](https://www.acmicpc.net/problem/1657)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 2288, 정답: 1135, 맞힌 사람: 854, 정답 비율: 50.088%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>장홍준은 참 특이한 두부장수이다. 세로크기 N, 가로크기 M인 두부판을 가지고 2x1짜리 두부로 잘라서 판다. 그런데, 두부판의 위치마다 등급이 다르다. 그리고 2x1짜리에 등급이 어떻게 매겨지느냐에 따라 두부의 값도 천차만별이 된다. 다음 등급표를 보자.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1657.%E2%80%85%EB%91%90%EB%B6%80%EC%9E%A5%EC%88%98%E2%80%85%EC%9E%A5%ED%99%8D%EC%A4%80/e44d54f0.png" data-original-src="https://boja.mercury.kr/assets/problem/1657-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:177px; width:214px" /></p>

<p>위의 표는 2x1짜리 두부의 등급에 따라 매겨지는 두부의 가격표다. 예를 들어 &ldquo;AC&quot; 두부의 가격은 7이고, &rdquo;DB&quot; 두부의 가격은 3이다.</p>

<p>세로크기 N, 가로크기 M의 두부판이 주어진다. 각 칸마다 두부의 등급이 A, B, C, D, F로 매겨져 있다. 홍준이는 전체 두부가격의 합을 최대가 되게 두부를 자르려고 한다. 2x1짜리 두부로 잘라내고 남은 한 칸짜리 두부는 가격이 0이기 때문에 버린다. 홍준이를 도와 가격이 최대가 되게 두부판을 자르는 프로그램을 작성하시오.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/1657.%E2%80%85%EB%91%90%EB%B6%80%EC%9E%A5%EC%88%98%E2%80%85%EC%9E%A5%ED%99%8D%EC%A4%80/a5889606.png" data-original-src="https://boja.mercury.kr/assets/problem/1657-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:156px; width:321px" /></p>

<p>위 그림은 N=4, M=4 인 두부판의 한 예이다. 오른쪽 그림이 잘라낸 두부가격의 합을 최대로 한 것이다. 한 칸짜리는 쓸모없으므로 버린다.</p>

### 입력

<p>첫째 줄에는 두부판의 세로크기 N, 가로크기 M이 주어진다. N, M은 1이상 14이하의 정수이다. 그 다음 N줄에 걸쳐 M개의 문자가 주어진다. 각 문자는 그 칸의 두부의 등급을 나타내며 A, B, C, D, F 중 하나로 주어진다.</p>

### 출력

<p>첫째 줄에 잘라낸 두부가격 합의 최댓값을 출력한다.</p>