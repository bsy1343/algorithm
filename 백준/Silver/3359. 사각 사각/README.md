# [Silver I] 사각 사각 - 3359

[문제 링크](https://www.acmicpc.net/problem/3359)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 1004, 정답: 480, 맞힌 사람: 304, 정답 비율: 45.306%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>n 개의 사각형이 주어진다. 사각형에는 1 부터 n 까지 번호가 주어진다.&nbsp;아람이는 x축 위에 이것들을 번호 순서대로 왼쪽에서 오른쪽으로 밀착시켜서 붙이려고한다.&nbsp;그림에서 보이듯이 각 사각형은 짧은 변 혹은 긴 변이 바닥에 붙도록 놓여진다. 아람이는 이 사각형의 위쪽의 둘레가 가장 긴 경우가 되도록 사각형을 놓으려고 한다.&nbsp;위쪽의 둘레라는 것은 x축과 붙어있는 바닥과 양옆 사이드 변의 길이를 제외 한 것을 말한다.</p>

<p>사각형들의 위쪽 둘레가 가장 길어지는 경우의&nbsp;위쪽 둘레의 길이를 계산하는 프로그램을 작성하시오.</p>

### 입력

<p>첫 번째 줄부터 표준입력으로 들어온다. 첫 번째 줄에는 사각형의 개수 n이 주어진다. 다음 줄부터 n개의 줄에&nbsp;ai 와&nbsp;bi가 주어진다. ai와&nbsp;bi는 사각형의 두 변의 길이이다. (0 &lt; n &lt; 1000; 0 &lt; ai&nbsp;&lt; bi&nbsp;&lt; 1000)</p>

### 출력

<p>양수 정수로 최대 위쪽 둘레를 출력한다.</p>

### 힌트

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3359.%E2%80%85%EC%82%AC%EA%B0%81%E2%80%85%EC%82%AC%EA%B0%81/a8d99e48.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/3359/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:255px; width:465px" /></p>

<p>위의 그림은 주어진 예제의&nbsp;사각형을&nbsp;위쪽 둘레가 최댓값이 되도록 배치한 모습이다.</p>

<p>위쪽 둘레가 포함하는 변은&nbsp;DC, CG, GF, FJ, JI, IM, ML, LP,&nbsp;PO 이다. 그래서 총 길이의 합은 68이 된다.</p>