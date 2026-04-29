# [Silver I] 철사 연결 - 2063

[문제 링크](https://www.acmicpc.net/problem/2063)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 546, 정답: 161, 맞힌 사람: 116, 정답 비율: 28.713%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p style="text-align: center;"><img alt="" height="241" src="%EB%B0%B1%EC%A4%80/Silver/2063.%E2%80%85%EC%B2%A0%EC%82%AC%E2%80%85%EC%97%B0%EA%B2%B0/0c14e638.png" data-original-src="https://boja.mercury.kr/assets/problem/2063-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="324" /></p>

<p>N(1 &le; N &le; 20)개의 반원 모양의 철사들이 있다. 이들 중 몇 개를 택해서 붙였을 때, 하나의 연결된 모양(폐곡선)을 만들 수 있는지 알아내는 프로그램을 작성하시오. 두 개의 반원 모양의 철사는 그 끝을 임의의 각도로 붙일 수 있지만(즉, 각각의 반원을 얼마든지 회전할 수 있다), 중간에 다른 철사와 겹치는 부분이 있어서는 안 된다.</p>

### 입력

<p>첫째 줄에 데이터의 개수 K(1 &le; K &le; 30)가 주어진다. 각 데이터의 첫째 줄에는 N이 주어지고, 그 다음 줄에는 각 반원의 반지름을 나타내는 실수가 N개 주어진다. 각 실수는 10,000,000 이하의 양의 실수이고, 소숫점 아래 셋째 자리까지 입력될 수 있다.</p>

### 출력

<p>각 데이터에 대해서 가능한 경우에는 YES, 불가능한 경우에는 NO를 출력한다.</p>