# [Bronze V] 사분면 고르기 - 14681

[문제 링크](https://www.acmicpc.net/problem/14681)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 361013, 정답: 218255, 맞힌 사람: 186605, 정답 비율: 60.980%

### 분류

구현, 기하학

### 문제 설명

<p>흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. &quot;Quadrant n&quot;은 &quot;제n사분면&quot;이라는 뜻이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/14681.%E2%80%85%EC%82%AC%EB%B6%84%EB%A9%B4%E2%80%85%EA%B3%A0%EB%A5%B4%EA%B8%B0/ce47c603.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/14681.%E2%80%85%EC%82%AC%EB%B6%84%EB%A9%B4%E2%80%85%EA%B3%A0%EB%A5%B4%EA%B8%B0/ce47c603.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/14681/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 276px; height: 200px;" /></p>

<p>예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다. 점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.</p>

<p>점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오. 단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.</p>

### 입력

<p>첫 줄에는 정수 x가 주어진다. (&minus;1000 &le; x &le; 1000; x &ne; 0) 다음 줄에는 정수 y가 주어진다. (&minus;1000 &le; y &le; 1000; y &ne; 0)</p>

### 출력

<p>점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.</p>