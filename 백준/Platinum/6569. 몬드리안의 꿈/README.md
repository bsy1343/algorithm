# [Platinum III] 몬드리안의 꿈 - 6569

[문제 링크](https://www.acmicpc.net/problem/6569)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 691, 정답: 340, 맞힌 사람: 280, 정답 비율: 48.110%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>네델란드의 미술 화가 피트 몬드리안은 정사각형과 직사각형에 매료되어 있었다.</p>

<p>어느 날 그는 꿈에서 너비가 2, 높이가 1인 작은 직사각형을 이용해서 큰 직사각형을 채우는 꿈을 꾸었다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6569.%E2%80%85%EB%AA%AC%EB%93%9C%EB%A6%AC%EC%95%88%EC%9D%98%E2%80%85%EA%BF%88/d4490aca.gif" data-original-src="https://www.acmicpc.net/upload/images/dream1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:33px; width:599px" /></p>

<p>직사각형의 크기가 주어졌을 때, 이 직사각형을 작은 직사각형으로 채우는 방법의 수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 큰 직사각형의 높이 h와 너비 w로 이루어져 있다. 입력의 마지막 줄에는 0이 두 개 주어진다. (1 &le; h, w &le; 11)</p>

### 출력

<p>각 테스트 케이스에 대해서, 입력으로 주어진 큰 직사각형을 작은 직사각형 2 &times; 1 로 채우는 방법의 수를 출력한다. (큰 직사각형은 방향이 있다. 즉, 대칭하는 방법을 여러 번 세야 한다)</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/6569.%E2%80%85%EB%AA%AC%EB%93%9C%EB%A6%AC%EC%95%88%EC%9D%98%E2%80%85%EA%BF%88/22983da1.gif" data-original-src="https://www.acmicpc.net/upload/images/dream2.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:316px; width:348px" /></p>